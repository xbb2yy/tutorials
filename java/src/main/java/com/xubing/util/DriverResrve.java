package com.xubing.util;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 自动监控广州驾驶员理论培训空位
 *
 * 空位不能再黄浦或者南沙，并且只能是周末
 */
public class DriverResrve {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void main(String[] args) throws Exception {


        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://www.gzjponline.com/Jp/GetSchedule?start=1553961600&end=1557590400");

        for (; ; ) {
            try(CloseableHttpResponse response = httpclient.execute(httpGet)) {
                List<School> schools = JSON.parseArray(EntityUtils.toString(response.getEntity()), School.class);
                schools.parallelStream().filter(School::getIsBookEnabled).filter(s -> s.getSeats() > s.getBookCount())
                        .filter(s -> !s.getSchoolName().contains("南沙") && !s.getSchoolName().contains("黄"))
                        .filter(s -> {
                            DayOfWeek dayOfWeek = LocalDate.parse(s.getTheDate(), formatter).getDayOfWeek();
                            return  dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY);
                        })
                        .forEach(s -> System.out.println(s.getScheduleId()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            TimeUnit.SECONDS.sleep(5);
        }

    }
}

@Data
class School {

    private String classRoomName;
    private String schoolId;
    private Integer bookCount;
    private Integer seats;
    private String scheduleId;
    private Boolean isBookEnabled;
    private String schoolName;
    private String theDate;

}

package leetcode;

public class Q1154_DayoftheYear {

    public int dayOfYear(String date) {
       /* LocalDate day = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return day.getDayOfYear();*/

        int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] s = date.split("-");

        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            a[1] = 29;
        }

        int result = 0;
        for (int i = 0; i < month; i++) {
            result += a[i];
        }
        result += day;
        return result;
    }
}

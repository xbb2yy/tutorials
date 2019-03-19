package com.xubing.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/5/31 9:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {
    private Color color;
    private Double weight;
    private Optional<String> name;


    public Apple(Color color, Double weight) {
        this.color = color;
        this.weight = weight;
    }


    public enum Color {
        RED, GREEN, BLANK, YELLOW
    }

    public static void main(String[] args) {
        System.out.println(Color.RED + ":" + Color.RED.ordinal());
    }

}

package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Pass
public class Q811_SubdomainVisitCount {

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] s = cpdomains[i].split(" ");
            Integer integer = Integer.parseInt(s[0]);
            String[] strings = s[1].split("\\.");

            StringBuilder builder = new StringBuilder(strings[strings.length - 1]);
            map.compute(builder.toString(), (k, v) -> {
                if (v == null) {
                    return integer;
                } else {
                    return integer + v;
                }
            });
            for (int j = 1; j < strings.length; j++) {
                builder.insert(0, strings[strings.length - 1 -j] + ".");
                map.compute(builder.toString(), (k, v) -> {
                    if (v == null) {
                        return integer;
                    } else {
                        return integer + v;
                    }
                });
            }
        }
        return map.entrySet().stream().map(e -> e.getValue() + " " + e.getKey()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] strings = {"9001 discuss.leetcode.com"};
        subdomainVisits(strings);
    }
}

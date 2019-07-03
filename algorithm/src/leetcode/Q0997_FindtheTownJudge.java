package leetcode;

import leetcode.common.Pass;

import java.util.*;
import java.util.stream.Collectors;

@Pass
public class Q0997_FindtheTownJudge {

    public int findJudge(int N, int[][] trust) {

        if (N == 1 && trust.length == 0) {
            return 1;
        }

        Map<Integer, Set<Integer>> map = new HashMap<>();
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < trust.length ; i++) {
            final int j = i;
            list.add(trust[i][0]);
            map.compute(trust[i][1], (k, v) -> {
                if (v == null) {
                    v = new HashSet<>();
                    v.add(trust[j][0]);
                } else {
                    v.add(trust[j][0]);
                }
                return v;
            });
        }

        System.out.println(map);
        List<Integer> collect = map.entrySet().stream().filter(e -> e.getValue().size() == N).map(Map.Entry::getKey).collect(Collectors.toList());

        if (collect.size() == 0) {
            return -1;
        }

        for (Integer integer : collect) {
            if (!list.contains(integer)) {
                return integer;
            }
        }

        return -1;

    }

}

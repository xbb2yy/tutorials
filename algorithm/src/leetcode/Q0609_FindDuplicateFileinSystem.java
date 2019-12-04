package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Pass
public class Q0609_FindDuplicateFileinSystem {

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < paths.length; i++) {
            String[] file = paths[i].split(" ");
            for (int j = 1; j < file.length; j++) {
                int n = file[j].indexOf("(");
                final int m = i;
                String content = file[j].substring(n + 1, file[j].length() - 1);
                String name = "/" + file[j].substring(0, n);
                map.compute(content, (key, old) -> {
                    if (old == null) {
                        List<String> list = new ArrayList<>();
                        list.add(paths[m].split(" ")[0] + name);
                        return list;
                    } else {
                        old.add(paths[m].split(" ")[0] + name);
                        return old;
                    }
                });
            }

        }
        List<List<String>> ans = map.values().stream().filter(list -> list.size() > 1).collect(Collectors.toList());
        return ans;
    }

    public static void main(String[] args) {
        String file = "4.txt(efgh)";
        Pattern pattern = Pattern.compile(".*?\\(.*\\)$");


        int i = file.indexOf("(");
        System.out.println(file.substring(i + 1, file.length() - 1));
        Map<String, List<String>> map = new HashMap<>();
        map.compute(file, (k, old) -> {
            if (old == null) {
                List<String> list = new ArrayList<>();
                list.add(file);
                return list;
            } else {
                old.add(file);
                return old;
            }
        });
    }
}

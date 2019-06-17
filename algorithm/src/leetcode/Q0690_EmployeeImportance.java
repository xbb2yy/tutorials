package leetcode;

import leetcode.common.Pass;

import java.util.*;

@Pass
public class Q0690_EmployeeImportance {

    Map<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        employees = employees;

        map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }

        Optional<Employee> employee = employees.stream().filter(e -> e.id == id).findFirst();
        Employee emp = employee.get();
        List<Integer> list = new ArrayList<>();
        visit(emp.subordinates, list);

        int sum = emp.importance;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;


    }

    public void visit(List<Integer> subordinates, List<Integer> list) {
        for (Integer subordinate : subordinates) {
            list.add(map.get(subordinate).importance);
            if (map.get(subordinate).subordinates != null || map.get(subordinate).subordinates.size() != 0) {
                visit(map.get(subordinate).subordinates, list);
            }
        }
    }
}

class Employee {

    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

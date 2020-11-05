package test20201102;
//690. 员工的重要性    力扣     https://leetcode-cn.com/problems/employee-importance/


import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

/*
class Solution0 {//已通过
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e: employees) {
            if (e.id == id) {
                if (e.subordinates.size() == 0) {  // 没有子结点
                    return e.importance;
                }
                for (int subId: e.subordinates) {
                    e.importance += getImportance(employees, subId);
                }
                return e.importance;
            }
        }
        return 0;
    }
}*/
class Solution2 {//用了键值对的方法
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id,e);
        }
        return getImportance(map,id);
    }

    public int getImportance(Map<Integer,Employee> employees, int id) {
        Employee employee = employees.get(id);//找到你要找的员工
        int result = employee.importance;
        for (int i = 0; i < employee.subordinates.size() ; i++) {
            int sunId = employee.subordinates.get(i);
            result += getImportance(employees,sunId);
        }
        return result;
    }
}
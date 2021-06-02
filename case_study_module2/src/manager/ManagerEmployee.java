package manager;

import common.FunctionWriteAndRead;
import models.Employee;

import java.util.*;

public class ManagerEmployee {
    public void showEmployee(){
        Map<String , Employee> map = new HashMap<String, Employee>();
        List<Employee> list = new FunctionWriteAndRead().readFileEmployee("src\\data\\employee");
        for (int i = 0; i<list.size(); i++){
            map.put(("00"+i),list.get(i));
        }
        Set<String> set = map.keySet();
        for (String key: set){
            System.out.println("MNV: "+key+" "+map.get(key));
        }
    }

    public void searchEmployee(){
        Employee employee;
        int count = 0;
        System.out.println("Input name of employee: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Employee> stack = new Stack<>();
        List<Employee> list = new FunctionWriteAndRead().readFileEmployee("src\\data\\employee");
        for (Employee employee1:list){
            stack.push(employee1);
        }
        while (!stack.isEmpty()){
            employee = stack.pop();
            if(input.equals(employee.getNameEmployee())){
                System.out.println(employee.toString());
                count++;
            }
        }
        System.out.println(count+" employee found.");
    }
}

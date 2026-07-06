//Brute Force solution 

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Employeeimportance {

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public static int getImportance(List<Employee> employee, int id) {

        for (Employee emp : employee) {
            if (emp.id == id) {
                int total = emp.importance;

                for (int subId : emp.subordinates) {
                    total += getImportance(employee, subId);
                }

                return total;
            }
        }
        return 0;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            Employee emp = new Employee();

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter employee ID: ");
            emp.id = sc.nextInt();

            System.out.print("Enter importance: ");
            emp.importance = sc.nextInt();

            System.out.print("Enter number of subordinates: ");
            int subCount = sc.nextInt();

            emp.subordinates = new ArrayList<>();

            System.out.println("Enter subordinate IDs:");

            for (int j = 0; j < subCount; j++) {
                emp.subordinates.add(sc.nextInt());
            }

            employees.add(emp);
        }

        System.out.print("\nEnter the ID you need importance of: ");
        int id = sc.nextInt();

        int ans = getImportance(employees, id);

        System.out.println("The total importance of the employee is: " + ans);

        sc.close();
    }
}

//Space complexity = O(h) <- Depth only, saves space over HashMap solution. 
//Time complexity = O(n^2) <-as we need to run through recursive. 

package comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Geor", "Khuba", 20000);
        Employee emp2 = new Employee(37, "Artur", "Djanai", 43000);
        Employee emp3 = new Employee(52, "Artur", "Kes", 100);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n" + list);

    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
        //     //return this.id-anotherEmp.id;  // korotkaya zapis1
//
        //     // return this.id.compareTo(anotherEmp.id); // korotkaya zapis2
        //     int res = this.name.compareTo(anotherEmp.name);
        //     if (res == 0){ // esli imena odinakovie
        //         res = this.surname.compareTo(anotherEmp.surname);
        //     }
        //     return res;
        // }


//class IdComparator implements Comparator<Employee>{
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if(emp1.id == emp2.id){
//            return 0;
//        }
//        else if(emp1.id< emp2.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }
//}
    }}
    class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    }

    class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }
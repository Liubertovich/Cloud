package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Student st1 = new Student("Gio",'m', 23, 6, 8.1);
        Student st2 = new Student("Artur",'m', 22, 5, 3.3);
        Student st3 = new Student("Gamich",'m', 21, 4, 6.5);
        Student st4 = new Student("Lena",'f', 26, 2, 7);
        Student st5 = new Student("Vasya",'m', 45, 4, 8.8);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);
        Student st6 = new Student("Vasya",'m', 45, 4, 8.8);
//        studentList.remove(st6);
        int index = studentList.indexOf(st6);
        System.out.println(index);
    }
}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course
                && Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}

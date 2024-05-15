package practice.WriteOnlyClassInJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Gohan");
        student.setClasses("CO3");
    }
}

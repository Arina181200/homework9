package com.company;
import java.util.Scanner;
import Lesson9HW.Student;
import Lesson9HW.StudentsList;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int key;
        StudentsList list=new StudentsList();
        System.out.println("Введите любое число для продолжения,для выхода 0");
        key=in.nextInt();
        while (key!=0)
        {
            String name,age,origin;
            System.out.println("Введите данные студента");
            name=in.nextLine();
            age=in.nextLine();
            origin=in.nextLine();
            Student student=new Student(name,age,origin);
            list.addStudent(student);
            list.printStudents();
        }

    }
}

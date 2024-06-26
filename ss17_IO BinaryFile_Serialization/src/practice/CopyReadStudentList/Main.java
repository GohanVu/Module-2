package practice.CopyReadStudentList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Vu Kieu Anh","Ha Noi"));
        students.add(new Student(2,"Nguyen Minh Quan","Ha Noi"));
        students.add(new Student(3,"Dang Huy Hoa","Da Nang"));
        students.add(new Student(4, "Nguyen Khanh Tung","Ha Noi"));
        students.add(new Student(5,"Nguyen Khac Nhat","Ha Noi"));
        writeDataToFile("student.txt",students);
        List<Student> studentDataFromFile = readDataToFile("student.txt");
        for(Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
    public static void writeDataToFile (String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Student> readDataToFile(String path){
      List<Student> students = new ArrayList<>();
      try{
          FileInputStream fis = new FileInputStream(path);
          ObjectInputStream ois = new ObjectInputStream(fis);
          students = (List<Student>) ois.readObject();
          fis.close();
          ois.close();
      } catch (Exception ex){
          ex.printStackTrace();
      }
      return students;
    }
}

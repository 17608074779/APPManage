package com.app.test;

import com.app.pojo.Student;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test001 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("02", "aa");
        map.put("01", "5");
        map.put("05", "bb");
        map.put("05", "456");
        /*Set set = map.entrySet();
        for (Object s: set) {
            System.out.println(s);
        }*/
        //System.out.println(map.get("0001"));
        System.out.println((String)map.get("07"));

    }

    public List<Student> students(){
        List<Student> students = Arrays.asList(
                new Student("李白", 20, "男"),
                new Student("韩信", 28, "女"),
                new Student("张飞", 30, "男")
        );
        return students;
    }

    @Test
    public void test01(){
        List<Student> students = this.students();
        Stream<Student> studentStream = students.stream().filter(student -> student.getAge() < 29);
        //studentStream.forEach(student-> System.out.println(student));
        List<Student> collect = studentStream.collect(Collectors.toList());
        for (Student student : collect) {
            System.out.println(student);
        }
    }
}

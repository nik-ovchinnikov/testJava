package com.mycompany.app;

public class Student implements Comparable<Student>{
    String name;
    int groupNumber;
    int age;

    public Student(int groupNumber, String name, int age) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int tmp = this.groupNumber - o.groupNumber;
        if (tmp == 0) {
            return this.name.compareTo(o.name);
        } else {
            return tmp;
        }
    }



}

package com.mycompany.app;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student st1 = new Student(1, "Steve", 22);
        Student st2 = new Student(3, "Abraham", 17);
        Student st3 = new Student(1, "John", 24);
        Student st4 = new Student(3, "Ivan", 17);
        Student st5 = new Student(2, "Sergey", 19);
        Student st6 = new Student(3, "Jim", 30);

        Student[] studentArray = {st1, st2, st3, st4, st5, st6};

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(studentArray));

        Comparator<Student> comparatorByAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int tmp = o1.age - o2.age;
                if (tmp == 0) {
                    tmp = o1.groupNumber - o2.groupNumber;
                    if (tmp == 0) {
                        return o1.name.compareTo(o2.name);
                    }else {
                        return tmp;
                    }
                }else {
                    return tmp;
                }
            }
        };

        Collections.sort(students, comparatorByAge);

       /* for (Student student : students) {
            System.out.println(student.toString());
        }*/

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }




}



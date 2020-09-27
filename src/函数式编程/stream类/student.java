package 函数式编程.stream类;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class student implements Comparable<student> {
    private int id;
    private String name;
    private int age;

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(student o) {
        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(final Object obj){
        if (null==obj){
            return false;
        }

        final student std= (student) obj;
        if (this==std){
            return true;
        }else {
            return (this.name.equals(std.getName())) && (this.age==std.getAge());
        }
    }

    @Override
    public int hashCode(){
        int hashno=7;
        hashno=13*hashno+(name==null?0:name.hashCode());
        return hashno;
    }

    public static void main(String[] args) {
        List<student> studentList= Arrays.asList(new student(1,"ziwen1",10),new student(2,"aiwen2",18),new student(3,"biwen3",28));

        List<student> studentList1=studentList.stream().sorted().collect(Collectors.toList());//自然序列

        List<student> studentList2=studentList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//逆序

        List<student> studentList3=studentList.stream().sorted(Comparator.comparing(student::getAge)).collect(Collectors.toList());//根据年龄升序

        List<student> studentList4=studentList.stream().sorted(Comparator.comparing(student::getAge).reversed()).collect(Collectors.toList());//根据年龄降序

        studentList1.forEach(student -> System.out.println("id is "+student.getId()+" ;name is "+student.getName()+";age is "+student.getAge()));//打印
        studentList2.forEach(student -> System.out.println("id is "+student.getId()+" ;name is "+student.getName()+";age is "+student.getAge()));//打印
        studentList3.forEach(student -> System.out.println("id is "+student.getId()+" ;name is "+student.getName()+";age is "+student.getAge()));//打印
        studentList4.forEach(student -> System.out.println("id is "+student.getId()+" ;name is "+student.getName()+";age is "+student.getAge()));//打印

    }

}

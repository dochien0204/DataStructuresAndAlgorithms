package queue;

public class Student implements Comparable<Student>{
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        if (this.age == student.age) {
            return 0;
        } else if(this.age > student.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

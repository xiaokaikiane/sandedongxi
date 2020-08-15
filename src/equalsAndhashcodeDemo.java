import java.util.Objects;

public class equalsAndhashcodeDemo {//equals和hashcode

    public static void main(String[] args) {
        Student student=new Student("小明",2,1);
        Student student1=new Student("小明",2,1);
        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
class Student{
    private String name;
    private int age;
    private int classes;
    Student(String name,int age,int classes){
        this.name=name;
        this.age=age;
        this.classes=classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                classes == student.classes &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, classes);
    }
}

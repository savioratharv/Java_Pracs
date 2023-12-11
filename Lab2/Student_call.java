class Student{
    String name;
    String rollno;
    public Student(String name, String rollno){
        this.name=name;
        this.rollno=rollno;
    }
}

public class Student_call {
    public static void main(String[] args) {
        Student john = new Student("John","176");
    }
}

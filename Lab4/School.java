class Student{
    int rollno;

    public Student(int rollno){
        this.rollno=rollno;
    }
}

class Test extends Student{
    int sem1_marks, sem2_marks;
    public Test(int rollno, int sem1_marks, int sem2_marks){
        super(rollno);
        this.sem1_marks=sem1_marks;
        this.sem2_marks=sem2_marks;
    }
}

interface Sports {
    int score();
}

class Result extends Test implements Sports{

    public Result(int rollno, int sem1_marks, int sem2_marks){
        super(rollno, sem1_marks, sem2_marks);
    }
    
    public int calculateTotal(){
        int score=score();
        return sem1_marks+sem2_marks+score;
    }

    @Override
    public int score() {
        return 20;
    }

    public void display(){
        System.out.println(rollno);
        System.out.println(sem1_marks);
        System.out.println(sem2_marks);
        System.out.println(score());
        System.out.println(calculateTotal());
    }
}

public class School {
    public static void main(String[] args) {
        Result stu1=new Result(176,40,50);
        stu1.display();
    }
}

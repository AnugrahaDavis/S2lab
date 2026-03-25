class Person{
    String name="Anu";
    void display()
    {System.out.println("Name : "+name);
}
}
class student extends Person{
    int no=21;
    void rollno(){
        System.out.println("Rollno : "+no);

    }
}
class course extends student{
    String c="MCA";
    void cours(){
        System.out.println("Course : "+c);
    }
}

public class multilevel {
    public static void main(String[] args) {
        course s=new course();
        s.display();
        s.rollno();
        s.cours();

    } 
}

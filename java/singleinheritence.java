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
public class singleinheritence {
    public static void main(String[] args) {
        student s=new student();
        s.display();
        s.rollno();
    } 
}

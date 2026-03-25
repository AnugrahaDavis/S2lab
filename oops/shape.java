public class shape {

    void area(double a){
        System.out.println("Area of square is "+ a*a);
    }
    void area(int l,int b){
        System.out.println("Area of rectangle"+l*b);
    }
    void area(float b,float h){
        System.out.println("Area of traingle is"+0.5*b*h);
    }
    public static void main(String[] args) {
       shape  obj=new shape();
        obj.area(5.0);
        obj.area(2,3);
        obj.area(2.0f, 9.7f);

    }

    
}



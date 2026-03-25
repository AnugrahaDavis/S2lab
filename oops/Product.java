// import java.util.Scanner;

public class Product{

    int Pcode;
    String Pname;
    int Pprice;

    void details(int code,String name,int price){
    this.Pcode = code;
    this.Pname = name;
    this.Pprice= price;
}

    public static void main(String[] args){

        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
     
     p1.details(123,"Dell",600000);
     p2.details(345,"HP",500000);
     p3.details(546,"Acer",700000);

     if(p1.Pprice<p2.Pprice && p1.Pprice<p3.Pprice){
        System.out.println(p1.Pname+"has lowest price");
     }
     else if(p2.Pprice<p3.Pprice){
         System.out.println(p2.Pname+"has lowest price");

     }
     else {
        System.out.println(p3.Pname+"has lowest  price");
     }

    }
}
interface anu{
    final int a = 10;
    void display();
}

class Test implements anu{
    public void display(){
        System.out.println("Hi");
    }
}

 class interfacea{
    public static void main(String args[])
    {
        Test t = new Test();
        t.display();
        System.out.println(t.a);
    }
}
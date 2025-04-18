class A{
    int a=10;

    void printA(){
        System.out.println("This is from A");
    }
}
class B extends A{
     void printB(){
        System.out.println("This is from B");
    }
    //void printA(){
      //  System.out.println("This is from B");
   // }
}

public class SingleInheritance{
    public static void main(String args[]){
        B obj = new B();
        System.out.println(obj.a);
        obj.printA();
        obj.printB();
    }
}

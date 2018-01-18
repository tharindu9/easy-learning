class Calculation {
   int z;
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("x+y="+z);
   }
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("x-y"+z);
   }
}
public class My_Calculation extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("x*y"+z);
   }
   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation cal = new My_Calculation();
      cal.addition(a, b);
      cal.Subtraction(a, b);
      cal.multiplication(a, b);
   }
}

//Method overloading
class A{
   public void print(){
     System.out.println("A");
   }
}
public class B extends A{
    public  void print(){
     System.out.println("B");
   }
   public static void main(String[] args){
       B b =new B();
       b.print();
   }
}
//Calculator functions after overloading
class Calculation {
   int z;
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("x+y="+z);
   }

   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("x-y="+z);
   }
}
public class My_Calculation extends Calculation {

   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("x*y"+z);
   }

   public void Subtraction(int x, int y) {
      z = y-x;
      System.out.println("x-y="+z);
   }

   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation cal = new My_Calculation();
      Calculation cal1=new Calculation();
      cal.addition(a, b);
      cal.Subtraction(a, b);
      cal1.Subtraction(a, b);
      cal.multiplication(a, b);
   }
}
//With super key word
class SuperClass{
         String myName,myColor;

         SuperClass(String name,String color){//superclass constructor
              myName=name;
              myColor=color;
         }
         public void printColor(){
             System.out.println("super color");
         }
     }
    
     public class SubClass extends SuperClass{
         SubClass(){//call to super class constructor
             super("jof","white");
         }
        
         public void printColor(){
             super.printColor();//calling to superclass printColor method.
             System.out.println("I am from sub.");
         }
        
         public static void main(String[] a){
             SubClass ob= new SubClass();
             ob.printColor();
         }
     }

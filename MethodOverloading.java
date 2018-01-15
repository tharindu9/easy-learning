//Wrong code...error: method method1() is already defined in class Test
    public static void method1(){
public class Test{
    public static void method1(){
        System.out.println("method");
    }
    public static void method1(){
        System.out.println("method2");
    }
     public static void main(String[] args) {
        method1();
    }

}
//Correct code...with method overloading
public class Test{

    public static void method1(int x){

        System.out.println(x);

    }

    public static void method1(){

        System.out.println("method2");

    }

     public static void main(String[] args) {

        method1(5);

    }

}
//a very simple example
public class Example{
   public static void print(int x){
        System.out.println("I am an integer " + x);
    }
   public static void print(String x){
        System.out.println("I am a String " + x);
    }
    public static void print(float x){

        System.out.println("I am a float " +x);
    }
    public static void main(String args[]){
        print(5);
       print("holle");
        print(5.5f);
    } 
}


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
//Correct code...
public class Test{

    public static void method1(int x){

        System.out.println("method1");

    }

    public static void method1(){

        System.out.println("method2");

    }

     public static void main(String[] args) {

        method1(5);

    }

}

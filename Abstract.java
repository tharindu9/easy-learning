
//basic example for abstract class
abstract class Vehicle{
    abstract void move();
}
class Car extends Vehicle{
    public void move(){
         System.out.println("Cars are moving");
    }
}

public class Test{

     public static void main(String []args){
        Vehicle car = new Car();
        car.move();
     }
}

//An real world example
abstract class Bank{   
    abstract int getRateOfInterest();   
    } 
   
    class HNB extends Bank{   
    int getRateOfInterest(){
        return 7;
    }   
    }
   
    class NSB extends Bank{   
    int getRateOfInterest(){
        return 8;
    }   
    }   
       
    public class TestBank{   
    public static void main(String args[]){   
    Bank hnb =new HNB(); 
    
    System.out.println("Rate of Interest of HNB  is: "+hnb.getRateOfInterest()+" %");   
    Bank nsb =new NSB(); 
    System.out.println("Rate of Interest of NSB is: "+nsb.getRateOfInterest()+" %");   
    }
       
    }

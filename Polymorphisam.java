class Vehical{

    public void move(){

        //System.out.println();;

    }

}

class Car extends Vehical{

    public void move(){

        System.out.println("Car can move");

       

    }

}

class Van extends Vehical{

    public void move(){

        System.out.println("Van can move");

       

    }

}

class Bus extends Vehical{

    public void move(){

        System.out.println("Bus can move");

       

    }

}


public class Test{

    public static void main(String[] args){

        Vehical car = new Car();

        car.move();

         Vehical van = new Van();

        van.move();

         Vehical bus = new Bus();

        bus.move();

    }

}

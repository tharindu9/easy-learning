class Encapsulation{


    private String name;


    public void setName(String name){

        this.name=name;

    }

    public String getName(){

        return name;

    }

}


public class Test{

   

     public static void main(String []args){

        Encapsulation ob = new Encapsulation();

        ob.setName("Tharindu");

        System.out.println(ob.getName());

     }

} 





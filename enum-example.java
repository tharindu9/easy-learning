
//Creating Outer enum 
enum Day{
    SUNDAY("low") , MONDAY("heigh"),
    TUESDAY("medium"), WEDNESDAY("medium"),
    THURSDAY ("medium"), FRIDAY("heigh") ,SATURDAY("low");

    private String trafic;
    Day(String trafic){
        this.trafic = trafic;
    }
    
    public String getTrafic(){
        return this.trafic;
    }
}

class EnumInner{
    enum Season{
        SUMMER, WINTER, SPRING, FALL
    }
}

public class EnumDemo{

    public static void main(String[] args) {
        //Accessing Day enum out of any class
        Day day = Day.FRIDAY;
        String trfic = day.getTrafic();//getting traffic of friday 
        //Accessing enum Season inside EnumInner class
        EnumInner.Season season = EnumInner.Season.SUMMER;
        EnumInner enumInner = new EnumInner();
        System.out.println(season);
        System.out.println( season instanceof Enum);// true
        
        //enu with switch statements
        switch (season){
            case SUMMER:
                System.out.println("summer");
                break;
            case FALL:
                System.out.println("fall");
                break;
            case SPRING:
                System.out.println("spring");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }
}

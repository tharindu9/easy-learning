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

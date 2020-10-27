import java.util.*;

class Main {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Введіть сторону а: ");
     int a = in.nextInt();

     System.out.print("Введіть сторону b: ");
     int b = in.nextInt();

     System.out.print("Введіть сторону с: ");
     int c = in.nextInt();

    if(a + b <= c || b + c <= a || a + c <= b ) {
      System.out.println("Трикутника не існує");
     }
    else {

      if((a*a + b*b) == c*c) {
        System.out.printf(" кут С - прямий,%nкут A - гострий,%n кут B - гострий");
      }

      else if((b*b + c*c) == a*a) {
        System.out.printf(" кут A - прямий,%nкут B - гострий,%n кут C - гострий");
      }

      else if((a*a + c*c) == b*b) {
        System.out.printf(" кут B - прямий,%nкут A - гострий,%n кут C - гострий");
      }

      else if((a*a + b*b) < c*c) {
        System.out.printf(" кут С - тупий,%n кут A - гострий,%n кут B - гострий");
      }

      else if((b*b + c*c) < a*a) {
        System.out.printf(" кут A - тупий,%n кут B - гострий,%n кут C - гострий");
      }

      else if((a*a + c*c) < b*b) {
        System.out.printf(" кут B - тупий,%n кут A - гострий,%n кут C - гострий");
      }

      else{
        System.out.printf(" кут A - гострий,%n кут B - гострий,%n кут C - гострий");
      }

    }
  }
}
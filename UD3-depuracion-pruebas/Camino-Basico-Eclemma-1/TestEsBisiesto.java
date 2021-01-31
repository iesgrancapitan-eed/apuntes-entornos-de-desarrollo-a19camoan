import java.util.Scanner;

public class TestEsBisiesto {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Mete el año: ");
    int anno = s.nextInt();

    if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
      System.out.println("Es bisiesto.");
    }
    else System.out.println("No es bisiesto.");


    s.close();
  }

}

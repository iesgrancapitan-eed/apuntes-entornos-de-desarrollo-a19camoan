public class TestEsBisiesto {

  public static void main(String[] args) {

    System.out.println(esBisiesto(100) ? "BISIESTO" : "NO BISIESTO");
    System.out.println(esBisiesto(400) ? "BISIESTO" : "NO BISIESTO");
    System.out.println(esBisiesto(416) ? "BISIESTO" : "NO BISIESTO");
    System.out.println(esBisiesto(3) ? "BISIESTO" : "NO BISIESTO");
    
  }

  public static boolean esBisiesto(int anno) {
    return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
  }
}

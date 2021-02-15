package pruebasUnitarias;

public class Numero {

  public enum NumeroTipo {
    MAYOR, MENOR, CERO
  }

  public static void  main(String[] args) {
    System.out.println(esMayorMenorCero(100) == NumeroTipo.MAYOR ? "OK" : "ERROR");
    System.out.println(esMayorMenorCero(0) == NumeroTipo.MAYOR ? "OK" : "ERROR");
    System.out.println(esMayorMenorCero(-100) == NumeroTipo.MAYOR ? "OK" : "ERROR");
  }

  static NumeroTipo esMayorMenorCero(int numero) {
    NumeroTipo resultado;
    if (numero > 0) // 2
      resultado = NumeroTipo.MAYOR; // 3
    else if (numero < 0) // 4
      resultado = NumeroTipo.MENOR; // 5
    else
      resultado = NumeroTipo.CERO; // 6
    return resultado; // 7
  }

}

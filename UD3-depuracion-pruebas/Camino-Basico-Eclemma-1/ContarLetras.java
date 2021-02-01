public class ContarLetras {
  public static void main(String[] args)  {

    System.out.println(contarLetras("patata", 'a'));
    System.out.println(contarLetras("Romero", 'a'));
    System.out.println(contarLetras("", 'T'));

  }

  private static int contarLetras(String string, char letra) {
    int posicion = 0, contador = 0, longitud = string.length();

    do {
      if (longitud > 0) {
        if (string.charAt(posicion) == letra)
          contador++;
        posicion++;
        longitud--;

      }
    } while (longitud > 0);
    return contador;
  }
}
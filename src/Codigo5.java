import java.util.Scanner;


/*
 * Los cambios realizados en este codigo fueron:
 * -Se importó la Scanner de java.util
 * -Se agregó el metodo main para ingresar todos los atributos dentro del mismo
 * - Se agrego el parametro (System.in)del constructor Scanner
 * --Se cambio la comilla simple por doble comilla
 * --Se cambio el tipo de dato de la variable ni a int
 * -Modificando lo que devolveria la variable ni a s.nextInt()
 * */
public class Codigo5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Introduzca un número: ");

	    int ni = s.nextInt();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	}
	  
}

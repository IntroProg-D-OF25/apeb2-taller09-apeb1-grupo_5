import java.util.Scanner;
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("INGRESE UN NUMERO LIMITE");
        num = teclado.nextInt();
        System.out.println("FIGURA 1: ");
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("FIGURA 2: ");
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }  
        System.out.println("");
        System.out.println("FIGURA 3: ");
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }  
        for (int i = (num - 1) ; i > 0; i--) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }          
    }
}
/**
INGRESE UN NUMERO LIMITE
10
FIGURA 1: 

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 

FIGURA 2: 

         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 

FIGURA 3: 

         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 
 */
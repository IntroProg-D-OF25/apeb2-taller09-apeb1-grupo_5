

/**
 *Ejercicio 4
Dado el arreglo; determinar cuantos elementos están arriba de la media
* aritmética y cuantos están por debajo de la medía aritmética.

int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author PC
 */
public class Ejercicio4_t9 {
    public static void main(String[] args) {
        int[] numeros = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int mediaA = 0, cont1 = 0, cont2 = 0, cont3 = 0;
       
        for (int i = 0; i < numeros.length; i++) {
            mediaA += numeros[i];
            
        }
        mediaA /= numeros.length;
        System.out.println("La media aritmetica es: " + mediaA);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mediaA){
                cont1 ++;
            }else if (numeros [i] < mediaA){
                cont2 ++;
            }else{
                cont3 ++;
            }
        }
        System.out.println("Numeros arriba de la media aritmetica: " + cont1);
        System.out.println("Numeros bajo la media aritmetica: " + cont2);
        System.out.println("Numeros iguales a la media aritmetica: " + cont3);
    }
}

/**
 * Salida: debug:
La media aritmetica es: 9
Numeros arriba de la media aritmetica: 8
Numeros bajo la media aritmetica: 4
Numeros iguales a la media aritmetica: 1
BUILD SUCCESSFUL (total time: 1 second)
 */
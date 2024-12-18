
/**
 * Ejercicio 5
Dados los siguientes arreglos

double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
"Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
Genere los datos para el arreglo

String[] promediosCualitativos = new String[7];

Promedio Regular son todas las notas >=0 y <=5.9
Promedio Bueno son todas las notas >=6 y <=8.9
Promedio Sobresaliente son todas las notas >=9 y <=10
 * @author PC
 */
public class Ejercicio5_t9 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};

        String promcuant;

        System.out.printf("%-20s %-10s %-20s\n", "Nombre del Estudiante", "Promedio", "Promedio Cuantitativo");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < estudiantes.length; i++) {
            if (promedios[i] >= 9) {
                promcuant = "Sobresaliente";
            } else if (promedios[i] >= 6) {
                promcuant = "Bueno";
            } else {
                promcuant = "Regular";
            }
            System.out.printf("%-20s %-10.2f %-20s\n", estudiantes[i], promedios[i], promcuant);
        }
    }
}

/**
 * debug:
Nombre del Estudiante Promedio   Promedio Cuantitativo
-------------------------------------------------------------
Kimberly Gonzalez    10,00      Sobresaliente       
Mark Hogan           10,00      Sobresaliente       
Teresa Martinez      9,10       Sobresaliente       
Julia Johnson        7,00       Bueno               
Mark Cook            6,10       Bueno               
Jennifer Manning     4,00       Regular             
Juan Vasquez         8,00       Bueno               
BUILD SUCCESSFUL (total time: 3 seconds)
 */
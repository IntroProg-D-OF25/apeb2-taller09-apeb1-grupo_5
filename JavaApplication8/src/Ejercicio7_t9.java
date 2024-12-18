

/**
 *Ejercicios 7
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al
finalizar el ciclo, la Dirección de la carrera de Computación a solicitado
las siguientes estadísticas en función a los promedios obtenidos del ciclo por 
estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no
ingrese el valor, si se debe autogenerar).

Promedio del ciclo, del paralelo C.
Listado de estudiantes con su nota por encima del promedio.
Listado de estudiantes con su nota por debajo del promedio.
Estudiante con la mejor calificación.
Estudiante con la calificación mas baja.
 * @author PC
 */
public class Ejercicio7_t9 {
        public static void main(String[] args) {
        double[] notas = new double[28];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;  
        }
        
        double suma = 0;
        System.out.println("Notas de los estudiantes:");
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            System.out.printf("Estudiante %d: %.2f%n", i + 1, notas[i]); 
        }
        double promedio = suma / notas.length;
        System.out.println("\nEl promedio del curso es: " + promedio);

        int aprobados = 0;
        int reprobados = 0;

        System.out.println("\nEstudiantes que aprobaron:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedio) {
                aprobados++;
                System.out.printf("Estudiante %d: %.2f%n", i + 1, notas[i]);
            }
        }

        System.out.println("\nEstudiantes que reprobaron:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <= promedio) {
                reprobados++;
                System.out.printf("Estudiante %d: %.2f%n", i + 1, notas[i]);
            }
        }

        System.out.println("\nTotal de estudiantes que aprobaron: " + aprobados);
        System.out.println("Total de estudiantes que reprobaron: " + reprobados);

        double mejorNota = notas[0];
        double peorNota = notas[0];
        int mejorEstudiante = 0;
        int peorEstudiante = 0;

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                mejorEstudiante = i;
            }
            if (notas[i] < peorNota) {
                peorNota = notas[i];
                peorEstudiante = i;
            }
        }
        
        System.out.printf("%nLa mejor nota es %.2f y la tiene el estudiante %d.%n", mejorNota, mejorEstudiante + 1);
        System.out.printf("La peor nota es %.2f y la tiene el estudiante %d.%n", peorNota, peorEstudiante + 1);
    }
}

/**
 * debug:
Notas de los estudiantes:
Estudiante 1: 2,05
Estudiante 2: 6,46
Estudiante 3: 9,87
Estudiante 4: 3,86
Estudiante 5: 7,51
Estudiante 6: 7,86
Estudiante 7: 2,17
Estudiante 8: 7,90
Estudiante 9: 9,97
Estudiante 10: 9,13
Estudiante 11: 8,95
Estudiante 12: 2,66
Estudiante 13: 1,49
Estudiante 14: 1,28
Estudiante 15: 5,62
Estudiante 16: 1,01
Estudiante 17: 3,33
Estudiante 18: 0,30
Estudiante 19: 6,68
Estudiante 20: 3,22
Estudiante 21: 9,83
Estudiante 22: 7,99
Estudiante 23: 6,70
Estudiante 24: 9,21
Estudiante 25: 8,00
Estudiante 26: 7,69
Estudiante 27: 0,42
Estudiante 28: 3,88

El promedio del curso es: 5.537681295527477

Estudiantes que aprobaron:
Estudiante 2: 6,46
Estudiante 3: 9,87
Estudiante 5: 7,51
Estudiante 6: 7,86
Estudiante 8: 7,90
Estudiante 9: 9,97
Estudiante 10: 9,13
Estudiante 11: 8,95
Estudiante 15: 5,62
Estudiante 19: 6,68
Estudiante 21: 9,83
Estudiante 22: 7,99
Estudiante 23: 6,70
Estudiante 24: 9,21
Estudiante 25: 8,00
Estudiante 26: 7,69

Estudiantes que reprobaron:
Estudiante 1: 2,05
Estudiante 4: 3,86
Estudiante 7: 2,17
Estudiante 12: 2,66
Estudiante 13: 1,49
Estudiante 14: 1,28
Estudiante 16: 1,01
Estudiante 17: 3,33
Estudiante 18: 0,30
Estudiante 20: 3,22
Estudiante 27: 0,42
Estudiante 28: 3,88

Total de estudiantes que aprobaron: 16
Total de estudiantes que reprobaron: 12

La mejor nota es 9,97 y la tiene el estudiante 9.
La peor nota es 0,30 y la tiene el estudiante 18.
BUILD SUCCESSFUL (total time: 2 seconds)

 */
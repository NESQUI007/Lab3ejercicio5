
package lab3ejercicio5;
import java.util.Scanner;
public class Lab3ejercicio5 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         float part, primerp1, segundop2, examenfn, rfinal;
         
        System.out.println("Ingrese el porcentaje obtenido de Participacion sobre 10%:");
        part = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje obtenido de Primer Parcial sobre 25%:");
        primerp1 = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje obtenido del Segundo Parcial sobre 25%:");
        segundop2 = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje obtenido del Examen Final sobre 40%:");
        examenfn = entrada.nextFloat();
        
        rfinal = part + primerp1 + segundop2 + examenfn;
        
        System.out.println("La calificacion Final es de: "+ rfinal + "%");
        
         }
}

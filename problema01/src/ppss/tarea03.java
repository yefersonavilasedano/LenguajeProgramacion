/*
 * Algoritmo para hallar el área
 */
package ppss;

import java.util.Scanner;

/**
 *
 * @author AVILA SEDANO YEFERSON
 */
public class tarea03 {
    public static void main(String[] args) {
        Scanner tecladorectangulo = new Scanner(System.in);
        int area, base, altura, perimetro;
        
        System.out.println("Ingrese el valor de la base : ");
        base = Integer.parseInt(tecladorectangulo.nextLine());
        System.out.println("Ingrese el valor de la altura : ");
        altura = Integer.parseInt(tecladorectangulo.nextLine());
        area = base * altura ;
        System.out.print("El valor del área es :" + area);
        perimetro = 2 * (base + altura);
        System.out.print("El valor del perimetr o es : " + perimetro);
    }
}

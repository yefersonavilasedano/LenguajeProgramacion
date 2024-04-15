/*
 * Determinar el área total de un cilindro
 * Determinar el volumen cilindro
 */
package ppss;

import java.util.Scanner;
/**
 *
 * @author AVILA SEDANO YEFERSON YEFERSON
 */
public class tarea04 {
    public static void main(String[] args) {
        float pi, area, altura, rad, volumen;
        
        pi = 3.1416F;
        
        Scanner tecladocilindro = new Scanner (System.in);

        System.out.println("Ingrese la altura del cilindro :");
        altura = Float.parseFloat(tecladocilindro.nextLine());
        
        System.out.println("Ingrese el valor del radio del cilindro :");
        rad = Float.parseFloat(tecladocilindro.nextLine());
        
        area = 2 * pi * rad *(rad + altura) ;
        System.out.print("El area total del cilindro es: " + area);
        System.out.println();
        volumen = pi * rad * rad * altura;
        System.out.print("El volumen del cilindro es : " + volumen);
    }
}


package reto3.puntuaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3Puntuaciones {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int puntaje;
        
        Guerrero persGuerrero = new Guerrero();
        Mago persMago = new Mago();
        Constructor persConstructor = new Constructor();
        
        System.out.println("Ingrese el puntaje para el constructor: ");
        puntaje = Integer.parseInt(entrada.readLine());
        persConstructor.setPuntaje(puntaje);
        System.out.println("Ingrese el puntaje para el mago: ");
        puntaje = Integer.parseInt(entrada.readLine());
        persMago.setPuntaje(puntaje);
        System.out.println("Ingrese el puntaje para el guerrero: ");
        puntaje = Integer.parseInt(entrada.readLine());
        persGuerrero.setPuntaje(puntaje);
    }
    
}

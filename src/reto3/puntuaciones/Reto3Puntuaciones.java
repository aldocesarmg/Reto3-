
package reto3.puntuaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3Puntuaciones {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int puntaje, temp;
        int[] valores = new int[3];
        String[] personajes = new String[3];
        
        
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
        
        valores[0] = persConstructor.getPuntaje();
        valores[1] = persMago.getPuntaje();
        valores[2] = persGuerrero.getPuntaje();

           for(int r = 0; r < valores.length; r++){
               for(int j = 0; j < valores.length - 1; j++){
                   if(valores[j] > valores[j + 1]){
                   temp = valores[j];
                   valores[j] = valores[j + 1];
                   valores[j + 1] = temp;
                   }
               }
           }
           
           for(int y = 0; y < valores.length; y++){
               if(persConstructor.getPuntaje() == valores[y]){
                   personajes[y] = "Constructor";
               }else if(persMago.getPuntaje() == valores[y]){
                   personajes[y] = "Mago";
               }else if(persGuerrero.getPuntaje() == valores[y]){
                   personajes[y] = "Guerrero";
               }
           }
           
           System.out.println("El personaje con mayor puntuación es: "+personajes[2]);
           
           System.out.println("El orden de los puntajes fue:");
           for(int y = 0; y < valores.length; y++){
               System.out.println(personajes[y]+" obtuvo "+valores[y]+" puntos.");
           }

    }
    
}


package reto3.puntuaciones;

public class Mago {
    private int puntaje;
    private String nomPersonaje;

    public Mago(int puntaje, String nomPersonaje) {
        this.puntaje = puntaje;
        this.nomPersonaje = nomPersonaje;
    }

    public Mago(int puntaje) {
        this.puntaje = puntaje;
    }

    public Mago(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }

    public Mago() {
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNomPersonaje() {
        return nomPersonaje;
    }

    public void setNomPersonaje(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }
    
    
}


package reto3.puntuaciones;

public class Guerrero {
    private int puntaje;
    private String nomPersonaje;

    public Guerrero(int puntaje, String nomPersonaje) {
        this.puntaje = puntaje;
        this.nomPersonaje = nomPersonaje;
    }

    public Guerrero(int puntaje) {
        this.puntaje = puntaje;
    }

    public Guerrero(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }

    public Guerrero() {
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


package reto3.puntuaciones;

public class Constructor {
    private int puntaje;
    private String nomPersonaje;

    public Constructor(int puntaje, String nomPersonaje) {
        this.puntaje = puntaje;
        this.nomPersonaje = nomPersonaje;
    }
    
    public Constructor(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }
    
    public Constructor(int puntaje) {
        this.puntaje = puntaje;
    }

    public Constructor() {
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

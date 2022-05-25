public class UsuarioJuego {
    /* Atributos */
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;
    /* Atributos */

    /* Metodos */
    public UsuarioJuego(String nombre, String clave){
        System.out.println("Nivel " + this.nivel);

    }

    public int subirNivel() {
        return  this.nivel += 1;
    }

    public void bonus(int valor) {

    }
    /* Metodos */

    /* Getter y Setters */
    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return  nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    /* Getter y Setters */
}

/**
 * La clase JugadorPoker representa un jugador de póker.
 * Almacena información: nombre, edad, sexo y posición en el torneo de Poker.
 * Contiene métodos para acceder y modificar los atributos. También incluye un 
 * método para celebrar la victoria.
 */
public class JugadorPoker {
    
    /**
     * Nombre del jugador de póker.
     */
    private String nombrePoker;

    /**
     * Edad del jugador de póker.
     */
    private int edadPoker;

    /**
     * Sexo del jugador de póker.
     */
    private String sexoPoker;

    /**
     * Posición del jugador de póker en el torneo.
     */
    private int posicionTorneo;

    /**
     * Constructor por defecto. 
     */
    public JugadorPoker() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombrePoker {String} - Nombre del jugador de póker.
     * @param edadPoker {Int} - Edad del jugador de póker.
     * @param sexoPoker {String} - Sexo del jugador de póker.
     * @param posicionTorneo {Int} - Posición en el torneo del jugador.
     */
    public JugadorPoker(String nombrePoker, int edadPoker, String sexoPoker, int posicionTorneo) {
        this.nombrePoker = nombrePoker;
        this.edadPoker = edadPoker;
        this.sexoPoker = sexoPoker;
        this.posicionTorneo = posicionTorneo;
    }

    /**
     * Obtenemos el nombre del jugador.
     * @return - El nombre del jugador.
     */
    public String getNombrePoker() {
        return nombrePoker;
    }

    /**
     * Establece el nombre del jugador de póker.
     * @param nombrePoker {String} - Nombre que se le asignará al jugador.
     */
    public void setNombrePoker(String nombrePoker) {
        this.nombrePoker = nombrePoker;
    }

     /**
     * Obtiene la edad del jugador de póker.
     * @return - La edad del jugador.
     */
    public int getEdadPoker() {
        return edadPoker;
    }

    /**
     * Establece la edad del jugador de póker.
     * @param edadPoker {Int} - Edad que se le asignará al jugador.
     */
    public void setEdadPoker(int edadPoker) {
        this.edadPoker = edadPoker;
    }

    /**
     * Obtiene el sexo del jugador de póker.
     * @return El sexo del jugador.
     */
    public String getSexoPoker() {
        return sexoPoker;
    }

    /**
     * Establece el sexo del jugador de póker.
     * @param sexoPoker {String} - Sexo que se le asignará al jugador.
     */
    public void setSexoPoker(String sexoPoker) {
        this.sexoPoker = sexoPoker;
    }

    /**
     * Obtiene la posición del jugador en el torneo.
     * @return La posición en el torneo.
     */
    public int getPosicionTorneo() {
        return posicionTorneo;
    }

    /**
     * Establece la posición del jugador en el torneo.
     * @param posicionTorneo {Int} - Posición en la que quedó el jugador.
     */
    public void setPosicionTorneo(int posicionTorneo) {
        this.posicionTorneo = posicionTorneo;
    }

    // Método addicional
    /**
     * Método para que el jugador celebre una victoria.
     */
    public void celebrarVictoria(){
        System.out.println(nombrePoker + " dice: " + "¡He ganado cabrones!");
    }

    /**
     * Sobreescribe para mostrar cadena de texto.
     * @return - Cadena que contiene los returns de los diferentes atributos.
     */
    @Override
    public String toString() {
        return "Nombre Poker: " + nombrePoker
                + "; " +
                "Edad Poker: " + edadPoker + "; " +
                "SexoPoker: " + sexoPoker
                + "; " +
                "Posición Torneo: " + posicionTorneo;
    }

}

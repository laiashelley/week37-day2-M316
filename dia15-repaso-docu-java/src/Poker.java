import java.util.ArrayList;

/**
 * Clase principal Poker.
 * Esta clase es sobre un torneo de póker donde se crean varios jugadores.
 */
public class Poker {
    public static void main(String[] args) throws Exception {
        
        // Creación de jugadores con sus respectivos atributos
        JugadorPoker poker1 = new JugadorPoker("Laia", 28, "Mujer", 2); 
        JugadorPoker poker2 = new JugadorPoker("Eric", 30, "Hombre", 1);
        JugadorPoker poker3 = new JugadorPoker("Cooper", 10, "Macho", 3);
        JugadorPoker poker4 =  new JugadorPoker("Gennai", 11, "Hembra", 4);
        JugadorPoker poker5 = new JugadorPoker("Mars", 4, "Macho", 5);
        JugadorPoker poker6 = new JugadorPoker("Taichi", 4, "Hembra", 6);

        // Creación de una lista para almacenar los jugadores.

        ArrayList <JugadorPoker> listaJugadores = new ArrayList<>();

        // Añadir a lista los diferentes jugadores.

        listaJugadores.add(poker1);
        listaJugadores.add(poker2);
        listaJugadores.add(poker3);
        listaJugadores.add(poker4);
        listaJugadores.add(poker5);
        listaJugadores.add(poker6);

        // Mostrar todos los jugadores almacenados en la lista.

        for (JugadorPoker poker : listaJugadores) {
            System.out.println(poker);
        }
        
        // Determinar el ganador basándose en la posición en el torneo.

        JugadorPoker ganadorPoker = listaJugadores.get(0);
        
         // Recorre la lista para encontrar al jugador con la posición más baja
         for (JugadorPoker poker : listaJugadores) {
             if (poker.getPosicionTorneo() < ganadorPoker.getPosicionTorneo()) {
                 ganadorPoker = poker;
             }
         }

        // Mostrar el nombre del ganador y hacer que celebre su victoria.
        System.out.println("El ganador es: " + ganadorPoker.getNombrePoker());
        ganadorPoker.celebrarVictoria();

    }
}

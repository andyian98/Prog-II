
package TPE.Estrategias;

import java.util.ArrayList;

public class Timbero implements Estrategia {
    @Override
    public Atributo seleccionarAtributo(Jugador primerJugador){
        
        ArrayList<Atributo> atris = new ArrayList<>();
        atris.addAll(primerJugador.getAtributosCarta());
        int numero = (int) (Math.random()*(atris.length()));
        Atributo atElegido=atris<numero>; 
        System.out.println(primerJugador+"selecciona competir por el atributo "+atElegido.getNombre());
        System.out.println("La carta es "+primerJugador.tomarCarta()+" con "+atElegido.getNombre()+atElegido.getValor());
        return atElegido;
    }

}

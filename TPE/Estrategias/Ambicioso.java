
package TPE.Estrategias;

import java.util.ArrayList;

public class Ambicioso implements Estrategia {
    @Override
    public Atributo seleccionarAtributo(Jugador primerJugador){
        ArrayList<Atributo> atris = new ArrayList<>();       
        atris.addAll(primerJugador.getAtributosCarta());
        int num=obtenerMayor(atris);
        Atributo atElegido=atris<num>; 
        System.out.Println(primerJugador.getNombre()+"selecciona competir por el atributo "+atElegido.getNombre());
        System.out.println("La carta es "+primerJugador.tomarCarta()+" con "+atElegido.getNombre()+atElegido.getValor());
        return atElegido;
    }

    public int obtenerMayor(ArrayList<Atributo> atris) {
        int mayor = -1;
        for (Atributo a : atris) {
            if (a.getValor() > mayor) {
                mayor = a.getValor();

            }
        }
        return mayor;
    }

}

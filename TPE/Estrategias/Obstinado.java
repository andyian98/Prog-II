
package TPE.Estrategias;

import java.util.ArrayList;

public class Obstinado implements Estrategia {

    private String nombreAtributo;

    public Obstinado(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    @Override
    public Atributo seleccionarAtributo(Jugador primerJugador){
        int numPos=0;
        ArrayList<Atributo> atris = new ArrayList<>();       
        atris.addAll(primerJugador.getAtributosCarta());
        Atributo atElegido= getAtributoPorNombre(nombreAtributo); //TO DO
        System.out.println(primerJugador+"selecciona competir por el atributo "+atElegido.getNombre())
        System.out.println("La carta es "+primerJugador.tomarCarta()+" con "+atElegido.getNombre()+atElegido.getValor());
        return atElegido;
        
    }

}

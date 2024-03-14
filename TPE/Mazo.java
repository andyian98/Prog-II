package TPE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    ArrayList<Carta> cartas;

    public Mazo(){
        cartas= new ArrayList<>()
    }

    public void addCartas(Carta carta) {
        cartas.add(carta);
    }

    public boolean verificar() {
        verificarCartas();
    }

    public Carta obtenerCarta(){

    private Carta aux = this.cartas<0>;
        cartas.remove(0);
        return aux;
    }

    public int getCantidadCartas() {
        return cartas.size();
    }

    public void agregarCartasAlFinal(ArrayList<Carta> nuevasCartas) {
        cartas.addAll(nuevasCartas);
    }

    public ArrayList<Carta> getCartas() {
        ArrayList<Carta> aux = new ArrayList<>();
        aux.addAll(cartas);
        return aux;
    }
}

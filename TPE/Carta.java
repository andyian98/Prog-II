package TPE;

import java.util.ArrayList;
import java.util.Collections;

public class Carta {
    private String personaje;
    private ArrayList<Atributo> atributos;

    public Carta(String personaje) {
        this.personaje = personaje;
        this.atributos = new ArrayList<>();
    }

    public void addAtributos(Atributo a) {
        atributos.add(a);
    }

    public int getValorAtributo(String nombreAtributo) {
        for (Atributo a : atributos) {
            if (a.getNombre().equals(nombreAtributo)) {
                return a.getValor();
            }

        }
        return 0;
    }

    public ArrayList<Atributo> getAtributos() {
        ArrayList<Atributo> aux = new ArrayList<>();
        aux.addAll(atributos);
        return aux;
    }

    public void setPersonaje(String nombre) {
        this.personaje = nombre;
    }

    public String getPersonaje() {
        return personaje;
    }

    public int getCantAtributos() {
        return (atributos.length());
    }

    public boolean tieneAtributo(Atributo a){

    private boolean tiene=true;
    for(int i = 0;i<this.atributos.length();i++){
            if(!(this.atributos<i>.equals(a))){
                tiene=false;
            }
        }return tiene;
    }

    public boolean verificarCartas(Carta c){

        private boolean validez = true;
        if(this.getCantAtributos()!=c.getCantAtributos())
        {
            return false;
        }else{
                    for(int i=0; i<atributos.length; i++){
                        if(!c.tieneAtributo(this.atributos<i>)){
                            validez=false;
                        }
                
                }
                return validez;
        }

}
}

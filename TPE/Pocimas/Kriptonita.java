package TPE.Pocimas;

public class Kriptonita implements Pocima {
    @Override
    public void aplicar(Carta carta) {
        for (Atributo atributo : carta.getAtributos()) {
            int nuevoValor = (int) (atributo.getValor() * 0.75);
            atributo.setValor(nuevoValor);
        }
    }
}

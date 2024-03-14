package TPE.Pocimas;

public class Fortalecedora implements Pocima {
    @Override
    public void aplicar(Carta carta) {
        for (Atributo atributo : carta.getAtributos()) {
            int nuevoValor = (int) (atributo.getValor() * 1.2);
            atributo.setValor(nuevoValor);
        }
    }
}


public class CondicioPesoMenor extends Condicion {

	 int pesoBuscado;
	@Override
	public boolean cumple(Elemento e) {
		return e.getPeso()<pesoBuscado;
	}

}

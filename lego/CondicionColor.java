
public class CondicionColor extends Condicion {

	 String colorBuscado;
	@Override
	public boolean cumple(Elemento e) {
     return e.getColor().equals(colorBuscado);
	}

}

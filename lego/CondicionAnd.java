
public class CondicionAnd extends Condicion {

	Condicion c1,c2;
	@Override
	public boolean cumple(Elemento e) {
		
		return c1.cumple(e) && c2.cumple(e);
	}

}

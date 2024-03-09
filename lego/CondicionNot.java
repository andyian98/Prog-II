
public class CondicionNot extends Condicion {

	Condicion c1;
	@Override
	public boolean cumple(Elemento e) {
		// TODO Auto-generated method stub
		return !c1.cumple(e);
	}

}

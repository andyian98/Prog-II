
public class CondicionEncastreMenor extends Condicion {

	int encastresBuscados;
	@Override
	public boolean cumple(Elemento e) {
		// TODO Auto-generated method stub
		return e.getEncastres()<encastresBuscados;
	}

}

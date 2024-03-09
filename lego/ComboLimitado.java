
public class ComboLimitado extends Combo {
   
	Condicion aceptacion;
	
	public Condicion getAceptacion() {
		return aceptacion;
	}

	public void setAceptacion(Condicion aceptacion) {
		this.aceptacion = aceptacion;
	}

	public void addElemento(Elemento e) {
		if (aceptacion.cumple(e)) {
			super.addElemento(e);
		}
	}
	
	public Combo getCopiaSimple() {
		ComboLimitado nuevo = new ComboLimitado(this.getMarca(), aceptacion);
		return nuevo;

	}

	public ComboLimitado(String m, Condicion aceptacion) {
		super(m);
		this.aceptacion = aceptacion;
	}
}

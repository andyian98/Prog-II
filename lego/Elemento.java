import java.util.ArrayList;


public abstract  class Elemento implements Comparable<Elemento>{
    
	String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public abstract int getPeso();
	public abstract String getColor();
	public abstract int getEncastres();
	public abstract double getCosto();
	
	public abstract ArrayList<Elemento> listar(Condicion c);
	
	public abstract Elemento getCopia();
	
	public abstract Elemento getCopia(Condicion c);
	
	
	public int compareTo(Elemento e) {
		int valor = this.marca.compareTo(e.getMarca());
		if (valor==0) {
			double miCosto = this.getCosto();
			double elOtroCosto = e.getCosto();
			if (miCosto>elOtroCosto) {
				return 1;
			} else if (miCosto<elOtroCosto) {
				return -1;
			} else {
				valor = this.getEncastres()-e.getEncastres();
				if (valor == 0) {
					return this.getColor().compareTo(e.getColor());
				}
			}
		}
		return valor;
	}
	
	
	public Elemento(String m) {
		marca = m;
	}
	
}

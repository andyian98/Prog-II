import java.util.ArrayList;
import java.util.Collections;

public class Combo extends Elemento {

	ArrayList<Elemento> els;
	double descuento;
	
	public Combo(String m) {
		super(m);
		els = new ArrayList<Elemento>();
	}
	
	public void addElemento(Elemento e) {
		els.add(e);
	}
	
	public int getPeso() {
	  int suma = 0;
	  for (int i =0; i<els.size();i++) {
		  Elemento ei = els.get(i);
		  suma = suma +ei.getPeso();
	  }
	  return suma;
	}

	@Override
	public String getColor() {
		int tamno = els.size();
		if (tamno>0) {
			Elemento ultimo = els.get(tamno-1);
			return ultimo.getColor();
			
		} else {
			return null;
		}
	}

	@Override
	public int getEncastres() {
		  int suma = 0;
		  for (int i =0; i<els.size();i++) {
			  Elemento ei = els.get(i);
			  suma = suma +ei.getEncastres();
		  }
		  return (int) suma/ els.size();
	}

	@Override
	public double getCosto() {
		  double suma = 0;
		  for (int i =0; i<els.size();i++) {
			  Elemento ei = els.get(i);
			  suma = suma +ei.getCosto();
		  }
		  return suma - suma*descuento;
	}

	@Override
	public ArrayList<Elemento> listar(Condicion c) {
		ArrayList<Elemento> salida = new ArrayList<Elemento>();
		
		if (c.cumple(this)) {
			salida.add(this);
		} else { //SINO
			for(int i = 0; i< els.size(); i++) {
				salida.addAll(els.get(i).listar(c));
			}
		}
		Collections.sort(salida);
		return salida;
	}
	
	public Elemento getCopia() {
		Combo nuevo = this.copiaSimpleCombo();
		for(int i =0; i<els.size();i++) {
			Elemento ee = els.get(i);
			Elemento copia = ee.getCopia();
			nuevo.addElemento(copia);
		}
		
		return nuevo;
	}
	
	public Combo copiaSimpleCombo() {
		return new Combo(this.getMarca());
	}

	
	
	public Elemento getCopia(Condicion c) {
		Combo nuevo = this.copiaSimpleCombo();
		boolean vacio = true;
		for(int i =0; i<els.size();i++) {
			Elemento ee = els.get(i);
			Elemento copia = ee.getCopia(c);
			if (copia!= null) {
				nuevo.addElemento(copia);
				vacio = false;
			}	
		}
		if (vacio) {
			return null;
		} else {
		   return nuevo;
		}
	}
}

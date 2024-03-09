import java.util.ArrayList;

public class Pieza extends Elemento {

	private String color;
	private int peso;
	private int encastres;
	private double costo;
	
	
	
	
	public Pieza(String m,String color, int peso, int encastres, double costo) {
		super(m);
		this.color = color;
		this.peso = peso;
		this.encastres = encastres;
		this.costo = costo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEncastres() {
		return encastres;
	}
	public void setEncastres(int encastres) {
		this.encastres = encastres;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	public ArrayList<Elemento> listar(Condicion c){
		ArrayList<Elemento> salida = new ArrayList<Elemento>();
		if (c.cumple(this)) {
			salida.add(this);
		}
		return salida;
	}
	
	
	public Elemento getCopia() {
		return new Pieza(marca,color,peso,encastres,costo);
	}
	
	public Elemento getCopia(Condicion c) {
		if (c.cumple(this))
	    	return new Pieza(this.getMarca(),color,peso,encastres,costo);
		else 
			return null;
	}
}

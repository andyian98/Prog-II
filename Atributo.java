package TPE;

public class Atributo {
    private String nombre;
    private int valor;

    public Atributo(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(int nuevoValor) {
        this.valor = nuevoValor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        Atributo nombre = (Atributo) o;
        return this.getNombre() == nombre.getNombre();
    }

}

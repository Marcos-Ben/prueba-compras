package tienda;

import java.util.List;

public class Compras implements Comparable<Compras> {
    private double valor;
    private String descripcion;

    public Compras(double valor,String descripcion) {
        this.valor = valor;
        this.descripcion=descripcion;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int compareTo(Compras compras) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(compras.getValor()));
    }
    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripcion='" + descripcion;
    }

}

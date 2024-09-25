package tienda;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double saldo;
    private double totalSaldo;
    private List<Compras> listaCompras = new ArrayList<>();

    public TarjetaDeCredito(double saldo) {
        this.saldo = saldo;
        this.totalSaldo = totalSaldo;
        this.listaCompras = listaCompras;
    }

    public boolean hacerCompra(Compras compras){
        if(this.getSaldo() >= compras.getValor()){
            this.saldo -= compras.getValor();
            listaCompras.add(compras);
            return true;
        }
        return false;
    }
    public List<Compras> getListaCompras() {
        return listaCompras;
    }

    public double getTotalSaldo() {
        return totalSaldo;
    }

    public double getSaldo() {
        return saldo;
    }
}

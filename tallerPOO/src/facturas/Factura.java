package facturas;

import utils.Productos;

import java.util.Map;

public abstract class Factura {

private String fecha;
private String idFactura;
private double valor;
private double valorTotal;

    public Factura() {

    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public abstract double calcularValor(Map<String, Double> productos);

    public boolean validarCantidadProductos(int productos){

        return productos <= Productos.MAXIMO_PRODUCTOS;
    }

    public double calcularTotal (Map<String, Double> productos)
    {
        double total = 0;

        for (double valor:productos.values()) {
            total += valor;
        }

        return total;
    }
    public abstract void calcularIVA(double totalValor);
}

package facturas;

import utils.Productos;

public abstract class Factura {

private String fecha;
private String idFactura;
private String[] servicioOProducto = new String[4];
private double valor;
private double valorTotal;
private int contadorProductos =0;

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

    public String[] getServicioOProducto() {
        return servicioOProducto;
    }

    public void setServicioOProducto(String[] servicioOProducto) {
        this.servicioOProducto = servicioOProducto;
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

    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    public abstract double calcularValor(double[] productos, String[] compra);




}

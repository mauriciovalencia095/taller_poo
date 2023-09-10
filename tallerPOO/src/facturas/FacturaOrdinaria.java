package facturas;

import utils.Descuentos;
import utils.Productos;

public class FacturaOrdinaria extends Factura{

    public FacturaOrdinaria() {
        super();
    }

    @Override
    public double calcularValor(double[] productos, String[] compra) {
        double total= 0;

        if (compra.length < Productos.MAXIMO_PRODUCTOS) {

            setContadorProductos(compra.length) ;
            setServicioOProducto(compra);
            for( int i =0;i<productos.length;i++){
                total +=productos[i];
            }
            setValorTotal(total +(total *(Descuentos.DESCUENTO_ORDINARIA /100)));
            System.out.println("El valor total es: " + getValorTotal());

            System.out.println("El número actual de productos en su factura es: " +getContadorProductos() + " " + getServicioOProducto());
        }else {
            System.out.println("No es permitido agregar más productos a esta factura, usted ha intentado agregar:" + compra.length +" productos");
        }

        return  getValorTotal();
    }
}

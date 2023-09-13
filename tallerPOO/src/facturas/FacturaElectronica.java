package facturas;

import utils.Descuentos;
import utils.Productos;
import utils.ProductosEnum;

import java.util.Map;

public class FacturaElectronica extends Factura {

    public FacturaElectronica() {
        super();
    }

    @Override
    public double calcularValor(Map<String, Double> productos){

        double total= 0;

        if (validarCantidadProductos(productos.size())) {

            total = calcularTotal(productos);

            calcularIVA(total);

            System.out.println("El valor total es: " + getValorTotal());

            System.out.println("El número actual de productos en su factura es: " + productos.size());
        }else {
            System.out.println("No es permitido agregar más productos a esta factura, usted ha intentado agregar:" + productos.size() +" productos");
        }

        return  getValorTotal();

    }

    @Override
    public void calcularIVA(double totalValor) {
        setValorTotal(totalValor +(totalValor *(Descuentos.DESCUENTO_ELECTRONICA /100)));
    }
}

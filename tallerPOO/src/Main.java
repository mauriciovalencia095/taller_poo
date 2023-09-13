import facturas.FacturaElectronica;
import facturas.FacturaOrdinaria;
import facturas.FacturaSimplificada;
import utils.Productos;
import utils.ProductosEnum;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> productos = new HashMap<>();


        ProductosEnum JEAN = ProductosEnum.JEAN;
        ProductosEnum CAMISA = ProductosEnum.CAMISA;
        ProductosEnum RELOJ = ProductosEnum.RELOJ;

        productos.put(JEAN.getProducto(), JEAN.precio());
        productos.put(CAMISA.getProducto(), CAMISA.precio());
        productos.put(RELOJ.getProducto(), RELOJ.precio());


        FacturaElectronica facturaElectronica1 = new FacturaElectronica();
        FacturaOrdinaria facturaOrdinaria = new FacturaOrdinaria();
        FacturaSimplificada facturaSimplificada = new FacturaSimplificada();


        System.out.println("ORDINARIA\n");
        facturaOrdinaria.calcularValor(productos);
        System.out.println("SIMPLIFICADA\n");
        facturaSimplificada.calcularValor(productos);
        System.out.println("ELECTRONICA\n");
        facturaElectronica1.calcularValor(productos);


    }

}
import facturas.FacturaElectronica;
import facturas.FacturaOrdinaria;
import facturas.FacturaSimplificada;
import utils.Productos;
import utils.ProductosEnum;

public class Main {

    public static void main(String[] args) {

        ProductosEnum JEAN = ProductosEnum.JEAN;
        ProductosEnum CAMISA = ProductosEnum.CAMISA;
        ProductosEnum RELOJ = ProductosEnum.RELOJ;

        String [] comprasError= {JEAN.getProducto(),CAMISA.getProducto(),CAMISA.getProducto(),CAMISA.getProducto(),CAMISA.getProducto()};
        String [] comprasComboCompleto= {JEAN.getProducto(),CAMISA.getProducto(), RELOJ.getProducto()};
        double [] comboCompleto= {JEAN.precio(),CAMISA.precio(), RELOJ.precio()};

        FacturaElectronica facturaElectronica1 = new FacturaElectronica();
        FacturaOrdinaria facturaOrdinaria = new FacturaOrdinaria();
        FacturaSimplificada facturaSimplificada = new FacturaSimplificada();

        facturaElectronica1.calcularValor( comboCompleto,comprasError);
        facturaOrdinaria.calcularValor( comboCompleto,comprasError);
        facturaSimplificada.calcularValor( comboCompleto,comprasError);





    }

}
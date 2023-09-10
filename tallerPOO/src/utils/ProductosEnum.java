package utils;

public enum ProductosEnum {

    CAMISA("camisa",115),
    JEAN("Jean",200),
    RELOJ("Reloj",1025);

    private String producto;

    private double precio;



    private ProductosEnum(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double precio() {
        return precio;
    }
}

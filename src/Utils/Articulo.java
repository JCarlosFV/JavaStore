package Utils;
public class Articulo {

    public String id;
    public String nombre;
    public String descripcion;
    public double precio;
    public double cantidad;

    public Cliente mi_comprador;

    public Articulo (String id, String nombre, String descripcion, double precio, double cantidad){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mi_comprador_es(Cliente mi_comprador){
        this.mi_comprador = mi_comprador;
    }

}

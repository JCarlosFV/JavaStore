package Utils;

import java.util.ArrayList;
import java.util.List;

public class Asistente {

    public String id;
    public String nombre;
    public String apellido;
    public double sueldo;
    public String direccion;
    public String telefono;
    public String genero;
    public int edad;
    public String correo;
    public Cliente articulos_comprados;

    public List<Articulo>productos_vendidos;

    public Asistente(String id, String nombre, String apellido, double sueldo, String direccion, String telefono,
                     String genero,int edad, String correo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.edad = edad;
        this.correo = correo;
        this.productos_vendidos = new ArrayList<Articulo>();
    }

    public void productos(Cliente productos_vendidos){
        this.articulos_comprados = productos_vendidos;
    }

    public void mis_ventas (){

        System.out.println("\n"+"Lista de productos vendidos de "+ nombre+"\n"+"---------------------------------------------------------------------------");
        for (Articulo c: this.articulos_comprados.articulos) {
            System.out.println(c.cantidad+" "+c.nombre+" de "+c.precio+" Vendido a "+c.mi_comprador.membresia.nombre);
        }
    }
}

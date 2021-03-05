package Utils;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public Membresia membresia;
    public Asistente asistente;
    public List<Articulo> articulos;
    public List<Articulo> historial;

    public Cliente(){
        this.articulos = new ArrayList<Articulo>();
        this.historial = new ArrayList<Articulo>();
    }

    public void asignar_membresia (Membresia membresia){
        this.membresia = membresia;
    }

    public void asignar_asistente (Asistente asistente){
        asistente.articulos_comprados = this;
        this.asistente = asistente;
    }

    public void articulos_a_comprar (Articulo nuevo_articulo){
        nuevo_articulo.mi_comprador = this;
        this.articulos.add(nuevo_articulo);
    }


    public void historial_de_compra (Articulo articulos_comprados){
        this.historial.add(articulos_comprados);
    }

    public void mi_historial(){
        System.out.println("\n"+"Lista de productos comprados de "+ membresia.nombre+"\n"+
                "---------------------------------------------------------------------------");
        for (Articulo c: this.historial) {
            System.out.println(c.cantidad+" "+c.nombre+" de "+c.precio);
        }
    }

    public void imprimir_factura (){
        double descuento = 0;
        double impuesto = 0;
        double Subtotal = 0;
        double Total = 0;

        for (Articulo c: this.articulos) {
            Subtotal += c.precio*c.cantidad;
        }

        if (membresia.suscripcion == "Yes" ){
            descuento = Subtotal*(0.2);
            impuesto = (Subtotal - descuento)*(0.15);
            Total = (Subtotal -descuento) + impuesto;
        }
        if(membresia.suscripcion == "No"){
            impuesto = Subtotal*(0.15);
            Total = Subtotal + impuesto;
        }

        //DISEÑO FACTURA

        String mi_factura1 = "------------------------------- JAVA STORE ------------------------------- " + "\n" + "Sucursal: JavaStore TGU City Mall Nivel II"
                + "\n" + "Municipio: Distrito Central"+ "\n" + "Departamento: Francisco Morazan" + "\n"+ "\n"+ "Cliente #: " + this.membresia.id + "\n"
                +"Nombre: "+this.membresia.nombre + "\n" + "Asistente: " + this.asistente.nombre;


        String mi_factura2 = "---------------------------------------------------------------------------" + "\n" + "Can / "+"Codigo / "+"Articulo y Precio Unitario /"+
                " Total"+"\n" +"---------------------------------------------------------------------------"+ "\n";

        String mi_factura3 = new String ();
        for (Articulo c: this.articulos) {
            mi_factura3 += c.cantidad + "   "+c.id+"    "+ c.nombre + " a " + c.precio + "  Lps." + (c.precio)*(c.cantidad) +"\n";
        }

        String mi_factura4 = "---------------------------------------------------------------------------" + "\n"+"\n" +
                "SubTotal: " + "                                                     "+Subtotal + "\n" +
                "Descuento 20%: " + "                                                "+ descuento+ "\n" +
                "Imp. S/Vta. 15%: "+"                                              "+impuesto +"\n"+
                "Total a pagar: "+ "                                                "+Total;


        System.out.println(mi_factura1 + "\n" + mi_factura2 + mi_factura3 + mi_factura4);

    }

}

package Aplication;

import Utils.*;

public class App {
    public static void main(String[] args){

        //CREAMOS LA MEMBRESIA
        Membresia membresia1 = new Membresia("0816200100289", "Juan Carlos", "Funez","Col.Luis Andres Zuniga",
                "97145532","Masculino",19,"jcfunez14@gmail.com","Yes");
        Membresia membresia2 = new Membresia("000120023265", "Jesus Noe", "Rodriguez","Res.Lomas del Sur",
                "22345898","Masculino",18,"noerodri21@gmail.com","No");

        //CREAMOS LOS ARTICULOS
        Articulo articulo1 = new Articulo ("RCC01","Camisa manga corta","Camisa para hombre Formal, Talla M ",1600.50,1);
        Articulo articulo2 = new Articulo ("RCL05","Camisa manga larga","Camisa para mujer color Rosa, Talla S ",1200.50,2);
        Articulo articulo3 = new Articulo ("TCS10","Samsung Galaxy S10","Telefono samsung galaxy S10 con camara triple y 128 GB de espacio",8600.00,1);
        Articulo articulo4 = new Articulo ("TRIH0","Smartwatch HuaweiR","Con una magnífica pantalla y una resolución HD, HUAWEI ofrece una experiencia de visualización amplia y ultra clara.",3600.50,1);
        Articulo articulo5 = new Articulo ("RCM02","Par de Calceta Nike","Para un gran jugador de futbol como tú, estas calcetas largas de la marca Nike son ideales para ti.",200.20,5);

        //CREAMOS AL ASISTENTE
        Asistente asistente1 = new Asistente ("0816199400506","Jose Manuel","Vasquez",13600.00,"Col.Las Torres",
                "98563245","Masculino",27,"jAntoniom17@gmail.com");

        //CREAMOS EL CLIENTE
        Cliente cliente1 = new Cliente();

        cliente1.asignar_membresia(membresia1);
        cliente1.asignar_asistente(asistente1);

        cliente1.articulos_a_comprar(articulo1);
        cliente1.articulos_a_comprar(articulo2);
        cliente1.articulos_a_comprar(articulo3);
        cliente1.articulos_a_comprar(articulo5);

        cliente1.historial_de_compra(articulo1);
        cliente1.historial_de_compra(articulo1);
        cliente1.historial_de_compra(articulo3);
        cliente1.historial_de_compra(articulo4);
        cliente1.historial_de_compra(articulo5);

        //FACTURA, HISTORIAL Y VENTAS/ASISTENTE
        cliente1.imprimir_factura();
        cliente1.mi_historial();
        asistente1.mis_ventas();
    }
}

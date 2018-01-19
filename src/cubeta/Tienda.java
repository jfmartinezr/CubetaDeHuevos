/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jumarrod
 */
public class Tienda {
    //instanciando la clase en el nivel superior la puedo utilizar en cualquier parte del codigo
    //las clases debe tener constructor por defecto.
    Cubeta cub1  = new Cubeta();
    Huevo huevo1 = new Huevo();
    List<Huevo> listahuevos; // = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //lista de cubetas
        
        //Menu de opciones
        Scanner sc = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        
        while(!salir){
        System.out.println("1. MENU CUBETA");
        System.out.println("2. MENU HUEVOS");
        System.out.println("3. TIENDA");
        System.out.println("4. SALIR");
        
        System.out.println("Escribe una de las opciones");
        
        Tienda tienda = new Tienda();
        opcion = sc.nextInt();
		switch(opcion){
               case 1:
                   System.out.println("1. ***********MENU CUBETA*************");
                   tienda.menuCubeta();
                   break;
               case 2:
                   System.out.println("2. ***********MENU HUEVOS*************");
                    tienda.menuHuevos();
                   break;
                case 3:
                   System.out.println("3. *************MENU TIENDA************");
                    tienda.menuTienda();
                   break;
                case 4:
                   salir = true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
        
        }
        
        //fin Menu de opciones
        
        
//listaHuevos.add(new Huevo("Gallina", 1, "blanco", 300.0 ,"Mediano"));

/* 
Huevo huevo1 = new Huevo("Gallina",1,"blanco",300.0,"Mediano");
Huevo huevo2 = new Huevo("Pato",1,"blanco",200.0,"Mediano");
Huevo huevo3 = new Huevo("Avestruz",1,"blanco",2000.0,"grande");
Huevo huevo4 = new Huevo("Codorniz",1,"cafe",100.0,"pequeño");
Huevo huevo5 = new Huevo("Cocodrilo",1,"camuflado",2500.0,"grande");
Huevo huevo6 = new Huevo("ornitorrinco",1,"blanco",2700.0,"grande");
Huevo huevo7 = new Huevo("iguana",1,"blanco con pecas",4000.0,"pequeno");
Huevo huevo8 = new Huevo("Pinguino",1,"blanco",4100.0,"mediano");
Huevo huevo9 = new Huevo("colibri",1,"blanco",5000.0,"pequeno");
Huevo huevo10 = new Huevo("trucha",1,"rosado",20.0,"pequeno");

*/


	  /*This is how elements should be added to the array list*/
	   
    }
    
    
    public void menuCubeta(){
        Scanner sc = new Scanner(System.in);
        Boolean salir = false;
       // ArrayList<String> listahuevos = new ArrayList<String>();
        
        int opcion;
        
        while(!salir){
        System.out.println("1. COMPRAR CUBETA");
        System.out.println("2. VACIAR CUBETA");
        System.out.println("3. <--VOLVER");
        
        System.out.println("Escribe una de las opciones");
        
       // Tienda tienda = new Tienda();
        opcion = sc.nextInt();
		switch(opcion){
               case 1:
                   System.out.println("1. COMPRAR CUBETA");
                   //cub1 = new Cubeta("Carton","amarilla",3000.00,listahuevos);
                   
                   cub1.setColor("amarilla");
                   cub1.setMaterial("carton");
                   cub1.setPrecio(3000.0);
                   cub1.setListahuevos(listahuevos);
                   //cub1.comprarCubeta(cub1);
                   System.out.println(cub1.toString());
                  
                  // tienda.menuCubeta();
                   break;
               case 2:
                   System.out.println("2. VACIAR CUBETA");
                   break;
                case 3:
                   salir = true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
        
        }
        
        
        
    }
    
    
    //Menu Huevos
    
    
    public void menuHuevos(){
        Scanner sc = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        
        while(!salir){
        System.out.println("1. AÑADIR HUEVO");
        System.out.println("2. BUSCAR HUEVO");
        System.out.println("3. ELIMINAR HUEVO");
        System.out.println("4. CONTAR HUEVOS");
        System.out.println("5. VER LISTA DE HUEVOS");
        System.out.println("6. BUSCAR X PRECIO");
        System.out.println("7. BUSCAR X TIPO");
        System.out.println("8. <--VOLVER");
        
        
        System.out.println("Escribe una de las opciones");
        
       // Tienda tienda = new Tienda();
        opcion = sc.nextInt();
		switch(opcion){
               case 1:
                   System.out.println("1. AÑADIR HUEVO");
                //   cub1.AgregarHuevo("Pato",1,"blanco",200.0,"Mediano"); //no quitar
                   
                   
                   //cub1.AgregarHuevo(tipo, opcion, color, Double.NaN, tamano);
                   //en lugar de utilizar el constructor por defecto utilizo los setters y getters
                   huevo1.setTipo("gallina");
                   huevo1.setPrecio(200.23);
                   huevo1.setColor("amarillo");
                   huevo1.setCantidad_yemas(2);
                   
                   cub1.AgregarHuevo2(huevo1);
                   System.out.println(cub1.toString());
                   // tienda.menuCubeta();
                   break;
               case 2:
                   System.out.println("2. BUSCAR HUEVO");
                   System.out.println(cub1.BuscarHuevo2(huevo1));
                   break;
                case 3:
                   System.out.println("3.  ELIMINAR HUEVO");
                   break;
               case 4:
                   System.out.println("4. BUSCAR HUEVO");
                   break;
               case 5:
                   System.out.println("5. BUSCAR HUEVO");
                   break;
               case 6:
                   System.out.println("6. BUSCAR HUEVO");
                   break;
               case 7:
                   System.out.println("7. BUSCAR HUEVO");
                   break;
                case 8:
                    salir = true;
                   break;
                   
                default:
                   System.out.println("!!!!!!!!!!!!!Solo números entre 1 y 8");
           }
        }
    }
    
    
    
    //Menu Tienda
    
    public void menuTienda(){
     
     

        
        Scanner sc = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        
        while(!salir){
        System.out.println("1. PROMOCIONES");
        System.out.println("2. VER PRECIO - FACTURAR");
        System.out.println("3. VOLVER");
        
        System.out.println("Escribe una de las opciones");
        
       // Tienda tienda = new Tienda();
        opcion = sc.nextInt();
		switch(opcion){
               case 1:
                   System.out.println("1. PROMOCIONES");
                  // tienda.menuCubeta();
                   break;
               case 2:
                   System.out.println("2. VER PRECIO FACTURAR");
                   break;
                case 3:
                   salir = true;
                   break;
                case 4:
                   break;
                default:
                   System.out.println("!!!!!!!!!!!!Solo números entre 1 y 3");
           }
        
        }
        
        
        
    }
    
    
    
    
}

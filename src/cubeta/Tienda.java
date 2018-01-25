/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jumarrod
 */
public class Tienda {
    //instanciando la clase en el nivel superior la puedo utilizar en cualquier parte del codigo
    //las clases debe tener constructor por defecto.
    Cubeta cub1  = new Cubeta();
    Huevo huevo1 = new Huevo();
    Huevo huevo2 = new Huevo();
    Huevo huevo3 = new Huevo();
    Huevo huevo4 = new Huevo();
    static Tienda tienda = new Tienda();
    List<Huevo> listahuevos = new ArrayList<>();
    int opcion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        //lista de cubetas
        
           tienda.MenuPrincipal();
           
        //fin Menu de opciones       
//listaHuevos.add(new Huevo("Gallina", 1, "blanco", 300.0 ,"Mediano"));

	  /*This is how elements should be added to the array list*/
	   
    }
    
    public void MenuPrincipal() 
    {
    
                //Menu de opciones
        
       Boolean salir = false;
    int sali = 0;
        
      
            
        do  {   
           
               System.out.println("1. COMPRAR CUBETA");
               System.out.println("2. VACIAR CUBETA");
               System.out.println("3. AÑADIR HUEVO");
               System.out.println("4. BUSCAR HUEVO");
               System.out.println("5. ELIMINAR HUEVO");
               System.out.println("6. CONTAR HUEVOS");
               System.out.println("7. VER LISTA DE HUEVOS");
               System.out.println("8. BUSCAR X PRECIO");
               System.out.println("9. BUSCAR X TIPO");
               System.out.println("10. PROMOCIONES");
               System.out.println("11. VER PRECIO - FACTURAR");
               System.out.println("12. <--SALIR");
               System.out.println("............Escribe una de las opciones");
               Scanner sc = new Scanner(System.in);
               sali = sc.nextInt();
               
             System.out.print("\033[H\033[2J");  
             System.out.flush(); 
           
             
             
             	switch(sali){
               case 1:
                   System.out.println("1. *********COMPRAR CUBETA*************");
                   cub1.setColor("amarilla");
                   cub1.setMaterial("carton");
                   cub1.setPrecio(3000.0);
                   cub1.setListahuevos(listahuevos);
                   System.out.println(cub1.toString());
                 
                 //  tienda.menuPrincipal();
                   break;
               case 2:
                   System.out.println("2. ***********VACIAR CUBETA*************");
                  System.out.println("2. VACIAR CUBETA");
                   cub1.vaciarCubeta();
                   System.out.println(cub1.toString());
                   break;
                case 3:
                   System.out.println("3. *************AÑADIR HUEVO***********");
                   huevo1.setTipo("gallina");
                   huevo1.setPrecio(200.23);
                   huevo1.setColor("amarillo");
                   huevo1.setTamano("Grande");
                   huevo1.setCantidadYemas(2);
                   cub1.AgregarHuevo2(huevo1);
                   
                   huevo2.setTipo("pato");
                   huevo2.setPrecio(200.23);
                   huevo2.setColor("amarillo");
                   huevo2.setTamano("Grande");
                   huevo2.setCantidadYemas(2);
                   cub1.AgregarHuevo2(huevo2);
                   
                   huevo3.setTipo("loro");
                   huevo3.setPrecio(200.23);
                   huevo3.setColor("amarillo");
                   huevo3.setTamano("Grande");
                   huevo3.setCantidadYemas(2);
                   cub1.AgregarHuevo2(huevo3);
                   
                   huevo4.setTipo("iguana");
                   huevo4.setPrecio(200.23);
                   huevo4.setColor("amarillo");
                   huevo4.setTamano("Grande");
                   huevo4.setCantidadYemas(2);
                   cub1.AgregarHuevo2(huevo4);
                   
                   
                   System.out.println(cub1.toString());
                  
                   break;
                case 4:
                    String tipo_huevo;
                    System.out.println("3. *************BUSCAR HUEVO***********");
                   
                    Scanner sci = new Scanner(System.in);
                     String digitado = sci.next();
                    System.out.println("difite huevo a tipo huevo a buscar" +sc.nextLine());
                    
                    
                    Huevo hue = new Huevo();
                           hue=cub1.BuscarHuevito(digitado);
                           System.out.println("se encontro esto" +hue.toString());
                    break;
                case 5:
                    break;
   
                case 6:
                    break;
       
                case 7:
                    break;
                case 8:
                    break;
   
                case 9:
                    break;
      
                case 10:
                    break;
     
                case 11:
                    break;
                case 12:
                      System.exit(0); 
                   break;
  
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
             
             
             
        }
        while(sali != 12);
        
        
        if (sali==12){
          System.exit(0);
         }
        
   //     Tienda tienda = new Tienda();
       
	
        
    }
    
    
    
    public void menuPrincipal2(){
        Scanner sc = new Scanner(System.in);
        Boolean salir = false;
       // ArrayList<String> listahuevos = new ArrayList<String>();
        
        int opcion;
        
        while(!salir){
        
        
       // Tienda tienda = new Tienda();
        opcion = sc.nextInt();
		switch(opcion){
               case 1:
                   System.out.println("1. COMPRAR CUBETA");
                   //cub1 = new Cubeta("Carton","amarilla",3000.00,listahuevos);      
                   // tienda.menuCubeta();
                  // tienda.menuCubeta();
                   break;
               case 2:
                   
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
    
    
    
    

    
    //Menu Tienda
    
    public void menuTienda(){
 
        Scanner sc = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        
        while(!salir){
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
    
    
   
    
    
    
    
}// fin clase





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
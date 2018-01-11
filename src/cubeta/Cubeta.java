/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeta;

import java.util.ArrayList;

/**
 *
 * @author jumarrod
 */
public class Cubeta {
    private String material;
    private String color;
    private Double precio;
    private ArrayList<Huevo> listahuevos;
    Huevo huevo;
     
     
    //constructor

    public Cubeta(String material, String color, Double precio, ArrayList<Huevo> listahuevos) {
        this.material = material;
        this.color = color;
        this.precio = precio;
        this.listahuevos = listahuevos;
    }
     
    
    
    public String getMaterial() {
        listahuevos = new ArrayList<> ();
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ArrayList<Huevo> getListahuevos() {
        return listahuevos;
    }

    public void setListahuevos(ArrayList<Huevo> listahuevos) {
        this.listahuevos = listahuevos;
    }
 
    
    @Override
    public String toString() {
        return "Cubeta{" + "material=" + material + ", color=" + color + ", precio=" + precio + ", listahuevos=" + listahuevos + '}';
    }

  
    public void AgregarHuevo(String tipo, Integer cantidad_yemas, String color, Double precio, String tamano){
    huevo = new Huevo(tipo, cantidad_yemas, color, precio, tamano);
    }
    //
}

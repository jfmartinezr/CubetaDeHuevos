/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeta;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jumarrod
 */
public class Cubeta {
    private String material;
    private String color;
    private Double precio;
    private List<Huevo> listahuevos = new ArrayList<>();
    Huevo huevo;
     
     
    //constructor
    public Cubeta() {
    }
    
    public Cubeta(String material, String color, Double precio, List<Huevo> listahuevos) {
        this.material = material;
        this.color = color;
        this.precio = precio;
        this.listahuevos = listahuevos;
    }
    
    public String getMaterial() {
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

    public List<Huevo> getListahuevos() {
        return listahuevos;
    }

    public void setListahuevos(List<Huevo> listahuevos) {
        this.listahuevos = listahuevos;
    }
 
    
    @Override
    public String toString() {
        return "Cubeta{" + "material=" + material + ", color=" + color + ", precio=" + precio + ", listahuevos=" + listahuevos + '}';
    }

      //no quitar
//    public void AgregarHuevo(String tipo, Integer cantidad_yemas, String color, Double precio, String tamano){
//    huevo = new Huevo(tipo, cantidad_yemas, color, precio, tamano);
//    listahuevos.add(huevo);
//    }
    
    
    public void comprarCubeta(Cubeta cubeta){
    cubeta.toString();
    }
    
    public void AgregarHuevo2(Huevo huevo){
      listahuevos.add(huevo);
    }

    public void EliminarHuevo2(Huevo huevo){
      listahuevos.remove(huevo);
    }
    
    public int BuscarHuevo2(Huevo huevo){
    int i;
        for (i=0; i<= listahuevos.size(); i++){
          i=listahuevos.indexOf(huevo);
    }
     return i;
    }
    
    public void vaciarCubeta(){
      listahuevos.clear();
    }
    
    
    //
}

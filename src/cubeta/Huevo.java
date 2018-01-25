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
public class Huevo {
    private String tipo;
    private Integer cantidadYemas;
    private String color;
    private Double precio;
    private String tamano;
      
    public Huevo(){
    }
    
    public Huevo(String tipo, Integer cantidadYemas, String color, Double precio, String tamano) {
        this.tipo = tipo;
        this.cantidadYemas = cantidadYemas;
        this.color = color;
        this.precio = precio;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidadYemas() {
        return cantidadYemas;
    }

    public void setCantidadYemas(Integer cantidadYemas) {
        this.cantidadYemas = cantidadYemas;
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Huevo{" + "tipo=" + tipo + ", cantidadYemas=" + cantidadYemas + ", color=" + color + ", precio=" + precio + ", tamano=" + tamano + '}';
    }

    
    
}

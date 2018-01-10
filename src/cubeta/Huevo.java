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
    private Integer cantidad_yemas;
    private String color;
    private Double precio;
    private String tamano;
      

    
    public Huevo(String tipo, Integer cantidad_yemas, String color, Double precio, String tamano) {
        this.tipo = tipo;
        this.cantidad_yemas = cantidad_yemas;
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

    public Integer getCantidad_yemas() {
        return cantidad_yemas;
    }

    public void setCantidad_yemas(Integer cantidad_yemas) {
        this.cantidad_yemas = cantidad_yemas;
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

public class Item {
    private String nombre;
    private Double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        nombre = pnombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double pprecio) {
        this.precio = pprecio;
        
    }
    
}

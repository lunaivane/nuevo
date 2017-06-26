/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author alumno
 */
public class ItemFactura {
    private Double cantidad, precio;
    private Item item_factura;

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Item getItem_factura() {
        return item_factura;
    }

    public void setItem_factura(Item item_factura) {
        this.item_factura = item_factura;
    }
    
    
    
}

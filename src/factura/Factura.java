/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList; 
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author alumno
 */
public class Factura {

    private ArrayList<ItemFactura> itemFactura = new ArrayList();    
    private FormaCobro formaCobro;
    private Cliente cliente;
    private Date fecha;
    private Integer numero;

    public ArrayList<ItemFactura> getItemFactura() {
        return itemFactura;
    }
    public void agregarItem(ItemFactura pItemFactura){
       itemFactura.add(pItemFactura);
    }
    
    

    public FormaCobro getFormaCobro() {
        return formaCobro;
    }

    public void setFormaCobro(FormaCobro formaCobro) {
        this.formaCobro = formaCobro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente unCliente = new Cliente();
        unCliente.setNombre("Manuel");
        
        FormaCobro unFormaCobro = new FormaCobro();
        unFormaCobro.setNombre("Visa");
        
        Item cocaCola = new Item();
        cocaCola.setNombre("Coca cola");
        cocaCola.setPrecio(12.43);

        Item pepsi = new Item();
        pepsi.setNombre("Pepsi");
        pepsi.setPrecio(15.43);

        
        ItemFactura unItemFacturaPepsi = new ItemFactura();
        unItemFacturaPepsi.setCantidad(2.0);
        unItemFacturaPepsi.setItem_factura(pepsi);
        unItemFacturaPepsi.setPrecio(pepsi.getPrecio());
        
        ItemFactura unItemFacturaCoca = new ItemFactura();
        unItemFacturaCoca.setCantidad(10.0);
        unItemFacturaCoca.setItem_factura(cocaCola);
        unItemFacturaCoca.setPrecio(cocaCola.getPrecio());
        
        
        
        Factura unaFactura = new Factura();
        unaFactura.setCliente(unCliente);
        unaFactura.setNumero(2354);
        unaFactura.setFormaCobro(unFormaCobro);
        unaFactura.agregarItem(unItemFacturaPepsi);
        unaFactura.agregarItem(unItemFacturaCoca);
    
        System.out.println(unaFactura.getItemFactura().get(0).getItem_factura().getPrecio());
        
        
    }
    
}

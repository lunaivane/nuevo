/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author Sello
 */
public class Principal {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente unCliente = new Cliente("Gabriela", "jordania", "av paseo colon", 5423);
        
        Pais unPais = new Pais();
        unPais.setNombre("Argentina");

        Provincia unaProvincia = new Provincia();
        unaProvincia.setNombre("BSAS");
        unaProvincia.setPais(unPais);
      
        Partido unPartido = new Partido();
        unPartido.setNombre("San Martin");
        unPartido.setProv(unaProvincia);
        
        Localidad unaLoca = new Localidad();
        unaLoca.setNombre("Ballester");
        unaLoca.setPartido(unPartido);
        
        FormaCobro cobroVisa = new FormaCobro();
        cobroVisa.setNombre("Visa");
                
        FormaCobro cobroEfectivo = new FormaCobro();
        cobroEfectivo.setNombre("Efectivo");

        
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
        unaFactura.getNumero();
        unaFactura.agregarformacobro(cobroVisa);
        unaFactura.agregarformacobro(cobroEfectivo);
        unaFactura.agregarItem(unItemFacturaPepsi);
        unaFactura.agregarItem(unItemFacturaCoca);
    
        System.out.println(unaFactura.getItemFactura().get(0).getItem_factura().getPrecio());
        System.out.println("el cliente es "+unCliente.getNombre());
        System.out.println("vive en "+unCliente.getCalle());
        System.out.println(unaLoca.getNombre());
        System.out.println(unPartido.getNombre());
        System.out.println(unPais.getNombre());
        System.out.println("sus formas de cobro son "+cobroVisa.getNombre());
        System.out.println("y "+cobroEfectivo.getNombre());
        
    }
 
}

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
public class Cliente {
    private String nombre;
    private String apellido;
    private Integer dni;
    private String calle;
    private Integer altura;
    private Localidad loca;

    public Cliente(String nombre, String apellido, Integer altura) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(String nombre, String apellido, String calle, Integer altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
    }

    public Cliente(String nombre, String apellido, Integer dni, String calle, Integer altura, Localidad loca) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.calle = calle;
        this.altura = altura;
        this.loca = loca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public Localidad getLoca() {
        return loca;
    }

    
}
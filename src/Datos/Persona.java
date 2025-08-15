/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Dell-Insp15
 */

//definicion de un objeto tipo persona  referencia a la pregunta --¿Que es?
public class Persona {
    //caracteristicas de l objeto responde a la pregunta --¿Como es?
    String cedula;
    String nombre;
    String apellido1;
    String apellido2;
    String telefono;
    String correo;
    
    //constructor vacio, para apartar la memoria del registro
    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido1, String apellido2, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
    }

    //metodos de las acciones - SET(establecer) y GET(obtener)  -- utilizar metodos SETTER y GETTER
    //metodo get/GETTER

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}

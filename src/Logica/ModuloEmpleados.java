/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import java.util.Scanner;
import Datos.Persona;
//importat el manejo de estructuras de almacenamiento completo
import java.util.Collections;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Dell-Insp15
 */
public class ModuloEmpleados {

    /**
     * @param args the command line arguments
     */
    //variables globales
   static int empleados =0;
   static Scanner leer=new Scanner (System.in);
   static String nombres="";
   static ArrayList<Persona> listaPersonas=new ArrayList<>();
    
   //definicion de registrar personas
   public static void regPersonas(){
       leer.nextLine();
       //declaracion de una nueva instancia de persona 
       // partiendo dedesde 0, sin caracteristicas
       Persona miPersona = new Persona();
       //llegano de caracteristicas/atributos
       System.out.println("-----Digite el numero de cedula de la persona-----");
       miPersona.setCedula(leer.nextLine() );
       System.out.println("");
       
       System.out.println("-----Digite el nombre de la persona-----");
       miPersona.setNombre(leer.nextLine() );
       System.out.println("");
       
       System.out.println("-----Digite el primer apellido de la persona-----");
       miPersona.setApellido1(leer.nextLine() );
       System.out.println("");
       
       System.out.println("-----Digite el segundo apellido de la persona-----");
       miPersona.setApellido2(leer.nextLine() );
       System.out.println("");
       
       System.out.println("-----Digite el numero de telefono de la persona-----");
       miPersona.setTelefono(leer.nextLine() );
       System.out.println("");
      
       System.out.println("-----Digitel el correo de la persona-----");
       miPersona.setCorreo(leer.nextLine() );
       System.out.println("");
       
       listaPersonas.add(miPersona);
       System.out.println("-----Persona registrada-----");
       leer.nextLine();
   } 
   
   //definicion metodo para consultar personas
   public static void consPersonas(){
       Persona miPersonaCons= new Persona();
       for (int i =0;  i <listaPersonas.size(); i++){
           miPersonaCons =listaPersonas.get(i);
           System.out.println("Persona #"+ i + "; Cedula: " + miPersonaCons.getCedula() +
                   "; Nombre: " + miPersonaCons.getNombre() + 
                   "; Apellidos: " + miPersonaCons.getApellido1() + " "+miPersonaCons.getApellido2() +
                   "; Telefono: "+ miPersonaCons.getTelefono() +
                   ";Correo: " + miPersonaCons.getCedula() );
       }
       
   }
   //metodo para modificar un registro enm una lista opcion 1
   public static void modiPersonas(){
            leer.nextLine();
          Persona miPersonaModi= new Persona();
          System.out.println("-----Digite la cedula de la persona a modificar-----");
          String numCedula = leer.nextLine(); //break point punto de parada
          System.out.println("");
       for (int i =0;  i <listaPersonas.size(); i++)
           miPersonaModi =listaPersonas.get(i);//equals comparar texto
       if (numCedula.equals(miPersonaModi.getCedula() ) ){
         System.out.print("Digite el nuevo nombre:");
           miPersonaModi.setNombre(leer.nextLine() );
           
       }
         
   }
   //metodo para modificar un registro en una lista opcion 2
   public static void modiPersonas2(){
       leer.nextLine();              //numero de registro = indice
       System.out.println("Digite el numero de registro de la persona a modificar");
       int indice = leer.nextInt(); 
       Persona miPersonaModi= new Persona();
       miPersonaModi=listaPersonas.get(indice-1);
         System.out.print("Digite el nuevo nombre:");
           miPersonaModi.setNombre(leer.nextLine() );
   }
   // --metodos para las opciones del menu
  
   public static void cantEmpleado() 
   {
       System.out.println("Ingrese la cantidad de empleados");
       empleados =leer.nextInt();
   }
   
   
   public static void registNom()
   {
       String empleado; 
       int i = 1;
       leer.nextLine();
       while (i<=empleados)
       {
           System.out.println("Ingrese el nombre del empleado " + i +": ");
           empleado =leer.nextLine();
           nombres = nombres + empleado + "; ";
           i++;
        }   
       }
       
   public static  void consuEmpleados()
   {
     System.out.println("usted digito los empleados: "+ nombres);
    }
  
public static void ModEmpleados()
    {
    nombres = "";
    String empleado; 
       int i = 1;
       leer.nextLine();
       while (i<=empleados)
       {
           System.out.println("Ingrese el nombre del empleado " + i +": ");
           empleado =leer.nextLine();
           nombres = nombres + empleado + "; ";
           i++;
        }
      }   
   public static  int Menu()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("|                                                                    |");
        System.out.println("|     Modulo de Empleados ME 3000   |");
        System.out.println("|                                                                    |");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("Digite el numero de opcion a realizar");
        System.out.println("Seguido de la tecla enter.");
        System.out.println("1. Definir Cantidad de Empleados");
        System.out.println("2. Registrar Nombres de Empleados");
        System.out.println("3. Consultar los Empleados");
        System.out.println("4. Modificar Empleados");
        System.out.println("5. Calcular Salario");
        System.out.println("6. Calcular Aguinaldo");
        System.out.println("7. Registrar personas");
        System.out.println("8. Consultar Personas registradas");
        System.out.println("9. Modificar Personas");
        System.out.println("10.Salir");
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Su opcion:  ");
        int opcion =leer.nextInt();
        
        switch (opcion)
        {
            case 1: cantEmpleado();
                        break;
            case 2: registNom();
                        break;
            case 3: consuEmpleados();
                        break;
            case 4: ModEmpleados();
                        break;
            case 5: System.out.println("-----Calcular Salario-----");
                        double salariototal= new Calculosmath().salario();
                        System.out.println("");
                        System.out.println("El salario mensual es: "+ salariototal);
            case 6: System.out.println("-----Calcular Aguinaldo-----");
                        double aguinaldoTotal=new Calculosmath().Aguinaldo();
                        System.out.println("");
                        System.out.println("El aguinaldo es: " + aguinaldoTotal);
            case 7: System.out.println("-----Registrando Personas-----");
                        regPersonas ();
                        break;
            case 8: System.out.println("-----Consultando Personas-----");
                        consPersonas();
                        break;
            case 9: System.out.println("-----Modificar Personas-----");
                        modiPersonas();
                        break;
        }
        
        return opcion; 
    }
   
   
    public static void main(String[] args) {
        int salida =0;
        do 
        {
            System.out.flush();
            salida= Menu();
        }while (salida<10);
        
        
    }
}
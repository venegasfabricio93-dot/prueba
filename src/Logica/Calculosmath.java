/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Scanner;

/**
 *
 * @author Dell-Insp15
 */
public class Calculosmath {
    
    static Scanner leer = new Scanner (System.in);//lector de datos consola
    //crear un array con los meses del año
    String [ ] meses = { "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octuber","Noviembre","Diciembre"};
    
    
    
    public double salario()
            {//variables necesarias para calcular el salario semanal
                double salaxHora=0.00;
                double horas= 0.00; //horas de trabajo regulares
                double horasExtra=0.00;
                double monto =0.00;//salario
                
                System.out.println("Digite las horas trabajadas en la semana");
                horas= leer.nextDouble();
                System.out.println("");
                System.out.println("Digite el salario por hora");
                salaxHora=leer.nextDouble();
                
                
                if (horas>48){
                 horasExtra =horas -48;                                                                      
                 horas =48;
                }
                
                if(horasExtra>0.00){
                monto = (horas * salaxHora)+ (horasExtra * (salaxHora* 1.5)  );
                }
                else{
                monto = (horas * salaxHora);
                }
                
                return monto * 4.33;
                      
            }
    

    public double Aguinaldo()
    {
        double [ ] salariosM = new double [12];
        double sumatoria =0.00;
        
        for (int i = 0; i<12;i++){
        System.out.println("Digite el salario de "+ meses [i]+ ": ");
        salariosM[i]= leer.nextDouble(); 
          }
        for (int i=0;i<12; i++){
            sumatoria = sumatoria + salariosM[i];
        }
        return sumatoria/12;
    }

}

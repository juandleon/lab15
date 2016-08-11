/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15lab1;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Cliente extends Personal_Date {
    private double saldo=0;
    private Scanner lector;
    
    public void Actualizar_Datos(){
        lector = new Scanner(System.in);
        System.out.println("Digite dir: ");
        setDir(lector.next());
        System.out.println("Digite tel: ");
        setTel(lector.next());   
    }
    
    public void Consignacion(){
        System.out.println("Digite el valor a consignar: ");
        saldo=lector.nextDouble();
    }
    
    public void Retiro(){
        double retiro;
        System.out.println("Digite el valor a retirar: ");
        retiro = lector.nextDouble();
        if (retiro>saldo)
            System.out.println("Saldo insuficiente");
        else
            saldo=saldo-retiro;
    }
    
    public void Consultar_Saldo(){
        System.out.println("Su saldo es "+saldo);
    }
}

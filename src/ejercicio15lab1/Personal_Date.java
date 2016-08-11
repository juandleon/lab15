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
public class Personal_Date {

    private String nombre, apellido,edad,cedula,fecha,dir,tel;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
       
    public void Loading_Data(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite nombre: ");
        nombre = lector.next();
        System.out.println("Digite apellido: ");
        apellido = lector.next();
        System.out.println("Digite edad: ");
        edad = lector.next();
        System.out.println("Digite cedula: ");
        cedula = lector.next();
        System.out.println("Digite fecha: ");
        fecha = lector.next();
        System.out.println("Digite dir: ");
        dir = lector.next();
        System.out.println("Digite tel: ");
        tel = lector.next();      
    }
    
    public void Data_Show(){
        System.out.println("Nombre: "+nombre+"\n"+
                "apellido: "+apellido+"\n"+
                "edad: "+edad+"\n"+
                "cedula: "+cedula+"\n"+
                "fecha: "+fecha+"\n"+
                "dir: "+dir+"\n"+
                "tel: "+tel+"\n");
    }
}

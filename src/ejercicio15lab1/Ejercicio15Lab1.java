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
public class Ejercicio15Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Cliente client = new Cliente();
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("Digite la opción deseada");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Actualizar datos");
            System.out.println("4. Consignación");
            System.out.println("5. Retirar");
            System.out.println("6. Mostrar saldo");
            System.out.println("0. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 0: System.out.println("Hasta luego");
                    break;
                case 1: client.Loading_Data();
                    break;
                case 2: client.Data_Show();
                    break;
                case 3: client.Actualizar_Datos();
                    break;
                case 4: client.Consignacion();
                    break;
                case 5: client.Retiro();
                    break;
                case 6: client.Consultar_Saldo();
                    break; 
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=0);
    }
    

        
        
}


package com.mycompany.pilasinclases;


import java.util.Scanner;
public class Pilasinclases {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                int[]pila = new int[5];
                int tope = -1;
                int opcion;
                
                do{
                System.out.println("\n-----PILA CON ARREGLO");
                System.out.println("1. Agregar Numero");
                System.out.println("2. Retirar Numero");
                System.out.println("3. Mostrar la Pila");
                System.out.println("4. Mostrar el Tope");
                System.out.println("5. Salir");
                System.out.println("Opcion :");
                opcion = teclado.nextInt();
                
                switch(opcion){
                    case 1:
                        if (tope ==pila.length-1){
                        System.out.println("La pila esta llena");
                        }else{
                        System.out.println("Agrega un numero :");
                        
                        int numero = teclado.nextInt();
                        tope++;
                        pila[tope]= numero;
                        
                        }
                        break;
                        
                    case 2 :
                        if (tope == -1){
                        System.out.println("La pila esta vacia");
                        }else{
                        System.out.println("Retirado:" + pila[tope]);
                        tope--;
                        }
                        break;
                        
                    case 3 :
                        if (tope == -1){
                        System.out.println("La pila esta vacia");
                        }else{
                        System.out.println("Elementos desde el Te:");
                        for(int i = tope; i>=0 ; i--){
                        System.out.println(pila[i]);
                        }
                        }
                        break;
                        
                    case 4 : 
                        if (tope == -1){
                        System.out.println("La pila esta vacia");
                        }else{
                        System.out.println("El elemento del tope es "+ pila[tope]);
                        }
                        break;
                        
                    case 5 :
                        System.out.println("Fin del programa");
                        break;
                        
                    default:
                        System.out.println("opcion invalida");
                }
                
        }while(opcion !=5);
          teclado.close();
    }
}

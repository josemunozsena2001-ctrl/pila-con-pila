
package com.mycompany.pilaconclases;


import java.util.Scanner;
import java.util.LinkedList;

public class Pilaconclases {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                //int[]pila = new int[5];
                //int tope = -1;
                
                LinkedList<String> pila = new LinkedList<>();
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
                teclado.nextLine();
                
                switch(opcion){
                    case 1:
                        System.out.println("Agregar elemento");
                        String palabra = teclado.nextLine();
                        pila.push(palabra);
                        
                        break;
                        
                    case 2 :
                        if (pila.isEmpty()){
                        System.out.println("La pila esta vacia");
                        }else{
                        System.out.println("Retirada del elemento" + pila.pop());
                        }
                        break;
                        
                    case 3 :
                        if (pila.isEmpty()){
                        System.out.println("La pila esta vacia");
                        }else{
                        System.out.println("Elementos desde el tope");
                        for(String elemento : pila){
                        System.out.println(elemento);
                            }
                        }
                        break;
                        
                    case 4 : 
                        if (pila.isEmpty()){
                        System.out.println("La pila esta vacia");
                        }else{
                        System.out.println("Elementos del tope: " + pila.peek());  
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

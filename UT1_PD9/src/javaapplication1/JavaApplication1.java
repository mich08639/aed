/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mich0
 */
public class JavaApplication1 {

    
    
    public static boolean isPrime(long n) {
boolean prime = true;
    for (long i = 3; i <= Math.sqrt(n); i += 2)
    if (n % i == 0) {
        prime = false;
        break;
        }
    if (( n%2 !=0 && prime && n > 2) || n == 2) {
        return true;
    } else {
        return false;
    }
}
 public static long SUMprimos(long num) 
 {
    boolean esPrimo = isPrime(num);

        int i = 0;
        int suma = 0;

        if (esPrimo) {
            while (i <= num) {
                if (i % 2 == 0) {
                    suma += i;
                }
                i++;
            }
        } else {
            while (i <= num) {
                if (i % 2 != 0) {
                    suma += i;
                }
                i++;
}
        
        }
     
   return suma;    
 }
 
    
    
    
    
    
    
public static int factorial(int num){
   int resultado =1; 
    
   for(int i = num;i >= 1; --i){
    resultado = resultado * i;
   }
   return resultado;
}
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     factorial(3);
System.out.println(SUMprimos(5));
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contador;


/**
 *
 * @author mich0
 */
public class Contador {
    public int MAX_CONT = 50;
    public int incremento;
    public int contador;
    
    
    public  void displayCount(){
    contador = 0;
    incremento = 2;
    for(contador = 0;contador <= MAX_CONT; contador+= incremento){
        System.out.println(contador);
    }
   
//    do{
//    System.out.println(contador);
//    contador += incremento;
//    }
//    while(contador <= MAX_CONT);


//       while(contador <= MAX_CONT){
//       System.out.println(contador);
//        contador += incremento;
//       }
//
    }
   
    
    public static void main (String[] args) {
    Contador test = new Contador();
    test.displayCount();
    }
}

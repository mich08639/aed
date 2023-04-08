/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadorpalabras;

/**
 *
 * @author mich0
 */
public class Principal {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
//        System.out.println(contador.contarPlabaras(" Hola   1 com12o estas as 1a    "));
        
//        System.out.println(contador.contadorPalabraX(" Hola        sdssssss com12o estas as aaa",4));
        String[] vector = contador.obtenerLines("./src/contadorpalabras/UT1_TA3_ARCHIVO_EJEMPLO.txt");
        for (int i =0; i < vector.length; i++  ){
            System.out.println(contador.contarPlabaras(vector[i]));
        }

    }
}

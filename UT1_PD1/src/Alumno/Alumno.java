/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

/**
 *
 * @author mich0
 */
public class Alumno {
 private String nombre;
public Alumno (String name) {
    nombre = name;
}
public String getNombreAdmiracion() {
return nombre.concat("!");
}
public static void main (String[] args) {
    Alumno alumno = new Alumno("mich");
    System.out.println(alumno.getNombreAdmiracion());
}
//} la llave de cierre de la clase esta mal ublicada 
public static int recorrer (String cadena) {
    int res = 0;
    for (int i = 1; i <= cadena.length(); i++) {
        if (cadena.charAt(i) != ' ') {
            res++;
    }
    }
    return res;
}
public static int getValor() {
    int vector[] = { 6, 16, 26,36,46,56,66,76 };
    int idx = 8;
    return vector[idx];
}
public static char getPrimerCaracter(String palabra) {
    return palabra.charAt(1);
}

public static String paraAString(int a) {
    return String.valueOf(a);
}

}
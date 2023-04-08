/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorpalabras;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author mich0
 */
public class ContadorPalabras {
   
    public int contadorPalabraX(String frase, int x){
    int count = 0;
    boolean palabra = false;
    int size =0;
    for(int i =0; i < frase.length(); i++){
        char letra = frase.charAt(i);
        if (letra == ' ' && palabra){
            if(size > x){
            count++;
            }
        palabra = false;
        size=0;
        }
        else if (Character.isLetter(letra)){
            palabra=true;
            size++;
        }
        else if (letra != ' '){
        size++;
        }

    }
    if (size > x){
    count++;
    }

    return count;
    }
    
    public int contarPlabaras(String frase){
        int count = 0;
        boolean palabra = false;
        for(int i =0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra == ' ' && palabra){
            count++;
            palabra = false;
            }
            else if (Character.isLetter(letra)){
            palabra=true;
            }            
        }
        if (palabra){
        count++;
        }
        
        return count;
    }
    
    public String[] obtenerLines (String archivo){
        
        int count =0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(archivo));
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    
    }
     String[] resultado = new String[count];
     reader = null;
     count=0;
    try {
        reader = new BufferedReader(new FileReader(archivo));
        String line;
        while ((line = reader.readLine()) != null) {
            resultado[count] = line;
            count++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
        return resultado;
    }
}

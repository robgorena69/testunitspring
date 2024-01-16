package com.gorena.TestProject;

public class StringUtil {
    
     public static String repeat(String texto,int numero ){
        StringBuffer cadena = new StringBuffer();
       for (int i=0;i<numero;i++){
        cadena.append(texto);
        cadena.append("-");
       }
       return cadena.toString(); 

     }

}

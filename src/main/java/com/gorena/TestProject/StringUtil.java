package com.gorena.TestProject;

public class StringUtil {
    
     public static String repeat(String texto,int numero ){
        StringBuffer cadena = new StringBuffer();
        if (numero<0){
            throw new IllegalArgumentException();
        }
       for (int i=0;i<numero;i++){
        cadena.append(texto);
        cadena.append("-");
       }
       return cadena.toString(); 

     }

}

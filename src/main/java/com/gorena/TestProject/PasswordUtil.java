package com.gorena.TestProject;

public class PasswordUtil {

    public static SecurityLevel verificaPassword(String password){

        if(password.length() >= 8 && !password.matches("[a-zA-Z]+")){
            if(password.matches("[a-zA-Z0-9]+")){
                return  SecurityLevel.MEDIO;
            } else{
                return SecurityLevel.FUERTE;
            }
        } else {
            return SecurityLevel.DEBIL;
        }
    }
}

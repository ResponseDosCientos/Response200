package co.gov.mintic.proyecto.gestion.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {

    public static void main(String[] args){
        var password = "Samuel12345*";
        System.out.println("Password " +password);
        System.out.println("Password Encriptado "+ encriptarPassword(password));
    }

    public static String encriptarPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}

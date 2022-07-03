package src;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int code = Autentification.autenticate();
        if (code == 0){
            System.out.println("Login success");
        } else {
            System.out.println("Login failed");
        }
    }
}

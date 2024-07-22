package Modelo;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        String pr = "hola";
        String ex = ".png";

        if (!pr.contains(ex)) {
            pr = pr + ex;

        }
        System.out.println(pr);

    }


}

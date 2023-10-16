package org.example;

import org.example.view.View;
import org.pp2.ClimaTotal;
import org.pp2.Dispositivo;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //src/main/resources/application.properties src/test/resources/plugins "Samsung v2" APAGAR
        List<Dispositivo> dispositivos = new ClimaTotal("src/test/resources/plugins", "src/main/resources/application.properties")
                .getDispositivos();
        View view = new View(dispositivos);
        view.init();
    }
}
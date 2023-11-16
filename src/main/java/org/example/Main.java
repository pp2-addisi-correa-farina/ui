package org.example;

import org.example.view.View;
import org.pp2.ClimaTotal;
import org.pp2.ClimaTotalFactory;
import org.pp2.Dispositivo;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        src/main/resources/application.properties src/test/resources/plugins "Samsung v2" APAGAR
        String especificacion = "src/test/resources/especificaciones/especificacion.json";
        ClimaTotal climaTotal = new ClimaTotalFactory(especificacion).crear();
        List<Dispositivo> dispositivos = climaTotal.getNombreDispositivoMap().values().stream().toList();
        View view = new View(dispositivos);
        view.init();
    }
}
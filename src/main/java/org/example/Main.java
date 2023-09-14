package org.example;

import org.example.view.View;
import org.pp2.ClimaTotal;
import org.pp2.Dispositivo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = ClimaTotal.inicializarDispositivos("src/main/resources/dispositivos.json");
        View view = new View(dispositivos);
        view.init();
    }
}
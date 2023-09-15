package org.example;

import org.example.view.View;
import org.pp2.ClimaTotal;
import org.pp2.Dispositivo;

import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Dispositivo> dispositivos = ClimaTotal.inicializarDispositivos(
                FileSystems.getDefault().getPath("src", "main", "resources", "dispositivos.json").toString(),
                FileSystems.getDefault().getPath("libs").toString());
        View view = new View(dispositivos);
        view.init();
    }
}
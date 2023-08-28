package org.example;

import org.example.view.View;
import org.pp2.ControladorTemperatura;

public class Main {
    public static void main(String[] args) {
        ControladorTemperatura controladorTemperatura = new ControladorTemperatura();
        View view = new View(controladorTemperatura);
        view.init();
    }
}
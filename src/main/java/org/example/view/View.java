package org.example.view;

import org.example.controller.Controller;
import org.pp2.Dispositivo;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class View implements PropertyChangeListener {

    private final Controller controller;
    private final List<Dispositivo> dispositivos;
    private JFrame frame;
    private PanelDeTemperatura switchTemp;
    public View(List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
//        this.controladorTemperatura.attach(this);
        this.controller = new Controller(this, dispositivos);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    public void init() {
        frame = new JFrame();
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        switchTemp = new PanelDeTemperatura(dispositivos.get(0));
        frame.getContentPane().add(switchTemp);

        frame.setVisible(true);
    }
}

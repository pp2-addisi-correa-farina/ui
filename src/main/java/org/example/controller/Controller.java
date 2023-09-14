package org.example.controller;

import org.example.view.View;
import org.pp2.Dispositivo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class Controller implements PropertyChangeListener {

    private final View view;
    private final List<Dispositivo> dispositivos;

    public Controller(View view, List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
//        this.dispositivos.attach(this);
        this.view = view;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }
}

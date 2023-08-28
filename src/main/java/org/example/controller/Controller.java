package org.example.controller;

import org.example.view.View;
import org.pp2.ControladorTemperatura;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller implements PropertyChangeListener {

    private final View view;
    private final ControladorTemperatura controladorTemperatura;

    public Controller(View view, ControladorTemperatura controladorTemperatura) {
        this.controladorTemperatura = controladorTemperatura;
        this.controladorTemperatura.attach(this);
        this.view = view;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }
}

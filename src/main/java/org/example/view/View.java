package org.example.view;

import org.example.controller.Controller;
import org.pp2.ControladorTemperatura;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class View implements PropertyChangeListener {

    private final Controller controller;
    private final ControladorTemperatura controladorTemperatura;
    public View(ControladorTemperatura controladorTemperatura) {
        this.controladorTemperatura = controladorTemperatura;
        this.controladorTemperatura.attach(this);
        this.controller = new Controller(this, controladorTemperatura);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    public void init() {
    }
}

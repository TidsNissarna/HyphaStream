package com.hyphastream.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

/**
 * Created by TobNil on 2016-05-31.
 */
public class SampleController {

    public Label helloWorld;

    public void sayHelloWorld(ActionEvent event) {
        this.helloWorld.setText("Hello2 World!");
    }
}
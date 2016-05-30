package com.hyphastream;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

/**
 * @author Tobias Nilsson <mailto:tobias.nilsson@so4it.com/>
 */
public class SampleController {

    public Label helloWorld;

    public void sayHelloWorld(ActionEvent event) {
        this.helloWorld.setText("Hello World!");
    }
}
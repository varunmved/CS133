package com.mycompany.myapp;

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import userclasses.StateMachine;

/**
 * Created by Varun on 1/30/16.
 */
public class A0Prj {
    private Form current;

    public void init(Object context) {
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");        
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}
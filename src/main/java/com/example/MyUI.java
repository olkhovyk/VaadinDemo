package com.example;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.*;
import com.vaadin.ui.*;

import java.io.File;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final GridLayout content = new GridLayout(30, 30);


        Button reserve = new Button("Reserve");
        Layout seats = new Seats(10 , 9);
        Layout description = new Description();
        Layout poster = new Poster();

        content.addComponent(poster, 1, 1, 4, 4);
        content.addComponent(seats, 1, 5, 28, 28);
        content.addComponent(description, 5, 1, 14, 4);
        content.addComponent(new Label("Price: 160"), 15, 3, 18, 4);
        content.addComponent(new Label("Email"), 19, 2, 21, 2);
        content.addComponent(new TextField(), 19, 3, 21, 4);
        content.addComponent(reserve, 25, 4, 27, 4);
        content.addComponent(new Button("Back"), 25, 2, 27, 2);




            setContent(content);
            content.setSizeFull();
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }


}



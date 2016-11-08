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
        Resource fileResource = new ThemeResource("\"C:\\B5wEpk55Ncw.jpg\"");
        Image image = new Image("Image", fileResource);
        image.setAlternateText(image.getCaption());

        GridLayout content = new GridLayout(4, 4);
        content.setSizeFull();
        setContent(content);
        Button reserve = new Button("Reserve");
        Layout seats = new Seats(10 , 9);
        Layout description = new Description();
        Layout poster = new Poster();
        Layout legend = new Legend();
        Layout order = new Order();

        content.addComponent(image, 0, 0);
        content.addComponent(seats, 1, 1, 2, 2);
        content.addComponent(description, 0, 1, 0 ,2);
        content.addComponent(legend, 1, 3, 2, 3);
        content.addComponent(reserve, 3, 3);
        content.addComponent(order, 3, 0);

        content.setComponentAlignment(seats, Alignment.MIDDLE_CENTER);
        content.setComponentAlignment(order, Alignment.MIDDLE_CENTER);
        content.setComponentAlignment(reserve, Alignment.MIDDLE_CENTER);


    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }


}



package com.example;

import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;

import java.io.File;

/**
 * Created by Илья on 07.11.2016.
 */
public class Poster extends VerticalLayout {
    public Poster() {
        Resource fileResource = new ThemeResource("\"C:\\B5wEpk55Ncw.jpg\"");
        Image image = new Image("Image", fileResource);
        image.setAlternateText(image.getCaption());
        addComponent(image);
        setComponentAlignment(image, Alignment.MIDDLE_CENTER);

    }
}

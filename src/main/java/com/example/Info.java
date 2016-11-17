package com.example;

import com.vaadin.ui.*;

/**
 * Created by Илья on 17.11.2016.
 */
public class Info extends FormLayout {
    TextField duration;
    TextField imdb;
    TextField periodicity;
    TextField basePrice;
    TextField timeOut;
    DateField rollingStart;
    DateField rollingEnd;
    Button save;
    Button back;
    public Info() {
        setSizeFull();
        init();
        addComponent(duration);
        addComponent(imdb);
        addComponent(periodicity);
        addComponent(basePrice);
        addComponent(timeOut);
        addComponent(rollingStart);
        addComponent(rollingEnd);
        addComponent(save);
        addComponent(back);
    }

    public void init(){
        duration = new TextField("Duration:");
        imdb = new TextField("Imdb:");
        periodicity = new TextField("Periodicity:");
        basePrice = new TextField("Base Price:");
        timeOut = new TextField("Time Out:");

        rollingStart = new DateField("Rolling Start:");
        rollingEnd = new DateField("Rolling End:");

        save = new Button("Save");
        back = new Button("Back");
    }
}

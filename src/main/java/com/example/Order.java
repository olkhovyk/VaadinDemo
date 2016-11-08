package com.example;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Илья on 07.11.2016.
 */
public class Order extends VerticalLayout{
    public Order() {
        Label label1 = new Label("Место 1 Ряд 2");
        Label label2 = new Label("Место 2 Ряд 2");
        Label label3 = new Label("Место 7 Ряд 2");
        addComponent(label1);
        addComponent(label2);
        addComponent(label3);
        setComponentAlignment(label1, Alignment.MIDDLE_CENTER);
        setComponentAlignment(label2, Alignment.MIDDLE_CENTER);
        setComponentAlignment(label3, Alignment.MIDDLE_CENTER);
    }
}

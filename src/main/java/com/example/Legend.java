package com.example;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Илья on 07.11.2016.
 */
public class Legend extends HorizontalLayout {
    public Legend() {
        addComponent(seatFree);
        addComponent(reserved);
        setSizeFull();
        initSeat();
        setComponentAlignment(seatFree, Alignment.MIDDLE_CENTER);
        setComponentAlignment(reserved, Alignment.MIDDLE_CENTER);

    }
    Button seatFree = new Button("Free");
    Button reserved = new Button("Reserved");
    //Button selected = new Button("Selected");

    void initSeat(){
        reserved.setEnabled(false);
    }
}

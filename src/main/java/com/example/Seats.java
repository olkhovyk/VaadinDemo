package com.example;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;

/**
 * Created by Илья on 07.11.2016.
 */
public class Seats extends GridLayout {
    public Seats(int columns, int rows) {
        super(columns, rows);
        createSeats();
        setSizeFull();
        addStyleName("myview");

    }

        void createSeats(){
        for (int i = 1; i <= getColumns(); i++){
            for(int j = 0; j < getRows(); j++){
                addComponent(new Button(j+1 + "." + i), i-1, j);
            }
        }
    }
}

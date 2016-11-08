package com.example;

import com.vaadin.shared.ui.AlignmentInfo;
import com.vaadin.ui.*;

/**
 * Created by Илья on 07.11.2016.
 */
public class Description extends VerticalLayout {

    public Description() {
        Label area = new Label();
        area.setCaption("Здесь будет описание фильма");
        addComponent(area);
        setComponentAlignment(area, Alignment.TOP_CENTER);

    }
}

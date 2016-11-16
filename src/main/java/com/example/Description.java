package com.example;

import com.vaadin.shared.ui.AlignmentInfo;
import com.vaadin.ui.*;

/**
 * Created by Илья on 07.11.2016.
 */
public class Description extends VerticalLayout {

    public Description() {
        Label area = new Label();
        area.setCaption("Date:10/11/2016");
        addComponent(area);
        //setComponentAlignment(area, Alignment.TOP_CENTER);
        addComponent(new Label("Time: 16-30"));
        addComponent(new Label("AA: 76 BB: 70 CC:80"));
    }
}

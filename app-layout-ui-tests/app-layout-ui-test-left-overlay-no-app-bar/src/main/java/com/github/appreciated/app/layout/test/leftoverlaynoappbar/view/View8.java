package com.github.appreciated.app.layout.test.leftoverlaynoappbar.view;

import com.github.appreciated.app.layout.test.leftoverlaynoappbar.LeftOverlayNoAppBarBehaviourView;
import com.github.appreciated.app.layout.test.view.ExampleView;
import com.vaadin.flow.router.Route;

@Route(value = "view8", layout = LeftOverlayNoAppBarBehaviourView.class)
// an empty view name will also be the default view
public class View8 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}
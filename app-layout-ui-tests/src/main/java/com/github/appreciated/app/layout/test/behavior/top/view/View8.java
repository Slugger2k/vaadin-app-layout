package com.github.appreciated.app.layout.test.behavior.top.view;

import com.github.appreciated.app.layout.test.base.ExampleView;
import com.github.appreciated.app.layout.test.behavior.top.TopBehaviourView;
import com.vaadin.flow.router.Route;

@Route(value = "view8", layout = TopBehaviourView.class)
// an empty view name will also be the default view
public class View8 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}
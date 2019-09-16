package com.github.appreciated.app.layout.test.layouts.left.leftresponsivehybridoverlaynoappbar.view;

import com.github.appreciated.app.layout.test.base.ExampleView;
import com.github.appreciated.app.layout.test.layouts.left.leftresponsivehybridoverlaynoappbar.LeftResponsiveHybridOverlayNoAppBarBehaviourView;
import com.vaadin.flow.router.Route;

@Route(value = "view4", layout = LeftResponsiveHybridOverlayNoAppBarBehaviourView.class)
// an empty view name will also be the default view
public class View4 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}

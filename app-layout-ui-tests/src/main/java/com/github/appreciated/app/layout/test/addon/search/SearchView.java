package com.github.appreciated.app.layout.test.addon.search;

import com.github.appreciated.app.layout.addons.search.overlay.AppBarSearchOverlayButton;
import com.github.appreciated.app.layout.addons.search.overlay.AppBarSearchOverlayButtonBuilder;
import com.github.appreciated.app.layout.component.applayout.Behaviour;
import com.github.appreciated.app.layout.component.builder.AppLayoutBuilder;
import com.github.appreciated.app.layout.test.addon.search.view.*;
import com.github.appreciated.app.layout.test.base.AbstractLeftBehaviorBasicView;
import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.Item;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.provider.Query;
import com.vaadin.flow.router.RoutePrefix;

import java.util.Arrays;

@RoutePrefix(absolute = true, value = "search")
public class SearchView extends AbstractLeftBehaviorBasicView {
    @Override
    public Behaviour getVariant() {
        return Behaviour.LEFT;
    }

    @Override
    public Class<? extends Component>[] getViews() {
        return new Class[]{View1.class, View2.class, View3.class, View4.class, View5.class, View6.class, View7.class, View8.class, View9.class};
    }

    @Override
    public void furtherConfiguration(AppLayoutBuilder builder) {
        ListDataProvider<TestSearchResult> dataProvider = new ListDataProvider<>(Arrays.asList(
                new TestSearchResult("Header1", "Description1"),
                new TestSearchResult("Header2", "Description2"),
                new TestSearchResult("Header3", "Description3"),
                new TestSearchResult("Header4", "Description4"),
                new TestSearchResult("Header5", "Description5"),
                new TestSearchResult("Header6", "Description6"),
                new TestSearchResult("Header7", "Description7"),
                new TestSearchResult("Header8", "Description8"),
                new TestSearchResult("Header9", "Description9"),
                new TestSearchResult("Header10", "Description10")
        ));

        AppBarSearchOverlayButton<TestSearchResult> button = new AppBarSearchOverlayButtonBuilder<TestSearchResult>()
                .withDataProvider(dataProvider)
                .withQueryProvider(s -> new Query<>(testEntity -> !s.equals("") && testEntity.getHeader().startsWith(s)))
                .withDataViewProvider(result -> {
                    RippleClickableCard card = new RippleClickableCard(new Item(result.getHeader(), result.getDescription()));
                    card.setWidthFull();
                    card.setBackground("var(--lumo-base-color)");
                    return card;
                })
                .build();

        builder.withAppBar(button);
    }
}
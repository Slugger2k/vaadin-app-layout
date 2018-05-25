package com.github.appreciated.app.layout.builder.factories;

import com.github.appreciated.app.layout.builder.design.Styles;
import com.github.appreciated.app.layout.builder.entities.DefaultNotification;
import com.github.appreciated.app.layout.builder.entities.NotificationHolder;
import com.github.appreciated.app.layout.builder.interfaces.PairComponentFactory;
import com.github.appreciated.app.layout.component.RoundImage;
import com.github.appreciated.app.layout.webcomponents.papercard.PaperCard;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class DefaultNotificationComponentFactory implements PairComponentFactory<NotificationHolder, DefaultNotification> {
    @Override
    public Component getComponent(NotificationHolder holder, DefaultNotification info) {
        PaperCard card = new PaperCard();
        card.getElement().getStyle().set("width", "100%").set("color", "#000000");

        Label timeAgo = new Label(info.getTimeAgo());
        timeAgo.getElement().getClassList().add(Styles.APP_BAR_NOTIFICATION_TIME);

        Label title = new Label(info.getTitle());
        title.getElement().getClassList().add(Styles.APP_BAR_NOTIFICATION_TITLE);

        Label description = new Label(info.getDescription());
        description.setWidth("100%");
        description.getElement().getClassList().add(Styles.APP_BAR_NOTIFICATION_DESCRIPTION);
        HorizontalLayout descriptionWrapper = new HorizontalLayout(description);

        descriptionWrapper.setWidth("100%");
        if (info.getImage() != null) {
            RoundImage image = new RoundImage(info.getImage());
            descriptionWrapper.add(image);
        }
       /* if (!info.isUnread()) {
            card.getElement().getClassList().add(Styles.APP_BAR_NOTIFICATION_READ);
        }*/
        card.add(new HorizontalLayout(new HorizontalLayout(title, timeAgo)));
        card.add(descriptionWrapper);
        /*wrapper.addLayoutClickListener(layoutClickEvent -> {
            info.setUnread(false);
            holder.onNotificationClicked(info);
            wrapper.getElement().getClassList().add(Styles.APP_BAR_NOTIFICATION_READ);
        });*/
        card.getElement().getClassList().add(info.getStyle());
        return card;
    }
}

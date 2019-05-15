package com.company.changefavicon.web.login;

import com.company.changefavicon.web.extension.ChangeFaviconExtension;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.web.app.loginwindow.AppLoginWindow;
import com.vaadin.ui.AbstractOrderedLayout;

import javax.inject.Inject;

public class ExtAppLoginWindow extends AppLoginWindow {

    @Inject
    private VBoxLayout loginWrapper;

    @Subscribe
    private void onInit(InitEvent event) {
        ChangeFaviconExtension extension = new ChangeFaviconExtension();
        extension.extend(loginWrapper.unwrap(AbstractOrderedLayout.class),
                "./VAADIN/themes/hover/myfavicon/favicon.ico");
    }
}
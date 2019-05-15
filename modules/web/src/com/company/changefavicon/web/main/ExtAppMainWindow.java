package com.company.changefavicon.web.main;

import com.company.changefavicon.web.extension.ChangeFaviconExtension;
import com.haulmont.cuba.gui.components.HBoxLayout;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import com.vaadin.ui.AbstractOrderedLayout;

import javax.inject.Inject;

public class ExtAppMainWindow extends AppMainWindow {

    @Inject
    private HBoxLayout titleBar;

    @Subscribe
    private void onInit(InitEvent event) {
        ChangeFaviconExtension extension = new ChangeFaviconExtension();
        extension.extend(titleBar.unwrap(AbstractOrderedLayout.class),
                "./VAADIN/themes/hover/favicon.ico");
    }
}
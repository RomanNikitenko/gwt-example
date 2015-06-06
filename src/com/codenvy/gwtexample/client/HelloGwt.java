package com.codenvy.gwtexample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloGwt implements EntryPoint {

	@Override
	  public void onModuleLoad() {
111111111111111111111111111111111111111111111111111
	    Label label = new Label("Hello GWT !!!");
	    label.setStyleName("my_label_for_css"); // Change css to use this
	    Button button = new Button("Say something");

	    button.addClickHandler(new ClickHandler() {
	      @Override
	      public void onClick(ClickEvent event) {
	        Window.alert("Hello, again");
	      }
	    });

	    RootPanel.get().add(label);
	    RootPanel.get().add(button);
	  }
	} 

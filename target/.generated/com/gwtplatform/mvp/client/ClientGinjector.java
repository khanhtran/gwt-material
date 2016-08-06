package com.gwtplatform.mvp.client;

import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.core.shared.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.DefaultBootstrapper;
import javax.inject.Provider;

public interface ClientGinjector extends Ginjector {
  static ClientGinjector SINGLETON = ((GinjectorProvider) GWT.create(GinjectorProvider.class)).get();
  
  EventBus getEventBus();
  
  PlaceManager getPlaceManager();
  
  DefaultBootstrapper getDefaultBootstrapper();
  
  Provider<gwt.material.starter.client.application.ApplicationPresenter> getgwtmaterialstarterclientapplicationApplicationPresenter();
  
  Provider<gwt.material.starter.client.application.home.HomePresenter> getgwtmaterialstarterclientapplicationhomeHomePresenter();
}

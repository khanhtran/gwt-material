package com.gwtplatform.mvp.client;

public class com_gwtplatform_mvp_client_DesktopGinjectorImpl implements com.gwtplatform.mvp.client.DesktopGinjector {
  
  /**
   * Top-level injector instance for injector interface com.gwtplatform.mvp.client.DesktopGinjector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector = new com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector(this);
  public com_gwtplatform_mvp_client_DesktopGinjectorImpl() {
    fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector.initializeEagerSingletons();
    
  }
  
  public com.gwtplatform.mvp.client.DefaultBootstrapper getDefaultBootstrapper() {
    return fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$DefaultBootstrapper$_annotation$$none$$();
  }
  
  public com.google.web.bindery.event.shared.EventBus getEventBus() {
    return fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public javax.inject.Provider<gwt.material.starter.client.application.ApplicationPresenter> getgwtmaterialstarterclientapplicationApplicationPresenter() {
    return fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector.getFragment_gwt_material_starter_client_application().get_Key$type$com$google$inject$Provider$gwt$material$starter$client$application$ApplicationPresenter$$_annotation$$none$$();
  }
  
  public javax.inject.Provider<gwt.material.starter.client.application.home.HomePresenter> getgwtmaterialstarterclientapplicationhomeHomePresenter() {
    return fieldcom_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector.getFragment_gwt_material_starter_client_application_home().get_Key$type$com$google$inject$Provider$gwt$material$starter$client$application$home$HomePresenter$$_annotation$$none$$();
  }
  
}

package com.gwtplatform.mvp.client;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$mvp$client$DefaultBootstrapper$_annotation$$none$$(com.gwtplatform.mvp.client.DefaultBootstrapper injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(com.gwtplatform.mvp.client.AutobindDisable injectee) {
    
  }
  
  public void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(com.gwtplatform.mvp.client.HandlerContainerImpl invokee, com.gwtplatform.mvp.client.AutobindDisable _0) {
    invokee.automaticBind(_0);
  }
  
  public void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(com.gwtplatform.mvp.client.HandlerContainerImpl invokee, com.gwtplatform.mvp.client.AutobindDisable _0) {
    invokee.automaticBind(_0);
  }
  
  public void memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$(com.gwtplatform.mvp.client.RootPresenter.RootView injectee) {
    
  }
  
  public void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(com.gwtplatform.mvp.client.HandlerContainerImpl invokee, com.gwtplatform.mvp.client.AutobindDisable _0) {
    invokee.automaticBind(_0);
  }
  
  public void memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$(com.gwtplatform.mvp.client.RootPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  
  /**
   * Binding for java.lang.String declared at:
   *   gwt.material.starter.client.gin.ClientModule.configure(ClientModule.java:42)
   */
  public java.lang.String get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$DefaultPlace$() {
    java.lang.String result = "/";
    return result;
    
  }
  
  
  /**
   * Binding for java.lang.String declared at:
   *   gwt.material.starter.client.gin.ClientModule.configure(ClientModule.java:43)
   */
  public java.lang.String get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$ErrorPlace$() {
    java.lang.String result = "/";
    return result;
    
  }
  
  
  /**
   * Binding for java.lang.String declared at:
   *   gwt.material.starter.client.gin.ClientModule.configure(ClientModule.java:44)
   */
  public java.lang.String get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$UnauthorizedPlace$() {
    java.lang.String result = "/";
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.DefaultBootstrapper declared at:
   *   Implicit binding for com.gwtplatform.mvp.client.DefaultBootstrapper
   */
  public com.gwtplatform.mvp.client.DefaultBootstrapper get_Key$type$com$gwtplatform$mvp$client$DefaultBootstrapper$_annotation$$none$$() {
    com.gwtplatform.mvp.client.DefaultBootstrapper result = com$gwtplatform$mvp$client$DefaultBootstrapper_com$gwtplatform$mvp$client$DefaultBootstrapper_methodInjection(injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$mvp$client$DefaultBootstrapper$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.client.DefaultBootstrapper com$gwtplatform$mvp$client$DefaultBootstrapper_com$gwtplatform$mvp$client$DefaultBootstrapper_methodInjection(com.gwtplatform.mvp.client.proxy.PlaceManager _0) {
    return new com.gwtplatform.mvp.client.DefaultBootstrapper(_0);
  }
  
  private com.gwtplatform.mvp.client.AutobindDisable singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.AutobindDisable get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.AutobindDisable result = com$gwtplatform$mvp$client$AutobindDisable_com$gwtplatform$mvp$client$AutobindDisable_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.mvp.client.AutobindDisable com$gwtplatform$mvp$client$AutobindDisable_com$gwtplatform$mvp$client$AutobindDisable_methodInjection() {
    return new com.gwtplatform.mvp.client.AutobindDisable();
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.RootPresenter$RootView declared at:
   *   Implicit GWT.create binding for com.gwtplatform.mvp.client.RootPresenter$RootView
   */
  public com.gwtplatform.mvp.client.RootPresenter.RootView get_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.mvp.client.RootPresenter.RootView.class);
    assert created instanceof com.gwtplatform.mvp.client.RootPresenter.RootView;
    com.gwtplatform.mvp.client.RootPresenter.RootView result = (com.gwtplatform.mvp.client.RootPresenter.RootView) created;
    
    memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.mvp.client.RootPresenter singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.RootPresenter get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.RootPresenter result = com$gwtplatform$mvp$client$RootPresenter_com$gwtplatform$mvp$client$RootPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.mvp.client.RootPresenter com$gwtplatform$mvp$client$RootPresenter_com$gwtplatform$mvp$client$RootPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.RootPresenter.RootView _1) {
    return new com.gwtplatform.mvp.client.RootPresenter(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit binding for com.gwtplatform.mvp.client.RootPresenter
    get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    
  }
  
}

package gwt.material.starter.client.application.home;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$(gwt.material.starter.client.application.home.HomePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$(gwt.material.starter.client.application.home.HomePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$application$home$HomeView$Binder$_annotation$$none$$(gwt.material.starter.client.application.home.HomeView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$(gwt.material.starter.client.application.home.HomeView injectee) {
    
  }
  
  
  /**
   * Binding for gwt.material.starter.client.application.home.HomePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public gwt.material.starter.client.application.home.HomePresenter.MyView get_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyView$_annotation$$none$$() {
    gwt.material.starter.client.application.home.HomePresenter.MyView result = get_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$();
    return result;
    
  }
  
  private gwt.material.starter.client.application.home.HomePresenter.MyProxy singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.application.home.HomePresenter.MyProxy get_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(gwt.material.starter.client.application.home.HomePresenter.MyProxy.class);
    assert created instanceof gwt.material.starter.client.application.home.HomePresenter.MyProxy;
    gwt.material.starter.client.application.home.HomePresenter.MyProxy result = (gwt.material.starter.client.application.home.HomePresenter.MyProxy) created;
    
    memberInject_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private gwt.material.starter.client.application.home.HomePresenter singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.application.home.HomePresenter get_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$ == null) {
    gwt.material.starter.client.application.home.HomePresenter result = gwt$material$starter$client$application$home$HomePresenter_gwt$material$starter$client$application$home$HomePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyView$_annotation$$none$$(), get_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$;
    
  }
  
  public gwt.material.starter.client.application.home.HomePresenter gwt$material$starter$client$application$home$HomePresenter_gwt$material$starter$client$application$home$HomePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, gwt.material.starter.client.application.home.HomePresenter.MyView _1, gwt.material.starter.client.application.home.HomePresenter.MyProxy _2) {
    return new gwt.material.starter.client.application.home.HomePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<gwt.material.starter.client.application.home.HomePresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<gwt.material.starter.client.application.home.HomePresenter>
   */
  public com.google.inject.Provider<gwt.material.starter.client.application.home.HomePresenter> get_Key$type$com$google$inject$Provider$gwt$material$starter$client$application$home$HomePresenter$$_annotation$$none$$() {
    com.google.inject.Provider<gwt.material.starter.client.application.home.HomePresenter> result = new com.google.inject.Provider<gwt.material.starter.client.application.home.HomePresenter>() { 
      public gwt.material.starter.client.application.home.HomePresenter get() { 
        return get_Key$type$gwt$material$starter$client$application$home$HomePresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for gwt.material.starter.client.application.home.HomeView$Binder declared at:
   *   Implicit GWT.create binding for gwt.material.starter.client.application.home.HomeView$Binder
   */
  public gwt.material.starter.client.application.home.HomeView.Binder get_Key$type$gwt$material$starter$client$application$home$HomeView$Binder$_annotation$$none$$() {
    Object created = GWT.create(gwt.material.starter.client.application.home.HomeView.Binder.class);
    assert created instanceof gwt.material.starter.client.application.home.HomeView.Binder;
    gwt.material.starter.client.application.home.HomeView.Binder result = (gwt.material.starter.client.application.home.HomeView.Binder) created;
    
    memberInject_Key$type$gwt$material$starter$client$application$home$HomeView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private gwt.material.starter.client.application.home.HomeView singleton_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.application.home.HomeView get_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$ == null) {
    gwt.material.starter.client.application.home.HomeView result = gwt$material$starter$client$application$home$HomeView_gwt$material$starter$client$application$home$HomeView_methodInjection(get_Key$type$gwt$material$starter$client$application$home$HomeView$Binder$_annotation$$none$$());
    memberInject_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$application$home$HomeView$_annotation$$none$$;
    
  }
  
  public gwt.material.starter.client.application.home.HomeView gwt$material$starter$client$application$home$HomeView_gwt$material$starter$client$application$home$HomeView_methodInjection(gwt.material.starter.client.application.home.HomeView.Binder _0) {
    return new gwt.material.starter.client.application.home.HomeView(_0);
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
    //   Implicit GWT.create binding for gwt.material.starter.client.application.home.HomePresenter$MyProxy
    get_Key$type$gwt$material$starter$client$application$home$HomePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}

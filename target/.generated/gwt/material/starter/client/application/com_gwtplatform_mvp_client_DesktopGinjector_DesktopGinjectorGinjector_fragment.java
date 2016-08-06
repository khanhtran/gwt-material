package gwt.material.starter.client.application;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$(gwt.material.starter.client.application.ApplicationPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$(gwt.material.starter.client.application.ApplicationPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$application$ApplicationView$Binder$_annotation$$none$$(gwt.material.starter.client.application.ApplicationView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$(gwt.material.starter.client.application.ApplicationView injectee) {
    
  }
  
  
  /**
   * Binding for gwt.material.starter.client.application.ApplicationPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public gwt.material.starter.client.application.ApplicationPresenter.MyView get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyView$_annotation$$none$$() {
    gwt.material.starter.client.application.ApplicationPresenter.MyView result = get_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$();
    return result;
    
  }
  
  private gwt.material.starter.client.application.ApplicationPresenter.MyProxy singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.application.ApplicationPresenter.MyProxy get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(gwt.material.starter.client.application.ApplicationPresenter.MyProxy.class);
    assert created instanceof gwt.material.starter.client.application.ApplicationPresenter.MyProxy;
    gwt.material.starter.client.application.ApplicationPresenter.MyProxy result = (gwt.material.starter.client.application.ApplicationPresenter.MyProxy) created;
    
    memberInject_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private gwt.material.starter.client.application.ApplicationPresenter singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.application.ApplicationPresenter get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$ == null) {
    gwt.material.starter.client.application.ApplicationPresenter result = gwt$material$starter$client$application$ApplicationPresenter_gwt$material$starter$client$application$ApplicationPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyView$_annotation$$none$$(), get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$;
    
  }
  
  public gwt.material.starter.client.application.ApplicationPresenter gwt$material$starter$client$application$ApplicationPresenter_gwt$material$starter$client$application$ApplicationPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, gwt.material.starter.client.application.ApplicationPresenter.MyView _1, gwt.material.starter.client.application.ApplicationPresenter.MyProxy _2) {
    return new gwt.material.starter.client.application.ApplicationPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<gwt.material.starter.client.application.ApplicationPresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<gwt.material.starter.client.application.ApplicationPresenter>
   */
  public com.google.inject.Provider<gwt.material.starter.client.application.ApplicationPresenter> get_Key$type$com$google$inject$Provider$gwt$material$starter$client$application$ApplicationPresenter$$_annotation$$none$$() {
    com.google.inject.Provider<gwt.material.starter.client.application.ApplicationPresenter> result = new com.google.inject.Provider<gwt.material.starter.client.application.ApplicationPresenter>() { 
      public gwt.material.starter.client.application.ApplicationPresenter get() { 
        return get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for gwt.material.starter.client.application.ApplicationView$Binder declared at:
   *   Implicit GWT.create binding for gwt.material.starter.client.application.ApplicationView$Binder
   */
  public gwt.material.starter.client.application.ApplicationView.Binder get_Key$type$gwt$material$starter$client$application$ApplicationView$Binder$_annotation$$none$$() {
    Object created = GWT.create(gwt.material.starter.client.application.ApplicationView.Binder.class);
    assert created instanceof gwt.material.starter.client.application.ApplicationView.Binder;
    gwt.material.starter.client.application.ApplicationView.Binder result = (gwt.material.starter.client.application.ApplicationView.Binder) created;
    
    memberInject_Key$type$gwt$material$starter$client$application$ApplicationView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private gwt.material.starter.client.application.ApplicationView singleton_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.application.ApplicationView get_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$ == null) {
    gwt.material.starter.client.application.ApplicationView result = gwt$material$starter$client$application$ApplicationView_gwt$material$starter$client$application$ApplicationView_methodInjection(get_Key$type$gwt$material$starter$client$application$ApplicationView$Binder$_annotation$$none$$());
    memberInject_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$application$ApplicationView$_annotation$$none$$;
    
  }
  
  public gwt.material.starter.client.application.ApplicationView gwt$material$starter$client$application$ApplicationView_gwt$material$starter$client$application$ApplicationView_methodInjection(gwt.material.starter.client.application.ApplicationView.Binder _0) {
    return new gwt.material.starter.client.application.ApplicationView(_0);
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
    //   Implicit GWT.create binding for gwt.material.starter.client.application.ApplicationPresenter$MyProxy
    get_Key$type$gwt$material$starter$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}

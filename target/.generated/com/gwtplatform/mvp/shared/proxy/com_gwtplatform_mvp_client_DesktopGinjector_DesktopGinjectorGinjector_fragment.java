package com.gwtplatform.mvp.shared.proxy;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter$_annotation$$none$$(com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter injectee) {
    
  }
  
  private com.gwtplatform.mvp.shared.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.shared.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.shared.proxy.TokenFormatter result = get_Key$type$com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter
   */
  public com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter get_Key$type$com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter result = com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter_com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter_methodInjection(injector.getFragment_com_gwtplatform_common_shared().get_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter_com$gwtplatform$mvp$shared$proxy$ParameterTokenFormatter_methodInjection(com.gwtplatform.common.shared.UrlUtils _0) {
    return new com.gwtplatform.mvp.shared.proxy.ParameterTokenFormatter(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}

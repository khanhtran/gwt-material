package gwt.material.starter.client.resources;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$gwt$material$starter$client$resources$AppResources$_annotation$$none$$(gwt.material.starter.client.resources.AppResources injectee) {
    
  }
  
  public void memberInject_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$(gwt.material.starter.client.resources.ResourceLoader injectee) {
    
  }
  
  
  /**
   * Binding for gwt.material.starter.client.resources.AppResources declared at:
   *   Implicit GWT.create binding for gwt.material.starter.client.resources.AppResources
   */
  public gwt.material.starter.client.resources.AppResources get_Key$type$gwt$material$starter$client$resources$AppResources$_annotation$$none$$() {
    Object created = GWT.create(gwt.material.starter.client.resources.AppResources.class);
    assert created instanceof gwt.material.starter.client.resources.AppResources;
    gwt.material.starter.client.resources.AppResources result = (gwt.material.starter.client.resources.AppResources) created;
    
    memberInject_Key$type$gwt$material$starter$client$resources$AppResources$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private gwt.material.starter.client.resources.ResourceLoader singleton_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$ = null;
  
  public gwt.material.starter.client.resources.ResourceLoader get_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$() {
    
    if (singleton_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$ == null) {
    gwt.material.starter.client.resources.ResourceLoader result = gwt$material$starter$client$resources$ResourceLoader_gwt$material$starter$client$resources$ResourceLoader_methodInjection(get_Key$type$gwt$material$starter$client$resources$AppResources$_annotation$$none$$());
    memberInject_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$(result);
    
        singleton_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$ = result;
    }
    return singleton_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$;
    
  }
  
  public gwt.material.starter.client.resources.ResourceLoader gwt$material$starter$client$resources$ResourceLoader_gwt$material$starter$client$resources$ResourceLoader_methodInjection(gwt.material.starter.client.resources.AppResources _0) {
    return new gwt.material.starter.client.resources.ResourceLoader(_0);
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
    //   Implicit binding for gwt.material.starter.client.resources.ResourceLoader
    get_Key$type$gwt$material$starter$client$resources$ResourceLoader$_annotation$$none$$();
    
  }
  
}

package gwt.material.starter.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle {
  private static ApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public java.lang.String footer() {
        return "OP0VGWD-c-a";
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ("header,main,footer{padding-right:280px}.OP0VGWD-c-b{margin:24px}.OP0VGWD-c-a{position:fixed;width:100%;bottom:0;padding-top:0!important}") : ("header,main,footer{padding-left:280px}.OP0VGWD-c-b{margin:24px}.OP0VGWD-c-a{position:fixed;width:100%;bottom:0;padding-top:0!important}");
      }
      public java.lang.String label() {
        return "OP0VGWD-c-b";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}

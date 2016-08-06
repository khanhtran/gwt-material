package gwt.material.starter.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AppResources_default_InlineClientBundleGenerator implements gwt.material.starter.client.resources.AppResources {
  private static AppResources_default_InlineClientBundleGenerator _instance0 = new AppResources_default_InlineClientBundleGenerator();
  private void normalizeInitializer() {
    normalize = new gwt.material.starter.client.resources.AppResources.Normalize() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "normalize";
      }
      public String getText() {
        return ("html{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}body{margin:0}article,aside,details,figcaption,figure,footer,header,hgroup,main,nav,section,summary{display:block}audio,canvas,progress,video{display:inline-block;vertical-align:baseline}[hidden],template{display:none}a{background:transparent}a:active,a:hover,button:active,button:hover{outline:0}abbr[title]{border-bottom:1px dotted}b,strong{font-weight:bold}dfn{font-style:italic}h1{font-size:2em;margin:.67em 0}mark{background:#ff0;color:#000}small{font-size:80%}sub{font-size:75%;line-height:0;position:relative;vertical-align:baseline}sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline;top:-0.5em}sub{bottom:-0.25em}img{border:0}figure{margin:1em 40px}hr{-moz-box-sizing:content-box;box-sizing:content-box;height:0}pre{overflow:auto}code,kbd,pre,samp{font-family:monospace,monospace;font-size:1em}button,input,optgroup,select,textarea{color:inherit;font:inherit;margin:0}button{overflow:visible;text-transform:none}select{text-transform:none}button,html input[type=\"button\"],input[type=\"reset\"],input[type=\"submit\"]{-webkit-appearance:button;cursor:pointer}button[disabled],html input[disabled]{cursor:default}button::-moz-focus-inner{border:0;padding:0}input::-moz-focus-inner{border:0;padding:0}input{line-height:normal}input[type=\"checkbox\"],input[type=\"radio\"]{box-sizing:border-box;padding:0}input[type=\"number\"]::-webkit-inner-spin-button{height:auto}input[type=\"number\"]::-webkit-outer-spin-button{height:auto}input[type=\"search\"]{-webkit-appearance:textfield;-moz-box-sizing:content-box;-webkit-box-sizing:content-box;box-sizing:content-box}input[type=\"search\"]::-webkit-search-cancel-button{-webkit-appearance:none}input[type=\"search\"]::-webkit-search-decoration{-webkit-appearance:none}fieldset{border:1px solid #c0c0c0;margin:0 2px;padding:.35em .625em .75em}legend{border:0;padding:0}textarea{overflow:auto}optgroup{font-weight:bold}table{border-collapse:collapse;border-spacing:0}td,th{padding:0}");
      }
    }
    ;
  }
  private static class normalizeInitializer {
    static {
      _instance0.normalizeInitializer();
    }
    static gwt.material.starter.client.resources.AppResources.Normalize get() {
      return normalize;
    }
  }
  public gwt.material.starter.client.resources.AppResources.Normalize normalize() {
    return normalizeInitializer.get();
  }
  private void styleInitializer() {
    style = new gwt.material.starter.client.resources.AppResources.Style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return ("");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static gwt.material.starter.client.resources.AppResources.Style get() {
      return style;
    }
  }
  public gwt.material.starter.client.resources.AppResources.Style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static gwt.material.starter.client.resources.AppResources.Normalize normalize;
  private static gwt.material.starter.client.resources.AppResources.Style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      normalize(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("normalize", normalize());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'normalize': return this.@gwt.material.starter.client.resources.AppResources::normalize()();
      case 'style': return this.@gwt.material.starter.client.resources.AppResources::style()();
    }
    return null;
  }-*/;
}

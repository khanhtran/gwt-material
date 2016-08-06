package gwt.material.design.addins.client.sideprofile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialSideProfileClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.sideprofile.MaterialSideProfileClientBundle {
  private static MaterialSideProfileClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialSideProfileClientBundle_default_InlineClientBundleGenerator();
  private void sideprofileCssInitializer() {
    sideprofileCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/C:/Users/Khanh/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/1.5.2/gwt-material-addins-1.5.2.jar!/gwt/material/design/addins/client/sideprofile/resources/css/sideprofile.min.css
      public String getText() {
        return ".side-profile span{line-height: 0 !important; } .side-profile i{line-height: 1.5; } .side-profile{padding: 16px; } .side-profile a.dropdown-button{cursor: pointer !important; padding: 0px !important;; line-height: 3; height: 32px !important; font-size: 0.8em; } .side-profile .dropdown-content a {padding: 0px 15px; height: inherit; line-height: 64px; } .side-profile img{width: 60px; height: 60px; margin-bottom: 16px; border-radius: 100%; -webkit-border-radius: 100%; -moz-border-radius: 100%; }";
      }
      public String getName() {
        return "sideprofileCss";
      }
    }
    ;
  }
  private static class sideprofileCssInitializer {
    static {
      _instance0.sideprofileCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return sideprofileCss;
    }
  }
  public com.google.gwt.resources.client.TextResource sideprofileCss() {
    return sideprofileCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource sideprofileCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      sideprofileCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("sideprofileCss", sideprofileCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'sideprofileCss': return this.@gwt.material.design.addins.client.sideprofile.MaterialSideProfileClientBundle::sideprofileCss()();
    }
    return null;
  }-*/;
}

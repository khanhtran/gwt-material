package gwt.material.design.addins.client.sideprofile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialSideProfileDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.sideprofile.MaterialSideProfileDebugClientBundle {
  private static MaterialSideProfileDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialSideProfileDebugClientBundle_default_InlineClientBundleGenerator();
  private void sideprofileCssDebugInitializer() {
    sideprofileCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/C:/Users/Khanh/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/1.5.2/gwt-material-addins-1.5.2.jar!/gwt/material/design/addins/client/sideprofile/resources/css/sideprofile.css
      public String getText() {
        return ".side-profile span{\r\n    line-height: 0 !important;\r\n}\r\n.side-profile i{\r\n    line-height: 1.5;\r\n}\r\n.side-profile{\r\n    padding: 16px;\r\n}\r\n\r\n.side-profile a.dropdown-button{\r\n    cursor: pointer !important;\r\n    padding: 0px !important;;\r\n    line-height: 3;\r\n    height: 32px !important;\r\n    font-size: 0.8em;\r\n}\r\n\r\n.side-profile .dropdown-content a {\r\n    padding: 0px 15px;\r\n    height: inherit;\r\n    line-height: 64px;\r\n}\r\n\r\n.side-profile img{\r\n    width: 60px;\r\n    height: 60px;\r\n    margin-bottom: 16px;\r\n    border-radius: 100%;\r\n    -webkit-border-radius: 100%;\r\n    -moz-border-radius: 100%;\r\n}";
      }
      public String getName() {
        return "sideprofileCssDebug";
      }
    }
    ;
  }
  private static class sideprofileCssDebugInitializer {
    static {
      _instance0.sideprofileCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return sideprofileCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource sideprofileCssDebug() {
    return sideprofileCssDebugInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource sideprofileCssDebug;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      sideprofileCssDebug(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("sideprofileCssDebug", sideprofileCssDebug());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'sideprofileCssDebug': return this.@gwt.material.design.addins.client.sideprofile.MaterialSideProfileDebugClientBundle::sideprofileCssDebug()();
    }
    return null;
  }-*/;
}

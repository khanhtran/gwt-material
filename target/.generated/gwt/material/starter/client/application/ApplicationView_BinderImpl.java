// .ui.xml template last modified: 1468307399111
package gwt.material.starter.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, gwt.material.starter.client.application.ApplicationView>, gwt.material.starter.client.application.ApplicationView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<header> <span id='{0}'></span>  <span id='{1}'></span>  <span id='{2}'></span>  <span id='{3}'></span> </header> <span id='{4}'></span>  <span id='{5}'></span>  <span id='{6}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final gwt.material.starter.client.application.ApplicationView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final gwt.material.starter.client.application.ApplicationView owner;


    public Widgets(final gwt.material.starter.client.application.ApplicationView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle) GWT.create(gwt.material.starter.client.application.ApplicationView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private gwt.material.starter.client.resources.AppResources get_res() {
      return build_res();
    }
    private gwt.material.starter.client.resources.AppResources build_res() {
      // Creation section.
      final gwt.material.starter.client.resources.AppResources res = (gwt.material.starter.client.resources.AppResources) GWT.create(gwt.material.starter.client.resources.AppResources.class);
      // Setup section.

      return res;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final gwt.material.starter.client.application.ApplicationView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();
        get_domId3Element().get();
        get_domId4Element().get();
        get_domId5Element().get();
        get_domId6Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_navBar(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_navBarSearch(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_MaterialSideNav11(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_MaterialDropDown21(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_MaterialContainer25(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_MaterialFAB58(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_MaterialFooter66(), get_domId6Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for navBar called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialNavBar get_navBar() {
      return build_navBar();
    }
    private gwt.material.design.client.ui.MaterialNavBar build_navBar() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBar navBar = (gwt.material.design.client.ui.MaterialNavBar) GWT.create(gwt.material.design.client.ui.MaterialNavBar.class);
      // Setup section.
      navBar.add(get_f_MaterialNavBrand2());
      navBar.add(get_f_MaterialNavSection3());
      navBar.setBackgroundColor("blue");
      navBar.setPaddingLeft(20);
      navBar.setActivates("sideNav");

      return navBar;
    }

    /**
     * Getter for f_MaterialNavBrand2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialNavBrand get_f_MaterialNavBrand2() {
      return build_f_MaterialNavBrand2();
    }
    private gwt.material.design.client.ui.MaterialNavBrand build_f_MaterialNavBrand2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBrand f_MaterialNavBrand2 = new gwt.material.design.client.ui.MaterialNavBrand();
      // Setup section.
      f_MaterialNavBrand2.setText("Starter");

      return f_MaterialNavBrand2;
    }

    /**
     * Getter for f_MaterialNavSection3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialNavSection get_f_MaterialNavSection3() {
      return build_f_MaterialNavSection3();
    }
    private gwt.material.design.client.ui.MaterialNavSection build_f_MaterialNavSection3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavSection f_MaterialNavSection3 = (gwt.material.design.client.ui.MaterialNavSection) GWT.create(gwt.material.design.client.ui.MaterialNavSection.class);
      // Setup section.
      f_MaterialNavSection3.add(get_f_MaterialTooltip4());
      f_MaterialNavSection3.add(get_f_MaterialTooltip6());
      f_MaterialNavSection3.add(get_f_MaterialTooltip8());
      f_MaterialNavSection3.add(get_f_MaterialTooltip10());
      f_MaterialNavSection3.setFloat(com.google.gwt.dom.client.Style.Float.RIGHT);

      return f_MaterialNavSection3;
    }

    /**
     * Getter for f_MaterialTooltip4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip4() {
      return build_f_MaterialTooltip4();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip4 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip4.add(get_f_MaterialLink5());
      f_MaterialTooltip4.setText("Starter");
      f_MaterialTooltip4.setPosition(gwt.material.design.client.constants.Position.BOTTOM);

      return f_MaterialTooltip4;
    }

    /**
     * Getter for f_MaterialLink5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink5() {
      return build_f_MaterialLink5();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink5() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink5 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink5.setIconType(gwt.material.design.client.constants.IconType.WHATSHOT);
      f_MaterialLink5.setIconPosition(gwt.material.design.client.constants.IconPosition.NONE);

      return f_MaterialLink5;
    }

    /**
     * Getter for f_MaterialTooltip6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip6() {
      return build_f_MaterialTooltip6();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip6() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip6 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip6.add(get_f_MaterialLink7());
      f_MaterialTooltip6.setText("Apps");
      f_MaterialTooltip6.setPosition(gwt.material.design.client.constants.Position.BOTTOM);

      return f_MaterialTooltip6;
    }

    /**
     * Getter for f_MaterialLink7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink7() {
      return build_f_MaterialLink7();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink7() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink7 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink7.setIconType(gwt.material.design.client.constants.IconType.VIEW_MODULE);
      f_MaterialLink7.setIconPosition(gwt.material.design.client.constants.IconPosition.NONE);

      return f_MaterialLink7;
    }

    /**
     * Getter for f_MaterialTooltip8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip8() {
      return build_f_MaterialTooltip8();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip8() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip8 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip8.add(get_f_MaterialLink9());
      f_MaterialTooltip8.setText("Notifications");
      f_MaterialTooltip8.setPosition(gwt.material.design.client.constants.Position.BOTTOM);

      return f_MaterialTooltip8;
    }

    /**
     * Getter for f_MaterialLink9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink9() {
      return build_f_MaterialLink9();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink9() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink9 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink9.setIconType(gwt.material.design.client.constants.IconType.NOTIFICATIONS);
      f_MaterialLink9.setIconPosition(gwt.material.design.client.constants.IconPosition.NONE);
      f_MaterialLink9.setActivates("sideNav");

      return f_MaterialLink9;
    }

    /**
     * Getter for f_MaterialTooltip10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip10() {
      return build_f_MaterialTooltip10();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip10() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip10 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip10.add(get_btnSearch());
      f_MaterialTooltip10.setText("Search");
      f_MaterialTooltip10.setPosition(gwt.material.design.client.constants.Position.BOTTOM);

      return f_MaterialTooltip10;
    }

    /**
     * Getter for btnSearch called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_btnSearch() {
      return build_btnSearch();
    }
    private gwt.material.design.client.ui.MaterialLink build_btnSearch() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink btnSearch = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      btnSearch.setIconType(gwt.material.design.client.constants.IconType.SEARCH);
      btnSearch.setIconPosition(gwt.material.design.client.constants.IconPosition.NONE);

      return btnSearch;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for navBarSearch called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialNavBar get_navBarSearch() {
      return build_navBarSearch();
    }
    private gwt.material.design.client.ui.MaterialNavBar build_navBarSearch() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBar navBarSearch = (gwt.material.design.client.ui.MaterialNavBar) GWT.create(gwt.material.design.client.ui.MaterialNavBar.class);
      // Setup section.
      navBarSearch.add(get_txtSearch());
      navBarSearch.setBackgroundColor("white");
      navBarSearch.setVisible(false);

      return navBarSearch;
    }

    /**
     * Getter for txtSearch called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialSearch get_txtSearch() {
      return build_txtSearch();
    }
    private gwt.material.design.client.ui.MaterialSearch build_txtSearch() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialSearch txtSearch = (gwt.material.design.client.ui.MaterialSearch) GWT.create(gwt.material.design.client.ui.MaterialSearch.class);
      // Setup section.
      txtSearch.setActive(true);
      txtSearch.setPlaceholder("Keyword");
      txtSearch.setTextColor("black");

      return txtSearch;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for f_MaterialSideNav11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialSideNav get_f_MaterialSideNav11() {
      return build_f_MaterialSideNav11();
    }
    private gwt.material.design.client.ui.MaterialSideNav build_f_MaterialSideNav11() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialSideNav f_MaterialSideNav11 = new gwt.material.design.client.ui.MaterialSideNav(gwt.material.design.client.constants.SideNavType.FIXED);
      // Setup section.
      f_MaterialSideNav11.add(get_f_sideprofile$MaterialSideProfile12());
      f_MaterialSideNav11.add(get_f_MaterialLink16());
      f_MaterialSideNav11.add(get_f_MaterialLink17());
      f_MaterialSideNav11.add(get_f_MaterialLink18());
      f_MaterialSideNav11.add(get_f_MaterialLink19());
      f_MaterialSideNav11.add(get_f_MaterialLink20());
      f_MaterialSideNav11.setWidth("280");
      f_MaterialSideNav11.setId("sideNav");
      f_MaterialSideNav11.setCloseOnClick(false);

      return f_MaterialSideNav11;
    }

    /**
     * Getter for f_sideprofile$MaterialSideProfile12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.addins.client.sideprofile.MaterialSideProfile get_f_sideprofile$MaterialSideProfile12() {
      return build_f_sideprofile$MaterialSideProfile12();
    }
    private gwt.material.design.addins.client.sideprofile.MaterialSideProfile build_f_sideprofile$MaterialSideProfile12() {
      // Creation section.
      final gwt.material.design.addins.client.sideprofile.MaterialSideProfile f_sideprofile$MaterialSideProfile12 = (gwt.material.design.addins.client.sideprofile.MaterialSideProfile) GWT.create(gwt.material.design.addins.client.sideprofile.MaterialSideProfile.class);
      // Setup section.
      f_sideprofile$MaterialSideProfile12.add(get_f_MaterialImage13());
      f_sideprofile$MaterialSideProfile12.add(get_f_MaterialLabel14());
      f_sideprofile$MaterialSideProfile12.add(get_f_MaterialLink15());
      f_sideprofile$MaterialSideProfile12.setUrl("http://static1.squarespace.com/static/51609147e4b0715db61d32b6/521b97cee4b05f031fd12dde/5519e33de4b06a1002802805/1431718693701/?format=1500w");

      return f_sideprofile$MaterialSideProfile12;
    }

    /**
     * Getter for f_MaterialImage13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialImage get_f_MaterialImage13() {
      return build_f_MaterialImage13();
    }
    private gwt.material.design.client.ui.MaterialImage build_f_MaterialImage13() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialImage f_MaterialImage13 = (gwt.material.design.client.ui.MaterialImage) GWT.create(gwt.material.design.client.ui.MaterialImage.class);
      // Setup section.
      f_MaterialImage13.setUrl("http://b.vimeocdn.com/ps/339/488/3394886_300.jpg");

      return f_MaterialImage13;
    }

    /**
     * Getter for f_MaterialLabel14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel14() {
      return build_f_MaterialLabel14();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel14() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel14 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel14.setText("GWT Material");
      f_MaterialLabel14.setTextColor("white");

      return f_MaterialLabel14;
    }

    /**
     * Getter for f_MaterialLink15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink15() {
      return build_f_MaterialLink15();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink15() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink15 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink15.setIconType(gwt.material.design.client.constants.IconType.ARROW_DROP_DOWN);
      f_MaterialLink15.setIconPosition(gwt.material.design.client.constants.IconPosition.RIGHT);
      f_MaterialLink15.setText("gwt-material@gmail.com");
      f_MaterialLink15.setTextColor("white");
      f_MaterialLink15.setActivates("dropProfile");

      return f_MaterialLink15;
    }

    /**
     * Getter for f_MaterialLink16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink16() {
      return build_f_MaterialLink16();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink16() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink16 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink16.setIconType(gwt.material.design.client.constants.IconType.WHATSHOT);
      f_MaterialLink16.setText("Starter");
      f_MaterialLink16.setTextColor("blue");

      return f_MaterialLink16;
    }

    /**
     * Getter for f_MaterialLink17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink17() {
      return build_f_MaterialLink17();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink17() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink17 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink17.setIconType(gwt.material.design.client.constants.IconType.VIEW_MODULE);
      f_MaterialLink17.setText("Apps");
      f_MaterialLink17.setTextColor("blue");

      return f_MaterialLink17;
    }

    /**
     * Getter for f_MaterialLink18 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink18() {
      return build_f_MaterialLink18();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink18() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink18 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink18.setIconType(gwt.material.design.client.constants.IconType.NOTIFICATIONS);
      f_MaterialLink18.setText("Notifications");
      f_MaterialLink18.setTextColor("blue");
      f_MaterialLink18.setSeparator(true);

      return f_MaterialLink18;
    }

    /**
     * Getter for f_MaterialLink19 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink19() {
      return build_f_MaterialLink19();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink19() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink19 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink19.setIconType(gwt.material.design.client.constants.IconType.NAVIGATION);
      f_MaterialLink19.setText("Navigation");
      f_MaterialLink19.setTextColor("blue");

      return f_MaterialLink19;
    }

    /**
     * Getter for f_MaterialLink20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink20() {
      return build_f_MaterialLink20();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink20() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink20 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink20.setIconType(gwt.material.design.client.constants.IconType.FAVORITE);
      f_MaterialLink20.setText("Favorite");
      f_MaterialLink20.setTextColor("blue");

      return f_MaterialLink20;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_MaterialDropDown21 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialDropDown get_f_MaterialDropDown21() {
      return build_f_MaterialDropDown21();
    }
    private gwt.material.design.client.ui.MaterialDropDown build_f_MaterialDropDown21() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialDropDown f_MaterialDropDown21 = new gwt.material.design.client.ui.MaterialDropDown("dropProfile");
      // Setup section.
      f_MaterialDropDown21.add(get_f_MaterialLink22());
      f_MaterialDropDown21.add(get_f_MaterialLink23());
      f_MaterialDropDown21.add(get_f_MaterialLink24());

      return f_MaterialDropDown21;
    }

    /**
     * Getter for f_MaterialLink22 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink22() {
      return build_f_MaterialLink22();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink22() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink22 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink22.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialLink22.setFontSize("1em");
      f_MaterialLink22.setText("First");

      return f_MaterialLink22;
    }

    /**
     * Getter for f_MaterialLink23 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink23() {
      return build_f_MaterialLink23();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink23() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink23 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink23.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialLink23.setFontSize("1em");
      f_MaterialLink23.setText("Second");

      return f_MaterialLink23;
    }

    /**
     * Getter for f_MaterialLink24 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink24() {
      return build_f_MaterialLink24();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink24() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink24 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink24.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialLink24.setFontSize("1em");
      f_MaterialLink24.setText("Third");

      return f_MaterialLink24;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for f_MaterialContainer25 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialContainer get_f_MaterialContainer25() {
      return build_f_MaterialContainer25();
    }
    private gwt.material.design.client.ui.MaterialContainer build_f_MaterialContainer25() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialContainer f_MaterialContainer25 = (gwt.material.design.client.ui.MaterialContainer) GWT.create(gwt.material.design.client.ui.MaterialContainer.class);
      // Setup section.
      f_MaterialContainer25.add(get_f_MaterialLabel26());
      f_MaterialContainer25.add(get_f_MaterialCollapsible27());
      f_MaterialContainer25.setFontSize("0.8em");

      return f_MaterialContainer25;
    }

    /**
     * Getter for f_MaterialLabel26 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel26() {
      return build_f_MaterialLabel26();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel26() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel26 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel26.addStyleName("" + get_style().label() + "");
      f_MaterialLabel26.setText("Today");
      f_MaterialLabel26.setTextColor("grey");

      return f_MaterialLabel26;
    }

    /**
     * Getter for f_MaterialCollapsible27 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialCollapsible get_f_MaterialCollapsible27() {
      return build_f_MaterialCollapsible27();
    }
    private gwt.material.design.client.ui.MaterialCollapsible build_f_MaterialCollapsible27() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsible f_MaterialCollapsible27 = (gwt.material.design.client.ui.MaterialCollapsible) GWT.create(gwt.material.design.client.ui.MaterialCollapsible.class);
      // Setup section.
      f_MaterialCollapsible27.add(get_f_MaterialCollapsibleItem28());
      f_MaterialCollapsible27.add(get_f_MaterialCollapsibleItem33());
      f_MaterialCollapsible27.add(get_f_MaterialCollapsibleItem38());
      f_MaterialCollapsible27.add(get_f_MaterialCollapsibleItem43());
      f_MaterialCollapsible27.add(get_f_MaterialCollapsibleItem48());
      f_MaterialCollapsible27.add(get_f_MaterialCollapsibleItem53());
      f_MaterialCollapsible27.setGrid("s12 m6 l8");
      f_MaterialCollapsible27.setType(gwt.material.design.client.constants.CollapsibleType.POPOUT);

      return f_MaterialCollapsible27;
    }

    /**
     * Getter for f_MaterialCollapsibleItem28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem28() {
      return build_f_MaterialCollapsibleItem28();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem28() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem28 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem28.add(get_f_MaterialCollapsibleHeader29());
      f_MaterialCollapsibleItem28.add(get_f_MaterialCollapsibleBody31());

      return f_MaterialCollapsibleItem28;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader29() {
      return build_f_MaterialCollapsibleHeader29();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader29() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader29 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader29.add(get_f_MaterialLink30());

      return f_MaterialCollapsibleHeader29;
    }

    /**
     * Getter for f_MaterialLink30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink30() {
      return build_f_MaterialLink30();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink30() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink30 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink30.setIconType(gwt.material.design.client.constants.IconType.AIRPLANEMODE_ACTIVE);
      f_MaterialLink30.setIconPosition(gwt.material.design.client.constants.IconPosition.LEFT);
      f_MaterialLink30.setText("Travel");
      f_MaterialLink30.setTextColor("purple");

      return f_MaterialLink30;
    }

    /**
     * Getter for f_MaterialCollapsibleBody31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody31() {
      return build_f_MaterialCollapsibleBody31();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody31() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody31 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody31.add(get_f_MaterialLabel32());

      return f_MaterialCollapsibleBody31;
    }

    /**
     * Getter for f_MaterialLabel32 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel32() {
      return build_f_MaterialLabel32();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel32() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel32 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel32.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

      return f_MaterialLabel32;
    }

    /**
     * Getter for f_MaterialCollapsibleItem33 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem33() {
      return build_f_MaterialCollapsibleItem33();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem33() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem33 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem33.add(get_f_MaterialCollapsibleHeader34());
      f_MaterialCollapsibleItem33.add(get_f_MaterialCollapsibleBody36());

      return f_MaterialCollapsibleItem33;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader34() {
      return build_f_MaterialCollapsibleHeader34();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader34() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader34 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader34.add(get_f_MaterialLink35());

      return f_MaterialCollapsibleHeader34;
    }

    /**
     * Getter for f_MaterialLink35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink35() {
      return build_f_MaterialLink35();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink35() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink35 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink35.setIconType(gwt.material.design.client.constants.IconType.GROUP);
      f_MaterialLink35.setIconPosition(gwt.material.design.client.constants.IconPosition.LEFT);
      f_MaterialLink35.setText("Social");
      f_MaterialLink35.setTextColor("red");

      return f_MaterialLink35;
    }

    /**
     * Getter for f_MaterialCollapsibleBody36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody36() {
      return build_f_MaterialCollapsibleBody36();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody36() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody36 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody36.add(get_f_MaterialLabel37());

      return f_MaterialCollapsibleBody36;
    }

    /**
     * Getter for f_MaterialLabel37 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel37() {
      return build_f_MaterialLabel37();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel37() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel37 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel37.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

      return f_MaterialLabel37;
    }

    /**
     * Getter for f_MaterialCollapsibleItem38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem38() {
      return build_f_MaterialCollapsibleItem38();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem38() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem38 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem38.add(get_f_MaterialCollapsibleHeader39());
      f_MaterialCollapsibleItem38.add(get_f_MaterialCollapsibleBody41());

      return f_MaterialCollapsibleItem38;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader39() {
      return build_f_MaterialCollapsibleHeader39();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader39() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader39 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader39.add(get_f_MaterialLink40());

      return f_MaterialCollapsibleHeader39;
    }

    /**
     * Getter for f_MaterialLink40 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink40() {
      return build_f_MaterialLink40();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink40() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink40 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink40.setIconType(gwt.material.design.client.constants.IconType.FLAG);
      f_MaterialLink40.setIconPosition(gwt.material.design.client.constants.IconPosition.LEFT);
      f_MaterialLink40.setText("Updates");
      f_MaterialLink40.setTextColor("amber");

      return f_MaterialLink40;
    }

    /**
     * Getter for f_MaterialCollapsibleBody41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody41() {
      return build_f_MaterialCollapsibleBody41();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody41() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody41 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody41.add(get_f_MaterialLabel42());

      return f_MaterialCollapsibleBody41;
    }

    /**
     * Getter for f_MaterialLabel42 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel42() {
      return build_f_MaterialLabel42();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel42() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel42 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel42.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

      return f_MaterialLabel42;
    }

    /**
     * Getter for f_MaterialCollapsibleItem43 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem43() {
      return build_f_MaterialCollapsibleItem43();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem43() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem43 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem43.add(get_f_MaterialCollapsibleHeader44());
      f_MaterialCollapsibleItem43.add(get_f_MaterialCollapsibleBody46());

      return f_MaterialCollapsibleItem43;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader44() {
      return build_f_MaterialCollapsibleHeader44();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader44() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader44 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader44.add(get_f_MaterialLink45());

      return f_MaterialCollapsibleHeader44;
    }

    /**
     * Getter for f_MaterialLink45 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink45() {
      return build_f_MaterialLink45();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink45() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink45 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink45.setIconType(gwt.material.design.client.constants.IconType.ADD_SHOPPING_CART);
      f_MaterialLink45.setIconPosition(gwt.material.design.client.constants.IconPosition.LEFT);
      f_MaterialLink45.setText("Purchases");
      f_MaterialLink45.setTextColor("brown");

      return f_MaterialLink45;
    }

    /**
     * Getter for f_MaterialCollapsibleBody46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody46() {
      return build_f_MaterialCollapsibleBody46();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody46() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody46 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody46.add(get_f_MaterialLabel47());

      return f_MaterialCollapsibleBody46;
    }

    /**
     * Getter for f_MaterialLabel47 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel47() {
      return build_f_MaterialLabel47();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel47() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel47 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel47.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

      return f_MaterialLabel47;
    }

    /**
     * Getter for f_MaterialCollapsibleItem48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem48() {
      return build_f_MaterialCollapsibleItem48();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem48() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem48 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem48.add(get_f_MaterialCollapsibleHeader49());
      f_MaterialCollapsibleItem48.add(get_f_MaterialCollapsibleBody51());

      return f_MaterialCollapsibleItem48;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader49() {
      return build_f_MaterialCollapsibleHeader49();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader49() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader49 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader49.add(get_f_MaterialLink50());

      return f_MaterialCollapsibleHeader49;
    }

    /**
     * Getter for f_MaterialLink50 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink50() {
      return build_f_MaterialLink50();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink50() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink50 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink50.setIconType(gwt.material.design.client.constants.IconType.LOYALTY);
      f_MaterialLink50.setIconPosition(gwt.material.design.client.constants.IconPosition.LEFT);
      f_MaterialLink50.setText("Promos");
      f_MaterialLink50.setTextColor("blue");

      return f_MaterialLink50;
    }

    /**
     * Getter for f_MaterialCollapsibleBody51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody51() {
      return build_f_MaterialCollapsibleBody51();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody51() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody51 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody51.add(get_f_MaterialLabel52());

      return f_MaterialCollapsibleBody51;
    }

    /**
     * Getter for f_MaterialLabel52 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel52() {
      return build_f_MaterialLabel52();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel52() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel52 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel52.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

      return f_MaterialLabel52;
    }

    /**
     * Getter for f_MaterialCollapsibleItem53 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem53() {
      return build_f_MaterialCollapsibleItem53();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem53() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem53 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem53.add(get_f_MaterialCollapsibleHeader54());
      f_MaterialCollapsibleItem53.add(get_f_MaterialCollapsibleBody56());

      return f_MaterialCollapsibleItem53;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader54() {
      return build_f_MaterialCollapsibleHeader54();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader54() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader54 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader54.add(get_f_MaterialLink55());

      return f_MaterialCollapsibleHeader54;
    }

    /**
     * Getter for f_MaterialLink55 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink55() {
      return build_f_MaterialLink55();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink55() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink55 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink55.setIconType(gwt.material.design.client.constants.IconType.INSERT_CHART);
      f_MaterialLink55.setIconPosition(gwt.material.design.client.constants.IconPosition.LEFT);
      f_MaterialLink55.setText("Finance");
      f_MaterialLink55.setTextColor("green");

      return f_MaterialLink55;
    }

    /**
     * Getter for f_MaterialCollapsibleBody56 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody56() {
      return build_f_MaterialCollapsibleBody56();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody56() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody56 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody56.add(get_f_MaterialLabel57());

      return f_MaterialCollapsibleBody56;
    }

    /**
     * Getter for f_MaterialLabel57 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel57() {
      return build_f_MaterialLabel57();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel57() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel57 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel57.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

      return f_MaterialLabel57;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId5;
    }

    /**
     * Getter for f_MaterialFAB58 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialFAB get_f_MaterialFAB58() {
      return build_f_MaterialFAB58();
    }
    private gwt.material.design.client.ui.MaterialFAB build_f_MaterialFAB58() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialFAB f_MaterialFAB58 = (gwt.material.design.client.ui.MaterialFAB) GWT.create(gwt.material.design.client.ui.MaterialFAB.class);
      // Setup section.
      f_MaterialFAB58.add(get_f_MaterialTooltip59());
      f_MaterialFAB58.add(get_f_MaterialFABList61());

      return f_MaterialFAB58;
    }

    /**
     * Getter for f_MaterialTooltip59 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip59() {
      return build_f_MaterialTooltip59();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip59() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip59 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip59.add(get_f_MaterialButton60());
      f_MaterialTooltip59.setText("Create");
      f_MaterialTooltip59.setPosition(gwt.material.design.client.constants.Position.LEFT);

      return f_MaterialTooltip59;
    }

    /**
     * Getter for f_MaterialButton60 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialButton get_f_MaterialButton60() {
      return build_f_MaterialButton60();
    }
    private gwt.material.design.client.ui.MaterialButton build_f_MaterialButton60() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialButton f_MaterialButton60 = (gwt.material.design.client.ui.MaterialButton) GWT.create(gwt.material.design.client.ui.MaterialButton.class);
      // Setup section.
      f_MaterialButton60.setBackgroundColor("red");
      f_MaterialButton60.setSize(gwt.material.design.client.constants.ButtonSize.LARGE);
      f_MaterialButton60.setIconType(gwt.material.design.client.constants.IconType.ADD);
      f_MaterialButton60.setType(gwt.material.design.client.constants.ButtonType.FLOATING);

      return f_MaterialButton60;
    }

    /**
     * Getter for f_MaterialFABList61 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialFABList get_f_MaterialFABList61() {
      return build_f_MaterialFABList61();
    }
    private gwt.material.design.client.ui.MaterialFABList build_f_MaterialFABList61() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialFABList f_MaterialFABList61 = (gwt.material.design.client.ui.MaterialFABList) GWT.create(gwt.material.design.client.ui.MaterialFABList.class);
      // Setup section.
      f_MaterialFABList61.add(get_f_MaterialTooltip62());
      f_MaterialFABList61.add(get_f_MaterialTooltip64());

      return f_MaterialFABList61;
    }

    /**
     * Getter for f_MaterialTooltip62 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip62() {
      return build_f_MaterialTooltip62();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip62() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip62 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip62.add(get_f_MaterialAnchorButton63());
      f_MaterialTooltip62.setText("Theme");
      f_MaterialTooltip62.setPosition(gwt.material.design.client.constants.Position.LEFT);

      return f_MaterialTooltip62;
    }

    /**
     * Getter for f_MaterialAnchorButton63 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialAnchorButton get_f_MaterialAnchorButton63() {
      return build_f_MaterialAnchorButton63();
    }
    private gwt.material.design.client.ui.MaterialAnchorButton build_f_MaterialAnchorButton63() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialAnchorButton f_MaterialAnchorButton63 = (gwt.material.design.client.ui.MaterialAnchorButton) GWT.create(gwt.material.design.client.ui.MaterialAnchorButton.class);
      // Setup section.
      f_MaterialAnchorButton63.setWaves(gwt.material.design.client.constants.WavesType.LIGHT);
      f_MaterialAnchorButton63.setBackgroundColor("blue");
      f_MaterialAnchorButton63.setIconType(gwt.material.design.client.constants.IconType.PALETTE);
      f_MaterialAnchorButton63.setType(gwt.material.design.client.constants.ButtonType.FLOATING);

      return f_MaterialAnchorButton63;
    }

    /**
     * Getter for f_MaterialTooltip64 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialTooltip get_f_MaterialTooltip64() {
      return build_f_MaterialTooltip64();
    }
    private gwt.material.design.client.ui.MaterialTooltip build_f_MaterialTooltip64() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTooltip f_MaterialTooltip64 = (gwt.material.design.client.ui.MaterialTooltip) GWT.create(gwt.material.design.client.ui.MaterialTooltip.class);
      // Setup section.
      f_MaterialTooltip64.add(get_f_MaterialAnchorButton65());
      f_MaterialTooltip64.setText("Mail");
      f_MaterialTooltip64.setPosition(gwt.material.design.client.constants.Position.LEFT);

      return f_MaterialTooltip64;
    }

    /**
     * Getter for f_MaterialAnchorButton65 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialAnchorButton get_f_MaterialAnchorButton65() {
      return build_f_MaterialAnchorButton65();
    }
    private gwt.material.design.client.ui.MaterialAnchorButton build_f_MaterialAnchorButton65() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialAnchorButton f_MaterialAnchorButton65 = (gwt.material.design.client.ui.MaterialAnchorButton) GWT.create(gwt.material.design.client.ui.MaterialAnchorButton.class);
      // Setup section.
      f_MaterialAnchorButton65.setWaves(gwt.material.design.client.constants.WavesType.LIGHT);
      f_MaterialAnchorButton65.setBackgroundColor("amber");
      f_MaterialAnchorButton65.setIconType(gwt.material.design.client.constants.IconType.MAIL);
      f_MaterialAnchorButton65.setType(gwt.material.design.client.constants.ButtonType.FLOATING);

      return f_MaterialAnchorButton65;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.

      return domId5Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId6;
    }

    /**
     * Getter for f_MaterialFooter66 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialFooter get_f_MaterialFooter66() {
      return build_f_MaterialFooter66();
    }
    private gwt.material.design.client.ui.MaterialFooter build_f_MaterialFooter66() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialFooter f_MaterialFooter66 = (gwt.material.design.client.ui.MaterialFooter) GWT.create(gwt.material.design.client.ui.MaterialFooter.class);
      // Setup section.
      f_MaterialFooter66.add(get_f_MaterialFooterCopyright67());
      f_MaterialFooter66.setBackgroundColor("blue");
      f_MaterialFooter66.setType(gwt.material.design.client.constants.FooterType.FIXED);

      return f_MaterialFooter66;
    }

    /**
     * Getter for f_MaterialFooterCopyright67 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialFooterCopyright get_f_MaterialFooterCopyright67() {
      return build_f_MaterialFooterCopyright67();
    }
    private gwt.material.design.client.ui.MaterialFooterCopyright build_f_MaterialFooterCopyright67() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialFooterCopyright f_MaterialFooterCopyright67 = (gwt.material.design.client.ui.MaterialFooterCopyright) GWT.create(gwt.material.design.client.ui.MaterialFooterCopyright.class);
      // Setup section.
      f_MaterialFooterCopyright67.add(get_f_MaterialLabel68());

      return f_MaterialFooterCopyright67;
    }

    /**
     * Getter for f_MaterialLabel68 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel68() {
      return build_f_MaterialLabel68();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel68() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel68 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel68.setText("© 2015 Copyright GWT Material");

      return f_MaterialLabel68;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.

      return domId6Element;
    }
  }
}

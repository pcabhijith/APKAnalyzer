package sk.styk.martin.apkanalyzer;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import sk.styk.martin.apkanalyzer.databinding.ActivityAppDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ActivityMainBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.DialogAppListBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentAboutBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentAboutBindingLandImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentAppDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentAppDetailPageBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentMainAppListBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentManifestBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentPermissionAppListBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentPermissionDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentPermissionDetailGeneralBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentPermissionListBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentPremiumBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentSettingsBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.FragmentStatisticsBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemActivityDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemActivityDetailExpandedBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemAppPermissionDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemApplicationBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemFabMenuBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemFeatureDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemPermissionLocalDataBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemProviderDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemProviderDetailExpandedBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemReceiverDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemReceiverDetailExpandedBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemServiceDetailBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemServiceDetailExpandedBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ListItemSimpleStringBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.NavHeaderMainBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ViewDetailListItemBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ViewFloatingActionButtonBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ViewLoadingBarBindingImpl;
import sk.styk.martin.apkanalyzer.databinding.ViewMathStatisticsCardBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAPPDETAIL = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_DIALOGAPPLIST = 3;

  private static final int LAYOUT_FRAGMENTABOUT = 4;

  private static final int LAYOUT_FRAGMENTAPPDETAIL = 5;

  private static final int LAYOUT_FRAGMENTAPPDETAILPAGE = 6;

  private static final int LAYOUT_FRAGMENTMAINAPPLIST = 7;

  private static final int LAYOUT_FRAGMENTMANIFEST = 8;

  private static final int LAYOUT_FRAGMENTPERMISSIONAPPLIST = 9;

  private static final int LAYOUT_FRAGMENTPERMISSIONDETAIL = 10;

  private static final int LAYOUT_FRAGMENTPERMISSIONDETAILGENERAL = 11;

  private static final int LAYOUT_FRAGMENTPERMISSIONLIST = 12;

  private static final int LAYOUT_FRAGMENTPREMIUM = 13;

  private static final int LAYOUT_FRAGMENTSETTINGS = 14;

  private static final int LAYOUT_FRAGMENTSTATISTICS = 15;

  private static final int LAYOUT_LISTITEMACTIVITYDETAIL = 16;

  private static final int LAYOUT_LISTITEMACTIVITYDETAILEXPANDED = 17;

  private static final int LAYOUT_LISTITEMAPPPERMISSIONDETAIL = 18;

  private static final int LAYOUT_LISTITEMAPPLICATION = 19;

  private static final int LAYOUT_LISTITEMDETAIL = 20;

  private static final int LAYOUT_LISTITEMFABMENU = 21;

  private static final int LAYOUT_LISTITEMFEATUREDETAIL = 22;

  private static final int LAYOUT_LISTITEMPERMISSIONLOCALDATA = 23;

  private static final int LAYOUT_LISTITEMPROVIDERDETAIL = 24;

  private static final int LAYOUT_LISTITEMPROVIDERDETAILEXPANDED = 25;

  private static final int LAYOUT_LISTITEMRECEIVERDETAIL = 26;

  private static final int LAYOUT_LISTITEMRECEIVERDETAILEXPANDED = 27;

  private static final int LAYOUT_LISTITEMSERVICEDETAIL = 28;

  private static final int LAYOUT_LISTITEMSERVICEDETAILEXPANDED = 29;

  private static final int LAYOUT_LISTITEMSIMPLESTRING = 30;

  private static final int LAYOUT_NAVHEADERMAIN = 31;

  private static final int LAYOUT_VIEWDETAILLISTITEM = 32;

  private static final int LAYOUT_VIEWFLOATINGACTIONBUTTON = 33;

  private static final int LAYOUT_VIEWLOADINGBAR = 34;

  private static final int LAYOUT_VIEWMATHSTATISTICSCARD = 35;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(35);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.activity_app_detail, LAYOUT_ACTIVITYAPPDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.dialog_app_list, LAYOUT_DIALOGAPPLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_app_detail, LAYOUT_FRAGMENTAPPDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_app_detail_page, LAYOUT_FRAGMENTAPPDETAILPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_main_app_list, LAYOUT_FRAGMENTMAINAPPLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_manifest, LAYOUT_FRAGMENTMANIFEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_permission_app_list, LAYOUT_FRAGMENTPERMISSIONAPPLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_permission_detail, LAYOUT_FRAGMENTPERMISSIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_permission_detail_general, LAYOUT_FRAGMENTPERMISSIONDETAILGENERAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_permission_list, LAYOUT_FRAGMENTPERMISSIONLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_premium, LAYOUT_FRAGMENTPREMIUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.fragment_statistics, LAYOUT_FRAGMENTSTATISTICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_activity_detail, LAYOUT_LISTITEMACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_activity_detail_expanded, LAYOUT_LISTITEMACTIVITYDETAILEXPANDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_app_permission_detail, LAYOUT_LISTITEMAPPPERMISSIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_application, LAYOUT_LISTITEMAPPLICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_detail, LAYOUT_LISTITEMDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_fab_menu, LAYOUT_LISTITEMFABMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_feature_detail, LAYOUT_LISTITEMFEATUREDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_permission_local_data, LAYOUT_LISTITEMPERMISSIONLOCALDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_provider_detail, LAYOUT_LISTITEMPROVIDERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_provider_detail_expanded, LAYOUT_LISTITEMPROVIDERDETAILEXPANDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_receiver_detail, LAYOUT_LISTITEMRECEIVERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_receiver_detail_expanded, LAYOUT_LISTITEMRECEIVERDETAILEXPANDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_service_detail, LAYOUT_LISTITEMSERVICEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_service_detail_expanded, LAYOUT_LISTITEMSERVICEDETAILEXPANDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.list_item_simple_string, LAYOUT_LISTITEMSIMPLESTRING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.nav_header_main, LAYOUT_NAVHEADERMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.view_detail_list_item, LAYOUT_VIEWDETAILLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.view_floating_action_button, LAYOUT_VIEWFLOATINGACTIONBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.view_loading_bar, LAYOUT_VIEWLOADINGBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sk.styk.martin.apkanalyzer.R.layout.view_math_statistics_card, LAYOUT_VIEWMATHSTATISTICSCARD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAPPDETAIL: {
          if ("layout/activity_app_detail_0".equals(tag)) {
            return new ActivityAppDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_app_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGAPPLIST: {
          if ("layout/dialog_app_list_0".equals(tag)) {
            return new DialogAppListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_app_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout-land/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingLandImpl(component, view);
          }
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAPPDETAIL: {
          if ("layout/fragment_app_detail_0".equals(tag)) {
            return new FragmentAppDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_app_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAPPDETAILPAGE: {
          if ("layout/fragment_app_detail_page_0".equals(tag)) {
            return new FragmentAppDetailPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_app_detail_page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINAPPLIST: {
          if ("layout/fragment_main_app_list_0".equals(tag)) {
            return new FragmentMainAppListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_app_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMANIFEST: {
          if ("layout/fragment_manifest_0".equals(tag)) {
            return new FragmentManifestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_manifest is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERMISSIONAPPLIST: {
          if ("layout/fragment_permission_app_list_0".equals(tag)) {
            return new FragmentPermissionAppListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_permission_app_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERMISSIONDETAIL: {
          if ("layout/fragment_permission_detail_0".equals(tag)) {
            return new FragmentPermissionDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_permission_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERMISSIONDETAILGENERAL: {
          if ("layout/fragment_permission_detail_general_0".equals(tag)) {
            return new FragmentPermissionDetailGeneralBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_permission_detail_general is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERMISSIONLIST: {
          if ("layout/fragment_permission_list_0".equals(tag)) {
            return new FragmentPermissionListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_permission_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPREMIUM: {
          if ("layout/fragment_premium_0".equals(tag)) {
            return new FragmentPremiumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_premium is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATISTICS: {
          if ("layout/fragment_statistics_0".equals(tag)) {
            return new FragmentStatisticsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_statistics is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMACTIVITYDETAIL: {
          if ("layout/list_item_activity_detail_0".equals(tag)) {
            return new ListItemActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMACTIVITYDETAILEXPANDED: {
          if ("layout/list_item_activity_detail_expanded_0".equals(tag)) {
            return new ListItemActivityDetailExpandedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_activity_detail_expanded is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMAPPPERMISSIONDETAIL: {
          if ("layout/list_item_app_permission_detail_0".equals(tag)) {
            return new ListItemAppPermissionDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_app_permission_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMAPPLICATION: {
          if ("layout/list_item_application_0".equals(tag)) {
            return new ListItemApplicationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_application is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMDETAIL: {
          if ("layout/list_item_detail_0".equals(tag)) {
            return new ListItemDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMFABMENU: {
          if ("layout/list_item_fab_menu_0".equals(tag)) {
            return new ListItemFabMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_fab_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMFEATUREDETAIL: {
          if ("layout/list_item_feature_detail_0".equals(tag)) {
            return new ListItemFeatureDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_feature_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPERMISSIONLOCALDATA: {
          if ("layout/list_item_permission_local_data_0".equals(tag)) {
            return new ListItemPermissionLocalDataBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_permission_local_data is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPROVIDERDETAIL: {
          if ("layout/list_item_provider_detail_0".equals(tag)) {
            return new ListItemProviderDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_provider_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPROVIDERDETAILEXPANDED: {
          if ("layout/list_item_provider_detail_expanded_0".equals(tag)) {
            return new ListItemProviderDetailExpandedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_provider_detail_expanded is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMRECEIVERDETAIL: {
          if ("layout/list_item_receiver_detail_0".equals(tag)) {
            return new ListItemReceiverDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_receiver_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMRECEIVERDETAILEXPANDED: {
          if ("layout/list_item_receiver_detail_expanded_0".equals(tag)) {
            return new ListItemReceiverDetailExpandedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_receiver_detail_expanded is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSERVICEDETAIL: {
          if ("layout/list_item_service_detail_0".equals(tag)) {
            return new ListItemServiceDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_service_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSERVICEDETAILEXPANDED: {
          if ("layout/list_item_service_detail_expanded_0".equals(tag)) {
            return new ListItemServiceDetailExpandedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_service_detail_expanded is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSIMPLESTRING: {
          if ("layout/list_item_simple_string_0".equals(tag)) {
            return new ListItemSimpleStringBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_simple_string is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERMAIN: {
          if ("layout/nav_header_main_0".equals(tag)) {
            return new NavHeaderMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_main is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWDETAILLISTITEM: {
          if ("layout/view_detail_list_item_0".equals(tag)) {
            return new ViewDetailListItemBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for view_detail_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWFLOATINGACTIONBUTTON: {
          if ("layout/view_floating_action_button_0".equals(tag)) {
            return new ViewFloatingActionButtonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_floating_action_button is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWLOADINGBAR: {
          if ("layout/view_loading_bar_0".equals(tag)) {
            return new ViewLoadingBarBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for view_loading_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWMATHSTATISTICSCARD: {
          if ("layout/view_math_statistics_card_0".equals(tag)) {
            return new ViewMathStatisticsCardBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for view_math_statistics_card is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_VIEWDETAILLISTITEM: {
          if("layout/view_detail_list_item_0".equals(tag)) {
            return new ViewDetailListItemBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for view_detail_list_item is invalid. Received: " + tag);
        }
        case LAYOUT_VIEWLOADINGBAR: {
          if("layout/view_loading_bar_0".equals(tag)) {
            return new ViewLoadingBarBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for view_loading_bar is invalid. Received: " + tag);
        }
        case LAYOUT_VIEWMATHSTATISTICSCARD: {
          if("layout/view_math_statistics_card_0".equals(tag)) {
            return new ViewMathStatisticsCardBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for view_math_statistics_card is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "data");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(36);

    static {
      sKeys.put("layout/activity_app_detail_0", sk.styk.martin.apkanalyzer.R.layout.activity_app_detail);
      sKeys.put("layout/activity_main_0", sk.styk.martin.apkanalyzer.R.layout.activity_main);
      sKeys.put("layout/dialog_app_list_0", sk.styk.martin.apkanalyzer.R.layout.dialog_app_list);
      sKeys.put("layout-land/fragment_about_0", sk.styk.martin.apkanalyzer.R.layout.fragment_about);
      sKeys.put("layout/fragment_about_0", sk.styk.martin.apkanalyzer.R.layout.fragment_about);
      sKeys.put("layout/fragment_app_detail_0", sk.styk.martin.apkanalyzer.R.layout.fragment_app_detail);
      sKeys.put("layout/fragment_app_detail_page_0", sk.styk.martin.apkanalyzer.R.layout.fragment_app_detail_page);
      sKeys.put("layout/fragment_main_app_list_0", sk.styk.martin.apkanalyzer.R.layout.fragment_main_app_list);
      sKeys.put("layout/fragment_manifest_0", sk.styk.martin.apkanalyzer.R.layout.fragment_manifest);
      sKeys.put("layout/fragment_permission_app_list_0", sk.styk.martin.apkanalyzer.R.layout.fragment_permission_app_list);
      sKeys.put("layout/fragment_permission_detail_0", sk.styk.martin.apkanalyzer.R.layout.fragment_permission_detail);
      sKeys.put("layout/fragment_permission_detail_general_0", sk.styk.martin.apkanalyzer.R.layout.fragment_permission_detail_general);
      sKeys.put("layout/fragment_permission_list_0", sk.styk.martin.apkanalyzer.R.layout.fragment_permission_list);
      sKeys.put("layout/fragment_premium_0", sk.styk.martin.apkanalyzer.R.layout.fragment_premium);
      sKeys.put("layout/fragment_settings_0", sk.styk.martin.apkanalyzer.R.layout.fragment_settings);
      sKeys.put("layout/fragment_statistics_0", sk.styk.martin.apkanalyzer.R.layout.fragment_statistics);
      sKeys.put("layout/list_item_activity_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_activity_detail);
      sKeys.put("layout/list_item_activity_detail_expanded_0", sk.styk.martin.apkanalyzer.R.layout.list_item_activity_detail_expanded);
      sKeys.put("layout/list_item_app_permission_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_app_permission_detail);
      sKeys.put("layout/list_item_application_0", sk.styk.martin.apkanalyzer.R.layout.list_item_application);
      sKeys.put("layout/list_item_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_detail);
      sKeys.put("layout/list_item_fab_menu_0", sk.styk.martin.apkanalyzer.R.layout.list_item_fab_menu);
      sKeys.put("layout/list_item_feature_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_feature_detail);
      sKeys.put("layout/list_item_permission_local_data_0", sk.styk.martin.apkanalyzer.R.layout.list_item_permission_local_data);
      sKeys.put("layout/list_item_provider_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_provider_detail);
      sKeys.put("layout/list_item_provider_detail_expanded_0", sk.styk.martin.apkanalyzer.R.layout.list_item_provider_detail_expanded);
      sKeys.put("layout/list_item_receiver_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_receiver_detail);
      sKeys.put("layout/list_item_receiver_detail_expanded_0", sk.styk.martin.apkanalyzer.R.layout.list_item_receiver_detail_expanded);
      sKeys.put("layout/list_item_service_detail_0", sk.styk.martin.apkanalyzer.R.layout.list_item_service_detail);
      sKeys.put("layout/list_item_service_detail_expanded_0", sk.styk.martin.apkanalyzer.R.layout.list_item_service_detail_expanded);
      sKeys.put("layout/list_item_simple_string_0", sk.styk.martin.apkanalyzer.R.layout.list_item_simple_string);
      sKeys.put("layout/nav_header_main_0", sk.styk.martin.apkanalyzer.R.layout.nav_header_main);
      sKeys.put("layout/view_detail_list_item_0", sk.styk.martin.apkanalyzer.R.layout.view_detail_list_item);
      sKeys.put("layout/view_floating_action_button_0", sk.styk.martin.apkanalyzer.R.layout.view_floating_action_button);
      sKeys.put("layout/view_loading_bar_0", sk.styk.martin.apkanalyzer.R.layout.view_loading_bar);
      sKeys.put("layout/view_math_statistics_card_0", sk.styk.martin.apkanalyzer.R.layout.view_math_statistics_card);
    }
  }
}

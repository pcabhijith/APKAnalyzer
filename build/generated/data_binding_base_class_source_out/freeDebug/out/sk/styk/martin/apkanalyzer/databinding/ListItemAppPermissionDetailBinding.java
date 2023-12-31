// Generated by data binding compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter;

public abstract class ListItemAppPermissionDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView activityName;

  @NonNull
  public final TextView activityPackageName;

  @NonNull
  public final LinearLayout headerContainer;

  @Bindable
  protected AppPermissionListAdapter.PermissionDataViewModel mViewModel;

  protected ListItemAppPermissionDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView activityName, TextView activityPackageName,
      LinearLayout headerContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityName = activityName;
    this.activityPackageName = activityPackageName;
    this.headerContainer = headerContainer;
  }

  public abstract void setViewModel(
      @Nullable AppPermissionListAdapter.PermissionDataViewModel viewModel);

  @Nullable
  public AppPermissionListAdapter.PermissionDataViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemAppPermissionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_app_permission_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemAppPermissionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemAppPermissionDetailBinding>inflateInternal(inflater, R.layout.list_item_app_permission_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemAppPermissionDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_app_permission_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemAppPermissionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemAppPermissionDetailBinding>inflateInternal(inflater, R.layout.list_item_app_permission_detail, null, false, component);
  }

  public static ListItemAppPermissionDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemAppPermissionDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemAppPermissionDetailBinding)bind(component, view, R.layout.list_item_app_permission_detail);
  }
}

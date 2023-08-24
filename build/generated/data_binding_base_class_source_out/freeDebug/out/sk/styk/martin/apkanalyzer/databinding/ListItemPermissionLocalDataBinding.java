// Generated by data binding compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter;

public abstract class ListItemPermissionLocalDataBinding extends ViewDataBinding {
  @NonNull
  public final TextView affectedApps;

  @NonNull
  public final TextView permissionName;

  @NonNull
  public final TextView permissionSimpleName;

  @Bindable
  protected PermissionListAdapter.PermissionItemViewModel mViewModel;

  protected ListItemPermissionLocalDataBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView affectedApps, TextView permissionName,
      TextView permissionSimpleName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.affectedApps = affectedApps;
    this.permissionName = permissionName;
    this.permissionSimpleName = permissionSimpleName;
  }

  public abstract void setViewModel(
      @Nullable PermissionListAdapter.PermissionItemViewModel viewModel);

  @Nullable
  public PermissionListAdapter.PermissionItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemPermissionLocalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_permission_local_data, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemPermissionLocalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemPermissionLocalDataBinding>inflateInternal(inflater, R.layout.list_item_permission_local_data, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemPermissionLocalDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_permission_local_data, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemPermissionLocalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemPermissionLocalDataBinding>inflateInternal(inflater, R.layout.list_item_permission_local_data, null, false, component);
  }

  public static ListItemPermissionLocalDataBinding bind(@NonNull View view) {
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
  public static ListItemPermissionLocalDataBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemPermissionLocalDataBinding)bind(component, view, R.layout.list_item_permission_local_data);
  }
}

// Generated by data binding compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel;

public abstract class FragmentPermissionDetailGeneralBinding extends ViewDataBinding {
  @Bindable
  protected PermissionsGeneralDetailsViewModel mViewModel;

  protected FragmentPermissionDetailGeneralBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable PermissionsGeneralDetailsViewModel viewModel);

  @Nullable
  public PermissionsGeneralDetailsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPermissionDetailGeneralBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_permission_detail_general, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPermissionDetailGeneralBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPermissionDetailGeneralBinding>inflateInternal(inflater, R.layout.fragment_permission_detail_general, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPermissionDetailGeneralBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_permission_detail_general, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPermissionDetailGeneralBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPermissionDetailGeneralBinding>inflateInternal(inflater, R.layout.fragment_permission_detail_general, null, false, component);
  }

  public static FragmentPermissionDetailGeneralBinding bind(@NonNull View view) {
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
  public static FragmentPermissionDetailGeneralBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentPermissionDetailGeneralBinding)bind(component, view, R.layout.fragment_permission_detail_general);
  }
}

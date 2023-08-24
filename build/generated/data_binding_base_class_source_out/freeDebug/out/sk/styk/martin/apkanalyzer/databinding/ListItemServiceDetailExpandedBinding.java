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
import net.cachapa.expandablelayout.ExpandableLayout;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter;
import sk.styk.martin.apkanalyzer.views.NewDetailListItemView;

public abstract class ListItemServiceDetailExpandedBinding extends ViewDataBinding {
  @NonNull
  public final ExpandableLayout expandableContainer;

  @NonNull
  public final NewDetailListItemView itemServiceExported;

  @NonNull
  public final NewDetailListItemView itemServiceExternalService;

  @NonNull
  public final NewDetailListItemView itemServiceIsolatedProcess;

  @NonNull
  public final NewDetailListItemView itemServicePermission;

  @NonNull
  public final NewDetailListItemView itemServiceSingleUser;

  @NonNull
  public final NewDetailListItemView itemServiceStopWithTask;

  @Bindable
  protected AppServiceDetailListAdapter.ServiceDataViewModel mViewModel;

  protected ListItemServiceDetailExpandedBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ExpandableLayout expandableContainer,
      NewDetailListItemView itemServiceExported, NewDetailListItemView itemServiceExternalService,
      NewDetailListItemView itemServiceIsolatedProcess, NewDetailListItemView itemServicePermission,
      NewDetailListItemView itemServiceSingleUser, NewDetailListItemView itemServiceStopWithTask) {
    super(_bindingComponent, _root, _localFieldCount);
    this.expandableContainer = expandableContainer;
    this.itemServiceExported = itemServiceExported;
    this.itemServiceExternalService = itemServiceExternalService;
    this.itemServiceIsolatedProcess = itemServiceIsolatedProcess;
    this.itemServicePermission = itemServicePermission;
    this.itemServiceSingleUser = itemServiceSingleUser;
    this.itemServiceStopWithTask = itemServiceStopWithTask;
  }

  public abstract void setViewModel(
      @Nullable AppServiceDetailListAdapter.ServiceDataViewModel viewModel);

  @Nullable
  public AppServiceDetailListAdapter.ServiceDataViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemServiceDetailExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_service_detail_expanded, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemServiceDetailExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemServiceDetailExpandedBinding>inflateInternal(inflater, R.layout.list_item_service_detail_expanded, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemServiceDetailExpandedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_service_detail_expanded, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemServiceDetailExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemServiceDetailExpandedBinding>inflateInternal(inflater, R.layout.list_item_service_detail_expanded, null, false, component);
  }

  public static ListItemServiceDetailExpandedBinding bind(@NonNull View view) {
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
  public static ListItemServiceDetailExpandedBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemServiceDetailExpandedBinding)bind(component, view, R.layout.list_item_service_detail_expanded);
  }
}
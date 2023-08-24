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
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter;
import sk.styk.martin.apkanalyzer.views.NewDetailListItemView;

public abstract class ListItemReceiverDetailExpandedBinding extends ViewDataBinding {
  @NonNull
  public final ExpandableLayout expandableContainer;

  @NonNull
  public final NewDetailListItemView itemReceiverExported;

  @NonNull
  public final NewDetailListItemView itemReceiverPermission;

  @Bindable
  protected AppReceiverDetailListAdapter.ReceiverDataViewModel mViewModel;

  protected ListItemReceiverDetailExpandedBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ExpandableLayout expandableContainer,
      NewDetailListItemView itemReceiverExported, NewDetailListItemView itemReceiverPermission) {
    super(_bindingComponent, _root, _localFieldCount);
    this.expandableContainer = expandableContainer;
    this.itemReceiverExported = itemReceiverExported;
    this.itemReceiverPermission = itemReceiverPermission;
  }

  public abstract void setViewModel(
      @Nullable AppReceiverDetailListAdapter.ReceiverDataViewModel viewModel);

  @Nullable
  public AppReceiverDetailListAdapter.ReceiverDataViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemReceiverDetailExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_receiver_detail_expanded, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemReceiverDetailExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemReceiverDetailExpandedBinding>inflateInternal(inflater, R.layout.list_item_receiver_detail_expanded, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemReceiverDetailExpandedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_receiver_detail_expanded, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemReceiverDetailExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemReceiverDetailExpandedBinding>inflateInternal(inflater, R.layout.list_item_receiver_detail_expanded, null, false, component);
  }

  public static ListItemReceiverDetailExpandedBinding bind(@NonNull View view) {
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
  public static ListItemReceiverDetailExpandedBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemReceiverDetailExpandedBinding)bind(component, view, R.layout.list_item_receiver_detail_expanded);
  }
}

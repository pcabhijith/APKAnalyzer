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
import sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter;

public abstract class ListItemDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView attributeName;

  @NonNull
  public final TextView attributeValue;

  @Bindable
  protected DetailInfoAdapter.DetailItemViewModel mViewModel;

  protected ListItemDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView attributeName, TextView attributeValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attributeName = attributeName;
    this.attributeValue = attributeValue;
  }

  public abstract void setViewModel(@Nullable DetailInfoAdapter.DetailItemViewModel viewModel);

  @Nullable
  public DetailInfoAdapter.DetailItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemDetailBinding>inflateInternal(inflater, R.layout.list_item_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemDetailBinding>inflateInternal(inflater, R.layout.list_item_detail, null, false, component);
  }

  public static ListItemDetailBinding bind(@NonNull View view) {
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
  public static ListItemDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemDetailBinding)bind(component, view, R.layout.list_item_detail);
  }
}

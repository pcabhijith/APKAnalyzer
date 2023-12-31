// Generated by data binding compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;

public abstract class ListItemFabMenuBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout itemContainer;

  @NonNull
  public final CardView menuItemCard;

  @NonNull
  public final LinearLayout menuItemIconWrapper;

  @NonNull
  public final TextView menuItemLabel;

  protected ListItemFabMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout itemContainer, CardView menuItemCard, LinearLayout menuItemIconWrapper,
      TextView menuItemLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemContainer = itemContainer;
    this.menuItemCard = menuItemCard;
    this.menuItemIconWrapper = menuItemIconWrapper;
    this.menuItemLabel = menuItemLabel;
  }

  @NonNull
  public static ListItemFabMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_fab_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemFabMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemFabMenuBinding>inflateInternal(inflater, R.layout.list_item_fab_menu, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemFabMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_fab_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemFabMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemFabMenuBinding>inflateInternal(inflater, R.layout.list_item_fab_menu, null, false, component);
  }

  public static ListItemFabMenuBinding bind(@NonNull View view) {
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
  public static ListItemFabMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemFabMenuBinding)bind(component, view, R.layout.list_item_fab_menu);
  }
}

// Generated by data binding compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;

public abstract class NavHeaderMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView appName;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final ImageView imageView;

  protected NavHeaderMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView appName, TextView authorName, ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appName = appName;
    this.authorName = authorName;
    this.imageView = imageView;
  }

  @NonNull
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.nav_header_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NavHeaderMainBinding>inflateInternal(inflater, R.layout.nav_header_main, root, attachToRoot, component);
  }

  @NonNull
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.nav_header_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NavHeaderMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NavHeaderMainBinding>inflateInternal(inflater, R.layout.nav_header_main, null, false, component);
  }

  public static NavHeaderMainBinding bind(@NonNull View view) {
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
  public static NavHeaderMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (NavHeaderMainBinding)bind(component, view, R.layout.nav_header_main);
  }
}

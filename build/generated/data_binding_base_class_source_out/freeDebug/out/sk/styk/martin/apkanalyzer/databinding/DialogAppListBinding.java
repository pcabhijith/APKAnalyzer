// Generated by data binding compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel;

public abstract class DialogAppListBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar listViewProgressBar;

  @NonNull
  public final TextView nothingToShow;

  @NonNull
  public final RecyclerView recyclerViewApplications;

  @Bindable
  protected AppListFromPackageNamesDialogViewModel mViewModel;

  protected DialogAppListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar listViewProgressBar, TextView nothingToShow,
      RecyclerView recyclerViewApplications) {
    super(_bindingComponent, _root, _localFieldCount);
    this.listViewProgressBar = listViewProgressBar;
    this.nothingToShow = nothingToShow;
    this.recyclerViewApplications = recyclerViewApplications;
  }

  public abstract void setViewModel(@Nullable AppListFromPackageNamesDialogViewModel viewModel);

  @Nullable
  public AppListFromPackageNamesDialogViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogAppListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_app_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogAppListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogAppListBinding>inflateInternal(inflater, R.layout.dialog_app_list, root, attachToRoot, component);
  }

  @NonNull
  public static DialogAppListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_app_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogAppListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogAppListBinding>inflateInternal(inflater, R.layout.dialog_app_list, null, false, component);
  }

  public static DialogAppListBinding bind(@NonNull View view) {
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
  public static DialogAppListBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogAppListBinding)bind(component, view, R.layout.dialog_app_list);
  }
}

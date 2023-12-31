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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.Deprecated;
import java.lang.Object;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel;
import sk.styk.martin.apkanalyzer.views.LoadingBarView;

public abstract class FragmentPermissionListBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final LoadingBarView loadingBar;

  @NonNull
  public final RecyclerView recyclerViewPermissions;

  @NonNull
  public final MaterialToolbar toolbar;

  @Bindable
  protected PermissionListFragmentViewModel mViewModel;

  protected FragmentPermissionListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBar, LoadingBarView loadingBar,
      RecyclerView recyclerViewPermissions, MaterialToolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.loadingBar = loadingBar;
    this.recyclerViewPermissions = recyclerViewPermissions;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable PermissionListFragmentViewModel viewModel);

  @Nullable
  public PermissionListFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPermissionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_permission_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPermissionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPermissionListBinding>inflateInternal(inflater, R.layout.fragment_permission_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPermissionListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_permission_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPermissionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPermissionListBinding>inflateInternal(inflater, R.layout.fragment_permission_list, null, false, component);
  }

  public static FragmentPermissionListBinding bind(@NonNull View view) {
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
  public static FragmentPermissionListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPermissionListBinding)bind(component, view, R.layout.fragment_permission_list);
  }
}

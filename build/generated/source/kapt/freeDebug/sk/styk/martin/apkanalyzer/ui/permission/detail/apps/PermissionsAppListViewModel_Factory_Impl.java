package sk.styk.martin.apkanalyzer.ui.permission.detail.apps;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class PermissionsAppListViewModel_Factory_Impl implements PermissionsAppListViewModel.Factory {
  private final PermissionsAppListViewModel_Factory delegateFactory;

  PermissionsAppListViewModel_Factory_Impl(PermissionsAppListViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public PermissionsAppListViewModel create(
      PermissionDetailFragmentViewModel permissionDetailFragmentViewModel, boolean showGranted) {
    return delegateFactory.get(permissionDetailFragmentViewModel, showGranted);
  }

  public static Provider<PermissionsAppListViewModel.Factory> create(
      PermissionsAppListViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new PermissionsAppListViewModel_Factory_Impl(delegateFactory));
  }
}

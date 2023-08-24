package sk.styk.martin.apkanalyzer.ui.permission.detail.details;

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
public final class PermissionsGeneralDetailsViewModel_Factory_Impl implements PermissionsGeneralDetailsViewModel.Factory {
  private final PermissionsGeneralDetailsViewModel_Factory delegateFactory;

  PermissionsGeneralDetailsViewModel_Factory_Impl(
      PermissionsGeneralDetailsViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public PermissionsGeneralDetailsViewModel create(
      PermissionDetailFragmentViewModel permissionDetailFragmentViewModel) {
    return delegateFactory.get(permissionDetailFragmentViewModel);
  }

  public static Provider<PermissionsGeneralDetailsViewModel.Factory> create(
      PermissionsGeneralDetailsViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new PermissionsGeneralDetailsViewModel_Factory_Impl(delegateFactory));
  }
}

package sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;

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
public final class AppUsedPermissionFragmentViewModel_Factory_Impl implements AppUsedPermissionFragmentViewModel.Factory {
  private final AppUsedPermissionFragmentViewModel_Factory delegateFactory;

  AppUsedPermissionFragmentViewModel_Factory_Impl(
      AppUsedPermissionFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppUsedPermissionFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppUsedPermissionFragmentViewModel.Factory> create(
      AppUsedPermissionFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppUsedPermissionFragmentViewModel_Factory_Impl(delegateFactory));
  }
}

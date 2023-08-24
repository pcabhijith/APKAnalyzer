package sk.styk.martin.apkanalyzer.ui.appdetail.page.definedpermission;

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
public final class AppDefinedPermissionFragmentViewModel_Factory_Impl implements AppDefinedPermissionFragmentViewModel.Factory {
  private final AppDefinedPermissionFragmentViewModel_Factory delegateFactory;

  AppDefinedPermissionFragmentViewModel_Factory_Impl(
      AppDefinedPermissionFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppDefinedPermissionFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppDefinedPermissionFragmentViewModel.Factory> create(
      AppDefinedPermissionFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppDefinedPermissionFragmentViewModel_Factory_Impl(delegateFactory));
  }
}

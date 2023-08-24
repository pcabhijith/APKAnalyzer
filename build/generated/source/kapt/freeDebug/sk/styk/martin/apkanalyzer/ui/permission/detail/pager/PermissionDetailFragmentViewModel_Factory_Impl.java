package sk.styk.martin.apkanalyzer.ui.permission.detail.pager;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData;

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
public final class PermissionDetailFragmentViewModel_Factory_Impl implements PermissionDetailFragmentViewModel.Factory {
  private final PermissionDetailFragmentViewModel_Factory delegateFactory;

  PermissionDetailFragmentViewModel_Factory_Impl(
      PermissionDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public PermissionDetailFragmentViewModel create(LocalPermissionData localPermissionData) {
    return delegateFactory.get(localPermissionData);
  }

  public static Provider<PermissionDetailFragmentViewModel.Factory> create(
      PermissionDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new PermissionDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}

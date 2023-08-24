package sk.styk.martin.apkanalyzer.ui.permission.detail.apps;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel;

@QualifierMetadata
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
public final class PermissionsAppListFragment_MembersInjector implements MembersInjector<PermissionsAppListFragment> {
  private final Provider<PermissionsAppListViewModel.Factory> viewModelFactoryProvider;

  private final Provider<PermissionDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  public PermissionsAppListFragment_MembersInjector(
      Provider<PermissionsAppListViewModel.Factory> viewModelFactoryProvider,
      Provider<PermissionDetailFragmentViewModel.Factory> parentViewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
  }

  public static MembersInjector<PermissionsAppListFragment> create(
      Provider<PermissionsAppListViewModel.Factory> viewModelFactoryProvider,
      Provider<PermissionDetailFragmentViewModel.Factory> parentViewModelFactoryProvider) {
    return new PermissionsAppListFragment_MembersInjector(viewModelFactoryProvider, parentViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PermissionsAppListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment.viewModelFactory")
  public static void injectViewModelFactory(PermissionsAppListFragment instance,
      PermissionsAppListViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment.parentViewModelFactory")
  public static void injectParentViewModelFactory(PermissionsAppListFragment instance,
      PermissionDetailFragmentViewModel.Factory parentViewModelFactory) {
    instance.parentViewModelFactory = parentViewModelFactory;
  }
}

package sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragment_MembersInjector;

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
public final class AppUsedPermissionDetailFragment_MembersInjector implements MembersInjector<AppUsedPermissionDetailFragment> {
  private final Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  private final Provider<AppUsedPermissionFragmentViewModel.Factory> viewModelFactoryProvider;

  public AppUsedPermissionDetailFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppUsedPermissionFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppUsedPermissionDetailFragment> create(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppUsedPermissionFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new AppUsedPermissionDetailFragment_MembersInjector(parentViewModelFactoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppUsedPermissionDetailFragment instance) {
    AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(AppUsedPermissionDetailFragment instance,
      AppUsedPermissionFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}

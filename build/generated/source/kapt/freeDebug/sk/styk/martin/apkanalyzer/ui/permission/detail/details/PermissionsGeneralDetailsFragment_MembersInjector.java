package sk.styk.martin.apkanalyzer.ui.permission.detail.details;

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
public final class PermissionsGeneralDetailsFragment_MembersInjector implements MembersInjector<PermissionsGeneralDetailsFragment> {
  private final Provider<PermissionsGeneralDetailsViewModel.Factory> viewModelFactoryProvider;

  private final Provider<PermissionDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  public PermissionsGeneralDetailsFragment_MembersInjector(
      Provider<PermissionsGeneralDetailsViewModel.Factory> viewModelFactoryProvider,
      Provider<PermissionDetailFragmentViewModel.Factory> parentViewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
  }

  public static MembersInjector<PermissionsGeneralDetailsFragment> create(
      Provider<PermissionsGeneralDetailsViewModel.Factory> viewModelFactoryProvider,
      Provider<PermissionDetailFragmentViewModel.Factory> parentViewModelFactoryProvider) {
    return new PermissionsGeneralDetailsFragment_MembersInjector(viewModelFactoryProvider, parentViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PermissionsGeneralDetailsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsFragment.viewModelFactory")
  public static void injectViewModelFactory(PermissionsGeneralDetailsFragment instance,
      PermissionsGeneralDetailsViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsFragment.parentViewModelFactory")
  public static void injectParentViewModelFactory(PermissionsGeneralDetailsFragment instance,
      PermissionDetailFragmentViewModel.Factory parentViewModelFactory) {
    instance.parentViewModelFactory = parentViewModelFactory;
  }
}

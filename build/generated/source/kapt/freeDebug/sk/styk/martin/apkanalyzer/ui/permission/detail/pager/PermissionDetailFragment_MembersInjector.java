package sk.styk.martin.apkanalyzer.ui.permission.detail.pager;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class PermissionDetailFragment_MembersInjector implements MembersInjector<PermissionDetailFragment> {
  private final Provider<PermissionDetailFragmentViewModel.Factory> viewModelFactoryProvider;

  public PermissionDetailFragment_MembersInjector(
      Provider<PermissionDetailFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PermissionDetailFragment> create(
      Provider<PermissionDetailFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new PermissionDetailFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PermissionDetailFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(PermissionDetailFragment instance,
      PermissionDetailFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}

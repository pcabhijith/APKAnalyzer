package sk.styk.martin.apkanalyzer.ui.manifest;

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
public final class AndroidManifestFragment_MembersInjector implements MembersInjector<AndroidManifestFragment> {
  private final Provider<AndroidManifestFragmentViewModel.Factory> viewModelFactoryProvider;

  public AndroidManifestFragment_MembersInjector(
      Provider<AndroidManifestFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AndroidManifestFragment> create(
      Provider<AndroidManifestFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new AndroidManifestFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AndroidManifestFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragment.viewModelFactory")
  public static void injectViewModelFactory(AndroidManifestFragment instance,
      AndroidManifestFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}

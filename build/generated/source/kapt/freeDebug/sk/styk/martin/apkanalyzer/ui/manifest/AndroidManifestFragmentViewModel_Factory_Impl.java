package sk.styk.martin.apkanalyzer.ui.manifest;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AndroidManifestFragmentViewModel_Factory_Impl implements AndroidManifestFragmentViewModel.Factory {
  private final AndroidManifestFragmentViewModel_Factory delegateFactory;

  AndroidManifestFragmentViewModel_Factory_Impl(
      AndroidManifestFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AndroidManifestFragmentViewModel create(ManifestRequest manifestRequest) {
    return delegateFactory.get(manifestRequest);
  }

  public static Provider<AndroidManifestFragmentViewModel.Factory> create(
      AndroidManifestFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AndroidManifestFragmentViewModel_Factory_Impl(delegateFactory));
  }
}

package sk.styk.martin.apkanalyzer.ui.about;

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
public final class AboutFragmentViewModel_Factory_Impl implements AboutFragmentViewModel.Factory {
  private final AboutFragmentViewModel_Factory delegateFactory;

  AboutFragmentViewModel_Factory_Impl(AboutFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AboutFragmentViewModel create() {
    return delegateFactory.get();
  }

  public static Provider<AboutFragmentViewModel.Factory> create(
      AboutFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AboutFragmentViewModel_Factory_Impl(delegateFactory));
  }
}

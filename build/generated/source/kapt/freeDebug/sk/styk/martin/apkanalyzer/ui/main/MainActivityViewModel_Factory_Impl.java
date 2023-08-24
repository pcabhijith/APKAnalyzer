package sk.styk.martin.apkanalyzer.ui.main;

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
public final class MainActivityViewModel_Factory_Impl implements MainActivityViewModel.Factory {
  private final MainActivityViewModel_Factory delegateFactory;

  MainActivityViewModel_Factory_Impl(MainActivityViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public MainActivityViewModel create() {
    return delegateFactory.get();
  }

  public static Provider<MainActivityViewModel.Factory> create(
      MainActivityViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new MainActivityViewModel_Factory_Impl(delegateFactory));
  }
}

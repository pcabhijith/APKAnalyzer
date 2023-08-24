package sk.styk.martin.apkanalyzer.ui.about;

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
public final class AboutFragment_MembersInjector implements MembersInjector<AboutFragment> {
  private final Provider<AboutFragmentViewModel.Factory> factoryProvider;

  public AboutFragment_MembersInjector(Provider<AboutFragmentViewModel.Factory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<AboutFragment> create(
      Provider<AboutFragmentViewModel.Factory> factoryProvider) {
    return new AboutFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(AboutFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.about.AboutFragment.factory")
  public static void injectFactory(AboutFragment instance, AboutFragmentViewModel.Factory factory) {
    instance.factory = factory;
  }
}

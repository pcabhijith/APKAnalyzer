package sk.styk.martin.apkanalyzer.ui.settings;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel;

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
public final class SettingsFragment_MembersInjector implements MembersInjector<SettingsFragment> {
  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  public SettingsFragment_MembersInjector(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider) {
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
  }

  public static MembersInjector<SettingsFragment> create(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider) {
    return new SettingsFragment_MembersInjector(navigationDrawerModelProvider);
  }

  @Override
  public void injectMembers(SettingsFragment instance) {
    injectNavigationDrawerModel(instance, navigationDrawerModelProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.settings.SettingsFragment.navigationDrawerModel")
  public static void injectNavigationDrawerModel(SettingsFragment instance,
      NavigationDrawerModel navigationDrawerModel) {
    instance.navigationDrawerModel = navigationDrawerModel;
  }
}

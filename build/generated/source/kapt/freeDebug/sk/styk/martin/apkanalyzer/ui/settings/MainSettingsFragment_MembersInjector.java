package sk.styk.martin.apkanalyzer.ui.settings;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager;

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
public final class MainSettingsFragment_MembersInjector implements MembersInjector<MainSettingsFragment> {
  private final Provider<ColorThemeManager> colorThemeManagerProvider;

  public MainSettingsFragment_MembersInjector(
      Provider<ColorThemeManager> colorThemeManagerProvider) {
    this.colorThemeManagerProvider = colorThemeManagerProvider;
  }

  public static MembersInjector<MainSettingsFragment> create(
      Provider<ColorThemeManager> colorThemeManagerProvider) {
    return new MainSettingsFragment_MembersInjector(colorThemeManagerProvider);
  }

  @Override
  public void injectMembers(MainSettingsFragment instance) {
    injectColorThemeManager(instance, colorThemeManagerProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.settings.MainSettingsFragment.colorThemeManager")
  public static void injectColorThemeManager(MainSettingsFragment instance,
      ColorThemeManager colorThemeManager) {
    instance.colorThemeManager = colorThemeManager;
  }
}

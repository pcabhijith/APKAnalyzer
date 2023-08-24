package sk.styk.martin.apkanalyzer.manager.resources;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.persistence.SettingsManager;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ColorThemeManagerImpl_Factory implements Factory<ColorThemeManagerImpl> {
  private final Provider<SettingsManager> settingsManagerProvider;

  public ColorThemeManagerImpl_Factory(Provider<SettingsManager> settingsManagerProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public ColorThemeManagerImpl get() {
    return newInstance(settingsManagerProvider.get());
  }

  public static ColorThemeManagerImpl_Factory create(
      Provider<SettingsManager> settingsManagerProvider) {
    return new ColorThemeManagerImpl_Factory(settingsManagerProvider);
  }

  public static ColorThemeManagerImpl newInstance(SettingsManager settingsManager) {
    return new ColorThemeManagerImpl(settingsManager);
  }
}

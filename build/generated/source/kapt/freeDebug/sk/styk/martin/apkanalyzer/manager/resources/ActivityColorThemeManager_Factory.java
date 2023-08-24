package sk.styk.martin.apkanalyzer.manager.resources;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class ActivityColorThemeManager_Factory implements Factory<ActivityColorThemeManager> {
  private final Provider<ColorThemeManager> colorThemeManagerProvider;

  public ActivityColorThemeManager_Factory(Provider<ColorThemeManager> colorThemeManagerProvider) {
    this.colorThemeManagerProvider = colorThemeManagerProvider;
  }

  @Override
  public ActivityColorThemeManager get() {
    return newInstance(colorThemeManagerProvider.get());
  }

  public static ActivityColorThemeManager_Factory create(
      Provider<ColorThemeManager> colorThemeManagerProvider) {
    return new ActivityColorThemeManager_Factory(colorThemeManagerProvider);
  }

  public static ActivityColorThemeManager newInstance(ColorThemeManager colorThemeManager) {
    return new ActivityColorThemeManager(colorThemeManager);
  }
}

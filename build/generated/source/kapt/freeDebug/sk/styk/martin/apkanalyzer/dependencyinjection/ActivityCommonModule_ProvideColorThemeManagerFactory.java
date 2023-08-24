package sk.styk.martin.apkanalyzer.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
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
public final class ActivityCommonModule_ProvideColorThemeManagerFactory implements Factory<ActivityColorThemeManager> {
  private final ActivityCommonModule module;

  private final Provider<AppCompatActivity> activityProvider;

  private final Provider<ColorThemeManager> applicationColorThemeManagerProvider;

  public ActivityCommonModule_ProvideColorThemeManagerFactory(ActivityCommonModule module,
      Provider<AppCompatActivity> activityProvider,
      Provider<ColorThemeManager> applicationColorThemeManagerProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
    this.applicationColorThemeManagerProvider = applicationColorThemeManagerProvider;
  }

  @Override
  public ActivityColorThemeManager get() {
    return provideColorThemeManager(module, activityProvider.get(), applicationColorThemeManagerProvider.get());
  }

  public static ActivityCommonModule_ProvideColorThemeManagerFactory create(
      ActivityCommonModule module, Provider<AppCompatActivity> activityProvider,
      Provider<ColorThemeManager> applicationColorThemeManagerProvider) {
    return new ActivityCommonModule_ProvideColorThemeManagerFactory(module, activityProvider, applicationColorThemeManagerProvider);
  }

  public static ActivityColorThemeManager provideColorThemeManager(ActivityCommonModule instance,
      AppCompatActivity activity, ColorThemeManager applicationColorThemeManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideColorThemeManager(activity, applicationColorThemeManager));
  }
}

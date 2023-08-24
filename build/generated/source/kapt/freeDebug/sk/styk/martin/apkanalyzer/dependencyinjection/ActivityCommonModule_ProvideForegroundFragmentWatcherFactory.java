package sk.styk.martin.apkanalyzer.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher;

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
public final class ActivityCommonModule_ProvideForegroundFragmentWatcherFactory implements Factory<ForegroundFragmentWatcher> {
  private final ActivityCommonModule module;

  private final Provider<AppCompatActivity> activityProvider;

  public ActivityCommonModule_ProvideForegroundFragmentWatcherFactory(ActivityCommonModule module,
      Provider<AppCompatActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public ForegroundFragmentWatcher get() {
    return provideForegroundFragmentWatcher(module, activityProvider.get());
  }

  public static ActivityCommonModule_ProvideForegroundFragmentWatcherFactory create(
      ActivityCommonModule module, Provider<AppCompatActivity> activityProvider) {
    return new ActivityCommonModule_ProvideForegroundFragmentWatcherFactory(module, activityProvider);
  }

  public static ForegroundFragmentWatcher provideForegroundFragmentWatcher(
      ActivityCommonModule instance, AppCompatActivity activity) {
    return Preconditions.checkNotNullFromProvides(instance.provideForegroundFragmentWatcher(activity));
  }
}

package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ActivityCommonModule_ProvidesResourcesFactory implements Factory<AppCompatActivity> {
  private final ActivityCommonModule module;

  private final Provider<Activity> activityProvider;

  public ActivityCommonModule_ProvidesResourcesFactory(ActivityCommonModule module,
      Provider<Activity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public AppCompatActivity get() {
    return providesResources(module, activityProvider.get());
  }

  public static ActivityCommonModule_ProvidesResourcesFactory create(ActivityCommonModule module,
      Provider<Activity> activityProvider) {
    return new ActivityCommonModule_ProvidesResourcesFactory(module, activityProvider);
  }

  public static AppCompatActivity providesResources(ActivityCommonModule instance,
      Activity activity) {
    return Preconditions.checkNotNullFromProvides(instance.providesResources(activity));
  }
}

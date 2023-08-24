package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.app.Activity;
import android.content.Context;
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
public final class ActivityCommonModule_ProvideActivityContextFactory implements Factory<Context> {
  private final ActivityCommonModule module;

  private final Provider<Activity> activityProvider;

  public ActivityCommonModule_ProvideActivityContextFactory(ActivityCommonModule module,
      Provider<Activity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Context get() {
    return provideActivityContext(module, activityProvider.get());
  }

  public static ActivityCommonModule_ProvideActivityContextFactory create(
      ActivityCommonModule module, Provider<Activity> activityProvider) {
    return new ActivityCommonModule_ProvideActivityContextFactory(module, activityProvider);
  }

  public static Context provideActivityContext(ActivityCommonModule instance, Activity activity) {
    return Preconditions.checkNotNullFromProvides(instance.provideActivityContext(activity));
  }
}

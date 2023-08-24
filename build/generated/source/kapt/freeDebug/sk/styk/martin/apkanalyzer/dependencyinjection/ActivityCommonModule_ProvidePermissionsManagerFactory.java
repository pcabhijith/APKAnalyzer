package sk.styk.martin.apkanalyzer.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.permission.PermissionManager;

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
public final class ActivityCommonModule_ProvidePermissionsManagerFactory implements Factory<PermissionManager> {
  private final ActivityCommonModule module;

  private final Provider<AppCompatActivity> activityProvider;

  public ActivityCommonModule_ProvidePermissionsManagerFactory(ActivityCommonModule module,
      Provider<AppCompatActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public PermissionManager get() {
    return providePermissionsManager(module, activityProvider.get());
  }

  public static ActivityCommonModule_ProvidePermissionsManagerFactory create(
      ActivityCommonModule module, Provider<AppCompatActivity> activityProvider) {
    return new ActivityCommonModule_ProvidePermissionsManagerFactory(module, activityProvider);
  }

  public static PermissionManager providePermissionsManager(ActivityCommonModule instance,
      AppCompatActivity activity) {
    return Preconditions.checkNotNullFromProvides(instance.providePermissionsManager(activity));
  }
}

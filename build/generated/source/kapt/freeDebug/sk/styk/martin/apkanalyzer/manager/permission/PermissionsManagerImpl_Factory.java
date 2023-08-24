package sk.styk.martin.apkanalyzer.manager.permission;

import android.app.Application;
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
public final class PermissionsManagerImpl_Factory implements Factory<PermissionsManagerImpl> {
  private final Provider<Application> applicationProvider;

  public PermissionsManagerImpl_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public PermissionsManagerImpl get() {
    return newInstance(applicationProvider.get());
  }

  public static PermissionsManagerImpl_Factory create(Provider<Application> applicationProvider) {
    return new PermissionsManagerImpl_Factory(applicationProvider);
  }

  public static PermissionsManagerImpl newInstance(Application application) {
    return new PermissionsManagerImpl(application);
  }
}

package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.app.Application;
import android.content.ContentResolver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ApplicationModule_ProvideContentResolverFactory implements Factory<ContentResolver> {
  private final ApplicationModule module;

  private final Provider<Application> applicationProvider;

  public ApplicationModule_ProvideContentResolverFactory(ApplicationModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public ContentResolver get() {
    return provideContentResolver(module, applicationProvider.get());
  }

  public static ApplicationModule_ProvideContentResolverFactory create(ApplicationModule module,
      Provider<Application> applicationProvider) {
    return new ApplicationModule_ProvideContentResolverFactory(module, applicationProvider);
  }

  public static ContentResolver provideContentResolver(ApplicationModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideContentResolver(application));
  }
}

package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class ApplicationModule_ProvidePersistenceSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvidePersistenceSharedPreferencesFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return providePersistenceSharedPreferences(module, contextProvider.get());
  }

  public static ApplicationModule_ProvidePersistenceSharedPreferencesFactory create(
      ApplicationModule module, Provider<Context> contextProvider) {
    return new ApplicationModule_ProvidePersistenceSharedPreferencesFactory(module, contextProvider);
  }

  public static SharedPreferences providePersistenceSharedPreferences(ApplicationModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providePersistenceSharedPreferences(context));
  }
}

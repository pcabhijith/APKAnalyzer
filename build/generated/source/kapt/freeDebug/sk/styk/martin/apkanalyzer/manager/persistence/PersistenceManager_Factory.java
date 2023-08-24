package sk.styk.martin.apkanalyzer.manager.persistence;

import android.content.SharedPreferences;
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
public final class PersistenceManager_Factory implements Factory<PersistenceManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public PersistenceManager_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public PersistenceManager get() {
    return newInstance(sharedPreferencesProvider.get());
  }

  public static PersistenceManager_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new PersistenceManager_Factory(sharedPreferencesProvider);
  }

  public static PersistenceManager newInstance(SharedPreferences sharedPreferences) {
    return new PersistenceManager(sharedPreferences);
  }
}

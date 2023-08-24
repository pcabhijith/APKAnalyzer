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
public final class SettingsManager_Factory implements Factory<SettingsManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SettingsManager_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SettingsManager get() {
    return newInstance(sharedPreferencesProvider.get());
  }

  public static SettingsManager_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SettingsManager_Factory(sharedPreferencesProvider);
  }

  public static SettingsManager newInstance(SharedPreferences sharedPreferences) {
    return new SettingsManager(sharedPreferences);
  }
}

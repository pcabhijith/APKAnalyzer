package sk.styk.martin.apkanalyzer.manager.promo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager;

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
public final class StartPromoManager_Factory implements Factory<StartPromoManager> {
  private final Provider<PersistenceManager> persistenceManagerProvider;

  public StartPromoManager_Factory(Provider<PersistenceManager> persistenceManagerProvider) {
    this.persistenceManagerProvider = persistenceManagerProvider;
  }

  @Override
  public StartPromoManager get() {
    return newInstance(persistenceManagerProvider.get());
  }

  public static StartPromoManager_Factory create(
      Provider<PersistenceManager> persistenceManagerProvider) {
    return new StartPromoManager_Factory(persistenceManagerProvider);
  }

  public static StartPromoManager newInstance(PersistenceManager persistenceManager) {
    return new StartPromoManager(persistenceManager);
  }
}

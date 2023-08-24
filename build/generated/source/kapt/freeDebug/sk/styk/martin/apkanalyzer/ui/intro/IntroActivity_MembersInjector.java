package sk.styk.martin.apkanalyzer.ui.intro;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager;

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
public final class IntroActivity_MembersInjector implements MembersInjector<IntroActivity> {
  private final Provider<PersistenceManager> persistenceManagerProvider;

  public IntroActivity_MembersInjector(Provider<PersistenceManager> persistenceManagerProvider) {
    this.persistenceManagerProvider = persistenceManagerProvider;
  }

  public static MembersInjector<IntroActivity> create(
      Provider<PersistenceManager> persistenceManagerProvider) {
    return new IntroActivity_MembersInjector(persistenceManagerProvider);
  }

  @Override
  public void injectMembers(IntroActivity instance) {
    injectPersistenceManager(instance, persistenceManagerProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.intro.IntroActivity.persistenceManager")
  public static void injectPersistenceManager(IntroActivity instance,
      PersistenceManager persistenceManager) {
    instance.persistenceManager = persistenceManager;
  }
}

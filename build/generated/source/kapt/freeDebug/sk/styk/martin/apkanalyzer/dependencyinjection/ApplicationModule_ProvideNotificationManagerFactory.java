package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.app.NotificationManager;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class ApplicationModule_ProvideNotificationManagerFactory implements Factory<NotificationManager> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideNotificationManagerFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public NotificationManager get() {
    return provideNotificationManager(module, contextProvider.get());
  }

  public static ApplicationModule_ProvideNotificationManagerFactory create(ApplicationModule module,
      Provider<Context> contextProvider) {
    return new ApplicationModule_ProvideNotificationManagerFactory(module, contextProvider);
  }

  public static NotificationManager provideNotificationManager(ApplicationModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideNotificationManager(context));
  }
}

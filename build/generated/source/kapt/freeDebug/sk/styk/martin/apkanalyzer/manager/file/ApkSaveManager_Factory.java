package sk.styk.martin.apkanalyzer.manager.file;

import android.content.ContentResolver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.manager.notification.NotificationManager;

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
public final class ApkSaveManager_Factory implements Factory<ApkSaveManager> {
  private final Provider<ContentResolver> contentResolverProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public ApkSaveManager_Factory(Provider<ContentResolver> contentResolverProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.contentResolverProvider = contentResolverProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public ApkSaveManager get() {
    return newInstance(contentResolverProvider.get(), notificationManagerProvider.get(), dispatcherProvider.get());
  }

  public static ApkSaveManager_Factory create(Provider<ContentResolver> contentResolverProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new ApkSaveManager_Factory(contentResolverProvider, notificationManagerProvider, dispatcherProvider);
  }

  public static ApkSaveManager newInstance(ContentResolver contentResolver,
      NotificationManager notificationManager, DispatcherProvider dispatcherProvider) {
    return new ApkSaveManager(contentResolver, notificationManager, dispatcherProvider);
  }
}

package sk.styk.martin.apkanalyzer.manager.notification;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager;

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
public final class NotificationManager_Factory implements Factory<NotificationManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ResourcesManager> resourcesManagerProvider;

  private final Provider<android.app.NotificationManager> androidNotificationManagerProvider;

  public NotificationManager_Factory(Provider<Context> contextProvider,
      Provider<ResourcesManager> resourcesManagerProvider,
      Provider<android.app.NotificationManager> androidNotificationManagerProvider) {
    this.contextProvider = contextProvider;
    this.resourcesManagerProvider = resourcesManagerProvider;
    this.androidNotificationManagerProvider = androidNotificationManagerProvider;
  }

  @Override
  public NotificationManager get() {
    return newInstance(contextProvider.get(), resourcesManagerProvider.get(), androidNotificationManagerProvider.get());
  }

  public static NotificationManager_Factory create(Provider<Context> contextProvider,
      Provider<ResourcesManager> resourcesManagerProvider,
      Provider<android.app.NotificationManager> androidNotificationManagerProvider) {
    return new NotificationManager_Factory(contextProvider, resourcesManagerProvider, androidNotificationManagerProvider);
  }

  public static NotificationManager newInstance(Context context, ResourcesManager resourcesManager,
      android.app.NotificationManager androidNotificationManager) {
    return new NotificationManager(context, resourcesManager, androidNotificationManager);
  }
}

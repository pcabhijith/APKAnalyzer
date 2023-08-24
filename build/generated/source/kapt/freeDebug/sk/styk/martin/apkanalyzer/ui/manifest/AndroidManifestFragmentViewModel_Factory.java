package sk.styk.martin.apkanalyzer.ui.manifest;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.appanalysis.AndroidManifestManager;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.manager.file.FileManager;
import sk.styk.martin.apkanalyzer.manager.notification.NotificationManager;
import sk.styk.martin.apkanalyzer.manager.permission.PermissionManager;

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
public final class AndroidManifestFragmentViewModel_Factory {
  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<AndroidManifestManager> androidManifestManagerProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<FileManager> fileManagerProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  public AndroidManifestFragmentViewModel_Factory(
      Provider<PermissionManager> permissionManagerProvider,
      Provider<AndroidManifestManager> androidManifestManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider, Provider<FileManager> fileManagerProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    this.permissionManagerProvider = permissionManagerProvider;
    this.androidManifestManagerProvider = androidManifestManagerProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.fileManagerProvider = fileManagerProvider;
    this.notificationManagerProvider = notificationManagerProvider;
  }

  public AndroidManifestFragmentViewModel get(ManifestRequest manifestRequest) {
    return newInstance(manifestRequest, permissionManagerProvider.get(), androidManifestManagerProvider.get(), dispatcherProvider.get(), fileManagerProvider.get(), notificationManagerProvider.get());
  }

  public static AndroidManifestFragmentViewModel_Factory create(
      Provider<PermissionManager> permissionManagerProvider,
      Provider<AndroidManifestManager> androidManifestManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider, Provider<FileManager> fileManagerProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    return new AndroidManifestFragmentViewModel_Factory(permissionManagerProvider, androidManifestManagerProvider, dispatcherProvider, fileManagerProvider, notificationManagerProvider);
  }

  public static AndroidManifestFragmentViewModel newInstance(ManifestRequest manifestRequest,
      PermissionManager permissionManager, AndroidManifestManager androidManifestManager,
      DispatcherProvider dispatcherProvider, FileManager fileManager,
      NotificationManager notificationManager) {
    return new AndroidManifestFragmentViewModel(manifestRequest, permissionManager, androidManifestManager, dispatcherProvider, fileManager, notificationManager);
  }
}

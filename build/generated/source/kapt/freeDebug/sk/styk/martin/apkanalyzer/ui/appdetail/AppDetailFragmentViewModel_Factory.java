package sk.styk.martin.apkanalyzer.ui.appdetail;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.appanalysis.AppDetailDataManager;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager;
import sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker;
import sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager;
import sk.styk.martin.apkanalyzer.manager.file.DrawableSaveManager;
import sk.styk.martin.apkanalyzer.manager.file.FileManager;
import sk.styk.martin.apkanalyzer.manager.notification.NotificationManager;
import sk.styk.martin.apkanalyzer.manager.permission.PermissionManager;
import sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager;

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
public final class AppDetailFragmentViewModel_Factory {
  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<AppDetailDataManager> appDetailDataManagerProvider;

  private final Provider<ResourcesManager> resourcesManagerProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<AppActionsSpeedMenuAdapter> appActionsAdapterProvider;

  private final Provider<DrawableSaveManager> drawableSaveManagerProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<ApkSaveManager> apkSaveManagerProvider;

  private final Provider<FileManager> fileManagerProvider;

  private final Provider<ActivityColorThemeManager> activityColorThemeManagerProvider;

  private final Provider<AnalyticsTracker> analyticsTrackerProvider;

  public AppDetailFragmentViewModel_Factory(Provider<DispatcherProvider> dispatcherProvider,
      Provider<AppDetailDataManager> appDetailDataManagerProvider,
      Provider<ResourcesManager> resourcesManagerProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<AppActionsSpeedMenuAdapter> appActionsAdapterProvider,
      Provider<DrawableSaveManager> drawableSaveManagerProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<ApkSaveManager> apkSaveManagerProvider, Provider<FileManager> fileManagerProvider,
      Provider<ActivityColorThemeManager> activityColorThemeManagerProvider,
      Provider<AnalyticsTracker> analyticsTrackerProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.appDetailDataManagerProvider = appDetailDataManagerProvider;
    this.resourcesManagerProvider = resourcesManagerProvider;
    this.permissionManagerProvider = permissionManagerProvider;
    this.appActionsAdapterProvider = appActionsAdapterProvider;
    this.drawableSaveManagerProvider = drawableSaveManagerProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.apkSaveManagerProvider = apkSaveManagerProvider;
    this.fileManagerProvider = fileManagerProvider;
    this.activityColorThemeManagerProvider = activityColorThemeManagerProvider;
    this.analyticsTrackerProvider = analyticsTrackerProvider;
  }

  public AppDetailFragmentViewModel get(AppDetailRequest appDetailRequest) {
    return newInstance(appDetailRequest, dispatcherProvider.get(), appDetailDataManagerProvider.get(), resourcesManagerProvider.get(), permissionManagerProvider.get(), appActionsAdapterProvider.get(), drawableSaveManagerProvider.get(), notificationManagerProvider.get(), apkSaveManagerProvider.get(), fileManagerProvider.get(), activityColorThemeManagerProvider.get(), analyticsTrackerProvider.get());
  }

  public static AppDetailFragmentViewModel_Factory create(
      Provider<DispatcherProvider> dispatcherProvider,
      Provider<AppDetailDataManager> appDetailDataManagerProvider,
      Provider<ResourcesManager> resourcesManagerProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<AppActionsSpeedMenuAdapter> appActionsAdapterProvider,
      Provider<DrawableSaveManager> drawableSaveManagerProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<ApkSaveManager> apkSaveManagerProvider, Provider<FileManager> fileManagerProvider,
      Provider<ActivityColorThemeManager> activityColorThemeManagerProvider,
      Provider<AnalyticsTracker> analyticsTrackerProvider) {
    return new AppDetailFragmentViewModel_Factory(dispatcherProvider, appDetailDataManagerProvider, resourcesManagerProvider, permissionManagerProvider, appActionsAdapterProvider, drawableSaveManagerProvider, notificationManagerProvider, apkSaveManagerProvider, fileManagerProvider, activityColorThemeManagerProvider, analyticsTrackerProvider);
  }

  public static AppDetailFragmentViewModel newInstance(AppDetailRequest appDetailRequest,
      DispatcherProvider dispatcherProvider, AppDetailDataManager appDetailDataManager,
      ResourcesManager resourcesManager, PermissionManager permissionManager,
      AppActionsSpeedMenuAdapter appActionsAdapter, DrawableSaveManager drawableSaveManager,
      NotificationManager notificationManager, ApkSaveManager apkSaveManager,
      FileManager fileManager, ActivityColorThemeManager activityColorThemeManager,
      AnalyticsTracker analyticsTracker) {
    return new AppDetailFragmentViewModel(appDetailRequest, dispatcherProvider, appDetailDataManager, resourcesManager, permissionManager, appActionsAdapter, drawableSaveManager, notificationManager, apkSaveManager, fileManager, activityColorThemeManager, analyticsTracker);
  }
}

package sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission;

import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;

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
public final class AppUsedPermissionFragmentViewModel_Factory {
  private final Provider<AppPermissionListAdapter> permissionAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  private final Provider<PackageManager> packageManagerProvider;

  public AppUsedPermissionFragmentViewModel_Factory(
      Provider<AppPermissionListAdapter> permissionAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider,
      Provider<PackageManager> packageManagerProvider) {
    this.permissionAdapterProvider = permissionAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
    this.packageManagerProvider = packageManagerProvider;
  }

  public AppUsedPermissionFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, permissionAdapterProvider.get(), clipBoardManagerProvider.get(), packageManagerProvider.get());
  }

  public static AppUsedPermissionFragmentViewModel_Factory create(
      Provider<AppPermissionListAdapter> permissionAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider,
      Provider<PackageManager> packageManagerProvider) {
    return new AppUsedPermissionFragmentViewModel_Factory(permissionAdapterProvider, clipBoardManagerProvider, packageManagerProvider);
  }

  public static AppUsedPermissionFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppPermissionListAdapter permissionAdapter, ClipBoardManager clipBoardManager,
      PackageManager packageManager) {
    return new AppUsedPermissionFragmentViewModel(appDetailFragmentViewModel, permissionAdapter, clipBoardManager, packageManager);
  }
}

package sk.styk.martin.apkanalyzer.ui.appdetail.page.definedpermission;

import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter;

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
public final class AppDefinedPermissionFragmentViewModel_Factory {
  private final Provider<AppPermissionListAdapter> permissionAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  private final Provider<PackageManager> packageManagerProvider;

  public AppDefinedPermissionFragmentViewModel_Factory(
      Provider<AppPermissionListAdapter> permissionAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider,
      Provider<PackageManager> packageManagerProvider) {
    this.permissionAdapterProvider = permissionAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
    this.packageManagerProvider = packageManagerProvider;
  }

  public AppDefinedPermissionFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, permissionAdapterProvider.get(), clipBoardManagerProvider.get(), packageManagerProvider.get());
  }

  public static AppDefinedPermissionFragmentViewModel_Factory create(
      Provider<AppPermissionListAdapter> permissionAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider,
      Provider<PackageManager> packageManagerProvider) {
    return new AppDefinedPermissionFragmentViewModel_Factory(permissionAdapterProvider, clipBoardManagerProvider, packageManagerProvider);
  }

  public static AppDefinedPermissionFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppPermissionListAdapter permissionAdapter, ClipBoardManager clipBoardManager,
      PackageManager packageManager) {
    return new AppDefinedPermissionFragmentViewModel(appDetailFragmentViewModel, permissionAdapter, clipBoardManager, packageManager);
  }
}

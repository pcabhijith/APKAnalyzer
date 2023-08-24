package sk.styk.martin.apkanalyzer.ui.permission.detail.pager;

import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData;

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
public final class PermissionDetailFragmentViewModel_Factory {
  private final Provider<PackageManager> packageManagerProvider;

  public PermissionDetailFragmentViewModel_Factory(
      Provider<PackageManager> packageManagerProvider) {
    this.packageManagerProvider = packageManagerProvider;
  }

  public PermissionDetailFragmentViewModel get(LocalPermissionData localPermissionData) {
    return newInstance(localPermissionData, packageManagerProvider.get());
  }

  public static PermissionDetailFragmentViewModel_Factory create(
      Provider<PackageManager> packageManagerProvider) {
    return new PermissionDetailFragmentViewModel_Factory(packageManagerProvider);
  }

  public static PermissionDetailFragmentViewModel newInstance(
      LocalPermissionData localPermissionData, PackageManager packageManager) {
    return new PermissionDetailFragmentViewModel(localPermissionData, packageManager);
  }
}

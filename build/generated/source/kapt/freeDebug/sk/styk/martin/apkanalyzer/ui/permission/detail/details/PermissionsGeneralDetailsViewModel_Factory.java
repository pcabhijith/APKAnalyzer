package sk.styk.martin.apkanalyzer.ui.permission.detail.details;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel;

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
public final class PermissionsGeneralDetailsViewModel_Factory {
  private final Provider<DetailInfoAdapter> detailInfoAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  public PermissionsGeneralDetailsViewModel_Factory(
      Provider<DetailInfoAdapter> detailInfoAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    this.detailInfoAdapterProvider = detailInfoAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
  }

  public PermissionsGeneralDetailsViewModel get(
      PermissionDetailFragmentViewModel permissionDetailFragmentViewModel) {
    return newInstance(permissionDetailFragmentViewModel, detailInfoAdapterProvider.get(), clipBoardManagerProvider.get());
  }

  public static PermissionsGeneralDetailsViewModel_Factory create(
      Provider<DetailInfoAdapter> detailInfoAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    return new PermissionsGeneralDetailsViewModel_Factory(detailInfoAdapterProvider, clipBoardManagerProvider);
  }

  public static PermissionsGeneralDetailsViewModel newInstance(
      PermissionDetailFragmentViewModel permissionDetailFragmentViewModel,
      DetailInfoAdapter detailInfoAdapter, ClipBoardManager clipBoardManager) {
    return new PermissionsGeneralDetailsViewModel(permissionDetailFragmentViewModel, detailInfoAdapter, clipBoardManager);
  }
}

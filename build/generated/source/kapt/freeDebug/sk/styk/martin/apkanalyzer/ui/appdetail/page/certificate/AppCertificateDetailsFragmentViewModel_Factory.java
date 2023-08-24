package sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter;
import sk.styk.martin.apkanalyzer.util.Formatter;

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
public final class AppCertificateDetailsFragmentViewModel_Factory {
  private final Provider<DetailInfoAdapter> detailInfoAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  private final Provider<Formatter> formatterProvider;

  public AppCertificateDetailsFragmentViewModel_Factory(
      Provider<DetailInfoAdapter> detailInfoAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider, Provider<Formatter> formatterProvider) {
    this.detailInfoAdapterProvider = detailInfoAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
    this.formatterProvider = formatterProvider;
  }

  public AppCertificateDetailsFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, detailInfoAdapterProvider.get(), clipBoardManagerProvider.get(), formatterProvider.get());
  }

  public static AppCertificateDetailsFragmentViewModel_Factory create(
      Provider<DetailInfoAdapter> detailInfoAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider, Provider<Formatter> formatterProvider) {
    return new AppCertificateDetailsFragmentViewModel_Factory(detailInfoAdapterProvider, clipBoardManagerProvider, formatterProvider);
  }

  public static AppCertificateDetailsFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel, DetailInfoAdapter detailInfoAdapter,
      ClipBoardManager clipBoardManager, Formatter formatter) {
    return new AppCertificateDetailsFragmentViewModel(appDetailFragmentViewModel, detailInfoAdapter, clipBoardManager, formatter);
  }
}

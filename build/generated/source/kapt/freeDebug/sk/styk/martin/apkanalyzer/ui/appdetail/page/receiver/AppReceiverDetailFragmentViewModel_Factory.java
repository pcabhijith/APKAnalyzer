package sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter;

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
public final class AppReceiverDetailFragmentViewModel_Factory {
  private final Provider<AppReceiverDetailListAdapter> receiverAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  public AppReceiverDetailFragmentViewModel_Factory(
      Provider<AppReceiverDetailListAdapter> receiverAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    this.receiverAdapterProvider = receiverAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
  }

  public AppReceiverDetailFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, receiverAdapterProvider.get(), clipBoardManagerProvider.get());
  }

  public static AppReceiverDetailFragmentViewModel_Factory create(
      Provider<AppReceiverDetailListAdapter> receiverAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    return new AppReceiverDetailFragmentViewModel_Factory(receiverAdapterProvider, clipBoardManagerProvider);
  }

  public static AppReceiverDetailFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppReceiverDetailListAdapter receiverAdapter, ClipBoardManager clipBoardManager) {
    return new AppReceiverDetailFragmentViewModel(appDetailFragmentViewModel, receiverAdapter, clipBoardManager);
  }
}

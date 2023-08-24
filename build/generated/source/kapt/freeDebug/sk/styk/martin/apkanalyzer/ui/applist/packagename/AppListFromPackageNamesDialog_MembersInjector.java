package sk.styk.martin.apkanalyzer.ui.applist.packagename;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppListFromPackageNamesDialog_MembersInjector implements MembersInjector<AppListFromPackageNamesDialog> {
  private final Provider<AppListFromPackageNamesDialogViewModel.Factory> viewModelFactoryProvider;

  public AppListFromPackageNamesDialog_MembersInjector(
      Provider<AppListFromPackageNamesDialogViewModel.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppListFromPackageNamesDialog> create(
      Provider<AppListFromPackageNamesDialogViewModel.Factory> viewModelFactoryProvider) {
    return new AppListFromPackageNamesDialog_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppListFromPackageNamesDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialog.viewModelFactory")
  public static void injectViewModelFactory(AppListFromPackageNamesDialog instance,
      AppListFromPackageNamesDialogViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}

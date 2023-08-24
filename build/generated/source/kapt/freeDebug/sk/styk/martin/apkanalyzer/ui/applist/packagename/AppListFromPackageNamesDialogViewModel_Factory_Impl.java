package sk.styk.martin.apkanalyzer.ui.applist.packagename;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppListFromPackageNamesDialogViewModel_Factory_Impl implements AppListFromPackageNamesDialogViewModel.Factory {
  private final AppListFromPackageNamesDialogViewModel_Factory delegateFactory;

  AppListFromPackageNamesDialogViewModel_Factory_Impl(
      AppListFromPackageNamesDialogViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppListFromPackageNamesDialogViewModel create(List<String> packageNames) {
    return delegateFactory.get(packageNames);
  }

  public static Provider<AppListFromPackageNamesDialogViewModel.Factory> create(
      AppListFromPackageNamesDialogViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppListFromPackageNamesDialogViewModel_Factory_Impl(delegateFactory));
  }
}

package sk.styk.martin.apkanalyzer.ui.applist.main;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager;

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
public final class MainAppListFragment_MembersInjector implements MembersInjector<MainAppListFragment> {
  private final Provider<BackPressedManager> backPressedManagerProvider;

  public MainAppListFragment_MembersInjector(
      Provider<BackPressedManager> backPressedManagerProvider) {
    this.backPressedManagerProvider = backPressedManagerProvider;
  }

  public static MembersInjector<MainAppListFragment> create(
      Provider<BackPressedManager> backPressedManagerProvider) {
    return new MainAppListFragment_MembersInjector(backPressedManagerProvider);
  }

  @Override
  public void injectMembers(MainAppListFragment instance) {
    injectBackPressedManager(instance, backPressedManagerProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListFragment.backPressedManager")
  public static void injectBackPressedManager(MainAppListFragment instance,
      BackPressedManager backPressedManager) {
    instance.backPressedManager = backPressedManager;
  }
}

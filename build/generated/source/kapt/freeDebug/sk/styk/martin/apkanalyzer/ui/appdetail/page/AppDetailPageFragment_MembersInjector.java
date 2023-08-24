package sk.styk.martin.apkanalyzer.ui.appdetail.page;

import androidx.databinding.ViewDataBinding;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;

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
public final class AppDetailPageFragment_MembersInjector<VM extends AppDetailPageFragmentViewModel, BINDING extends ViewDataBinding> implements MembersInjector<AppDetailPageFragment<VM, BINDING>> {
  private final Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  public AppDetailPageFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider) {
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
  }

  public static <VM extends AppDetailPageFragmentViewModel, BINDING extends ViewDataBinding> MembersInjector<AppDetailPageFragment<VM, BINDING>> create(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider) {
    return new AppDetailPageFragment_MembersInjector<VM, BINDING>(parentViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppDetailPageFragment<VM, BINDING> instance) {
    injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragment.parentViewModelFactory")
  public static <VM extends AppDetailPageFragmentViewModel, BINDING extends ViewDataBinding> void injectParentViewModelFactory(
      AppDetailPageFragment<VM, BINDING> instance,
      AppDetailFragmentViewModel.Factory parentViewModelFactory) {
    instance.parentViewModelFactory = parentViewModelFactory;
  }
}

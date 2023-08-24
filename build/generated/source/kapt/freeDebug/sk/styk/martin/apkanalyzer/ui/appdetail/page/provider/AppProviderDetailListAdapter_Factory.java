package sk.styk.martin.apkanalyzer.ui.appdetail.page.provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppProviderDetailListAdapter_Factory implements Factory<AppProviderDetailListAdapter> {
  @Override
  public AppProviderDetailListAdapter get() {
    return newInstance();
  }

  public static AppProviderDetailListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppProviderDetailListAdapter newInstance() {
    return new AppProviderDetailListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppProviderDetailListAdapter_Factory INSTANCE = new AppProviderDetailListAdapter_Factory();
  }
}

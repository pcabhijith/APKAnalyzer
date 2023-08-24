package sk.styk.martin.apkanalyzer.ui.appdetail.page.service;

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
public final class AppServiceDetailListAdapter_Factory implements Factory<AppServiceDetailListAdapter> {
  @Override
  public AppServiceDetailListAdapter get() {
    return newInstance();
  }

  public static AppServiceDetailListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppServiceDetailListAdapter newInstance() {
    return new AppServiceDetailListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppServiceDetailListAdapter_Factory INSTANCE = new AppServiceDetailListAdapter_Factory();
  }
}

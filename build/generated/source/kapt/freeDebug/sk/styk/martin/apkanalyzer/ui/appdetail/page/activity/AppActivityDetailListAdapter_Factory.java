package sk.styk.martin.apkanalyzer.ui.appdetail.page.activity;

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
public final class AppActivityDetailListAdapter_Factory implements Factory<AppActivityDetailListAdapter> {
  @Override
  public AppActivityDetailListAdapter get() {
    return newInstance();
  }

  public static AppActivityDetailListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppActivityDetailListAdapter newInstance() {
    return new AppActivityDetailListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppActivityDetailListAdapter_Factory INSTANCE = new AppActivityDetailListAdapter_Factory();
  }
}

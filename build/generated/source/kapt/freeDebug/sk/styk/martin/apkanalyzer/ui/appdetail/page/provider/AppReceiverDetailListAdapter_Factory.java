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
public final class AppReceiverDetailListAdapter_Factory implements Factory<AppReceiverDetailListAdapter> {
  @Override
  public AppReceiverDetailListAdapter get() {
    return newInstance();
  }

  public static AppReceiverDetailListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppReceiverDetailListAdapter newInstance() {
    return new AppReceiverDetailListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppReceiverDetailListAdapter_Factory INSTANCE = new AppReceiverDetailListAdapter_Factory();
  }
}

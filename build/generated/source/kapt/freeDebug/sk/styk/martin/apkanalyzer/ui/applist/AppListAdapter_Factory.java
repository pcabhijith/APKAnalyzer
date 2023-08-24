package sk.styk.martin.apkanalyzer.ui.applist;

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
public final class AppListAdapter_Factory implements Factory<AppListAdapter> {
  @Override
  public AppListAdapter get() {
    return newInstance();
  }

  public static AppListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppListAdapter newInstance() {
    return new AppListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppListAdapter_Factory INSTANCE = new AppListAdapter_Factory();
  }
}

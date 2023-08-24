package sk.styk.martin.apkanalyzer.ui.appdetail.page.feature;

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
public final class AppFeatureDetailListAdapter_Factory implements Factory<AppFeatureDetailListAdapter> {
  @Override
  public AppFeatureDetailListAdapter get() {
    return newInstance();
  }

  public static AppFeatureDetailListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppFeatureDetailListAdapter newInstance() {
    return new AppFeatureDetailListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppFeatureDetailListAdapter_Factory INSTANCE = new AppFeatureDetailListAdapter_Factory();
  }
}

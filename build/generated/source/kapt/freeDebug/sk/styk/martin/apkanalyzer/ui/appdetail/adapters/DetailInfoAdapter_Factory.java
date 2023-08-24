package sk.styk.martin.apkanalyzer.ui.appdetail.adapters;

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
public final class DetailInfoAdapter_Factory implements Factory<DetailInfoAdapter> {
  @Override
  public DetailInfoAdapter get() {
    return newInstance();
  }

  public static DetailInfoAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DetailInfoAdapter newInstance() {
    return new DetailInfoAdapter();
  }

  private static final class InstanceHolder {
    private static final DetailInfoAdapter_Factory INSTANCE = new DetailInfoAdapter_Factory();
  }
}

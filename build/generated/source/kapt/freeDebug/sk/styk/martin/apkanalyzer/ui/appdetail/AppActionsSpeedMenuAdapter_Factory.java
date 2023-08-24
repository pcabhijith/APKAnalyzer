package sk.styk.martin.apkanalyzer.ui.appdetail;

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
public final class AppActionsSpeedMenuAdapter_Factory implements Factory<AppActionsSpeedMenuAdapter> {
  @Override
  public AppActionsSpeedMenuAdapter get() {
    return newInstance();
  }

  public static AppActionsSpeedMenuAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppActionsSpeedMenuAdapter newInstance() {
    return new AppActionsSpeedMenuAdapter();
  }

  private static final class InstanceHolder {
    private static final AppActionsSpeedMenuAdapter_Factory INSTANCE = new AppActionsSpeedMenuAdapter_Factory();
  }
}

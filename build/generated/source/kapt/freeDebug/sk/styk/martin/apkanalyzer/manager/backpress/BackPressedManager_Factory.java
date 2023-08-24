package sk.styk.martin.apkanalyzer.manager.backpress;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
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
public final class BackPressedManager_Factory implements Factory<BackPressedManager> {
  @Override
  public BackPressedManager get() {
    return newInstance();
  }

  public static BackPressedManager_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BackPressedManager newInstance() {
    return new BackPressedManager();
  }

  private static final class InstanceHolder {
    private static final BackPressedManager_Factory INSTANCE = new BackPressedManager_Factory();
  }
}

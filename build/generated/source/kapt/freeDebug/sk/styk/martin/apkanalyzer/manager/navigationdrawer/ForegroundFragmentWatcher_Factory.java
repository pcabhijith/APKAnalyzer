package sk.styk.martin.apkanalyzer.manager.navigationdrawer;

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
public final class ForegroundFragmentWatcher_Factory implements Factory<ForegroundFragmentWatcher> {
  @Override
  public ForegroundFragmentWatcher get() {
    return newInstance();
  }

  public static ForegroundFragmentWatcher_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ForegroundFragmentWatcher newInstance() {
    return new ForegroundFragmentWatcher();
  }

  private static final class InstanceHolder {
    private static final ForegroundFragmentWatcher_Factory INSTANCE = new ForegroundFragmentWatcher_Factory();
  }
}

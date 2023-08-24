package sk.styk.martin.apkanalyzer.manager.clipboard;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class ClipBoardManager_Factory implements Factory<ClipBoardManager> {
  private final Provider<Context> contextProvider;

  public ClipBoardManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ClipBoardManager get() {
    return newInstance(contextProvider.get());
  }

  public static ClipBoardManager_Factory create(Provider<Context> contextProvider) {
    return new ClipBoardManager_Factory(contextProvider);
  }

  public static ClipBoardManager newInstance(Context context) {
    return new ClipBoardManager(context);
  }
}

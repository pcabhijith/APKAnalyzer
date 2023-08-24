package sk.styk.martin.apkanalyzer.manager.media;

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
public final class MediaManager_Factory implements Factory<MediaManager> {
  private final Provider<Context> contextProvider;

  public MediaManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MediaManager get() {
    return newInstance(contextProvider.get());
  }

  public static MediaManager_Factory create(Provider<Context> contextProvider) {
    return new MediaManager_Factory(contextProvider);
  }

  public static MediaManager newInstance(Context context) {
    return new MediaManager(context);
  }
}

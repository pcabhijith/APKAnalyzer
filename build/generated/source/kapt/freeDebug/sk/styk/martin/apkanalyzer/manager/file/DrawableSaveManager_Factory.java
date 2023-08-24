package sk.styk.martin.apkanalyzer.manager.file;

import android.content.ContentResolver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.manager.media.MediaManager;

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
public final class DrawableSaveManager_Factory implements Factory<DrawableSaveManager> {
  private final Provider<ContentResolver> contentResolverProvider;

  private final Provider<MediaManager> mediaManagerProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public DrawableSaveManager_Factory(Provider<ContentResolver> contentResolverProvider,
      Provider<MediaManager> mediaManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.contentResolverProvider = contentResolverProvider;
    this.mediaManagerProvider = mediaManagerProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public DrawableSaveManager get() {
    return newInstance(contentResolverProvider.get(), mediaManagerProvider.get(), dispatcherProvider.get());
  }

  public static DrawableSaveManager_Factory create(
      Provider<ContentResolver> contentResolverProvider,
      Provider<MediaManager> mediaManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new DrawableSaveManager_Factory(contentResolverProvider, mediaManagerProvider, dispatcherProvider);
  }

  public static DrawableSaveManager newInstance(ContentResolver contentResolver,
      MediaManager mediaManager, DispatcherProvider dispatcherProvider) {
    return new DrawableSaveManager(contentResolver, mediaManager, dispatcherProvider);
  }
}

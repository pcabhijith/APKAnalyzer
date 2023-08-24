package sk.styk.martin.apkanalyzer.manager.file;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;

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
public final class FileManager_Factory implements Factory<FileManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ContentResolver> contentResolverProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public FileManager_Factory(Provider<Context> contextProvider,
      Provider<ContentResolver> contentResolverProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.contextProvider = contextProvider;
    this.contentResolverProvider = contentResolverProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public FileManager get() {
    return newInstance(contextProvider.get(), contentResolverProvider.get(), dispatcherProvider.get());
  }

  public static FileManager_Factory create(Provider<Context> contextProvider,
      Provider<ContentResolver> contentResolverProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new FileManager_Factory(contextProvider, contentResolverProvider, dispatcherProvider);
  }

  public static FileManager newInstance(Context context, ContentResolver contentResolver,
      DispatcherProvider dispatcherProvider) {
    return new FileManager(context, contentResolver, dispatcherProvider);
  }
}

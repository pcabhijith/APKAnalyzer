package sk.styk.martin.apkanalyzer.util;

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
public final class Formatter_Factory implements Factory<Formatter> {
  private final Provider<Context> contextProvider;

  public Formatter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Formatter get() {
    return newInstance(contextProvider.get());
  }

  public static Formatter_Factory create(Provider<Context> contextProvider) {
    return new Formatter_Factory(contextProvider);
  }

  public static Formatter newInstance(Context context) {
    return new Formatter(context);
  }
}

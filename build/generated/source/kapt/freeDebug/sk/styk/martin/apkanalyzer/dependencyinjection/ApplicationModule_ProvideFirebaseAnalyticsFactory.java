package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ApplicationModule_ProvideFirebaseAnalyticsFactory implements Factory<FirebaseAnalytics> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideFirebaseAnalyticsFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public FirebaseAnalytics get() {
    return provideFirebaseAnalytics(module, contextProvider.get());
  }

  public static ApplicationModule_ProvideFirebaseAnalyticsFactory create(ApplicationModule module,
      Provider<Context> contextProvider) {
    return new ApplicationModule_ProvideFirebaseAnalyticsFactory(module, contextProvider);
  }

  public static FirebaseAnalytics provideFirebaseAnalytics(ApplicationModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideFirebaseAnalytics(context));
  }
}

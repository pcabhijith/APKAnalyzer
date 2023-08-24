package sk.styk.martin.apkanalyzer.manager.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AnalyticsTracker_Factory implements Factory<AnalyticsTracker> {
  private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;

  public AnalyticsTracker_Factory(Provider<FirebaseAnalytics> firebaseAnalyticsProvider) {
    this.firebaseAnalyticsProvider = firebaseAnalyticsProvider;
  }

  @Override
  public AnalyticsTracker get() {
    return newInstance(firebaseAnalyticsProvider.get());
  }

  public static AnalyticsTracker_Factory create(
      Provider<FirebaseAnalytics> firebaseAnalyticsProvider) {
    return new AnalyticsTracker_Factory(firebaseAnalyticsProvider);
  }

  public static AnalyticsTracker newInstance(FirebaseAnalytics firebaseAnalytics) {
    return new AnalyticsTracker(firebaseAnalytics);
  }
}

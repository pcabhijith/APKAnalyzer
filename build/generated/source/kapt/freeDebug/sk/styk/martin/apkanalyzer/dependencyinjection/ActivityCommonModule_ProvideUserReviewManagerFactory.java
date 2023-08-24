package sk.styk.martin.apkanalyzer.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.play.core.review.ReviewManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager;

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
public final class ActivityCommonModule_ProvideUserReviewManagerFactory implements Factory<UserReviewManager> {
  private final ActivityCommonModule module;

  private final Provider<AppCompatActivity> activityProvider;

  private final Provider<ReviewManager> reviewManagerProvider;

  public ActivityCommonModule_ProvideUserReviewManagerFactory(ActivityCommonModule module,
      Provider<AppCompatActivity> activityProvider, Provider<ReviewManager> reviewManagerProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
    this.reviewManagerProvider = reviewManagerProvider;
  }

  @Override
  public UserReviewManager get() {
    return provideUserReviewManager(module, activityProvider.get(), reviewManagerProvider.get());
  }

  public static ActivityCommonModule_ProvideUserReviewManagerFactory create(
      ActivityCommonModule module, Provider<AppCompatActivity> activityProvider,
      Provider<ReviewManager> reviewManagerProvider) {
    return new ActivityCommonModule_ProvideUserReviewManagerFactory(module, activityProvider, reviewManagerProvider);
  }

  public static UserReviewManager provideUserReviewManager(ActivityCommonModule instance,
      AppCompatActivity activity, ReviewManager reviewManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserReviewManager(activity, reviewManager));
  }
}

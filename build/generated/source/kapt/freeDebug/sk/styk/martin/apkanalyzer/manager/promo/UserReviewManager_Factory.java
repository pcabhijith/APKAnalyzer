package sk.styk.martin.apkanalyzer.manager.promo;

import com.google.android.play.core.review.ReviewManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class UserReviewManager_Factory implements Factory<UserReviewManager> {
  private final Provider<ReviewManager> reviewManagerProvider;

  public UserReviewManager_Factory(Provider<ReviewManager> reviewManagerProvider) {
    this.reviewManagerProvider = reviewManagerProvider;
  }

  @Override
  public UserReviewManager get() {
    return newInstance(reviewManagerProvider.get());
  }

  public static UserReviewManager_Factory create(Provider<ReviewManager> reviewManagerProvider) {
    return new UserReviewManager_Factory(reviewManagerProvider);
  }

  public static UserReviewManager newInstance(ReviewManager reviewManager) {
    return new UserReviewManager(reviewManager);
  }
}

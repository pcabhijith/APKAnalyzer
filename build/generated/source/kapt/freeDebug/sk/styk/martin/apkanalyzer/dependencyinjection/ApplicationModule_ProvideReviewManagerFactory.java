package sk.styk.martin.apkanalyzer.dependencyinjection;

import android.content.Context;
import com.google.android.play.core.review.ReviewManager;
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
public final class ApplicationModule_ProvideReviewManagerFactory implements Factory<ReviewManager> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideReviewManagerFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ReviewManager get() {
    return provideReviewManager(module, contextProvider.get());
  }

  public static ApplicationModule_ProvideReviewManagerFactory create(ApplicationModule module,
      Provider<Context> contextProvider) {
    return new ApplicationModule_ProvideReviewManagerFactory(module, contextProvider);
  }

  public static ReviewManager provideReviewManager(ApplicationModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideReviewManager(context));
  }
}

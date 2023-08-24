package sk.styk.martin.apkanalyzer.manager.promo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0007J\u0011\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;", "Landroidx/lifecycle/ViewModel;", "reviewManager", "Lcom/google/android/play/core/review/ReviewManager;", "(Lcom/google/android/play/core/review/ReviewManager;)V", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bind", "", "openGooglePlayReview", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_freeDebug"})
@dagger.hilt.android.scopes.ActivityScoped
public final class UserReviewManager extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.google.android.play.core.review.ReviewManager reviewManager = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.ref.WeakReference<android.app.Activity> activity;
    
    @javax.inject.Inject
    public UserReviewManager(@org.jetbrains.annotations.NotNull
    com.google.android.play.core.review.ReviewManager reviewManager) {
        super();
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object openGooglePlayReview(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}
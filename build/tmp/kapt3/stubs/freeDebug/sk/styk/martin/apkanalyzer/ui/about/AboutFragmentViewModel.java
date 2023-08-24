package sk.styk.martin.apkanalyzer.ui.about;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/about/AboutFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "navigationDrawerModel", "Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/NavigationDrawerModel;", "userReviewManager", "Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;", "(Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/NavigationDrawerModel;Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;)V", "openGooglePlay", "Landroidx/lifecycle/LiveData;", "", "getOpenGooglePlay", "()Landroidx/lifecycle/LiveData;", "openGooglePlayEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "onNavigationClick", "Lkotlinx/coroutines/Job;", "onRateAppClick", "Factory", "app_freeDebug"})
public final class AboutFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel navigationDrawerModel = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager userReviewManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<kotlin.Unit> openGooglePlayEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<kotlin.Unit> openGooglePlay = null;
    
    @dagger.assisted.AssistedInject
    public AboutFragmentViewModel(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel navigationDrawerModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager userReviewManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Unit> getOpenGooglePlay() {
        return null;
    }
    
    public final void onRateAppClick() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onNavigationClick() {
        return null;
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/about/AboutFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/about/AboutFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel create();
    }
}
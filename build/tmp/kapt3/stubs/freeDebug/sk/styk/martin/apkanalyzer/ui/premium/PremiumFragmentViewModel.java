package sk.styk.martin.apkanalyzer.ui.premium;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/premium/PremiumFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "navigationDrawerModel", "Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/NavigationDrawerModel;", "resourcesManager", "Lsk/styk/martin/apkanalyzer/core/common/resources/ResourcesManager;", "(Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/NavigationDrawerModel;Lsk/styk/martin/apkanalyzer/core/common/resources/ResourcesManager;)V", "openGooglePlay", "Landroidx/lifecycle/LiveData;", "", "getOpenGooglePlay", "()Landroidx/lifecycle/LiveData;", "openGooglePlayEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "onNavigationClick", "Lkotlinx/coroutines/Job;", "onUpgradeToPremiumClick", "", "app_freeDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PremiumFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel navigationDrawerModel = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager resourcesManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<java.lang.String> openGooglePlayEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> openGooglePlay = null;
    
    @javax.inject.Inject
    public PremiumFragmentViewModel(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel navigationDrawerModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager resourcesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getOpenGooglePlay() {
        return null;
    }
    
    public final void onUpgradeToPremiumClick() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onNavigationClick() {
        return null;
    }
}
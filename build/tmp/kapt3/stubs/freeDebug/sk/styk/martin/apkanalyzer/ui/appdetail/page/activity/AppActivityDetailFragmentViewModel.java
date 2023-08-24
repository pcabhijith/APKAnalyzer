package sk.styk.martin.apkanalyzer.ui.appdetail.page.activity;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001 B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\rH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailFragmentViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "activityAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;)V", "getActivityAdapter", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;", "value", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ExpandedActivityData;", "activityData", "setActivityData", "(Ljava/util/List;)V", "runActivity", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ActivityData;", "getRunActivity", "()Landroidx/lifecycle/LiveData;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDataReceived", "", "appDetailData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "updateLocalData", "editedExpandedActivityData", "Factory", "app_freeDebug"})
public final class AppActivityDetailFragmentViewModel extends sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragmentViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter activityAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData> runActivity = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> activityData;
    
    @dagger.assisted.AssistedInject
    public AppActivityDetailFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter activityAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter getActivityAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData> getRunActivity() {
        return null;
    }
    
    private final void setActivityData(java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> value) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override
    public boolean onDataReceived(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData appDetailData) {
        return false;
    }
    
    private final void updateLocalData(sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData editedExpandedActivityData) {
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel);
    }
}
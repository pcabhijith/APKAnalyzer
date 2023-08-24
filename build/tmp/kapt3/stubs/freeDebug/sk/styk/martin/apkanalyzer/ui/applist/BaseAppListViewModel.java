package sk.styk.martin.apkanalyzer.ui.applist;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f@TX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00180\u00180\u001cX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;", "Landroidx/lifecycle/ViewModel;", "adapter", "Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;", "(Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;)V", "getAdapter", "()Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;", "appClicked", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter$AppListClickData;", "getAppClicked", "()Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "appClicked$delegate", "Lkotlin/Lazy;", "value", "", "Lsk/styk/martin/apkanalyzer/core/applist/model/LazyAppListData;", "lazyAppListData", "getLazyAppListData", "()Ljava/util/List;", "setLazyAppListData", "(Ljava/util/List;)V", "viewState", "Landroidx/lifecycle/LiveData;", "", "getViewState", "()Landroidx/lifecycle/LiveData;", "viewStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getViewStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "app_freeDebug"})
public abstract class BaseAppListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter adapter = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.core.applist.model.LazyAppListData> lazyAppListData;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy appClicked$delegate = null;
    
    public BaseAppListViewModel(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter adapter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected java.util.List<sk.styk.martin.apkanalyzer.core.applist.model.LazyAppListData> getLazyAppListData() {
        return null;
    }
    
    protected void setLazyAppListData(@org.jetbrains.annotations.NotNull
    java.util.List<sk.styk.martin.apkanalyzer.core.applist.model.LazyAppListData> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.lifecycle.MutableLiveData<java.lang.Integer> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter.AppListClickData> getAppClicked() {
        return null;
    }
}
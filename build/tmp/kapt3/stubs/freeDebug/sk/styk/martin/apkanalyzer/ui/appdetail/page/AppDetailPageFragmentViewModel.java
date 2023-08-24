package sk.styk.martin.apkanalyzer.ui.appdetail.page;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&R\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00150\u00150\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "adapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;)V", "getAdapter", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "openDescription", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/util/components/DialogComponent;", "getOpenDescription", "()Landroidx/lifecycle/LiveData;", "showSnackbar", "Lsk/styk/martin/apkanalyzer/util/components/SnackBarComponent;", "getShowSnackbar", "viewState", "", "getViewState", "viewStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDataReceived", "", "appDetailData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "app_freeDebug"})
public abstract class AppDetailPageFragmentViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<?> adapter = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> openDescription = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.SnackBarComponent> showSnackbar = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> viewState = null;
    
    public AppDetailPageFragmentViewModel(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<?> adapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<?> getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> getOpenDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.SnackBarComponent> getShowSnackbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getViewState() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public abstract boolean onDataReceived(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData appDetailData);
}
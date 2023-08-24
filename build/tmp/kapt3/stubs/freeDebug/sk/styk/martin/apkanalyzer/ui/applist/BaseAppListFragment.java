package sk.styk.martin.apkanalyzer.ui.applist;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListFragment;", "VM", "Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "getViewModel", "()Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;", "setViewModel", "(Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;)V", "Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "startAppDetail", "appListClickData", "Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter$AppListClickData;", "app_freeDebug"})
public abstract class BaseAppListFragment<VM extends sk.styk.martin.apkanalyzer.ui.applist.BaseAppListViewModel> extends androidx.fragment.app.Fragment {
    protected VM viewModel;
    
    public BaseAppListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull
    VM p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startAppDetail(sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter.AppListClickData appListClickData) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected androidx.fragment.app.FragmentManager fragmentManager() {
        return null;
    }
}
package sk.styk.martin.apkanalyzer.ui.permission.list;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\r0\r0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "permissionListAdapter", "Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;", "navigationDrawerModel", "Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/NavigationDrawerModel;", "localPermissionManager", "Lsk/styk/martin/apkanalyzer/core/apppermissions/LocalPermissionManager;", "(Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/NavigationDrawerModel;Lsk/styk/martin/apkanalyzer/core/apppermissions/LocalPermissionManager;)V", "isLoading", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isLoadingLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "loadingProgress", "", "getLoadingProgress", "loadingProgressLiveData", "loadingProgressMax", "getLoadingProgressMax", "loadingProgressMaxLiveData", "openPermission", "Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$PermissionClickData;", "getOpenPermission", "getPermissionListAdapter", "()Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;", "onNavigationClick", "Lkotlinx/coroutines/Job;", "app_freeDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PermissionListFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter permissionListAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel navigationDrawerModel = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.apppermissions.LocalPermissionManager localPermissionManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionClickData> openPermission = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> loadingProgressLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> loadingProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> loadingProgressMaxLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> loadingProgressMax = null;
    
    @javax.inject.Inject
    public PermissionListFragmentViewModel(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter permissionListAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel navigationDrawerModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.apppermissions.LocalPermissionManager localPermissionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter getPermissionListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionClickData> getOpenPermission() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getLoadingProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getLoadingProgressMax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onNavigationClick() {
        return null;
    }
}
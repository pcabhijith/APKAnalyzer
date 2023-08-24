package sk.styk.martin.apkanalyzer.ui.permission.detail.apps;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel;", "Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;", "permissionDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "showGranted", "", "installedAppsRepository", "Lsk/styk/martin/apkanalyzer/core/applist/InstalledAppsRepository;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "adapter", "Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;ZLsk/styk/martin/apkanalyzer/core/applist/InstalledAppsRepository;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;)V", "Factory", "app_freeDebug"})
public final class PermissionsAppListViewModel extends sk.styk.martin.apkanalyzer.ui.applist.BaseAppListViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel permissionDetailFragmentViewModel = null;
    private final boolean showGranted = false;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository installedAppsRepository = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    
    @dagger.assisted.AssistedInject
    public PermissionsAppListViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel permissionDetailFragmentViewModel, @dagger.assisted.Assisted
    boolean showGranted, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository installedAppsRepository, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter adapter) {
        super(null);
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel;", "permissionDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "showGranted", "", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel permissionDetailFragmentViewModel, boolean showGranted);
    }
}
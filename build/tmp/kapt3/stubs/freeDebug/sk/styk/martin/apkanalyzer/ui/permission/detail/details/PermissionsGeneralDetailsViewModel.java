package sk.styk.martin.apkanalyzer.ui.permission.detail.details;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B!\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "permissionDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "detailInfoAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;)V", "getClipBoardManager", "()Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "getDetailInfoAdapter", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;", "openDescription", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/util/components/DialogComponent;", "getOpenDescription", "()Landroidx/lifecycle/LiveData;", "showSnackbar", "Lsk/styk/martin/apkanalyzer/util/components/SnackBarComponent;", "getShowSnackbar", "permissionLevelText", "", "level", "Factory", "app_freeDebug"})
public final class PermissionsGeneralDetailsViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel permissionDetailFragmentViewModel = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter detailInfoAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> openDescription = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.SnackBarComponent> showSnackbar = null;
    
    @dagger.assisted.AssistedInject
    public PermissionsGeneralDetailsViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel permissionDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter detailInfoAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter getDetailInfoAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager getClipBoardManager() {
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
    
    private final int permissionLevelText(int level) {
        return 0;
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel;", "permissionDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel permissionDetailFragmentViewModel);
    }
}
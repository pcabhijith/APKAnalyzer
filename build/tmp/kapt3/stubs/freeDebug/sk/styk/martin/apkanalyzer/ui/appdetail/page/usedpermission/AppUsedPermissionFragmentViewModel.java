package sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppUsedPermissionFragmentViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "permissionAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppPermissionListAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "packageManager", "Landroid/content/pm/PackageManager;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppPermissionListAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;Landroid/content/pm/PackageManager;)V", "showDialog", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/util/components/DialogComponent;", "getShowDialog", "()Landroidx/lifecycle/LiveData;", "showDialogEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDataReceived", "", "appDetailData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "Factory", "app_freeDebug"})
public final class AppUsedPermissionFragmentViewModel extends sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragmentViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter permissionAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.pm.PackageManager packageManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.components.DialogComponent> showDialogEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> showDialog = null;
    
    @dagger.assisted.AssistedInject
    public AppUsedPermissionFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter permissionAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager, @org.jetbrains.annotations.NotNull
    android.content.pm.PackageManager packageManager) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> getShowDialog() {
        return null;
    }
    
    @java.lang.Override
    public boolean onDataReceived(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData appDetailData) {
        return false;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppUsedPermissionFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppUsedPermissionFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel);
    }
}
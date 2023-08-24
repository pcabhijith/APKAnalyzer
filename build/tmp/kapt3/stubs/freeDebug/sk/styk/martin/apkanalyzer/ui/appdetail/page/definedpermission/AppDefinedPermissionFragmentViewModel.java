package sk.styk.martin.apkanalyzer.ui.appdetail.page.definedpermission;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/definedpermission/AppDefinedPermissionFragmentViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "permissionAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppPermissionListAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "packageManager", "Landroid/content/pm/PackageManager;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppPermissionListAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;Landroid/content/pm/PackageManager;)V", "getPermissionAdapter", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/page/usedpermission/AppPermissionListAdapter;", "showDialog", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "Lsk/styk/martin/apkanalyzer/util/components/DialogComponent;", "getShowDialog", "()Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "showDialogEvent", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDataReceived", "", "appDetailData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "Factory", "app_freeDebug"})
public final class AppDefinedPermissionFragmentViewModel extends sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragmentViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter permissionAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.pm.PackageManager packageManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.components.DialogComponent> showDialogEvent = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.components.DialogComponent> showDialog = null;
    
    @dagger.assisted.AssistedInject
    public AppDefinedPermissionFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter permissionAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager, @org.jetbrains.annotations.NotNull
    android.content.pm.PackageManager packageManager) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter getPermissionAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.components.DialogComponent> getShowDialog() {
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
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/definedpermission/AppDefinedPermissionFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/definedpermission/AppDefinedPermissionFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.appdetail.page.definedpermission.AppDefinedPermissionFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel);
    }
}
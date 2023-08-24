package sk.styk.martin.apkanalyzer.ui.permission.detail.pager;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0019\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\nJ\b\u0010\u001e\u001a\u00020\nH\u0002R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "localPermissionData", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "packageManager", "Landroid/content/pm/PackageManager;", "(Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;Landroid/content/pm/PackageManager;)V", "close", "Landroidx/lifecycle/LiveData;", "", "getClose", "()Landroidx/lifecycle/LiveData;", "closeEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "getLocalPermissionData", "()Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "showDialog", "Lsk/styk/martin/apkanalyzer/util/components/DialogComponent;", "getShowDialog", "showDialogEvent", "title", "", "getTitle", "()Ljava/lang/String;", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "onNavigationClick", "showDescriptionDialog", "Factory", "app_freeDebug"})
public final class PermissionDetailFragmentViewModel extends androidx.lifecycle.ViewModel implements androidx.appcompat.widget.Toolbar.OnMenuItemClickListener {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData localPermissionData = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.pm.PackageManager packageManager = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.components.DialogComponent> showDialogEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> showDialog = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<kotlin.Unit> closeEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<kotlin.Unit> close = null;
    
    @dagger.assisted.AssistedInject
    public PermissionDetailFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData localPermissionData, @org.jetbrains.annotations.NotNull
    android.content.pm.PackageManager packageManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData getLocalPermissionData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.DialogComponent> getShowDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Unit> getClose() {
        return null;
    }
    
    public final void onNavigationClick() {
    }
    
    @java.lang.Override
    public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showDescriptionDialog() {
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "localPermissionData", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData localPermissionData);
    }
}
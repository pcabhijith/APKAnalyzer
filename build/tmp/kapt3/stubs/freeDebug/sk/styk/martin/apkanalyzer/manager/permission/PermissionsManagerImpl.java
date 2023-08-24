package sk.styk.martin.apkanalyzer.manager.permission;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J#\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J#\u0010\u001e\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\u001c\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/permission/PermissionsManagerImpl;", "Landroidx/lifecycle/AndroidViewModel;", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "permissionsCallback", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionsCallback;", "bind", "", "Landroidx/appcompat/app/AppCompatActivity;", "hasPermissionGranted", "", "permission", "", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "([Ljava/lang/String;[I)V", "requestPermission", "callback", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionCallback;", "requestPermissions", "([Ljava/lang/String;Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionsCallback;)V", "shouldShowRationaleForPermission", "app_freeDebug"})
public final class PermissionsManagerImpl extends androidx.lifecycle.AndroidViewModel implements sk.styk.martin.apkanalyzer.manager.permission.PermissionManager {
    @org.jetbrains.annotations.Nullable
    private java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile sk.styk.martin.apkanalyzer.manager.permission.PermissionManager.PermissionsCallback permissionsCallback;
    
    @javax.inject.Inject
    public PermissionsManagerImpl(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    private final android.app.Activity getActivity() {
        return null;
    }
    
    @java.lang.Override
    public boolean hasPermissionGranted(@org.jetbrains.annotations.NotNull
    java.lang.String permission) {
        return false;
    }
    
    @java.lang.Override
    public boolean shouldShowRationaleForPermission(@org.jetbrains.annotations.NotNull
    java.lang.String permission) {
        return false;
    }
    
    @java.lang.Override
    public void requestPermission(@org.jetbrains.annotations.NotNull
    java.lang.String permission, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.permission.PermissionManager.PermissionCallback callback) {
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    public synchronized void requestPermissions(@org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.permission.PermissionManager.PermissionsCallback callback) {
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    public synchronized void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
}
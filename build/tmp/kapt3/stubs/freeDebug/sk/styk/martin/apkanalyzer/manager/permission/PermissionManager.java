package sk.styk.martin.apkanalyzer.manager.permission;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0014\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J#\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J#\u0010\u0010\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000e\u001a\u00020\u0011H&\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0016"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;", "", "hasPermissionGranted", "", "permission", "", "onRequestPermissionsResult", "", "permissions", "", "grantResults", "", "([Ljava/lang/String;[I)V", "requestPermission", "callback", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionCallback;", "requestPermissions", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionsCallback;", "([Ljava/lang/String;Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionsCallback;)V", "shouldShowRationaleForPermission", "PermissionCallback", "PermissionsCallback", "app_freeDebug"})
public abstract interface PermissionManager {
    
    public abstract boolean hasPermissionGranted(@org.jetbrains.annotations.NotNull
    java.lang.String permission);
    
    public abstract boolean shouldShowRationaleForPermission(@org.jetbrains.annotations.NotNull
    java.lang.String permission);
    
    public abstract void requestPermission(@org.jetbrains.annotations.NotNull
    java.lang.String permission, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.permission.PermissionManager.PermissionCallback callback);
    
    public abstract void requestPermissions(@org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.permission.PermissionManager.PermissionsCallback callback);
    
    public abstract void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionCallback;", "", "onPermissionDenied", "", "permission", "", "onPermissionGranted", "app_freeDebug"})
    public static abstract interface PermissionCallback {
        
        public abstract void onPermissionGranted(@org.jetbrains.annotations.NotNull
        java.lang.String permission);
        
        public abstract void onPermissionDenied(@org.jetbrains.annotations.NotNull
        java.lang.String permission);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager$PermissionsCallback;", "", "onPermissionsDenied", "", "deniedPermissions", "", "", "onPermissionsGranted", "grantedPermissions", "app_freeDebug"})
    public static abstract interface PermissionsCallback {
        
        public abstract void onPermissionsGranted(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> grantedPermissions);
        
        public abstract void onPermissionsDenied(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> deniedPermissions);
    }
}
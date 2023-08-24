package sk.styk.martin.apkanalyzer.manager.permission;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"PERMISSIONS_REQUEST_CODE", "", "hasScopedStorage", "", "needsNotificationPermission", "app_freeDebug"})
public final class PermissionManagerImplKt {
    private static final int PERMISSIONS_REQUEST_CODE = 777;
    
    public static final boolean hasScopedStorage() {
        return false;
    }
    
    public static final boolean needsNotificationPermission() {
        return false;
    }
}
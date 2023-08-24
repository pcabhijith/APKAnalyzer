package sk.styk.martin.apkanalyzer.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0017J+\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\u0006\u0010)\u001a\u00020*H\u0016\u00a2\u0006\u0002\u0010+R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006,"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/ApkAnalyzerBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityColorThemeManager", "Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;", "getActivityColorThemeManager", "()Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;", "setActivityColorThemeManager", "(Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;)V", "backPressedManager", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "getBackPressedManager", "()Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "setBackPressedManager", "(Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;)V", "foregroundFragmentWatcher", "Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;", "getForegroundFragmentWatcher", "()Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;", "setForegroundFragmentWatcher", "(Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;)V", "fragmentScreenTracker", "Lsk/styk/martin/apkanalyzer/manager/analytics/FragmentScreenTracker;", "getFragmentScreenTracker", "()Lsk/styk/martin/apkanalyzer/manager/analytics/FragmentScreenTracker;", "setFragmentScreenTracker", "(Lsk/styk/martin/apkanalyzer/manager/analytics/FragmentScreenTracker;)V", "permissionManager", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;", "getPermissionManager", "()Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;", "setPermissionManager", "(Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;)V", "onBackPressed", "", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_freeDebug"})
public abstract class ApkAnalyzerBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.permission.PermissionManager permissionManager;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager activityColorThemeManager;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager backPressedManager;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker fragmentScreenTracker;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher foregroundFragmentWatcher;
    
    public ApkAnalyzerBaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.permission.PermissionManager getPermissionManager() {
        return null;
    }
    
    public final void setPermissionManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.permission.PermissionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager getActivityColorThemeManager() {
        return null;
    }
    
    public final void setActivityColorThemeManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager getBackPressedManager() {
        return null;
    }
    
    public final void setBackPressedManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker getFragmentScreenTracker() {
        return null;
    }
    
    public final void setFragmentScreenTracker(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher getForegroundFragmentWatcher() {
        return null;
    }
    
    public final void setForegroundFragmentWatcher(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher p0) {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onBackPressed() {
    }
}
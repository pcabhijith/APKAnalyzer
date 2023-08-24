package sk.styk.martin.apkanalyzer.ui.settings;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/settings/MainSettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "colorThemeManager", "Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "getColorThemeManager", "()Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "setColorThemeManager", "(Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;)V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onStart", "onStop", "app_freeDebug"})
public final class MainSettingsFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager colorThemeManager;
    
    public MainSettingsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager getColorThemeManager() {
        return null;
    }
    
    public final void setColorThemeManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager p0) {
    }
    
    @java.lang.Override
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable
    java.lang.String rootKey) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
}
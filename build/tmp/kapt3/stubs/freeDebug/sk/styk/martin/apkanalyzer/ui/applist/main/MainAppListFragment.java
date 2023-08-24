package sk.styk.martin.apkanalyzer.ui.applist.main;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0013H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/main/MainAppListFragment;", "Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListFragment;", "Lsk/styk/martin/apkanalyzer/ui/applist/main/MainAppListViewModel;", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedListener;", "()V", "backPressedManager", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "getBackPressedManager", "()Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "setBackPressedManager", "(Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;)V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/FragmentMainAppListBinding;", "filePickerResultLuncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "handleFilteredSources", "", "filtered", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppSource;", "handleIndefiniteSnackbar", "component", "Lsk/styk/martin/apkanalyzer/util/components/SnackBarComponent;", "handleQueryFilter", "filterQuery", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "startAppDetail", "uri", "Landroid/net/Uri;", "startFilePicker", "Companion", "app_freeDebug"})
public final class MainAppListFragment extends sk.styk.martin.apkanalyzer.ui.applist.BaseAppListFragment<sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel> implements sk.styk.martin.apkanalyzer.manager.backpress.BackPressedListener {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager backPressedManager;
    private sk.styk.martin.apkanalyzer.databinding.FragmentMainAppListBinding binding;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> filePickerResultLuncher;
    @org.jetbrains.annotations.Nullable
    private com.google.android.material.snackbar.Snackbar snackbar;
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListFragment.Companion Companion = null;
    
    public MainAppListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager getBackPressedManager() {
        return null;
    }
    
    public final void setBackPressedManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void handleFilteredSources(sk.styk.martin.apkanalyzer.core.appanalysis.model.AppSource filtered) {
    }
    
    private final void handleQueryFilter(java.lang.String filterQuery) {
    }
    
    private final void handleIndefiniteSnackbar(sk.styk.martin.apkanalyzer.util.components.SnackBarComponent component) {
    }
    
    private final void startFilePicker() {
    }
    
    private final void startAppDetail(android.net.Uri uri) {
    }
    
    @java.lang.Override
    public boolean onBackPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/main/MainAppListFragment$Companion;", "", "()V", "newInstance", "Lsk/styk/martin/apkanalyzer/ui/applist/main/MainAppListFragment;", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListFragment newInstance() {
            return null;
        }
    }
}
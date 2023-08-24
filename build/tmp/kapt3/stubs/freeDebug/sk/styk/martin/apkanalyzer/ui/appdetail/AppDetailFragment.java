package sk.styk.martin.apkanalyzer.ui.appdetail;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\u001a\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00061"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedListener;", "()V", "backPressedManager", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "getBackPressedManager", "()Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "setBackPressedManager", "(Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;)V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/FragmentAppDetailBinding;", "exportPathPickerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "viewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;", "getViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;", "setViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;)V", "onBackPressed", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onViewCreated", "view", "openDirectoryPicker", "outputFilePickerRequest", "Lsk/styk/martin/apkanalyzer/util/OutputFilePickerRequest;", "openImage", "path", "Landroid/net/Uri;", "openManifestFragment", "manifestRequest", "Lsk/styk/martin/apkanalyzer/ui/manifest/ManifestRequest;", "Companion", "app_freeDebug"})
public final class AppDetailFragment extends androidx.fragment.app.Fragment implements sk.styk.martin.apkanalyzer.manager.backpress.BackPressedListener {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory viewModelFactory;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager backPressedManager;
    private sk.styk.martin.apkanalyzer.databinding.FragmentAppDetailBinding binding;
    private sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel viewModel;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> exportPathPickerResultLauncher;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_DETAIL_REQUEST = "appDetailRequest";
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment.Companion Companion = null;
    
    public AppDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory p0) {
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
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    private final void openImage(android.net.Uri path) {
    }
    
    private final void openManifestFragment(sk.styk.martin.apkanalyzer.ui.manifest.ManifestRequest manifestRequest) {
    }
    
    private final void openDirectoryPicker(sk.styk.martin.apkanalyzer.util.OutputFilePickerRequest outputFilePickerRequest) {
    }
    
    @java.lang.Override
    public boolean onBackPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragment$Companion;", "", "()V", "APP_DETAIL_REQUEST", "", "newInstance", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragment;", "appDetailRequest", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailRequest;", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment newInstance(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailRequest appDetailRequest) {
            return null;
        }
    }
}
package sk.styk.martin.apkanalyzer.ui.manifest;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/FragmentManifestBinding;", "exportPathPickerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragmentViewModel;", "viewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragmentViewModel$Factory;", "getViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragmentViewModel$Factory;", "setViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragmentViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openExportFilePicker", "outputFilePickerRequest", "Lsk/styk/martin/apkanalyzer/util/OutputFilePickerRequest;", "showManifest", "manifest", "", "showManifestFile", "fileUri", "Landroid/net/Uri;", "Companion", "app_freeDebug"})
public final class AndroidManifestFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel.Factory viewModelFactory;
    private sk.styk.martin.apkanalyzer.databinding.FragmentManifestBinding binding;
    private sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel viewModel;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> exportPathPickerResultLauncher;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MANIFEST_REQUEST = "manifest_request";
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragment.Companion Companion = null;
    
    public AndroidManifestFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel.Factory p0) {
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
    
    private final void showManifestFile(android.net.Uri fileUri) {
    }
    
    private final void openExportFilePicker(sk.styk.martin.apkanalyzer.util.OutputFilePickerRequest outputFilePickerRequest) {
    }
    
    private final void showManifest(java.lang.String manifest) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragment$Companion;", "", "()V", "MANIFEST_REQUEST", "", "create", "Lsk/styk/martin/apkanalyzer/ui/manifest/AndroidManifestFragment;", "manifestRequest", "Lsk/styk/martin/apkanalyzer/ui/manifest/ManifestRequest;", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragment create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.manifest.ManifestRequest manifestRequest) {
            return null;
        }
    }
}
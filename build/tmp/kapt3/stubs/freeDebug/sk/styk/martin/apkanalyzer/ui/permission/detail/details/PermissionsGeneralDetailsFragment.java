package sk.styk.martin.apkanalyzer.ui.permission.detail.details;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/FragmentPermissionDetailGeneralBinding;", "parentViewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "getParentViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "setParentViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;)V", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel;", "viewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel$Factory;", "getViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel$Factory;", "setViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/details/PermissionsGeneralDetailsViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_freeDebug"})
public final class PermissionsGeneralDetailsFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel.Factory viewModelFactory;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory parentViewModelFactory;
    private sk.styk.martin.apkanalyzer.databinding.FragmentPermissionDetailGeneralBinding binding;
    private sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel viewModel;
    
    public PermissionsGeneralDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory getParentViewModelFactory() {
        return null;
    }
    
    public final void setParentViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory p0) {
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
}
package sk.styk.martin.apkanalyzer.ui.permission.detail.pager;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/FragmentPermissionDetailBinding;", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel;", "viewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "getViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "setViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_freeDebug"})
public final class PermissionDetailFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory viewModelFactory;
    private sk.styk.martin.apkanalyzer.databinding.FragmentPermissionDetailBinding binding;
    private sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_PERMISSIONS_DATA = "permission_args";
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragment.Companion Companion = null;
    
    public PermissionDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragment$Companion;", "", "()V", "ARG_PERMISSIONS_DATA", "", "create", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragment;", "permissionData", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragment create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData permissionData) {
            return null;
        }
    }
}
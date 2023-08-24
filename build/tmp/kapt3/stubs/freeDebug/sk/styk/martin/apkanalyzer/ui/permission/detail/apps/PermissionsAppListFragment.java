package sk.styk.martin.apkanalyzer.ui.permission.detail.apps;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006!"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListFragment;", "Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListFragment;", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel;", "()V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/FragmentPermissionAppListBinding;", "parentViewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "getParentViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;", "setParentViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/pager/PermissionDetailFragmentViewModel$Factory;)V", "viewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel$Factory;", "getViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel$Factory;", "setViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListViewModel$Factory;)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_freeDebug"})
public final class PermissionsAppListFragment extends sk.styk.martin.apkanalyzer.ui.applist.BaseAppListFragment<sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel> {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel.Factory viewModelFactory;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory parentViewModelFactory;
    private sk.styk.martin.apkanalyzer.databinding.FragmentPermissionAppListBinding binding;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_GRANTED = "arg_granted";
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment.Companion Companion = null;
    
    public PermissionsAppListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel.Factory p0) {
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
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected androidx.fragment.app.FragmentManager fragmentManager() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListFragment$Companion;", "", "()V", "ARG_GRANTED", "", "newInstance", "Lsk/styk/martin/apkanalyzer/ui/permission/detail/apps/PermissionsAppListFragment;", "granted", "", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment newInstance(boolean granted) {
            return null;
        }
    }
}
package sk.styk.martin.apkanalyzer.ui.applist.packagename;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/DialogAppListBinding;", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel;", "viewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel$Factory;", "getViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel$Factory;", "setViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "startAppDetail", "appListClickData", "Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter$AppListClickData;", "Companion", "app_freeDebug"})
public final class AppListFromPackageNamesDialog extends androidx.fragment.app.DialogFragment {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel.Factory viewModelFactory;
    private sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel viewModel;
    private sk.styk.martin.apkanalyzer.databinding.DialogAppListBinding binding;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_PACKAGE_NAMES = "arg_package_names";
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialog.Companion Companion = null;
    
    public AppListFromPackageNamesDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel.Factory p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void startAppDetail(sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter.AppListClickData appListClickData) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialog$Companion;", "", "()V", "ARG_PACKAGE_NAMES", "", "newInstance", "Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialog;", "packageNames", "", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialog newInstance(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> packageNames) {
            return null;
        }
    }
}
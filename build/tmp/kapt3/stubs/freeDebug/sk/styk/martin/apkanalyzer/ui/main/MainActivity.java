package sk.styk.martin.apkanalyzer.ui.main;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0017J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/main/MainActivity;", "Lsk/styk/martin/apkanalyzer/ui/ApkAnalyzerBaseActivity;", "()V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/ActivityMainBinding;", "factory", "Lsk/styk/martin/apkanalyzer/ui/main/MainActivityViewModel$Factory;", "getFactory", "()Lsk/styk/martin/apkanalyzer/ui/main/MainActivityViewModel$Factory;", "setFactory", "(Lsk/styk/martin/apkanalyzer/ui/main/MainActivityViewModel$Factory;)V", "userReviewManager", "Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;", "getUserReviewManager", "()Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;", "setUserReviewManager", "(Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;)V", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/main/MainActivityViewModel;", "navigateTo", "", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "Lsk/styk/martin/apkanalyzer/util/FragmentTag;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "placeAppListFragment", "popToAppList", "app_freeDebug"})
public final class MainActivity extends sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.main.MainActivityViewModel.Factory factory;
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager userReviewManager;
    private sk.styk.martin.apkanalyzer.ui.main.MainActivityViewModel viewModel;
    private sk.styk.martin.apkanalyzer.databinding.ActivityMainBinding binding;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.main.MainActivityViewModel.Factory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.main.MainActivityViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager getUserReviewManager() {
        return null;
    }
    
    public final void setUserReviewManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onBackPressed() {
    }
    
    private final void navigateTo(androidx.fragment.app.Fragment fragment, sk.styk.martin.apkanalyzer.util.FragmentTag tag) {
    }
    
    private final void placeAppListFragment() {
    }
    
    private final void popToAppList() {
    }
}
package sk.styk.martin.apkanalyzer.manager.navigationdrawer;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;", "Landroidx/lifecycle/ViewModel;", "()V", "foregroundFragment", "Lkotlinx/coroutines/flow/Flow;", "Lsk/styk/martin/apkanalyzer/util/FragmentTag;", "getForegroundFragment", "()Lkotlinx/coroutines/flow/Flow;", "foregroundFragmentFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "fragmentManager", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentManager;", "lifeCycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "bind", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "onCleared", "app_freeDebug"})
@dagger.hilt.android.scopes.ActivityScoped
public final class ForegroundFragmentWatcher extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManager;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<sk.styk.martin.apkanalyzer.util.FragmentTag> foregroundFragmentFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<sk.styk.martin.apkanalyzer.util.FragmentTag> foregroundFragment = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks lifeCycleCallbacks = null;
    
    @javax.inject.Inject
    public ForegroundFragmentWatcher() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<sk.styk.martin.apkanalyzer.util.FragmentTag> getForegroundFragment() {
        return null;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}
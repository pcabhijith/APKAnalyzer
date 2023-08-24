package sk.styk.martin.apkanalyzer.ui.appdetail.page;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&\u00a2\u0006\u0002\u0010\u001eJ\r\u0010\u001f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0015J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u001a\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020*H\u0004R\u001c\u0010\u0007\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragment;", "VM", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "BINDING", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "parentViewModelFactory", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;", "getParentViewModelFactory", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;", "setParentViewModelFactory", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;)V", "viewModel", "getViewModel", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "setViewModel", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;)V", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "createFragmentBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "createViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "onDestroy", "onViewCreated", "view", "parentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "app_freeDebug"})
public abstract class AppDetailPageFragment<VM extends sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragmentViewModel, BINDING extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory parentViewModelFactory;
    protected BINDING binding;
    protected VM viewModel;
    
    public AppDetailPageFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory getParentViewModelFactory() {
        return null;
    }
    
    public final void setParentViewModelFactory(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final BINDING getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull
    BINDING p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract BINDING createFragmentBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container);
    
    @org.jetbrains.annotations.NotNull
    public abstract VM createViewModel();
    
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
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel parentViewModel() {
        return null;
    }
}
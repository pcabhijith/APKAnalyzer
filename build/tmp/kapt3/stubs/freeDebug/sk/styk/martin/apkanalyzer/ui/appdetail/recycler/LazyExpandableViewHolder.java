package sk.styk.martin.apkanalyzer.ui.appdetail.recycler;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H&J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H&J\r\u0010\u0017\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H&J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0002\u00a2\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00028\u0002H\u0002\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0019H&J\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00022\u0006\u0010 \u001a\u00020\u001cH\u0002\u00a2\u0006\u0002\u0010!R\u0013\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\b\u00a8\u0006\""}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/LazyExpandableViewHolder;", "BaseBinding", "Landroidx/databinding/ViewDataBinding;", "ExpandBinding", "ViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "baseBinding", "(Landroidx/databinding/ViewDataBinding;)V", "getBaseBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroidx/databinding/ViewDataBinding;", "expandedBinding", "getExpandedBinding", "setExpandedBinding", "baseContainer", "Landroid/view/ViewGroup;", "bind", "", "viewModel", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;)V", "expandableContainer", "Lnet/cachapa/expandablelayout/ExpandableLayout;", "expandedInflation", "headerContainer", "Landroid/view/View;", "inflateExpandedIfNeeded", "onExpandedClickBase", "", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;)Z", "toggleArrow", "updateExpandedState", "isExpanded", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;Z)V", "app_freeDebug"})
public abstract class LazyExpandableViewHolder<BaseBinding extends androidx.databinding.ViewDataBinding, ExpandBinding extends androidx.databinding.ViewDataBinding, ViewModel extends sk.styk.martin.apkanalyzer.ui.appdetail.recycler.ExpandableItemViewModel> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull
    private final BaseBinding baseBinding = null;
    protected ExpandBinding expandedBinding;
    
    public LazyExpandableViewHolder(@org.jetbrains.annotations.NotNull
    BaseBinding baseBinding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final BaseBinding getBaseBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final ExpandBinding getExpandedBinding() {
        return null;
    }
    
    protected final void setExpandedBinding(@org.jetbrains.annotations.NotNull
    ExpandBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract android.view.ViewGroup baseContainer();
    
    @org.jetbrains.annotations.NotNull
    public abstract ExpandBinding expandedInflation();
    
    @org.jetbrains.annotations.NotNull
    public abstract net.cachapa.expandablelayout.ExpandableLayout expandableContainer();
    
    @org.jetbrains.annotations.NotNull
    public abstract android.view.View toggleArrow();
    
    @org.jetbrains.annotations.NotNull
    public abstract android.view.View headerContainer();
    
    private final void inflateExpandedIfNeeded(ViewModel viewModel) {
    }
    
    private final void updateExpandedState(ViewModel viewModel, boolean isExpanded) {
    }
    
    private final boolean onExpandedClickBase(ViewModel viewModel) {
        return false;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    ViewModel viewModel) {
    }
}
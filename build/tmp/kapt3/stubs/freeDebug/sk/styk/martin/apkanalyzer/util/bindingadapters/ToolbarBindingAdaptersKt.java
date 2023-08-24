package sk.styk.martin.apkanalyzer.util.bindingadapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"inflateMenu", "", "Landroidx/appcompat/widget/Toolbar;", "menuResId", "", "navigationIconState", "iconState", "Lsk/styk/martin/apkanalyzer/views/toolbar/NavigationIconState;", "onSearchCloseListener", "onCloseListener", "Landroid/widget/SearchView$OnCloseListener;", "searchHint", "searchOnQueryTextListener", "onQueryTextListener", "Landroid/widget/SearchView$OnQueryTextListener;", "searchQuery", "", "setTitle", "textInfo", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "app_freeDebug"})
public final class ToolbarBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"navigationIconState"})
    public static final void navigationIconState(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$navigationIconState, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState iconState) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"inflateMenu"})
    public static final void inflateMenu(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$inflateMenu, @androidx.annotation.MenuRes
    int menuResId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onQueryTextListener"})
    public static final void searchOnQueryTextListener(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$searchOnQueryTextListener, @org.jetbrains.annotations.NotNull
    android.widget.SearchView.OnQueryTextListener onQueryTextListener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onSearchCloseListener"})
    public static final void onSearchCloseListener(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$onSearchCloseListener, @org.jetbrains.annotations.NotNull
    android.widget.SearchView.OnCloseListener onCloseListener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"searchHint"})
    public static final void searchHint(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$searchHint, @androidx.annotation.StringRes
    int searchHint) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"searchQuery"})
    public static final void searchQuery(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$searchQuery, @org.jetbrains.annotations.Nullable
    java.lang.String searchQuery) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"title"})
    public static final void setTitle(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar $this$setTitle, @org.jetbrains.annotations.Nullable
    sk.styk.martin.apkanalyzer.util.TextInfo textInfo) {
    }
}
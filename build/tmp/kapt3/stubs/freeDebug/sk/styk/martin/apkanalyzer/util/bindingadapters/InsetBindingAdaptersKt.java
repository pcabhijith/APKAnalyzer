package sk.styk.martin.apkanalyzer.util.bindingadapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007\u001a0\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007\u001a=\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H\u0007\u001a&\u0010\u0019\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0003\u00a8\u0006\u001e"}, d2 = {"applySystemWindowsMargin", "", "view", "Landroid/view/View;", "applyLeft", "", "applyTop", "applyRight", "applyBottom", "applySystemWindowsPadding", "applySystemWindowsPaddingFraction", "applyLeftFraction", "", "applyTopFraction", "applyRightFraction", "applyBottomFraction", "(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "matchTopInsetHeight", "recordInitialMargin", "Lsk/styk/martin/apkanalyzer/util/bindingadapters/ValuesHolder;", "layoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "recordInitialPadding", "setMinHeighTopSystemWindowInsets", "minHeightTopSystemWindowInsets", "doOnApplyWindowInsets", "f", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "requestApplyInsetsWhenAttached", "app_freeDebug"})
public final class InsetBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"paddingLeftSystemWindowInsets", "paddingTopSystemWindowInsets", "paddingRightSystemWindowInsets", "paddingBottomSystemWindowInsets"}, requireAll = false)
    public static final void applySystemWindowsPadding(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean applyLeft, boolean applyTop, boolean applyRight, boolean applyBottom) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"marginLeftSystemWindowInsets", "marginTopSystemWindowInsets", "marginRightSystemWindowInsets", "marginBottomSystemWindowInsets"}, requireAll = false)
    public static final void applySystemWindowsMargin(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean applyLeft, boolean applyTop, boolean applyRight, boolean applyBottom) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"paddingLeftSystemWindowInsetsFraction", "paddingTopSystemWindowInsetsFraction", "paddingRightSystemWindowInsetsFraction", "paddingBottomSystemWindowInsetsFraction"}, requireAll = false)
    public static final void applySystemWindowsPaddingFraction(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    java.lang.Float applyLeftFraction, @org.jetbrains.annotations.Nullable
    java.lang.Float applyTopFraction, @org.jetbrains.annotations.Nullable
    java.lang.Float applyRightFraction, @org.jetbrains.annotations.Nullable
    java.lang.Float applyBottomFraction) {
    }
    
    public static final void doOnApplyWindowInsets(@org.jetbrains.annotations.NotNull
    android.view.View $this$doOnApplyWindowInsets, @org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.core.view.WindowInsetsCompat, kotlin.Unit> f) {
    }
    
    public static final void requestApplyInsetsWhenAttached(@org.jetbrains.annotations.NotNull
    android.view.View $this$requestApplyInsetsWhenAttached) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"matchTopInsetHeight"})
    public static final void matchTopInsetHeight(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean matchTopInsetHeight) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"minHeightTopSystemWindowInsets"})
    public static final void setMinHeighTopSystemWindowInsets(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean minHeightTopSystemWindowInsets) {
    }
    
    private static final sk.styk.martin.apkanalyzer.util.bindingadapters.ValuesHolder recordInitialPadding(android.view.View view) {
        return null;
    }
    
    private static final sk.styk.martin.apkanalyzer.util.bindingadapters.ValuesHolder recordInitialMargin(android.view.ViewGroup.MarginLayoutParams layoutParams) {
        return null;
    }
}
package sk.styk.martin.apkanalyzer.util.bindingadapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\t"}, d2 = {"setPluralString", "", "Landroid/widget/TextView;", "pluralRes", "", "pluralCount", "setText", "textInfo", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "app_freeDebug"})
public final class TextViewBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"pluralRes", "pluralCount"})
    public static final void setPluralString(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setPluralString, @androidx.annotation.PluralsRes
    int pluralRes, int pluralCount) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"text"})
    public static final void setText(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setText, @org.jetbrains.annotations.Nullable
    sk.styk.martin.apkanalyzer.util.TextInfo textInfo) {
    }
}
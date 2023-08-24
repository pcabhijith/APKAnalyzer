package sk.styk.martin.apkanalyzer.views.chart;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/chart/MyBarChart;", "Lcom/github/mikephil/charting/charts/BarChart;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowingMarker", "", "()Z", "onMarkerClickListener", "Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView$OnMarkerClickListener;", "getOnMarkerClickListener", "()Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView$OnMarkerClickListener;", "setOnMarkerClickListener", "(Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView$OnMarkerClickListener;)V", "init", "", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "app_freeDebug"})
public final class MyBarChart extends com.github.mikephil.charting.charts.BarChart {
    @org.jetbrains.annotations.Nullable
    private sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener onMarkerClickListener;
    
    public MyBarChart(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super(null);
    }
    
    public MyBarChart(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public MyBarChart(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener getOnMarkerClickListener() {
        return null;
    }
    
    public final void setOnMarkerClickListener(@org.jetbrains.annotations.Nullable
    sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener p0) {
    }
    
    @java.lang.Override
    protected void init() {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    private final boolean isShowingMarker() {
        return false;
    }
}
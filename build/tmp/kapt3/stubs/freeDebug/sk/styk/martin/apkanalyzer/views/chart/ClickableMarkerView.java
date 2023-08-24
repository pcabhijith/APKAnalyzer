package sk.styk.martin.apkanalyzer.views.chart;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView;", "Lcom/github/mikephil/charting/components/MarkerView;", "context", "Landroid/content/Context;", "callback", "Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView$OnMarkerClickListener;", "(Landroid/content/Context;Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView$OnMarkerClickListener;)V", "<set-?>", "", "drawingPosX", "getDrawingPosX", "()F", "drawingPosY", "getDrawingPosY", "startClickTime", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "posX", "posY", "getOffset", "Lcom/github/mikephil/charting/utils/MPPointF;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "refreshContent", "e", "Lcom/github/mikephil/charting/data/Entry;", "highlight", "Lcom/github/mikephil/charting/highlight/Highlight;", "OnMarkerClickListener", "app_freeDebug"})
@android.annotation.SuppressLint(value = {"ViewConstructor"})
public final class ClickableMarkerView extends com.github.mikephil.charting.components.MarkerView {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener callback = null;
    private float drawingPosX = 0.0F;
    private float drawingPosY = 0.0F;
    private long startClickTime = 0L;
    
    public ClickableMarkerView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener callback) {
        super(null, 0);
    }
    
    public final float getDrawingPosX() {
        return 0.0F;
    }
    
    public final float getDrawingPosY() {
        return 0.0F;
    }
    
    @java.lang.Override
    public void refreshContent(@org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.data.Entry e, @org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.highlight.Highlight highlight) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        return null;
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, float posX, float posY) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/chart/ClickableMarkerView$OnMarkerClickListener;", "", "onMarkerClick", "", "entry", "Lcom/github/mikephil/charting/data/Entry;", "app_freeDebug"})
    public static abstract interface OnMarkerClickListener {
        
        public abstract void onMarkerClick(@org.jetbrains.annotations.NotNull
        com.github.mikephil.charting.data.Entry entry);
    }
}
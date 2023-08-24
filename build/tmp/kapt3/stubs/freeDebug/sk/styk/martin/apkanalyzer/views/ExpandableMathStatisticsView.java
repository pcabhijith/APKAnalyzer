package sk.styk.martin.apkanalyzer.views;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lsk/styk/martin/apkanalyzer/databinding/ViewMathStatisticsCardBinding;", "value", "Landroid/view/View$OnClickListener;", "expandListener", "getExpandListener", "()Landroid/view/View$OnClickListener;", "setExpandListener", "(Landroid/view/View$OnClickListener;)V", "Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;", "statistics", "getStatistics", "()Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;", "setStatistics", "(Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;)V", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "type", "Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type;", "setExpanded", "", "isExpanded", "", "Type", "app_freeDebug"})
public final class ExpandableMathStatisticsView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.databinding.ViewMathStatisticsCardBinding binding = null;
    @org.jetbrains.annotations.NotNull
    private sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView.Type type = sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView.Type.INTEGRAL;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title = "";
    @org.jetbrains.annotations.Nullable
    private sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics statistics;
    @org.jetbrains.annotations.Nullable
    private android.view.View.OnClickListener expandListener;
    
    @kotlin.jvm.JvmOverloads
    public ExpandableMathStatisticsView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics getStatistics() {
        return null;
    }
    
    public final void setStatistics(@org.jetbrains.annotations.Nullable
    sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View.OnClickListener getExpandListener() {
        return null;
    }
    
    public final void setExpandListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnClickListener value) {
    }
    
    public final void setExpanded(boolean isExpanded) {
    }
    
    @kotlin.jvm.JvmOverloads
    public ExpandableMathStatisticsView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH \u00a2\u0006\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0013"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type;", "", "(Ljava/lang/String;I)V", "setStatistics", "", "statistics", "Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;", "mean", "Lsk/styk/martin/apkanalyzer/views/NewDetailListItemView;", "median", "min", "max", "deviation", "variance", "setStatistics$app_freeDebug", "INTEGRAL", "DECIMAL", "SIZE", "Companion", "app_freeDebug"})
    public static enum Type {
        /*public static final*/ INTEGRAL /* = new @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0001\u0018\u00002\u00020\u0001JE\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0010\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type$INTEGRAL;", "Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type;", "setStatistics", "", "statistics", "Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;", "mean", "Lsk/styk/martin/apkanalyzer/views/NewDetailListItemView;", "median", "min", "max", "deviation", "variance", "setStatistics$app_freeDebug", "app_freeDebug"}) INTEGRAL(){
    
    INTEGRAL() {
    }
    
    @java.lang.Override
    public void setStatistics$app_freeDebug(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics statistics, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView mean, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView median, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView min, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView max, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView deviation, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView variance) {
    }
} */,
        /*public static final*/ DECIMAL /* = new @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0001\u0018\u00002\u00020\u0001JE\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0010\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type$DECIMAL;", "Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type;", "setStatistics", "", "statistics", "Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;", "mean", "Lsk/styk/martin/apkanalyzer/views/NewDetailListItemView;", "median", "min", "max", "deviation", "variance", "setStatistics$app_freeDebug", "app_freeDebug"}) DECIMAL(){
    
    DECIMAL() {
    }
    
    @java.lang.Override
    public void setStatistics$app_freeDebug(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics statistics, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView mean, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView median, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView min, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView max, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView deviation, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView variance) {
    }
} */,
        /*public static final*/ SIZE /* = new @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0001\u0018\u00002\u00020\u0001JE\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0010\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type$SIZE;", "Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type;", "setStatistics", "", "statistics", "Lsk/styk/martin/apkanalyzer/core/appstatistics/model/MathStatistics;", "mean", "Lsk/styk/martin/apkanalyzer/views/NewDetailListItemView;", "median", "min", "max", "deviation", "variance", "setStatistics$app_freeDebug", "app_freeDebug"}) SIZE(){
    
    SIZE() {
    }
    
    @java.lang.Override
    public void setStatistics$app_freeDebug(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics statistics, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView mean, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView median, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView min, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView max, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView deviation, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.views.NewDetailListItemView variance) {
    }
} */;
        @org.jetbrains.annotations.NotNull
        public static final sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView.Type.Companion Companion = null;
        
        Type() {
        }
        
        public abstract void setStatistics$app_freeDebug(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics statistics, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.views.NewDetailListItemView mean, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.views.NewDetailListItemView median, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.views.NewDetailListItemView min, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.views.NewDetailListItemView max, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.views.NewDetailListItemView deviation, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.views.NewDetailListItemView variance);
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type$Companion;", "", "()V", "resolve", "Lsk/styk/martin/apkanalyzer/views/ExpandableMathStatisticsView$Type;", "stringAttribute", "", "app_freeDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView.Type resolve(@org.jetbrains.annotations.Nullable
            java.lang.String stringAttribute) {
                return null;
            }
        }
    }
}
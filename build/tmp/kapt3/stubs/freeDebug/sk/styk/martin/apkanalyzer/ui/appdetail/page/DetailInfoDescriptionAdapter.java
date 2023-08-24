package sk.styk.martin.apkanalyzer.ui.appdetail.page;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u0014*\u0004\u0018\u00010\u0015H\u0004J\u000e\u0010\u0016\u001a\u00020\u0014*\u0004\u0018\u00010\u0015H\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "copyToClipboard", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$CopyToClipboard;", "getCopyToClipboard", "()Landroidx/lifecycle/LiveData;", "copyToClipboardEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "getCopyToClipboardEvent", "()Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "openDescription", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$Description;", "getOpenDescription", "openDescriptionEvent", "getOpenDescriptionEvent", "orNa", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "", "orNone", "CopyToClipboard", "Description", "app_freeDebug"})
public abstract class DetailInfoDescriptionAdapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description> openDescriptionEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description> openDescription = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard> copyToClipboardEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard> copyToClipboard = null;
    
    public DetailInfoDescriptionAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description> getOpenDescriptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description> getOpenDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard> getCopyToClipboardEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard> getCopyToClipboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final sk.styk.martin.apkanalyzer.util.TextInfo orNa(@org.jetbrains.annotations.Nullable
    java.lang.String $this$orNa) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final sk.styk.martin.apkanalyzer.util.TextInfo orNone(@org.jetbrains.annotations.Nullable
    java.lang.String $this$orNone) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$CopyToClipboard;", "", "text", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "label", "(Lsk/styk/martin/apkanalyzer/util/TextInfo;Lsk/styk/martin/apkanalyzer/util/TextInfo;)V", "getLabel", "()Lsk/styk/martin/apkanalyzer/util/TextInfo;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_freeDebug"})
    public static final class CopyToClipboard {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo text = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo label = null;
        @org.jetbrains.annotations.NotNull
        public static final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard.Companion Companion = null;
        
        public CopyToClipboard(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo text, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo label) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard copy(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo text, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo label) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$CopyToClipboard$Companion;", "", "()V", "from", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$CopyToClipboard;", "detailInfo", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "app_freeDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.CopyToClipboard from(@org.jetbrains.annotations.NotNull
            sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo detailInfo) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$Description;", "", "title", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "message", "(Lsk/styk/martin/apkanalyzer/util/TextInfo;Lsk/styk/martin/apkanalyzer/util/TextInfo;)V", "getMessage", "()Lsk/styk/martin/apkanalyzer/util/TextInfo;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_freeDebug"})
    public static final class Description {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo title = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo message = null;
        @org.jetbrains.annotations.NotNull
        public static final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description.Companion Companion = null;
        
        public Description(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo title, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description copy(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo title, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo message) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$Description$Companion;", "", "()V", "from", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter$Description;", "detailInfo", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "app_freeDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter.Description from(@org.jetbrains.annotations.NotNull
            sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo detailInfo) {
                return null;
            }
        }
    }
}
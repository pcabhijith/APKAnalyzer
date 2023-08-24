package sk.styk.martin.apkanalyzer.ui.appdetail.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u0016\u0017\u0018\u0019B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$ViewHolder;", "()V", "value", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "info", "getInfo", "()Ljava/util/List;", "setInfo", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DetailInfo", "DetailItemViewModel", "InfoDiffCallback", "ViewHolder", "app_freeDebug"})
public final class DetailInfoAdapter extends sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> info;
    
    @javax.inject.Inject
    public DetailInfoAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.NotNull
    java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> value) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "", "name", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "value", "description", "(Lsk/styk/martin/apkanalyzer/util/TextInfo;Lsk/styk/martin/apkanalyzer/util/TextInfo;Lsk/styk/martin/apkanalyzer/util/TextInfo;)V", "getDescription", "()Lsk/styk/martin/apkanalyzer/util/TextInfo;", "getName", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_freeDebug"})
    public static final class DetailInfo {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo name = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo value = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.util.TextInfo description = null;
        
        public DetailInfo(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo name, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo value, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.util.TextInfo getDescription() {
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
        public final sk.styk.martin.apkanalyzer.util.TextInfo component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo copy(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo name, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo value, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.util.TextInfo description) {
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
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailItemViewModel;", "", "info", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;)V", "getInfo", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "onClick", "", "onLongClick", "", "app_freeDebug"})
    public final class DetailItemViewModel {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo info = null;
        
        public DetailItemViewModel(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo info) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getInfo() {
            return null;
        }
        
        public final void onClick() {
        }
        
        public final boolean onLongClick() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$InfoDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "oldList", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_freeDebug"})
    final class InfoDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> newList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> oldList = null;
        
        public InfoDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> newList, @org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo> oldList) {
            super();
        }
        
        @java.lang.Override
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bR\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lsk/styk/martin/apkanalyzer/databinding/ListItemDetailBinding;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;Lsk/styk/martin/apkanalyzer/databinding/ListItemDetailBinding;)V", "update", "", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailItemViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;", "app_freeDebug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.databinding.ListItemDetailBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.databinding.ListItemDetailBinding binding) {
            super(null);
        }
        
        public final void update(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailItemViewModel viewModel) {
        }
    }
}
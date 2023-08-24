package sk.styk.martin.apkanalyzer.ui.appdetail.page.feature;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u0016\u0017\u0018B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter$ViewHolder;", "()V", "value", "", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/FeatureData;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FeatureDataViewModel", "FeatureDiffCallback", "ViewHolder", "app_freeDebug"})
public final class AppFeatureDetailListAdapter extends sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> items;
    
    @javax.inject.Inject
    public AppFeatureDetailListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter$FeatureDataViewModel;", "", "featureData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/FeatureData;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter;Lsk/styk/martin/apkanalyzer/core/appanalysis/model/FeatureData;)V", "name", "", "getName", "()Ljava/lang/String;", "required", "", "getRequired", "()Z", "copyFeatureName", "onDetailClick", "", "app_freeDebug"})
    public final class FeatureDataViewModel {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final boolean required = false;
        
        public FeatureDataViewModel(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData featureData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final boolean getRequired() {
            return false;
        }
        
        public final void onDetailClick() {
        }
        
        public final boolean copyFeatureName() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter$FeatureDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/FeatureData;", "oldList", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_freeDebug"})
    final class FeatureDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> newList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> oldList = null;
        
        public FeatureDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> newList, @org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.core.appanalysis.model.FeatureData> oldList) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nR\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lsk/styk/martin/apkanalyzer/databinding/ListItemFeatureDetailBinding;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter;Lsk/styk/martin/apkanalyzer/databinding/ListItemFeatureDetailBinding;)V", "getBinding", "()Lsk/styk/martin/apkanalyzer/databinding/ListItemFeatureDetailBinding;", "bind", "", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter$FeatureDataViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/feature/AppFeatureDetailListAdapter;", "app_freeDebug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.databinding.ListItemFeatureDetailBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.databinding.ListItemFeatureDetailBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.databinding.ListItemFeatureDetailBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailListAdapter.FeatureDataViewModel viewModel) {
        }
    }
}
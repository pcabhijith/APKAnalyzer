package sk.styk.martin.apkanalyzer.ui.appdetail.page.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ViewHolder;", "()V", "value", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ExpandedServiceData;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "serviceUpdate", "Landroidx/lifecycle/LiveData;", "getServiceUpdate", "()Landroidx/lifecycle/LiveData;", "serviceUpdateEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ExpandedServiceData", "ServiceDataViewModel", "ServiceDiffCallback", "ViewHolder", "app_freeDebug"})
public final class AppServiceDetailListAdapter extends sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> serviceUpdateEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> serviceUpdate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> items;
    
    @javax.inject.Inject
    public AppServiceDetailListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> getServiceUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ExpandedServiceData;", "", "serviceData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ServiceData;", "expanded", "", "(Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ServiceData;Z)V", "getExpanded", "()Z", "getServiceData", "()Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ServiceData;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_freeDebug"})
    public static final class ExpandedServiceData {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.core.appanalysis.model.ServiceData serviceData = null;
        private final boolean expanded = false;
        
        public ExpandedServiceData(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.appanalysis.model.ServiceData serviceData, boolean expanded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.appanalysis.model.ServiceData getServiceData() {
            return null;
        }
        
        public final boolean getExpanded() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.appanalysis.model.ServiceData component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData copy(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.appanalysis.model.ServiceData serviceData, boolean expanded) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010!\u001a\u00020\u0006J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f\u00a8\u0006$"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ServiceDataViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;", "expandedServiceData", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ExpandedServiceData;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ExpandedServiceData;)V", "expanded", "", "getExpanded", "()Z", "exported", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "getExported", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "external", "getExternal", "isolatedProcess", "getIsolatedProcess", "name", "", "getName", "()Ljava/lang/String;", "packageName", "getPackageName", "permission", "getPermission", "singleUser", "getSingleUser", "stopWithTask", "getStopWithTask", "onDetailClick", "", "detailInfo", "onLongClick", "onTitleLongClick", "toggleExpanded", "newlyExpanded", "app_freeDebug"})
    public final class ServiceDataViewModel implements sk.styk.martin.apkanalyzer.ui.appdetail.recycler.ExpandableItemViewModel {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData expandedServiceData = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String packageName = null;
        private final boolean expanded = false;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo permission = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo exported = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo stopWithTask = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo singleUser = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo isolatedProcess = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo external = null;
        
        public ServiceDataViewModel(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData expandedServiceData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @java.lang.Override
        public boolean getExpanded() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getPermission() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getExported() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getStopWithTask() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getSingleUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getIsolatedProcess() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getExternal() {
            return null;
        }
        
        public final void onDetailClick(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo detailInfo) {
        }
        
        public final boolean onLongClick(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo detailInfo) {
            return false;
        }
        
        public final boolean onTitleLongClick() {
            return false;
        }
        
        @java.lang.Override
        public void toggleExpanded(boolean newlyExpanded) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ServiceDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ExpandedServiceData;", "oldList", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_freeDebug"})
    final class ServiceDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> newList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> oldList = null;
        
        public ServiceDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> newList, @org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ExpandedServiceData> oldList) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ViewHolder;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/LazyExpandableViewHolder;", "Lsk/styk/martin/apkanalyzer/databinding/ListItemServiceDetailBinding;", "Lsk/styk/martin/apkanalyzer/databinding/ListItemServiceDetailExpandedBinding;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter$ServiceDataViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter;", "binding", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/service/AppServiceDetailListAdapter;Lsk/styk/martin/apkanalyzer/databinding/ListItemServiceDetailBinding;)V", "baseContainer", "Landroid/widget/LinearLayout;", "expandableContainer", "Lnet/cachapa/expandablelayout/ExpandableLayout;", "expandedInflation", "headerContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "toggleArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "app_freeDebug"})
    public final class ViewHolder extends sk.styk.martin.apkanalyzer.ui.appdetail.recycler.LazyExpandableViewHolder<sk.styk.martin.apkanalyzer.databinding.ListItemServiceDetailBinding, sk.styk.martin.apkanalyzer.databinding.ListItemServiceDetailExpandedBinding, sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel> {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.databinding.ListItemServiceDetailBinding binding) {
            super(null);
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public android.widget.LinearLayout baseContainer() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public sk.styk.martin.apkanalyzer.databinding.ListItemServiceDetailExpandedBinding expandedInflation() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public net.cachapa.expandablelayout.ExpandableLayout expandableContainer() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.appcompat.widget.AppCompatImageView toggleArrow() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.constraintlayout.widget.ConstraintLayout headerContainer() {
            return null;
        }
    }
}
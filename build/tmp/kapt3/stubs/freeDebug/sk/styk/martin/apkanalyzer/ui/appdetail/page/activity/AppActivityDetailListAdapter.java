package sk.styk.martin.apkanalyzer.ui.appdetail.page.activity;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004 !\"#B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/DetailInfoDescriptionAdapter;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ViewHolder;", "()V", "activityUpdate", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ExpandedActivityData;", "getActivityUpdate", "()Landroidx/lifecycle/LiveData;", "activityUpdateEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "runActivity", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ActivityData;", "getRunActivity", "runActivityEvent", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ActivityDataViewModel", "ActivityDiffCallback", "ExpandedActivityData", "ViewHolder", "app_freeDebug"})
public final class AppActivityDetailListAdapter extends sk.styk.martin.apkanalyzer.ui.appdetail.page.DetailInfoDescriptionAdapter<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData> runActivityEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData> runActivity = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> activityUpdateEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> activityUpdate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> items;
    
    @javax.inject.Inject
    public AppActivityDetailListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData> getRunActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> getActivityUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010\u001e\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b\u00a8\u0006!"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ActivityDataViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;", "expandedActivityData", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ExpandedActivityData;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ExpandedActivityData;)V", "expanded", "", "getExpanded", "()Z", "labelDetailItemInfo", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "getLabelDetailItemInfo", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter$DetailInfo;", "name", "", "getName", "()Ljava/lang/String;", "packageName", "getPackageName", "parentDetailItemInfo", "getParentDetailItemInfo", "permissionDetailItemInfo", "getPermissionDetailItemInfo", "runButtonVisible", "getRunButtonVisible", "onDetailClick", "", "detailInfo", "onLongClick", "onRunClick", "onTitleLongClick", "toggleExpanded", "newlyExpanded", "app_freeDebug"})
    public final class ActivityDataViewModel implements sk.styk.martin.apkanalyzer.ui.appdetail.recycler.ExpandableItemViewModel {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData expandedActivityData = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String packageName = null;
        private final boolean expanded = false;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo labelDetailItemInfo = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo parentDetailItemInfo = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo permissionDetailItemInfo = null;
        private final boolean runButtonVisible = false;
        
        public ActivityDataViewModel(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData expandedActivityData) {
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
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getLabelDetailItemInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getParentDetailItemInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo getPermissionDetailItemInfo() {
            return null;
        }
        
        public final boolean getRunButtonVisible() {
            return false;
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
        
        public final void onRunClick() {
        }
        
        @java.lang.Override
        public void toggleExpanded(boolean newlyExpanded) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ActivityDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ExpandedActivityData;", "oldList", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_freeDebug"})
    final class ActivityDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> newList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> oldList = null;
        
        public ActivityDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> newList, @org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData> oldList) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ExpandedActivityData;", "", "activityData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ActivityData;", "expanded", "", "(Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ActivityData;Z)V", "getActivityData", "()Lsk/styk/martin/apkanalyzer/core/appanalysis/model/ActivityData;", "getExpanded", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_freeDebug"})
    public static final class ExpandedActivityData {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData activityData = null;
        private final boolean expanded = false;
        
        public ExpandedActivityData(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData activityData, boolean expanded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData getActivityData() {
            return null;
        }
        
        public final boolean getExpanded() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ExpandedActivityData copy(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.appanalysis.model.ActivityData activityData, boolean expanded) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ViewHolder;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/LazyExpandableViewHolder;", "Lsk/styk/martin/apkanalyzer/databinding/ListItemActivityDetailBinding;", "Lsk/styk/martin/apkanalyzer/databinding/ListItemActivityDetailExpandedBinding;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter$ActivityDataViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;", "binding", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/page/activity/AppActivityDetailListAdapter;Lsk/styk/martin/apkanalyzer/databinding/ListItemActivityDetailBinding;)V", "baseContainer", "Landroid/widget/LinearLayout;", "expandableContainer", "Lnet/cachapa/expandablelayout/ExpandableLayout;", "expandedInflation", "headerContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "toggleArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "app_freeDebug"})
    public final class ViewHolder extends sk.styk.martin.apkanalyzer.ui.appdetail.recycler.LazyExpandableViewHolder<sk.styk.martin.apkanalyzer.databinding.ListItemActivityDetailBinding, sk.styk.martin.apkanalyzer.databinding.ListItemActivityDetailExpandedBinding, sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel> {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.databinding.ListItemActivityDetailBinding binding) {
            super(null);
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public android.widget.LinearLayout baseContainer() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public sk.styk.martin.apkanalyzer.databinding.ListItemActivityDetailExpandedBinding expandedInflation() {
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
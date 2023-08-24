package sk.styk.martin.apkanalyzer.ui.permission.list;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001d\u001e\u001f B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$ViewHolder;", "()V", "openPermission", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$PermissionClickData;", "getOpenPermission", "()Landroidx/lifecycle/LiveData;", "openPermissionEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "value", "", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "permissions", "getPermissions", "()Ljava/util/List;", "setPermissions", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PermissionClickData", "PermissionDiffCallback", "PermissionItemViewModel", "ViewHolder", "app_freeDebug"})
public final class PermissionListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionClickData> openPermissionEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionClickData> openPermission = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> permissions;
    
    @javax.inject.Inject
    public PermissionListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionClickData> getOpenPermission() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> getPermissions() {
        return null;
    }
    
    public final void setPermissions(@org.jetbrains.annotations.NotNull
    java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> value) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$PermissionClickData;", "", "view", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "localPermissionData", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "(Ljava/lang/ref/WeakReference;Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;)V", "getLocalPermissionData", "()Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "getView", "()Ljava/lang/ref/WeakReference;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_freeDebug"})
    public static final class PermissionClickData {
        @org.jetbrains.annotations.NotNull
        private final java.lang.ref.WeakReference<android.view.View> view = null;
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData localPermissionData = null;
        
        public PermissionClickData(@org.jetbrains.annotations.NotNull
        java.lang.ref.WeakReference<android.view.View> view, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData localPermissionData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.ref.WeakReference<android.view.View> getView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData getLocalPermissionData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.ref.WeakReference<android.view.View> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionClickData copy(@org.jetbrains.annotations.NotNull
        java.lang.ref.WeakReference<android.view.View> view, @org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData localPermissionData) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$PermissionDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "oldList", "(Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_freeDebug"})
    final class PermissionDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> newList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> oldList = null;
        
        public PermissionDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> newList, @org.jetbrains.annotations.NotNull
        java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData> oldList) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$PermissionItemViewModel;", "", "permissionData", "Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "(Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;)V", "getPermissionData", "()Lsk/styk/martin/apkanalyzer/core/apppermissions/model/LocalPermissionData;", "onClick", "", "view", "Landroid/view/View;", "app_freeDebug"})
    public final class PermissionItemViewModel {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData permissionData = null;
        
        public PermissionItemViewModel(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData permissionData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData getPermissionData() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bR\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lsk/styk/martin/apkanalyzer/databinding/ListItemPermissionLocalDataBinding;", "(Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;Lsk/styk/martin/apkanalyzer/databinding/ListItemPermissionLocalDataBinding;)V", "update", "", "viewModel", "Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter$PermissionItemViewModel;", "Lsk/styk/martin/apkanalyzer/ui/permission/list/PermissionListAdapter;", "app_freeDebug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final sk.styk.martin.apkanalyzer.databinding.ListItemPermissionLocalDataBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.databinding.ListItemPermissionLocalDataBinding binding) {
            super(null);
        }
        
        public final void update(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionItemViewModel viewModel) {
        }
    }
}
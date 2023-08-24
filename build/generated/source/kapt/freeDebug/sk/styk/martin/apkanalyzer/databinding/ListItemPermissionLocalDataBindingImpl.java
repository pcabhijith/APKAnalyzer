package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemPermissionLocalDataBindingImpl extends ListItemPermissionLocalDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ListItemPermissionLocalDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemPermissionLocalDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.affectedApps.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.permissionName.setTag(null);
        this.permissionSimpleName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionItemViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelPermissionDataPermissionDataName = null;
        java.util.List<sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionStatus> viewModelPermissionDataPermissionStatusList = null;
        sk.styk.martin.apkanalyzer.core.appanalysis.model.PermissionData viewModelPermissionDataPermissionData = null;
        android.view.View.OnClickListener viewModelOnClickAndroidViewViewOnClickListener = null;
        java.lang.String viewModelPermissionDataPermissionDataSimpleName = null;
        int viewModelPermissionDataPermissionStatusListSize = 0;
        java.lang.String mboundView0AndroidStringTransitionPermissionNameViewModelPermissionDataPermissionDataName = null;
        sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionItemViewModel viewModel = mViewModel;
        sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData viewModelPermissionData = null;
        java.lang.String ViewModelPermissionDataPermissionDataName1 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onClick
                    viewModelOnClickAndroidViewViewOnClickListener = (((mViewModelOnClickAndroidViewViewOnClickListener == null) ? (mViewModelOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel.permissionData
                    viewModelPermissionData = viewModel.getPermissionData();
                }


                if (viewModelPermissionData != null) {
                    // read viewModel.permissionData.permissionStatusList
                    viewModelPermissionDataPermissionStatusList = viewModelPermissionData.getPermissionStatusList();
                    // read viewModel.permissionData.permissionData
                    viewModelPermissionDataPermissionData = viewModelPermissionData.getPermissionData();
                }


                if (viewModelPermissionDataPermissionStatusList != null) {
                    // read viewModel.permissionData.permissionStatusList.size
                    viewModelPermissionDataPermissionStatusListSize = viewModelPermissionDataPermissionStatusList.size();
                }
                if (viewModelPermissionDataPermissionData != null) {
                    // read viewModel.permissionData.permissionData.name
                    viewModelPermissionDataPermissionDataName = viewModelPermissionDataPermissionData.getName();
                    // read viewModel.permissionData.permissionData.simpleName
                    viewModelPermissionDataPermissionDataSimpleName = viewModelPermissionDataPermissionData.getSimpleName();
                    // read viewModel.permissionData.permissionData.Name
                    ViewModelPermissionDataPermissionDataName1 = viewModelPermissionDataPermissionData.getName();
                }


                // read @android:string/transition_permission_name
                mboundView0AndroidStringTransitionPermissionNameViewModelPermissionDataPermissionDataName = mboundView0.getResources().getString(R.string.transition_permission_name, ViewModelPermissionDataPermissionDataName1);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.TextViewBindingAdaptersKt.setPluralString(this.affectedApps, sk.styk.martin.apkanalyzer.R.plurals.permissions_number_apps, viewModelPermissionDataPermissionStatusListSize);
            this.mboundView0.setOnClickListener(viewModelOnClickAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.permissionName, viewModelPermissionDataPermissionDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.permissionSimpleName, viewModelPermissionDataPermissionDataSimpleName);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView0.setTransitionName(mboundView0AndroidStringTransitionPermissionNameViewModelPermissionDataPermissionDataName);
            }
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionItemViewModel value;
        public OnClickListenerImpl setValue(sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter.PermissionItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
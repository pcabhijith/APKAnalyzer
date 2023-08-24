package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemServiceDetailExpandedBindingImpl extends ListItemServiceDetailExpandedBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback8;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback6;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback4;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback14;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback12;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemServiceDetailExpandedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListItemServiceDetailExpandedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[0]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[2]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[6]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[5]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[1]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[4]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[3]
            );
        this.expandableContainer.setTag(null);
        this.itemServiceExported.setTag(null);
        this.itemServiceExternalService.setTag(null);
        this.itemServiceIsolatedProcess.setTag(null);
        this.itemServicePermission.setTag(null);
        this.itemServiceSingleUser.setTag(null);
        this.itemServiceStopWithTask.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 11);
        mCallback11 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 9);
        mCallback8 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 6);
        mCallback6 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 4);
        mCallback4 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 2);
        mCallback14 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 12);
        mCallback12 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 10);
        mCallback10 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 8);
        mCallback9 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 7);
        mCallback7 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 5);
        mCallback5 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 3);
        mCallback3 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel ViewModel) {
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
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelIsolatedProcessName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermission = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExportedValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelStopWithTaskValue = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExternal = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelIsolatedProcess = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelPermissionValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExternalValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelPermissionName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelStopWithTaskName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelSingleUserName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelSingleUser = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelIsolatedProcessValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExternalName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelStopWithTask = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExportedName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelSingleUserValue = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.permission
                    viewModelPermission = viewModel.getPermission();
                    // read viewModel.external
                    viewModelExternal = viewModel.getExternal();
                    // read viewModel.isolatedProcess
                    viewModelIsolatedProcess = viewModel.getIsolatedProcess();
                    // read viewModel.singleUser
                    viewModelSingleUser = viewModel.getSingleUser();
                    // read viewModel.exported
                    viewModelExported = viewModel.getExported();
                    // read viewModel.stopWithTask
                    viewModelStopWithTask = viewModel.getStopWithTask();
                }


                if (viewModelPermission != null) {
                    // read viewModel.permission.value
                    viewModelPermissionValue = viewModelPermission.getValue();
                    // read viewModel.permission.name
                    viewModelPermissionName = viewModelPermission.getName();
                }
                if (viewModelExternal != null) {
                    // read viewModel.external.value
                    viewModelExternalValue = viewModelExternal.getValue();
                    // read viewModel.external.name
                    viewModelExternalName = viewModelExternal.getName();
                }
                if (viewModelIsolatedProcess != null) {
                    // read viewModel.isolatedProcess.name
                    viewModelIsolatedProcessName = viewModelIsolatedProcess.getName();
                    // read viewModel.isolatedProcess.value
                    viewModelIsolatedProcessValue = viewModelIsolatedProcess.getValue();
                }
                if (viewModelSingleUser != null) {
                    // read viewModel.singleUser.name
                    viewModelSingleUserName = viewModelSingleUser.getName();
                    // read viewModel.singleUser.value
                    viewModelSingleUserValue = viewModelSingleUser.getValue();
                }
                if (viewModelExported != null) {
                    // read viewModel.exported.value
                    viewModelExportedValue = viewModelExported.getValue();
                    // read viewModel.exported.name
                    viewModelExportedName = viewModelExported.getName();
                }
                if (viewModelStopWithTask != null) {
                    // read viewModel.stopWithTask.value
                    viewModelStopWithTaskValue = viewModelStopWithTask.getValue();
                    // read viewModel.stopWithTask.name
                    viewModelStopWithTaskName = viewModelStopWithTask.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.itemServiceExported.setOnClickListener(mCallback5);
            this.itemServiceExported.setOnLongClickListener(mCallback6);
            this.itemServiceExternalService.setOnClickListener(mCallback13);
            this.itemServiceExternalService.setOnLongClickListener(mCallback14);
            this.itemServiceIsolatedProcess.setOnClickListener(mCallback11);
            this.itemServiceIsolatedProcess.setOnLongClickListener(mCallback12);
            this.itemServicePermission.setOnClickListener(mCallback3);
            this.itemServicePermission.setOnLongClickListener(mCallback4);
            this.itemServiceSingleUser.setOnClickListener(mCallback9);
            this.itemServiceSingleUser.setOnLongClickListener(mCallback10);
            this.itemServiceStopWithTask.setOnClickListener(mCallback7);
            this.itemServiceStopWithTask.setOnLongClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.itemServiceExported.setTitleText(viewModelExportedName);
            this.itemServiceExported.setValueText(viewModelExportedValue);
            this.itemServiceExternalService.setTitleText(viewModelExternalName);
            this.itemServiceExternalService.setValueText(viewModelExternalValue);
            this.itemServiceIsolatedProcess.setTitleText(viewModelIsolatedProcessName);
            this.itemServiceIsolatedProcess.setValueText(viewModelIsolatedProcessValue);
            this.itemServicePermission.setTitleText(viewModelPermissionName);
            this.itemServicePermission.setValueText(viewModelPermissionValue);
            this.itemServiceSingleUser.setTitleText(viewModelSingleUserName);
            this.itemServiceSingleUser.setValueText(viewModelSingleUserValue);
            this.itemServiceStopWithTask.setTitleText(viewModelStopWithTaskName);
            this.itemServiceStopWithTask.setValueText(viewModelStopWithTaskValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.external
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExternal = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelExternal = viewModel.getExternal();

                    viewModel.onDetailClick(viewModelExternal);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel.isolatedProcess
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelIsolatedProcess = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelIsolatedProcess = viewModel.getIsolatedProcess();

                    viewModel.onDetailClick(viewModelIsolatedProcess);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel.singleUser
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelSingleUser = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelSingleUser = viewModel.getSingleUser();

                    viewModel.onDetailClick(viewModelSingleUser);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel.stopWithTask
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelStopWithTask = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelStopWithTask = viewModel.getStopWithTask();

                    viewModel.onDetailClick(viewModelStopWithTask);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.exported
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelExported = viewModel.getExported();

                    viewModel.onDetailClick(viewModelExported);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.permission
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermission = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelPermission = viewModel.getPermission();

                    viewModel.onDetailClick(viewModelPermission);
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewModel.onLongClick(viewModel.stopWithTask)
                boolean viewModelOnLongClickViewModelStopWithTask = false;
                // viewModel.stopWithTask
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelStopWithTask = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelStopWithTask = viewModel.getStopWithTask();

                    viewModelOnLongClickViewModelStopWithTask = viewModel.onLongClick(viewModelStopWithTask);
                }
                return viewModelOnLongClickViewModelStopWithTask;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel.exported
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.onLongClick(viewModel.exported)
                boolean viewModelOnLongClickViewModelExported = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelExported = viewModel.getExported();

                    viewModelOnLongClickViewModelExported = viewModel.onLongClick(viewModelExported);
                }
                return viewModelOnLongClickViewModelExported;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel.onLongClick(viewModel.permission)
                boolean viewModelOnLongClickViewModelPermission = false;
                // viewModel.permission
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermission = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelPermission = viewModel.getPermission();

                    viewModelOnLongClickViewModelPermission = viewModel.onLongClick(viewModelPermission);
                }
                return viewModelOnLongClickViewModelPermission;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel.onLongClick(viewModel.external)
                boolean viewModelOnLongClickViewModelExternal = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.external
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExternal = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelExternal = viewModel.getExternal();

                    viewModelOnLongClickViewModelExternal = viewModel.onLongClick(viewModelExternal);
                }
                return viewModelOnLongClickViewModelExternal;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel.isolatedProcess
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelIsolatedProcess = null;
                // viewModel.onLongClick(viewModel.isolatedProcess)
                boolean viewModelOnLongClickViewModelIsolatedProcess = false;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelIsolatedProcess = viewModel.getIsolatedProcess();

                    viewModelOnLongClickViewModelIsolatedProcess = viewModel.onLongClick(viewModelIsolatedProcess);
                }
                return viewModelOnLongClickViewModelIsolatedProcess;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel.singleUser
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelSingleUser = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter.ServiceDataViewModel viewModel = mViewModel;
                // viewModel.onLongClick(viewModel.singleUser)
                boolean viewModelOnLongClickViewModelSingleUser = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelSingleUser = viewModel.getSingleUser();

                    viewModelOnLongClickViewModelSingleUser = viewModel.onLongClick(viewModelSingleUser);
                }
                return viewModelOnLongClickViewModelSingleUser;
            }
            default: {
                return false;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
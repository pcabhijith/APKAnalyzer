package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemActivityDetailExpandedBindingImpl extends ListItemActivityDetailExpandedBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback20;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback24;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemActivityDetailExpandedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemActivityDetailExpandedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[0]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[1]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[2]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            );
        this.expandableContainer.setTag(null);
        this.itemActivityLabel.setTag(null);
        this.itemActivityParent.setTag(null);
        this.itemActivityPermission.setTag(null);
        this.itemActivityRun.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 7);
        mCallback23 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 5);
        mCallback21 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 3);
        mCallback19 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        mCallback20 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 2);
        mCallback24 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 6);
        mCallback22 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 4);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel ViewModel) {
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
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelParentDetailItemInfo = null;
        boolean viewModelRunButtonVisible = false;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelLabelDetailItemInfoValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelPermissionDetailItemInfoValue = null;
        int viewModelRunButtonVisibleViewVISIBLEViewGONE = 0;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelPermissionDetailItemInfoName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelParentDetailItemInfoValue = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermissionDetailItemInfo = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelLabelDetailItemInfo = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelLabelDetailItemInfoName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelParentDetailItemInfoName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.parentDetailItemInfo
                    viewModelParentDetailItemInfo = viewModel.getParentDetailItemInfo();
                    // read viewModel.runButtonVisible
                    viewModelRunButtonVisible = viewModel.getRunButtonVisible();
                    // read viewModel.permissionDetailItemInfo
                    viewModelPermissionDetailItemInfo = viewModel.getPermissionDetailItemInfo();
                    // read viewModel.labelDetailItemInfo
                    viewModelLabelDetailItemInfo = viewModel.getLabelDetailItemInfo();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelRunButtonVisible) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                if (viewModelParentDetailItemInfo != null) {
                    // read viewModel.parentDetailItemInfo.value
                    viewModelParentDetailItemInfoValue = viewModelParentDetailItemInfo.getValue();
                    // read viewModel.parentDetailItemInfo.name
                    viewModelParentDetailItemInfoName = viewModelParentDetailItemInfo.getName();
                }
                // read viewModel.runButtonVisible ? View.VISIBLE : View.GONE
                viewModelRunButtonVisibleViewVISIBLEViewGONE = ((viewModelRunButtonVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (viewModelPermissionDetailItemInfo != null) {
                    // read viewModel.permissionDetailItemInfo.value
                    viewModelPermissionDetailItemInfoValue = viewModelPermissionDetailItemInfo.getValue();
                    // read viewModel.permissionDetailItemInfo.name
                    viewModelPermissionDetailItemInfoName = viewModelPermissionDetailItemInfo.getName();
                }
                if (viewModelLabelDetailItemInfo != null) {
                    // read viewModel.labelDetailItemInfo.value
                    viewModelLabelDetailItemInfoValue = viewModelLabelDetailItemInfo.getValue();
                    // read viewModel.labelDetailItemInfo.name
                    viewModelLabelDetailItemInfoName = viewModelLabelDetailItemInfo.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.itemActivityLabel.setOnClickListener(mCallback19);
            this.itemActivityLabel.setOnLongClickListener(mCallback20);
            this.itemActivityParent.setOnClickListener(mCallback21);
            this.itemActivityParent.setOnLongClickListener(mCallback22);
            this.itemActivityPermission.setOnClickListener(mCallback23);
            this.itemActivityPermission.setOnLongClickListener(mCallback24);
            this.itemActivityRun.setOnClickListener(mCallback25);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.itemActivityLabel.setTitleText(viewModelLabelDetailItemInfoName);
            this.itemActivityLabel.setValueText(viewModelLabelDetailItemInfoValue);
            this.itemActivityParent.setTitleText(viewModelParentDetailItemInfoName);
            this.itemActivityParent.setValueText(viewModelParentDetailItemInfoValue);
            this.itemActivityPermission.setTitleText(viewModelPermissionDetailItemInfoName);
            this.itemActivityPermission.setValueText(viewModelPermissionDetailItemInfoValue);
            this.itemActivityRun.setVisibility(viewModelRunButtonVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onRunClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel.permissionDetailItemInfo
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermissionDetailItemInfo = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelPermissionDetailItemInfo = viewModel.getPermissionDetailItemInfo();

                    viewModel.onDetailClick(viewModelPermissionDetailItemInfo);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.parentDetailItemInfo
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelParentDetailItemInfo = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelParentDetailItemInfo = viewModel.getParentDetailItemInfo();

                    viewModel.onDetailClick(viewModelParentDetailItemInfo);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.labelDetailItemInfo
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelLabelDetailItemInfo = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelLabelDetailItemInfo = viewModel.getLabelDetailItemInfo();

                    viewModel.onDetailClick(viewModelLabelDetailItemInfo);
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel.labelDetailItemInfo
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelLabelDetailItemInfo = null;
                // viewModel.onLongClick(viewModel.labelDetailItemInfo)
                boolean viewModelOnLongClickViewModelLabelDetailItemInfo = false;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelLabelDetailItemInfo = viewModel.getLabelDetailItemInfo();

                    viewModelOnLongClickViewModelLabelDetailItemInfo = viewModel.onLongClick(viewModelLabelDetailItemInfo);
                }
                return viewModelOnLongClickViewModelLabelDetailItemInfo;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel.permissionDetailItemInfo
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermissionDetailItemInfo = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel.onLongClick(viewModel.permissionDetailItemInfo)
                boolean viewModelOnLongClickViewModelPermissionDetailItemInfo = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelPermissionDetailItemInfo = viewModel.getPermissionDetailItemInfo();

                    viewModelOnLongClickViewModelPermissionDetailItemInfo = viewModel.onLongClick(viewModelPermissionDetailItemInfo);
                }
                return viewModelOnLongClickViewModelPermissionDetailItemInfo;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel.parentDetailItemInfo
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelParentDetailItemInfo = null;
                // viewModel.onLongClick(viewModel.parentDetailItemInfo)
                boolean viewModelOnLongClickViewModelParentDetailItemInfo = false;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelParentDetailItemInfo = viewModel.getParentDetailItemInfo();

                    viewModelOnLongClickViewModelParentDetailItemInfo = viewModel.onLongClick(viewModelParentDetailItemInfo);
                }
                return viewModelOnLongClickViewModelParentDetailItemInfo;
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
        flag 2 (0x3L): viewModel.runButtonVisible ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewModel.runButtonVisible ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}
package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemReceiverDetailExpandedBindingImpl extends ListItemReceiverDetailExpandedBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback66;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemReceiverDetailExpandedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListItemReceiverDetailExpandedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[0]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[2]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[1]
            );
        this.expandableContainer.setTag(null);
        this.itemReceiverExported.setTag(null);
        this.itemReceiverPermission.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 3);
        mCallback68 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 4);
        mCallback65 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        mCallback66 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 2);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel ViewModel) {
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
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelPermissionValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelPermissionName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelPermission = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExportedValue = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel viewModel = mViewModel;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExportedName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.permission
                    viewModelPermission = viewModel.getPermission();
                    // read viewModel.exported
                    viewModelExported = viewModel.getExported();
                }


                if (viewModelPermission != null) {
                    // read viewModel.permission.value
                    viewModelPermissionValue = viewModelPermission.getValue();
                    // read viewModel.permission.name
                    viewModelPermissionName = viewModelPermission.getName();
                }
                if (viewModelExported != null) {
                    // read viewModel.exported.value
                    viewModelExportedValue = viewModelExported.getValue();
                    // read viewModel.exported.name
                    viewModelExportedName = viewModelExported.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.itemReceiverExported.setOnClickListener(mCallback67);
            this.itemReceiverExported.setOnLongClickListener(mCallback68);
            this.itemReceiverPermission.setOnClickListener(mCallback65);
            this.itemReceiverPermission.setOnLongClickListener(mCallback66);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.itemReceiverExported.setTitleText(viewModelExportedName);
            this.itemReceiverExported.setValueText(viewModelExportedValue);
            this.itemReceiverPermission.setTitleText(viewModelPermissionName);
            this.itemReceiverPermission.setValueText(viewModelPermissionValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel.exported
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel viewModel = mViewModel;
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
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel viewModel = mViewModel;
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
            case 4: {
                // localize variables for thread safety
                // viewModel.exported
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel viewModel = mViewModel;
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
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ReceiverDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelPermission = viewModel.getPermission();

                    viewModelOnLongClickViewModelPermission = viewModel.onLongClick(viewModelPermission);
                }
                return viewModelOnLongClickViewModelPermission;
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
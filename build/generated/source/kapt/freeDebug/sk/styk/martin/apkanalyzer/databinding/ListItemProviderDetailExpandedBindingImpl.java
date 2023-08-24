package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemProviderDetailExpandedBindingImpl extends ListItemProviderDetailExpandedBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnLongClickListener mCallback27;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback33;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemProviderDetailExpandedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemProviderDetailExpandedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[0]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[1]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[4]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[2]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[3]
            );
        this.expandableContainer.setTag(null);
        this.itemProviderAuthority.setTag(null);
        this.itemProviderExported.setTag(null);
        this.itemProviderReadPermission.setTag(null);
        this.itemProviderWritePermission.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 2);
        mCallback33 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 8);
        mCallback29 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 4);
        mCallback30 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 5);
        mCallback28 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 3);
        mCallback26 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        mCallback32 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 7);
        mCallback31 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 6);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel ViewModel) {
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
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelAuthority = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelReadPermissionName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExportedValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelWritePermissionName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelReadPermissionValue = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelWritePermission = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelAuthorityValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelWritePermissionValue = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelAuthorityName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelReadPermission = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelExportedName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.authority
                    viewModelAuthority = viewModel.getAuthority();
                    // read viewModel.writePermission
                    viewModelWritePermission = viewModel.getWritePermission();
                    // read viewModel.exported
                    viewModelExported = viewModel.getExported();
                    // read viewModel.readPermission
                    viewModelReadPermission = viewModel.getReadPermission();
                }


                if (viewModelAuthority != null) {
                    // read viewModel.authority.value
                    viewModelAuthorityValue = viewModelAuthority.getValue();
                    // read viewModel.authority.name
                    viewModelAuthorityName = viewModelAuthority.getName();
                }
                if (viewModelWritePermission != null) {
                    // read viewModel.writePermission.name
                    viewModelWritePermissionName = viewModelWritePermission.getName();
                    // read viewModel.writePermission.value
                    viewModelWritePermissionValue = viewModelWritePermission.getValue();
                }
                if (viewModelExported != null) {
                    // read viewModel.exported.value
                    viewModelExportedValue = viewModelExported.getValue();
                    // read viewModel.exported.name
                    viewModelExportedName = viewModelExported.getName();
                }
                if (viewModelReadPermission != null) {
                    // read viewModel.readPermission.name
                    viewModelReadPermissionName = viewModelReadPermission.getName();
                    // read viewModel.readPermission.value
                    viewModelReadPermissionValue = viewModelReadPermission.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.itemProviderAuthority.setOnClickListener(mCallback26);
            this.itemProviderAuthority.setOnLongClickListener(mCallback27);
            this.itemProviderExported.setOnClickListener(mCallback32);
            this.itemProviderExported.setOnLongClickListener(mCallback33);
            this.itemProviderReadPermission.setOnClickListener(mCallback28);
            this.itemProviderReadPermission.setOnLongClickListener(mCallback29);
            this.itemProviderWritePermission.setOnClickListener(mCallback30);
            this.itemProviderWritePermission.setOnLongClickListener(mCallback31);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.itemProviderAuthority.setTitleText(viewModelAuthorityName);
            this.itemProviderAuthority.setValueText(viewModelAuthorityValue);
            this.itemProviderExported.setTitleText(viewModelExportedName);
            this.itemProviderExported.setValueText(viewModelExportedValue);
            this.itemProviderReadPermission.setTitleText(viewModelReadPermissionName);
            this.itemProviderReadPermission.setValueText(viewModelReadPermissionValue);
            this.itemProviderWritePermission.setTitleText(viewModelWritePermissionName);
            this.itemProviderWritePermission.setValueText(viewModelWritePermissionValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel.authority
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelAuthority = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel.onLongClick(viewModel.authority)
                boolean viewModelOnLongClickViewModelAuthority = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelAuthority = viewModel.getAuthority();

                    viewModelOnLongClickViewModelAuthority = viewModel.onLongClick(viewModelAuthority);
                }
                return viewModelOnLongClickViewModelAuthority;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel.exported
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
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
            case 4: {
                // localize variables for thread safety
                // viewModel.onLongClick(viewModel.readPermission)
                boolean viewModelOnLongClickViewModelReadPermission = false;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.readPermission
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelReadPermission = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelReadPermission = viewModel.getReadPermission();

                    viewModelOnLongClickViewModelReadPermission = viewModel.onLongClick(viewModelReadPermission);
                }
                return viewModelOnLongClickViewModelReadPermission;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel.writePermission
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelWritePermission = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel.onLongClick(viewModel.writePermission)
                boolean viewModelOnLongClickViewModelWritePermission = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelWritePermission = viewModel.getWritePermission();

                    viewModelOnLongClickViewModelWritePermission = viewModel.onLongClick(viewModelWritePermission);
                }
                return viewModelOnLongClickViewModelWritePermission;
            }
            default: {
                return false;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // viewModel.writePermission
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelWritePermission = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelWritePermission = viewModel.getWritePermission();

                    viewModel.onDetailClick(viewModelWritePermission);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.readPermission
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelReadPermission = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelReadPermission = viewModel.getReadPermission();

                    viewModel.onDetailClick(viewModelReadPermission);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.authority
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelAuthority = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelAuthority = viewModel.getAuthority();

                    viewModel.onDetailClick(viewModelAuthority);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel.exported
                sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelExported = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelExported = viewModel.getExported();

                    viewModel.onDetailClick(viewModelExported);
                }
                break;
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
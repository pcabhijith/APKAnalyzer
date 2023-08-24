package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPermissionListBindingImpl extends FragmentPermissionListBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPermissionListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentPermissionListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (sk.styk.martin.apkanalyzer.views.LoadingBarView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[1]
            );
        this.loadingBar.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerViewPermissions.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback34 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelLoadingProgress((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewModelLoadingProgressMax((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingProgress(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelLoadingProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingProgressMax(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelLoadingProgressMax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        java.lang.Integer viewModelLoadingProgressGetValue = null;
        sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter viewModelPermissionListAdapter = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelLoadingProgress = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        java.lang.Integer viewModelLoadingProgressMaxGetValue = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelLoadingProgressMax = null;
        int viewModelIsLoadingViewGONEViewVISIBLE = 0;
        sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading()
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading().getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.GONE : View.VISIBLE
                    viewModelIsLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.permissionListAdapter
                        viewModelPermissionListAdapter = viewModel.getPermissionListAdapter();
                    }
            }
            if ((dirtyFlags & 0x1eL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingProgress
                        viewModelLoadingProgress = viewModel.getLoadingProgress();
                        // read viewModel.loadingProgressMax
                        viewModelLoadingProgressMax = viewModel.getLoadingProgressMax();
                    }
                    updateLiveDataRegistration(1, viewModelLoadingProgress);
                    updateLiveDataRegistration(2, viewModelLoadingProgressMax);


                    if (viewModelLoadingProgress != null) {
                        // read viewModel.loadingProgress.getValue()
                        viewModelLoadingProgressGetValue = viewModelLoadingProgress.getValue();
                    }
                    if (viewModelLoadingProgressMax != null) {
                        // read viewModel.loadingProgressMax.getValue()
                        viewModelLoadingProgressMaxGetValue = viewModelLoadingProgressMax.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.loadingBar.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
            this.recyclerViewPermissions.setVisibility(viewModelIsLoadingViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1eL) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.views.LoadingBarViewKt.setProgress(this.loadingBar, viewModelLoadingProgressGetValue, viewModelLoadingProgressMaxGetValue);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.recyclerViewPermissions.setAdapter(viewModelPermissionListAdapter);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.RecyclerViewBindingAdaptersKt.itemDecoration(this.recyclerViewPermissions, true);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.navigationIconState(this.toolbar, sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState.HAMBURGER);
            this.toolbar.setNavigationOnClickListener(mCallback34);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.onNavigationClick()
        kotlinx.coroutines.Job viewModelOnNavigationClick = null;
        // viewModel
        sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelOnNavigationClick = viewModel.onNavigationClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading()
        flag 1 (0x2L): viewModel.loadingProgress
        flag 2 (0x3L): viewModel.loadingProgressMax
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}
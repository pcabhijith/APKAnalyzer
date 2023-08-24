package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentManifestBindingImpl extends FragmentManifestBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.code_loading, 3);
        sViewsWithIds.put(R.id.item_detail_error, 4);
        sViewsWithIds.put(R.id.code_container, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentManifestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentManifestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ViewAnimator) bindings[2]
            , (android.widget.FrameLayout) bindings[5]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[1]
            );
        this.animator.setTag(null);
        this.codeCoordinator.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelViewState((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelAppName((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelViewState(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelViewState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAppName(androidx.lifecycle.LiveData<java.lang.String> ViewModelAppName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelViewState = null;
        java.lang.Integer viewModelViewStateGetValue = null;
        java.lang.String viewModelAppNameGetValue = null;
        sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel viewModel = mViewModel;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.String> viewModelAppName = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.viewState
                        viewModelViewState = viewModel.getViewState();
                    }
                    updateLiveDataRegistration(0, viewModelViewState);


                    if (viewModelViewState != null) {
                        // read viewModel.viewState.getValue()
                        viewModelViewStateGetValue = viewModelViewState.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelViewStateGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.appName
                        viewModelAppName = viewModel.getAppName();
                    }
                    updateLiveDataRegistration(1, viewModelAppName);


                    if (viewModelAppName != null) {
                        // read viewModel.appName.getValue()
                        viewModelAppNameGetValue = viewModelAppName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.animator.setDisplayedChild(androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.inflateMenu(this.toolbar, sk.styk.martin.apkanalyzer.R.menu.android_manifest);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.navigationIconState(this.toolbar, sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState.ARROW);
            this.toolbar.setNavigationOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.toolbar.setOnMenuItemClickListener(viewModel);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.toolbar.setTitle(viewModelAppNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onNavigationClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.viewState
        flag 1 (0x2L): viewModel.appName
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
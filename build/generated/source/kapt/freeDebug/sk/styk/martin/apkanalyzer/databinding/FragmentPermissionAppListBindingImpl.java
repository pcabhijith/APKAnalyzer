package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPermissionAppListBindingImpl extends FragmentPermissionAppListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.list_view_progress_bar, 2);
        sViewsWithIds.put(R.id.nothing_to_show, 3);
    }
    // views
    @NonNull
    private final android.widget.ViewAnimator mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPermissionAppListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentPermissionAppListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.ViewAnimator) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerViewAppList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.applist.BaseAppListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.applist.BaseAppListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelViewState((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter viewModelAdapter = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelViewState = null;
        java.lang.Integer viewModelViewStateGetValue = null;
        sk.styk.martin.apkanalyzer.ui.applist.BaseAppListViewModel viewModel = mViewModel;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = 0;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.adapter
                        viewModelAdapter = viewModel.getAdapter();
                    }
            }

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
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView0.setDisplayedChild(androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.recyclerViewAppList.setAdapter(viewModelAdapter);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.RecyclerViewBindingAdaptersKt.itemDecoration(this.recyclerViewAppList, true);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.viewState
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
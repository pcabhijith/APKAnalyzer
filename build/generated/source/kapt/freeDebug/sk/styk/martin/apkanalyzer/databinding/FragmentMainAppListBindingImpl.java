package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainAppListBindingImpl extends FragmentMainAppListBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 5);
        sViewsWithIds.put(R.id.list_view_progress_bar, 6);
        sViewsWithIds.put(R.id.nothing_to_show, 7);
    }
    // views
    @NonNull
    private final android.widget.ViewAnimator mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainAppListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentMainAppListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[1]
            );
        this.appListContainer.setTag(null);
        this.btnAnalyzeNotInstalled.setTag(null);
        this.mboundView2 = (android.widget.ViewAnimator) bindings[2];
        this.mboundView2.setTag(null);
        this.recyclerViewAppList.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        mCallback16 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 2);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel ViewModel) {
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
        java.lang.Integer viewModelViewStateGetValue = null;
        boolean viewModelViewStateInt0 = false;
        sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter viewModelAdapter = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelViewState = null;
        sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel viewModel = mViewModel;
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


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue()) != 0
                viewModelViewStateInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue) != (0);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnAnalyzeNotInstalled.setOnClickListener(mCallback16);
            this.recyclerViewAppList.setHasFixedSize(true);
            sk.styk.martin.apkanalyzer.util.bindingadapters.RecyclerViewBindingAdaptersKt.itemDecoration(this.recyclerViewAppList, true);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.inflateMenu(this.toolbar, sk.styk.martin.apkanalyzer.R.menu.app_list);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.navigationIconState(this.toolbar, sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState.HAMBURGER);
            this.toolbar.setNavigationOnClickListener(mCallback15);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.searchHint(this.toolbar, sk.styk.martin.apkanalyzer.R.string.action_search);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.FabBindingAdaptersKt.bindFabIsShown(this.btnAnalyzeNotInstalled, viewModelViewStateInt0);
            this.mboundView2.setDisplayedChild(androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.recyclerViewAppList.setAdapter(viewModelAdapter);
            this.toolbar.setOnMenuItemClickListener(viewModel);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.searchOnQueryTextListener(this.toolbar, viewModel);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.onSearchCloseListener(this.toolbar, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel.onNavigationClick()
                kotlinx.coroutines.Job viewModelOnNavigationClick = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelOnNavigationClick = viewModel.onNavigationClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onFilePickerClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.viewState
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
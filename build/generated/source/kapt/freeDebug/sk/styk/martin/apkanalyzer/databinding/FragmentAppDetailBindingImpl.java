package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAppDetailBindingImpl extends FragmentAppDetailBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_detail_loading, 9);
        sViewsWithIds.put(R.id.item_detail_error, 10);
        sViewsWithIds.put(R.id.pager, 11);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.ViewAnimator mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAppDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentAppDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (sk.styk.martin.apkanalyzer.views.FloatingActionButton) bindings[8]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.viewpager.widget.ViewPager) bindings[11]
            , (com.google.android.material.tabs.TabLayout) bindings[6]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[2]
            );
        this.appBar.setTag(null);
        this.appImage.setTag(null);
        this.appPackageName.setTag(null);
        this.btnActions.setTag(null);
        this.detailToolbar.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (android.widget.ViewAnimator) bindings[7];
        this.mboundView7.setTag(null);
        this.tab.setTag(null);
        this.toolbarLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAccentColor((androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo>) object, fieldId);
            case 1 :
                return onChangeViewModelToolbarSubtitleVisibility((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelToolbarSubtitle((androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo>) object, fieldId);
            case 3 :
                return onChangeViewModelViewState((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeViewModelToolbarIcon((androidx.lifecycle.LiveData<android.graphics.drawable.Drawable>) object, fieldId);
            case 5 :
                return onChangeViewModelToolbarTitle((androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo>) object, fieldId);
            case 6 :
                return onChangeViewModelActionButtonVisibility((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelActionButtonAdapter((androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAccentColor(androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo> ViewModelAccentColor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelToolbarSubtitleVisibility(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelToolbarSubtitleVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelToolbarSubtitle(androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> ViewModelToolbarSubtitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelViewState(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelViewState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelToolbarIcon(androidx.lifecycle.LiveData<android.graphics.drawable.Drawable> ViewModelToolbarIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelToolbarTitle(androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> ViewModelToolbarTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelActionButtonVisibility(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelActionButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelActionButtonAdapter(androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter> ViewModelActionButtonAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo> viewModelAccentColor = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelToolbarSubtitleGetValue = null;
        java.lang.Integer viewModelViewStateGetValue = null;
        boolean viewModelViewStateAppDetailFragmentViewModelKtDATASTATE = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelToolbarSubtitleVisibility = null;
        sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo viewModelAccentColorGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelToolbarSubtitleVisibilityGetValue = false;
        androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> viewModelToolbarSubtitle = null;
        int viewModelViewStateAppDetailFragmentViewModelKtDATASTATEViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelViewState = null;
        java.lang.Boolean viewModelToolbarSubtitleVisibilityGetValue = null;
        android.graphics.drawable.Drawable viewModelToolbarIconGetValue = null;
        int viewModelToolbarSubtitleVisibilityViewVISIBLEViewGONE = 0;
        sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter viewModelActionButtonAdapterGetValue = null;
        java.lang.Boolean viewModelActionButtonVisibilityGetValue = null;
        int viewModelAccentColorToColorIntContext = 0;
        androidx.lifecycle.LiveData<android.graphics.drawable.Drawable> viewModelToolbarIcon = null;
        androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> viewModelToolbarTitle = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelActionButtonVisibility = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelToolbarTitleGetValue = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel viewModel = mViewModel;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = 0;
        androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter> viewModelActionButtonAdapter = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.accentColor
                        viewModelAccentColor = viewModel.getAccentColor();
                    }
                    updateLiveDataRegistration(0, viewModelAccentColor);


                    if (viewModelAccentColor != null) {
                        // read viewModel.accentColor.getValue()
                        viewModelAccentColorGetValue = viewModelAccentColor.getValue();
                    }


                    if (viewModelAccentColorGetValue != null) {
                        // read viewModel.accentColor.getValue().toColorInt(context)
                        viewModelAccentColorToColorIntContext = viewModelAccentColorGetValue.toColorInt(getRoot().getContext());
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toolbarSubtitleVisibility
                        viewModelToolbarSubtitleVisibility = viewModel.getToolbarSubtitleVisibility();
                    }
                    updateLiveDataRegistration(1, viewModelToolbarSubtitleVisibility);


                    if (viewModelToolbarSubtitleVisibility != null) {
                        // read viewModel.toolbarSubtitleVisibility.getValue()
                        viewModelToolbarSubtitleVisibilityGetValue = viewModelToolbarSubtitleVisibility.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.toolbarSubtitleVisibility.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelToolbarSubtitleVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelToolbarSubtitleVisibilityGetValue);
                if((dirtyFlags & 0x302L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelToolbarSubtitleVisibilityGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.toolbarSubtitleVisibility.getValue()) ? View.VISIBLE : View.GONE
                    viewModelToolbarSubtitleVisibilityViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelToolbarSubtitleVisibilityGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toolbarSubtitle
                        viewModelToolbarSubtitle = viewModel.getToolbarSubtitle();
                    }
                    updateLiveDataRegistration(2, viewModelToolbarSubtitle);


                    if (viewModelToolbarSubtitle != null) {
                        // read viewModel.toolbarSubtitle.getValue()
                        viewModelToolbarSubtitleGetValue = viewModelToolbarSubtitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.viewState
                        viewModelViewState = viewModel.getViewState();
                    }
                    updateLiveDataRegistration(3, viewModelViewState);


                    if (viewModelViewState != null) {
                        // read viewModel.viewState.getValue()
                        viewModelViewStateGetValue = viewModelViewState.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelViewStateGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue()) == AppDetailFragmentViewModelKt.DATA_STATE
                    viewModelViewStateAppDetailFragmentViewModelKtDATASTATE = (androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue) == (sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModelKt.DATA_STATE);
                if((dirtyFlags & 0x308L) != 0) {
                    if(viewModelViewStateAppDetailFragmentViewModelKtDATASTATE) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue()) == AppDetailFragmentViewModelKt.DATA_STATE ? View.VISIBLE : View.GONE
                    viewModelViewStateAppDetailFragmentViewModelKtDATASTATEViewVISIBLEViewGONE = ((viewModelViewStateAppDetailFragmentViewModelKtDATASTATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toolbarIcon
                        viewModelToolbarIcon = viewModel.getToolbarIcon();
                    }
                    updateLiveDataRegistration(4, viewModelToolbarIcon);


                    if (viewModelToolbarIcon != null) {
                        // read viewModel.toolbarIcon.getValue()
                        viewModelToolbarIconGetValue = viewModelToolbarIcon.getValue();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toolbarTitle
                        viewModelToolbarTitle = viewModel.getToolbarTitle();
                    }
                    updateLiveDataRegistration(5, viewModelToolbarTitle);


                    if (viewModelToolbarTitle != null) {
                        // read viewModel.toolbarTitle.getValue()
                        viewModelToolbarTitleGetValue = viewModelToolbarTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.actionButtonVisibility
                        viewModelActionButtonVisibility = viewModel.getActionButtonVisibility();
                    }
                    updateLiveDataRegistration(6, viewModelActionButtonVisibility);


                    if (viewModelActionButtonVisibility != null) {
                        // read viewModel.actionButtonVisibility.getValue()
                        viewModelActionButtonVisibilityGetValue = viewModelActionButtonVisibility.getValue();
                    }
            }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.actionButtonAdapter
                        viewModelActionButtonAdapter = viewModel.getActionButtonAdapter();
                    }
                    updateLiveDataRegistration(7, viewModelActionButtonAdapter);


                    if (viewModelActionButtonAdapter != null) {
                        // read viewModel.actionButtonAdapter.getValue()
                        viewModelActionButtonAdapterGetValue = viewModelActionButtonAdapter.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.AppBarLayoutBindingAdaptersKt.setOnOffsetChangeListener(this.appBar, viewModel);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.ImageViewBindingAdaptersKt.srcAsync(this.appImage, viewModelToolbarIconGetValue);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            this.appPackageName.setVisibility(viewModelToolbarSubtitleVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.TextViewBindingAdaptersKt.setText(this.appPackageName, viewModelToolbarSubtitleGetValue);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            this.btnActions.setButtonBackgroundColour(viewModelAccentColorToColorIntContext);
            sk.styk.martin.apkanalyzer.util.bindingadapters.TabLayoutBindingAdaptersKt.setColor(this.tab, viewModelAccentColorToColorIntContext);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.btnActions.setContentCoverEnabled(true);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.navigationIconState(this.detailToolbar, sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState.ARROW);
            this.detailToolbar.setNavigationOnClickListener(mCallback39);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            this.btnActions.setShow(viewModelActionButtonVisibilityGetValue);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            this.btnActions.setSpeedDialMenuAdapter(viewModelActionButtonAdapterGetValue);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.setTitle(this.detailToolbar, viewModelToolbarTitleGetValue);
            sk.styk.martin.apkanalyzer.util.bindingadapters.CollapsingToolbarLayoutBindingAdaptersKt.setTitle(this.toolbarLayout, viewModelToolbarTitleGetValue);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            this.mboundView7.setDisplayedChild(androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue);
            this.tab.setVisibility(viewModelViewStateAppDetailFragmentViewModelKtDATASTATEViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel viewModel = mViewModel;
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
        flag 0 (0x1L): viewModel.accentColor
        flag 1 (0x2L): viewModel.toolbarSubtitleVisibility
        flag 2 (0x3L): viewModel.toolbarSubtitle
        flag 3 (0x4L): viewModel.viewState
        flag 4 (0x5L): viewModel.toolbarIcon
        flag 5 (0x6L): viewModel.toolbarTitle
        flag 6 (0x7L): viewModel.actionButtonVisibility
        flag 7 (0x8L): viewModel.actionButtonAdapter
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue()) == AppDetailFragmentViewModelKt.DATA_STATE ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue()) == AppDetailFragmentViewModelKt.DATA_STATE ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.toolbarSubtitleVisibility.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.toolbarSubtitleVisibility.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}
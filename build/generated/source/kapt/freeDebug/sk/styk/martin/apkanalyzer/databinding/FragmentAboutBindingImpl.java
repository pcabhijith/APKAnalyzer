package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAboutBindingImpl extends FragmentAboutBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 4);
        sViewsWithIds.put(R.id.logo, 5);
        sViewsWithIds.put(R.id.about_app_name, 6);
        sViewsWithIds.put(R.id.about_app_authors, 7);
        sViewsWithIds.put(R.id.about_app_github_link, 8);
        sViewsWithIds.put(R.id.about_app_privacy_policy, 9);
        sViewsWithIds.put(R.id.about_app_dependencies, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAboutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentAboutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , null
            , (android.widget.ImageView) bindings[5]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[1]
            );
        this.aboutAppRate.setTag(null);
        this.aboutAppVersion.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 2);
        mCallback40 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel ViewModel) {
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
        sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.aboutAppRate.setOnClickListener(mCallback41);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.aboutAppVersion, sk.styk.martin.apkanalyzer.BuildConfig.VERSION_NAME);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.navigationIconState(this.toolbar, sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState.HAMBURGER);
            this.toolbar.setNavigationOnClickListener(mCallback40);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onRateAppClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.onNavigationClick()
                kotlinx.coroutines.Job viewModelOnNavigationClick = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelOnNavigationClick = viewModel.onNavigationClick();
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
package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemProviderDetailBindingImpl extends ListItemProviderDetailBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toggleArrow, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnLongClickListener mCallback64;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemProviderDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemProviderDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            );
        this.activityName.setTag(null);
        this.activityPackageName.setTag(null);
        this.container.setTag(null);
        this.headerContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback64 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 1);
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
        java.lang.String viewModelPackageName = null;
        java.lang.String viewModelName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.packageName
                    viewModelPackageName = viewModel.getPackageName();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityName, viewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityPackageName, viewModelPackageName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.headerContainer.setOnLongClickListener(mCallback64);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.onTitleLongClick()
        boolean viewModelOnTitleLongClick = false;
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter.ProviderDataViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelOnTitleLongClick = viewModel.onTitleLongClick();
        }
        return viewModelOnTitleLongClick;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
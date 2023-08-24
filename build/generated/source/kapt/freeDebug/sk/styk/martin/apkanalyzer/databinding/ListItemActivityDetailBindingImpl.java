package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemActivityDetailBindingImpl extends ListItemActivityDetailBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toggleArrow, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnLongClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListItemActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            );
        this.activityName.setTag(null);
        this.activityPackageName.setTag(null);
        this.container.setTag(null);
        this.headerContainer.setTag(null);
        this.playArrow.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 1);
        mCallback2 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 2);
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
        java.lang.String viewModelPackageName = null;
        boolean viewModelRunButtonVisible = false;
        java.lang.String viewModelName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
        int viewModelRunButtonVisibleViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.packageName
                    viewModelPackageName = viewModel.getPackageName();
                    // read viewModel.runButtonVisible
                    viewModelRunButtonVisible = viewModel.getRunButtonVisible();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelRunButtonVisible) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewModel.runButtonVisible ? View.VISIBLE : View.GONE
                viewModelRunButtonVisibleViewVISIBLEViewGONE = ((viewModelRunButtonVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityName, viewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityPackageName, viewModelPackageName);
            this.playArrow.setVisibility(viewModelRunButtonVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.headerContainer.setOnLongClickListener(mCallback1);
            this.playArrow.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.onTitleLongClick()
        boolean viewModelOnTitleLongClick = false;
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelOnTitleLongClick = viewModel.onTitleLongClick();
        }
        return viewModelOnTitleLongClick;
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter.ActivityDataViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onRunClick();
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
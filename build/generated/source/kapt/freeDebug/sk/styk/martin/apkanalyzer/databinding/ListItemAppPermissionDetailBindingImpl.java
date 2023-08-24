package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemAppPermissionDetailBindingImpl extends ListItemAppPermissionDetailBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback35;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemAppPermissionDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListItemAppPermissionDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.activityName.setTag(null);
        this.activityPackageName.setTag(null);
        this.headerContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback36 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 2);
        mCallback35 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 1);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter.PermissionDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter.PermissionDataViewModel ViewModel) {
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
        java.lang.String viewModelCompleteName = null;
        java.lang.String viewModelSimpleName = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter.PermissionDataViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.completeName
                    viewModelCompleteName = viewModel.getCompleteName();
                    // read viewModel.simpleName
                    viewModelSimpleName = viewModel.getSimpleName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityName, viewModelSimpleName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityPackageName, viewModelCompleteName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.headerContainer.setOnLongClickListener(mCallback35);
            this.headerContainer.setOnClickListener(mCallback36);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter.PermissionDataViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.showDetail();
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.copyName()
        boolean viewModelCopyName = false;
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter.PermissionDataViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelCopyName = viewModel.copyName();
        }
        return viewModelCopyName;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
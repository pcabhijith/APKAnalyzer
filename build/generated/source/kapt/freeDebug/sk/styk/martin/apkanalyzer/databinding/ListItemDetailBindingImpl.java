package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemDetailBindingImpl extends ListItemDetailBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener.Listener, sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnLongClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListItemDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.attributeName.setTag(null);
        this.attributeValue.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new sk.styk.martin.apkanalyzer.generated.callback.OnLongClickListener(this, 2);
        mCallback42 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailItemViewModel ViewModel) {
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
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelInfoName = null;
        sk.styk.martin.apkanalyzer.util.TextInfo viewModelInfoValue = null;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailItemViewModel viewModel = mViewModel;
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailInfo viewModelInfo = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.info
                    viewModelInfo = viewModel.getInfo();
                }


                if (viewModelInfo != null) {
                    // read viewModel.info.name
                    viewModelInfoName = viewModelInfo.getName();
                    // read viewModel.info.value
                    viewModelInfoValue = viewModelInfo.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.util.bindingadapters.TextViewBindingAdaptersKt.setText(this.attributeName, viewModelInfoName);
            sk.styk.martin.apkanalyzer.util.bindingadapters.TextViewBindingAdaptersKt.setText(this.attributeValue, viewModelInfoValue);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback42);
            this.mboundView0.setOnLongClickListener(mCallback43);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.onLongClick()
        boolean viewModelOnLongClick = false;
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailItemViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelOnLongClick = viewModel.onLongClick();
        }
        return viewModelOnLongClick;
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter.DetailItemViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClick();
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
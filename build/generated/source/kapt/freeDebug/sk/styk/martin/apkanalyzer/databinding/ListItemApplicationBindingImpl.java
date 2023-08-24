package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemApplicationBindingImpl extends ListItemApplicationBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemApplicationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemApplicationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.applicationName.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.packageImg.setTag(null);
        this.packageName.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.data == variableId) {
            setData((sk.styk.martin.apkanalyzer.core.applist.model.LazyAppListData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable sk.styk.martin.apkanalyzer.core.applist.model.LazyAppListData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.String dataApplicationName = null;
        java.lang.String mboundView0AndroidStringTransitionAppNameDataPackageName = null;
        sk.styk.martin.apkanalyzer.core.applist.model.LazyAppListData data = mData;
        java.lang.String dataPackageName = null;
        android.graphics.drawable.Drawable dataIcon = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.applicationName
                    dataApplicationName = data.getApplicationName();
                    // read data.packageName
                    dataPackageName = data.getPackageName();
                    // read data.icon
                    dataIcon = data.getIcon();
                }


                // read @android:string/transition_app_name
                mboundView0AndroidStringTransitionAppNameDataPackageName = mboundView0.getResources().getString(R.string.transition_app_name, dataPackageName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.applicationName, dataApplicationName);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ImageViewBindingAdaptersKt.srcAsync(this.packageImg, dataIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.packageName, dataPackageName);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView0.setTransitionName(mboundView0AndroidStringTransitionAppNameDataPackageName);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
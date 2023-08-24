package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewMathStatisticsCardBindingImpl extends ViewMathStatisticsCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.itemTitle, 2);
        sViewsWithIds.put(R.id.toggleArrow, 3);
        sViewsWithIds.put(R.id.item_arithmetic_mean, 4);
        sViewsWithIds.put(R.id.item_median, 5);
        sViewsWithIds.put(R.id.item_max, 6);
        sViewsWithIds.put(R.id.item_min, 7);
        sViewsWithIds.put(R.id.item_variance, 8);
        sViewsWithIds.put(R.id.item_deviation, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewMathStatisticsCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ViewMathStatisticsCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[1]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[4]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[9]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[6]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[5]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[8]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            );
        this.expandableContainer.setTag(null);
        this.titleContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
package sk.styk.martin.apkanalyzer.databinding;
import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStatisticsBindingImpl extends FragmentStatisticsBinding implements sk.styk.martin.apkanalyzer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 31);
        sViewsWithIds.put(R.id.local_statistics_content, 32);
        sViewsWithIds.put(R.id.analysisResultsToggleArrow, 33);
        sViewsWithIds.put(R.id.minSdkToggleArrow, 34);
        sViewsWithIds.put(R.id.targetSdkToggleArrow, 35);
        sViewsWithIds.put(R.id.installLocationToggleArrow, 36);
        sViewsWithIds.put(R.id.signAlgorithmToggleArrow, 37);
        sViewsWithIds.put(R.id.appSourceToggleArrow, 38);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView15;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView16;
    @NonNull
    private final android.widget.LinearLayout mboundView18;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView19;
    @NonNull
    private final android.widget.ViewAnimator mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView21;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView22;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    private OnMarkerClickListenerImpl mViewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener;
    // Inverse Binding Event Handlers

    public FragmentStatisticsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 39, sIncludes, sViewsWithIds));
    }
    private FragmentStatisticsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17
            , (androidx.appcompat.widget.AppCompatImageView) bindings[33]
            , (com.google.android.material.appbar.AppBarLayout) bindings[31]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (sk.styk.martin.apkanalyzer.views.chart.MyBarChart) bindings[23]
            , (sk.styk.martin.apkanalyzer.views.chart.MyBarChart) bindings[17]
            , (sk.styk.martin.apkanalyzer.views.chart.MyBarChart) bindings[11]
            , (sk.styk.martin.apkanalyzer.views.chart.MyBarChart) bindings[20]
            , (sk.styk.martin.apkanalyzer.views.chart.MyBarChart) bindings[14]
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[36]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[7]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[6]
            , (sk.styk.martin.apkanalyzer.views.NewDetailListItemView) bindings[8]
            , (sk.styk.martin.apkanalyzer.views.LoadingBarView) bindings[3]
            , (android.widget.ScrollView) bindings[32]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[34]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[37]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[25]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[24]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[30]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[27]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[28]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[26]
            , (sk.styk.martin.apkanalyzer.views.ExpandableMathStatisticsView) bindings[29]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[35]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[1]
            );
        this.chartAppSource.setTag(null);
        this.chartInstallLocation.setTag(null);
        this.chartMinSdk.setTag(null);
        this.chartSignAlgorithm.setTag(null);
        this.chartTargetSdk.setTag(null);
        this.expandableContainer.setTag(null);
        this.itemAnalyzeFailed.setTag(null);
        this.itemAnalyzeSuccess.setTag(null);
        this.itemSystemApps.setTag(null);
        this.loadingBar.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (android.widget.LinearLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView18 = (android.widget.LinearLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.ViewAnimator) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (android.widget.LinearLayout) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.statisticsActivities.setTag(null);
        this.statisticsApkSize.setTag(null);
        this.statisticsDefinedPermissions.setTag(null);
        this.statisticsProviders.setTag(null);
        this.statisticsReceivers.setTag(null);
        this.statisticsServices.setTag(null);
        this.statisticsUsedPermissions.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback55 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 12);
        mCallback56 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 13);
        mCallback44 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 1);
        mCallback49 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 6);
        mCallback52 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 9);
        mCallback54 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 11);
        mCallback53 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 10);
        mCallback47 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 4);
        mCallback59 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 16);
        mCallback50 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 7);
        mCallback48 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 5);
        mCallback51 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 8);
        mCallback45 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 2);
        mCallback57 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 14);
        mCallback58 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 15);
        mCallback46 = new sk.styk.martin.apkanalyzer.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
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
            setViewModel((sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSignAlgorithmExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelTargetSdkExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelServicesExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelProvidersExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelUsedPermissionsExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelAppSizeExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelReceiversExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelAppSourceExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelDefinedPermissionsExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelViewState((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 10 :
                return onChangeViewModelStatisticData((androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.StatisticsDataWithCharts>) object, fieldId);
            case 11 :
                return onChangeViewModelLoadingProgressMax((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 12 :
                return onChangeViewModelActivitiesExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeViewModelMinSdkExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelLoadingProgress((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 15 :
                return onChangeViewModelAnalysisResultsExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 16 :
                return onChangeViewModelInstallLocationExpanded((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSignAlgorithmExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelSignAlgorithmExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTargetSdkExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelTargetSdkExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelServicesExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelServicesExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProvidersExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelProvidersExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsedPermissionsExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelUsedPermissionsExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAppSizeExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelAppSizeExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReceiversExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelReceiversExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAppSourceExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelAppSourceExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefinedPermissionsExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelDefinedPermissionsExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelViewState(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelViewState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatisticData(androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.StatisticsDataWithCharts> ViewModelStatisticData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingProgressMax(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelLoadingProgressMax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelActivitiesExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelActivitiesExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMinSdkExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelMinSdkExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingProgress(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelLoadingProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAnalysisResultsExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelAnalysisResultsExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInstallLocationExpanded(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelInstallLocationExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
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
        com.github.mikephil.charting.data.BarData viewModelStatisticDataInstallLocationChartDataData = null;
        java.lang.Boolean viewModelActivitiesExpandedGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelSignAlgorithmExpanded = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelTargetSdkExpanded = null;
        java.lang.Boolean viewModelReceiversExpandedGetValue = null;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.StatisticsDataWithCharts viewModelStatisticDataGetValue = null;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.BarDataHolder viewModelStatisticDataTargetSdkChartData = null;
        com.github.mikephil.charting.formatter.IAxisValueFormatter viewModelStatisticDataTargetSdkChartDataValueFormatter = null;
        java.lang.Boolean viewModelInstallLocationExpandedGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelServicesExpanded = null;
        java.lang.Boolean viewModelAppSizeExpandedGetValue = null;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.BarDataHolder viewModelStatisticDataAppSourceChartData = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAnalysisResultsExpandedGetValue = false;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.PercentagePair viewModelStatisticDataStatisticsDataAnalyzeFailed = null;
        com.github.mikephil.charting.data.BarData viewModelStatisticDataMinSdkChartDataData = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelProvidersExpanded = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelUsedPermissionsExpanded = null;
        java.lang.Boolean viewModelProvidersExpandedGetValue = null;
        com.github.mikephil.charting.formatter.IAxisValueFormatter viewModelStatisticDataAppSourceChartDataValueFormatter = null;
        java.lang.Integer viewModelLoadingProgressGetValue = null;
        java.lang.Boolean viewModelServicesExpandedGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelAppSizeExpanded = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataActivities = null;
        com.github.mikephil.charting.data.BarData viewModelStatisticDataSignAlgorithChartDataData = null;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.BarDataHolder viewModelStatisticDataSignAlgorithChartData = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelReceiversExpanded = null;
        com.github.mikephil.charting.formatter.IAxisValueFormatter viewModelStatisticDataMinSdkChartDataValueFormatter = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelReceiversExpandedGetValue = false;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataDefinedPermissions = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAppSizeExpandedGetValue = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelProvidersExpandedGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelAppSourceExpanded = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelInstallLocationExpandedGetValue = false;
        java.lang.Boolean viewModelTargetSdkExpandedGetValue = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.PercentagePair viewModelStatisticDataStatisticsDataAnalyzeSuccess = null;
        sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelDefinedPermissionsExpanded = null;
        com.github.mikephil.charting.data.BarData viewModelStatisticDataAppSourceChartDataData = null;
        com.github.mikephil.charting.formatter.IAxisValueFormatter viewModelStatisticDataInstallLocationChartDataValueFormatter = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelServicesExpandedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelMinSdkExpandedGetValue = false;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.BarDataHolder viewModelStatisticDataInstallLocationChartData = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelViewState = null;
        java.lang.Boolean viewModelSignAlgorithmExpandedGetValue = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataUsedPermissions = null;
        com.github.mikephil.charting.formatter.IAxisValueFormatter viewModelStatisticDataSignAlgorithChartDataValueFormatter = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.StatisticsData viewModelStatisticDataStatisticsData = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataReceivers = null;
        androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.StatisticsDataWithCharts> viewModelStatisticData = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelUsedPermissionsExpandedGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelLoadingProgressMax = null;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel.BarDataHolder viewModelStatisticDataMinSdkChartData = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelActivitiesExpanded = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataServices = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAppSourceExpandedGetValue = false;
        java.lang.Boolean viewModelUsedPermissionsExpandedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDefinedPermissionsExpandedGetValue = false;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.PercentagePair viewModelStatisticDataStatisticsDataSystemApps = null;
        java.lang.Integer viewModelViewStateGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelMinSdkExpanded = null;
        java.lang.Boolean viewModelAnalysisResultsExpandedGetValue = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataProviders = null;
        java.lang.Boolean viewModelMinSdkExpandedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelActivitiesExpandedGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelLoadingProgress = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelAnalysisResultsExpanded = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelInstallLocationExpanded = null;
        sk.styk.martin.apkanalyzer.core.appstatistics.model.MathStatistics viewModelStatisticDataStatisticsDataApkSize = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelTargetSdkExpandedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSignAlgorithmExpandedGetValue = false;
        java.lang.Boolean viewModelAppSourceExpandedGetValue = null;
        java.lang.Integer viewModelLoadingProgressMaxGetValue = null;
        java.lang.Boolean viewModelDefinedPermissionsExpandedGetValue = null;
        com.github.mikephil.charting.data.BarData viewModelStatisticDataTargetSdkChartDataData = null;
        sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7ffffL) != 0) {


            if ((dirtyFlags & 0x60001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.signAlgorithmExpanded
                        viewModelSignAlgorithmExpanded = viewModel.getSignAlgorithmExpanded();
                    }
                    updateLiveDataRegistration(0, viewModelSignAlgorithmExpanded);


                    if (viewModelSignAlgorithmExpanded != null) {
                        // read viewModel.signAlgorithmExpanded.getValue()
                        viewModelSignAlgorithmExpandedGetValue = viewModelSignAlgorithmExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.signAlgorithmExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSignAlgorithmExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSignAlgorithmExpandedGetValue);
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.targetSdkExpanded
                        viewModelTargetSdkExpanded = viewModel.getTargetSdkExpanded();
                    }
                    updateLiveDataRegistration(1, viewModelTargetSdkExpanded);


                    if (viewModelTargetSdkExpanded != null) {
                        // read viewModel.targetSdkExpanded.getValue()
                        viewModelTargetSdkExpandedGetValue = viewModelTargetSdkExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.targetSdkExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelTargetSdkExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTargetSdkExpandedGetValue);
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.servicesExpanded
                        viewModelServicesExpanded = viewModel.getServicesExpanded();
                    }
                    updateLiveDataRegistration(2, viewModelServicesExpanded);


                    if (viewModelServicesExpanded != null) {
                        // read viewModel.servicesExpanded.getValue()
                        viewModelServicesExpandedGetValue = viewModelServicesExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.servicesExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelServicesExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelServicesExpandedGetValue);
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.providersExpanded
                        viewModelProvidersExpanded = viewModel.getProvidersExpanded();
                    }
                    updateLiveDataRegistration(3, viewModelProvidersExpanded);


                    if (viewModelProvidersExpanded != null) {
                        // read viewModel.providersExpanded.getValue()
                        viewModelProvidersExpandedGetValue = viewModelProvidersExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.providersExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelProvidersExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelProvidersExpandedGetValue);
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.usedPermissionsExpanded
                        viewModelUsedPermissionsExpanded = viewModel.getUsedPermissionsExpanded();
                    }
                    updateLiveDataRegistration(4, viewModelUsedPermissionsExpanded);


                    if (viewModelUsedPermissionsExpanded != null) {
                        // read viewModel.usedPermissionsExpanded.getValue()
                        viewModelUsedPermissionsExpandedGetValue = viewModelUsedPermissionsExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.usedPermissionsExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelUsedPermissionsExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelUsedPermissionsExpandedGetValue);
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.appSizeExpanded
                        viewModelAppSizeExpanded = viewModel.getAppSizeExpanded();
                    }
                    updateLiveDataRegistration(5, viewModelAppSizeExpanded);


                    if (viewModelAppSizeExpanded != null) {
                        // read viewModel.appSizeExpanded.getValue()
                        viewModelAppSizeExpandedGetValue = viewModelAppSizeExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appSizeExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAppSizeExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAppSizeExpandedGetValue);
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.receiversExpanded
                        viewModelReceiversExpanded = viewModel.getReceiversExpanded();
                    }
                    updateLiveDataRegistration(6, viewModelReceiversExpanded);


                    if (viewModelReceiversExpanded != null) {
                        // read viewModel.receiversExpanded.getValue()
                        viewModelReceiversExpandedGetValue = viewModelReceiversExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.receiversExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelReceiversExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelReceiversExpandedGetValue);
            }
            if ((dirtyFlags & 0x60080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.appSourceExpanded
                        viewModelAppSourceExpanded = viewModel.getAppSourceExpanded();
                    }
                    updateLiveDataRegistration(7, viewModelAppSourceExpanded);


                    if (viewModelAppSourceExpanded != null) {
                        // read viewModel.appSourceExpanded.getValue()
                        viewModelAppSourceExpandedGetValue = viewModelAppSourceExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appSourceExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAppSourceExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAppSourceExpandedGetValue);
            }
            if ((dirtyFlags & 0x60000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onChartMarkerClick
                        viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener = (((mViewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener == null) ? (mViewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener = new OnMarkerClickListenerImpl()) : mViewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x60100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.definedPermissionsExpanded
                        viewModelDefinedPermissionsExpanded = viewModel.getDefinedPermissionsExpanded();
                    }
                    updateLiveDataRegistration(8, viewModelDefinedPermissionsExpanded);


                    if (viewModelDefinedPermissionsExpanded != null) {
                        // read viewModel.definedPermissionsExpanded.getValue()
                        viewModelDefinedPermissionsExpandedGetValue = viewModelDefinedPermissionsExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.definedPermissionsExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDefinedPermissionsExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDefinedPermissionsExpandedGetValue);
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.viewState
                        viewModelViewState = viewModel.getViewState();
                    }
                    updateLiveDataRegistration(9, viewModelViewState);


                    if (viewModelViewState != null) {
                        // read viewModel.viewState.getValue()
                        viewModelViewStateGetValue = viewModelViewState.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.viewState.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelViewStateGetValue);
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.statisticData
                        viewModelStatisticData = viewModel.getStatisticData();
                    }
                    updateLiveDataRegistration(10, viewModelStatisticData);


                    if (viewModelStatisticData != null) {
                        // read viewModel.statisticData.getValue()
                        viewModelStatisticDataGetValue = viewModelStatisticData.getValue();
                    }


                    if (viewModelStatisticDataGetValue != null) {
                        // read viewModel.statisticData.getValue().targetSdkChartData
                        viewModelStatisticDataTargetSdkChartData = viewModelStatisticDataGetValue.getTargetSdkChartData();
                        // read viewModel.statisticData.getValue().appSourceChartData
                        viewModelStatisticDataAppSourceChartData = viewModelStatisticDataGetValue.getAppSourceChartData();
                        // read viewModel.statisticData.getValue().signAlgorithChartData
                        viewModelStatisticDataSignAlgorithChartData = viewModelStatisticDataGetValue.getSignAlgorithChartData();
                        // read viewModel.statisticData.getValue().installLocationChartData
                        viewModelStatisticDataInstallLocationChartData = viewModelStatisticDataGetValue.getInstallLocationChartData();
                        // read viewModel.statisticData.getValue().statisticsData
                        viewModelStatisticDataStatisticsData = viewModelStatisticDataGetValue.getStatisticsData();
                        // read viewModel.statisticData.getValue().minSdkChartData
                        viewModelStatisticDataMinSdkChartData = viewModelStatisticDataGetValue.getMinSdkChartData();
                    }


                    if (viewModelStatisticDataTargetSdkChartData != null) {
                        // read viewModel.statisticData.getValue().targetSdkChartData.valueFormatter
                        viewModelStatisticDataTargetSdkChartDataValueFormatter = viewModelStatisticDataTargetSdkChartData.getValueFormatter();
                        // read viewModel.statisticData.getValue().targetSdkChartData.data
                        viewModelStatisticDataTargetSdkChartDataData = viewModelStatisticDataTargetSdkChartData.getData();
                    }
                    if (viewModelStatisticDataAppSourceChartData != null) {
                        // read viewModel.statisticData.getValue().appSourceChartData.valueFormatter
                        viewModelStatisticDataAppSourceChartDataValueFormatter = viewModelStatisticDataAppSourceChartData.getValueFormatter();
                        // read viewModel.statisticData.getValue().appSourceChartData.data
                        viewModelStatisticDataAppSourceChartDataData = viewModelStatisticDataAppSourceChartData.getData();
                    }
                    if (viewModelStatisticDataSignAlgorithChartData != null) {
                        // read viewModel.statisticData.getValue().signAlgorithChartData.data
                        viewModelStatisticDataSignAlgorithChartDataData = viewModelStatisticDataSignAlgorithChartData.getData();
                        // read viewModel.statisticData.getValue().signAlgorithChartData.valueFormatter
                        viewModelStatisticDataSignAlgorithChartDataValueFormatter = viewModelStatisticDataSignAlgorithChartData.getValueFormatter();
                    }
                    if (viewModelStatisticDataInstallLocationChartData != null) {
                        // read viewModel.statisticData.getValue().installLocationChartData.data
                        viewModelStatisticDataInstallLocationChartDataData = viewModelStatisticDataInstallLocationChartData.getData();
                        // read viewModel.statisticData.getValue().installLocationChartData.valueFormatter
                        viewModelStatisticDataInstallLocationChartDataValueFormatter = viewModelStatisticDataInstallLocationChartData.getValueFormatter();
                    }
                    if (viewModelStatisticDataStatisticsData != null) {
                        // read viewModel.statisticData.getValue().statisticsData.analyzeFailed
                        viewModelStatisticDataStatisticsDataAnalyzeFailed = viewModelStatisticDataStatisticsData.getAnalyzeFailed();
                        // read viewModel.statisticData.getValue().statisticsData.activities
                        viewModelStatisticDataStatisticsDataActivities = viewModelStatisticDataStatisticsData.getActivities();
                        // read viewModel.statisticData.getValue().statisticsData.definedPermissions
                        viewModelStatisticDataStatisticsDataDefinedPermissions = viewModelStatisticDataStatisticsData.getDefinedPermissions();
                        // read viewModel.statisticData.getValue().statisticsData.analyzeSuccess
                        viewModelStatisticDataStatisticsDataAnalyzeSuccess = viewModelStatisticDataStatisticsData.getAnalyzeSuccess();
                        // read viewModel.statisticData.getValue().statisticsData.usedPermissions
                        viewModelStatisticDataStatisticsDataUsedPermissions = viewModelStatisticDataStatisticsData.getUsedPermissions();
                        // read viewModel.statisticData.getValue().statisticsData.receivers
                        viewModelStatisticDataStatisticsDataReceivers = viewModelStatisticDataStatisticsData.getReceivers();
                        // read viewModel.statisticData.getValue().statisticsData.services
                        viewModelStatisticDataStatisticsDataServices = viewModelStatisticDataStatisticsData.getServices();
                        // read viewModel.statisticData.getValue().statisticsData.systemApps
                        viewModelStatisticDataStatisticsDataSystemApps = viewModelStatisticDataStatisticsData.getSystemApps();
                        // read viewModel.statisticData.getValue().statisticsData.providers
                        viewModelStatisticDataStatisticsDataProviders = viewModelStatisticDataStatisticsData.getProviders();
                        // read viewModel.statisticData.getValue().statisticsData.apkSize
                        viewModelStatisticDataStatisticsDataApkSize = viewModelStatisticDataStatisticsData.getApkSize();
                    }
                    if (viewModelStatisticDataMinSdkChartData != null) {
                        // read viewModel.statisticData.getValue().minSdkChartData.data
                        viewModelStatisticDataMinSdkChartDataData = viewModelStatisticDataMinSdkChartData.getData();
                        // read viewModel.statisticData.getValue().minSdkChartData.valueFormatter
                        viewModelStatisticDataMinSdkChartDataValueFormatter = viewModelStatisticDataMinSdkChartData.getValueFormatter();
                    }
            }
            if ((dirtyFlags & 0x64800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingProgressMax
                        viewModelLoadingProgressMax = viewModel.getLoadingProgressMax();
                        // read viewModel.loadingProgress
                        viewModelLoadingProgress = viewModel.getLoadingProgress();
                    }
                    updateLiveDataRegistration(11, viewModelLoadingProgressMax);
                    updateLiveDataRegistration(14, viewModelLoadingProgress);


                    if (viewModelLoadingProgressMax != null) {
                        // read viewModel.loadingProgressMax.getValue()
                        viewModelLoadingProgressMaxGetValue = viewModelLoadingProgressMax.getValue();
                    }
                    if (viewModelLoadingProgress != null) {
                        // read viewModel.loadingProgress.getValue()
                        viewModelLoadingProgressGetValue = viewModelLoadingProgress.getValue();
                    }
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.activitiesExpanded
                        viewModelActivitiesExpanded = viewModel.getActivitiesExpanded();
                    }
                    updateLiveDataRegistration(12, viewModelActivitiesExpanded);


                    if (viewModelActivitiesExpanded != null) {
                        // read viewModel.activitiesExpanded.getValue()
                        viewModelActivitiesExpandedGetValue = viewModelActivitiesExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.activitiesExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelActivitiesExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelActivitiesExpandedGetValue);
            }
            if ((dirtyFlags & 0x62000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.minSdkExpanded
                        viewModelMinSdkExpanded = viewModel.getMinSdkExpanded();
                    }
                    updateLiveDataRegistration(13, viewModelMinSdkExpanded);


                    if (viewModelMinSdkExpanded != null) {
                        // read viewModel.minSdkExpanded.getValue()
                        viewModelMinSdkExpandedGetValue = viewModelMinSdkExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.minSdkExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelMinSdkExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelMinSdkExpandedGetValue);
            }
            if ((dirtyFlags & 0x68000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.analysisResultsExpanded
                        viewModelAnalysisResultsExpanded = viewModel.getAnalysisResultsExpanded();
                    }
                    updateLiveDataRegistration(15, viewModelAnalysisResultsExpanded);


                    if (viewModelAnalysisResultsExpanded != null) {
                        // read viewModel.analysisResultsExpanded.getValue()
                        viewModelAnalysisResultsExpandedGetValue = viewModelAnalysisResultsExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.analysisResultsExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAnalysisResultsExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAnalysisResultsExpandedGetValue);
            }
            if ((dirtyFlags & 0x70000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.installLocationExpanded
                        viewModelInstallLocationExpanded = viewModel.getInstallLocationExpanded();
                    }
                    updateLiveDataRegistration(16, viewModelInstallLocationExpanded);


                    if (viewModelInstallLocationExpanded != null) {
                        // read viewModel.installLocationExpanded.getValue()
                        viewModelInstallLocationExpandedGetValue = viewModelInstallLocationExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.installLocationExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelInstallLocationExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelInstallLocationExpandedGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            this.chartAppSource.setData(viewModelStatisticDataAppSourceChartDataData);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ChartsBindingAdaptersKt.xAxisValueFormatter(this.chartAppSource, viewModelStatisticDataAppSourceChartDataValueFormatter);
            this.chartInstallLocation.setData(viewModelStatisticDataInstallLocationChartDataData);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ChartsBindingAdaptersKt.xAxisValueFormatter(this.chartInstallLocation, viewModelStatisticDataInstallLocationChartDataValueFormatter);
            this.chartMinSdk.setData(viewModelStatisticDataMinSdkChartDataData);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ChartsBindingAdaptersKt.xAxisValueFormatter(this.chartMinSdk, viewModelStatisticDataMinSdkChartDataValueFormatter);
            this.chartSignAlgorithm.setData(viewModelStatisticDataSignAlgorithChartDataData);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ChartsBindingAdaptersKt.xAxisValueFormatter(this.chartSignAlgorithm, viewModelStatisticDataSignAlgorithChartDataValueFormatter);
            this.chartTargetSdk.setData(viewModelStatisticDataTargetSdkChartDataData);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ChartsBindingAdaptersKt.xAxisValueFormatter(this.chartTargetSdk, viewModelStatisticDataTargetSdkChartDataValueFormatter);
            this.itemAnalyzeFailed.setValueText(viewModelStatisticDataStatisticsDataAnalyzeFailed);
            this.itemAnalyzeSuccess.setValueText(viewModelStatisticDataStatisticsDataAnalyzeSuccess);
            this.itemSystemApps.setValueText(viewModelStatisticDataStatisticsDataSystemApps);
            this.statisticsActivities.setStatistics(viewModelStatisticDataStatisticsDataActivities);
            this.statisticsApkSize.setStatistics(viewModelStatisticDataStatisticsDataApkSize);
            this.statisticsDefinedPermissions.setStatistics(viewModelStatisticDataStatisticsDataDefinedPermissions);
            this.statisticsProviders.setStatistics(viewModelStatisticDataStatisticsDataProviders);
            this.statisticsReceivers.setStatistics(viewModelStatisticDataStatisticsDataReceivers);
            this.statisticsServices.setStatistics(viewModelStatisticDataStatisticsDataServices);
            this.statisticsUsedPermissions.setStatistics(viewModelStatisticDataStatisticsDataUsedPermissions);
        }
        if ((dirtyFlags & 0x60000L) != 0) {
            // api target 1

            this.chartAppSource.setOnMarkerClickListener(viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener);
            this.chartInstallLocation.setOnMarkerClickListener(viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener);
            this.chartMinSdk.setOnMarkerClickListener(viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener);
            this.chartSignAlgorithm.setOnMarkerClickListener(viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener);
            this.chartTargetSdk.setOnMarkerClickListener(viewModelOnChartMarkerClickSkStykMartinApkanalyzerViewsChartClickableMarkerViewOnMarkerClickListener);
            this.toolbar.setOnMenuItemClickListener(viewModel);
        }
        if ((dirtyFlags & 0x62000L) != 0) {
            // api target 1

            this.expandableContainer.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelMinSdkExpandedGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            this.itemAnalyzeFailed.setOnClickListener(mCallback47);
            this.itemAnalyzeSuccess.setOnClickListener(mCallback46);
            this.mboundView12.setOnClickListener(mCallback49);
            this.mboundView15.setOnClickListener(mCallback50);
            this.mboundView18.setOnClickListener(mCallback51);
            this.mboundView21.setOnClickListener(mCallback52);
            this.mboundView4.setOnClickListener(mCallback45);
            this.mboundView9.setOnClickListener(mCallback48);
            this.statisticsActivities.setExpandListener(mCallback54);
            this.statisticsApkSize.setExpandListener(mCallback53);
            this.statisticsDefinedPermissions.setExpandListener(mCallback59);
            this.statisticsProviders.setExpandListener(mCallback56);
            this.statisticsReceivers.setExpandListener(mCallback57);
            this.statisticsServices.setExpandListener(mCallback55);
            this.statisticsUsedPermissions.setExpandListener(mCallback58);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.inflateMenu(this.toolbar, sk.styk.martin.apkanalyzer.R.menu.statistics);
            sk.styk.martin.apkanalyzer.util.bindingadapters.ToolbarBindingAdaptersKt.navigationIconState(this.toolbar, sk.styk.martin.apkanalyzer.views.toolbar.NavigationIconState.HAMBURGER);
            this.toolbar.setNavigationOnClickListener(mCallback44);
        }
        if ((dirtyFlags & 0x64800L) != 0) {
            // api target 1

            sk.styk.martin.apkanalyzer.views.LoadingBarViewKt.setProgress(this.loadingBar, viewModelLoadingProgressGetValue, viewModelLoadingProgressMaxGetValue);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            this.mboundView13.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelTargetSdkExpandedGetValue);
        }
        if ((dirtyFlags & 0x70000L) != 0) {
            // api target 1

            this.mboundView16.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelInstallLocationExpandedGetValue);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            this.mboundView19.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelSignAlgorithmExpandedGetValue);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            this.mboundView2.setDisplayedChild(androidxDatabindingViewDataBindingSafeUnboxViewModelViewStateGetValue);
        }
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            this.mboundView22.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelAppSourceExpandedGetValue);
        }
        if ((dirtyFlags & 0x68000L) != 0) {
            // api target 1

            this.mboundView5.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelAnalysisResultsExpandedGetValue);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            this.statisticsActivities.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelActivitiesExpandedGetValue);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            this.statisticsApkSize.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelAppSizeExpandedGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            this.statisticsDefinedPermissions.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelDefinedPermissionsExpandedGetValue);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            this.statisticsProviders.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelProvidersExpandedGetValue);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            this.statisticsReceivers.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelReceiversExpandedGetValue);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            this.statisticsServices.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelServicesExpandedGetValue);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            this.statisticsUsedPermissions.setExpanded(androidxDatabindingViewDataBindingSafeUnboxViewModelUsedPermissionsExpandedGetValue);
        }
    }
    // Listener Stub Implementations
    public static class OnMarkerClickListenerImpl implements sk.styk.martin.apkanalyzer.views.chart.ClickableMarkerView.OnMarkerClickListener{
        private sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel value;
        public OnMarkerClickListenerImpl setValue(sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onMarkerClick(com.github.mikephil.charting.data.Entry arg0) {
            this.value.onChartMarkerClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 12: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleServicesExpanded();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleProvidersExpanded();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.onNavigationClick()
                kotlinx.coroutines.Job viewModelOnNavigationClick = null;
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelOnNavigationClick = viewModel.onNavigationClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleTargetSdkExpanded();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleAppSourceExpanded();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleActivitiesExpanded();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleAppSizeExpanded();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.showDetail(itemAnalyzeFailed.getResources().getString(R.string.analyze_results_failed), itemAnalyzeFailed.getResources().getString(R.string.analyze_results_failed_description));
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleDefinedPermissionsExpanded();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleInstallLocationExpanded();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleMinSdkExpanded();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleSignAlgorithmExpanded();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleAnalysisResultExpanded();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleReceiversExpanded();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleUsedPermissionsExpanded();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.showDetail(itemAnalyzeSuccess.getResources().getString(R.string.analyze_results_success), itemAnalyzeSuccess.getResources().getString(R.string.analyze_results_success_description));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.signAlgorithmExpanded
        flag 1 (0x2L): viewModel.targetSdkExpanded
        flag 2 (0x3L): viewModel.servicesExpanded
        flag 3 (0x4L): viewModel.providersExpanded
        flag 4 (0x5L): viewModel.usedPermissionsExpanded
        flag 5 (0x6L): viewModel.appSizeExpanded
        flag 6 (0x7L): viewModel.receiversExpanded
        flag 7 (0x8L): viewModel.appSourceExpanded
        flag 8 (0x9L): viewModel.definedPermissionsExpanded
        flag 9 (0xaL): viewModel.viewState
        flag 10 (0xbL): viewModel.statisticData
        flag 11 (0xcL): viewModel.loadingProgressMax
        flag 12 (0xdL): viewModel.activitiesExpanded
        flag 13 (0xeL): viewModel.minSdkExpanded
        flag 14 (0xfL): viewModel.loadingProgress
        flag 15 (0x10L): viewModel.analysisResultsExpanded
        flag 16 (0x11L): viewModel.installLocationExpanded
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): null
    flag mapping end*/
    //end
}
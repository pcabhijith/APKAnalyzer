package sk.styk.martin.apkanalyzer.ui.appdetail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001uBi\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\b\u0010a\u001a\u000203H\u0002J\b\u0010b\u001a\u00020cH\u0002J\b\u0010d\u001a\u000203H\u0002J\b\u0010e\u001a\u000203H\u0014J\u0010\u0010f\u001a\u0002032\u0006\u0010g\u001a\u00020hH\u0016J\u0006\u0010i\u001a\u000203J\u0018\u0010j\u001a\u0002032\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020^H\u0016J\u0010\u0010n\u001a\u0002032\u0006\u0010o\u001a\u00020EH\u0002J\b\u0010p\u001a\u000203H\u0002J\u0019\u0010q\u001a\u0002032\u0006\u0010r\u001a\u00020/H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010sJ\b\u0010t\u001a\u000203H\u0002R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001f0\u001f0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010)0)0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020/0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020306X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020908\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020=06X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010!R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020A06X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010!R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020E06X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020A0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010!R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020A06X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010!R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020L06X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010!R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020P06X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010!R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010!R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020)0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010!R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020W0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010!R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010!R\u001c\u0010`\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010^0^0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006v"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "appDetailRequest", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailRequest;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "appDetailDataManager", "Lsk/styk/martin/apkanalyzer/core/appanalysis/AppDetailDataManager;", "resourcesManager", "Lsk/styk/martin/apkanalyzer/core/common/resources/ResourcesManager;", "permissionManager", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;", "appActionsAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppActionsSpeedMenuAdapter;", "drawableSaveManager", "Lsk/styk/martin/apkanalyzer/manager/file/DrawableSaveManager;", "notificationManager", "Lsk/styk/martin/apkanalyzer/manager/notification/NotificationManager;", "apkSaveManager", "Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager;", "fileManager", "Lsk/styk/martin/apkanalyzer/manager/file/FileManager;", "activityColorThemeManager", "Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;", "analyticsTracker", "Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailRequest;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;Lsk/styk/martin/apkanalyzer/core/appanalysis/AppDetailDataManager;Lsk/styk/martin/apkanalyzer/core/common/resources/ResourcesManager;Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;Lsk/styk/martin/apkanalyzer/ui/appdetail/AppActionsSpeedMenuAdapter;Lsk/styk/martin/apkanalyzer/manager/file/DrawableSaveManager;Lsk/styk/martin/apkanalyzer/manager/notification/NotificationManager;Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager;Lsk/styk/martin/apkanalyzer/manager/file/FileManager;Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker;)V", "accentColor", "Landroidx/lifecycle/LiveData;", "Lsk/styk/martin/apkanalyzer/core/uilibrary/ColorInfo;", "getAccentColor", "()Landroidx/lifecycle/LiveData;", "accentColorLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "actionButtonAdapter", "getActionButtonAdapter", "actionButtonAdapterLiveData", "actionButtonVisibility", "", "getActionButtonVisibility", "actionButtonVisibilityLiveData", "getAppDetailRequest", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailRequest;", "appDetails", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "getAppDetails", "appDetailsLiveData", "close", "", "getClose", "closeEvent", "Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "exportFilePickerResult", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResult;", "getExportFilePickerResult", "()Landroidx/activity/result/ActivityResultCallback;", "openExportFilePicker", "Lsk/styk/martin/apkanalyzer/util/OutputFilePickerRequest;", "getOpenExportFilePicker", "openExportFilePickerEvent", "openGooglePlay", "", "getOpenGooglePlay", "openGooglePlayEvent", "openImage", "Landroid/net/Uri;", "getOpenImage", "openImageEvent", "openSystemInfo", "getOpenSystemInfo", "openSystemInfoEvent", "showManifest", "Lsk/styk/martin/apkanalyzer/ui/manifest/ManifestRequest;", "getShowManifest", "showManifestEvent", "showSnack", "Lsk/styk/martin/apkanalyzer/util/components/SnackBarComponent;", "getShowSnack", "showSnackEvent", "toolbarIcon", "Landroid/graphics/drawable/Drawable;", "getToolbarIcon", "toolbarSubtitle", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "getToolbarSubtitle", "toolbarSubtitleVisibility", "getToolbarSubtitleVisibility", "toolbarTitle", "getToolbarTitle", "viewState", "", "getViewState", "viewStateLiveData", "exportAppFileSelection", "loadDetail", "Lkotlinx/coroutines/Job;", "observeApkActions", "onCleared", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onNavigationClick", "onOffsetChanged", "bar", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "saveApk", "targetUri", "saveImage", "setupToolbar", "detail", "(Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateActionButtonAdapter", "Factory", "app_freeDebug"})
public final class AppDetailFragmentViewModel extends androidx.lifecycle.ViewModel implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailRequest appDetailRequest = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.appanalysis.AppDetailDataManager appDetailDataManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager resourcesManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.permission.PermissionManager permissionManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter appActionsAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.file.DrawableSaveManager drawableSaveManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.notification.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager apkSaveManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.file.FileManager fileManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager activityColorThemeManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker analyticsTracker = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData> appDetailsLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData> appDetails = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> actionButtonVisibilityLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> actionButtonVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter> actionButtonAdapterLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter> actionButtonAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.components.SnackBarComponent> showSnackEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.SnackBarComponent> showSnack = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<kotlin.Unit> closeEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<kotlin.Unit> close = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<android.net.Uri> openImageEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<android.net.Uri> openImage = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.util.OutputFilePickerRequest> openExportFilePickerEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.OutputFilePickerRequest> openExportFilePicker = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<sk.styk.martin.apkanalyzer.ui.manifest.ManifestRequest> showManifestEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.manifest.ManifestRequest> showManifest = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<java.lang.String> openGooglePlayEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> openGooglePlay = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent<java.lang.String> openSystemInfoEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> openSystemInfo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> toolbarTitle = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> toolbarSubtitle = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> toolbarSubtitleVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo> accentColorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo> accentColor = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<android.graphics.drawable.Drawable> toolbarIcon = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultCallback<androidx.activity.result.ActivityResult> exportFilePickerResult = null;
    
    @dagger.assisted.AssistedInject
    public AppDetailFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailRequest appDetailRequest, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appanalysis.AppDetailDataManager appDetailDataManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager resourcesManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.permission.PermissionManager permissionManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter appActionsAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.file.DrawableSaveManager drawableSaveManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.notification.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager apkSaveManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.file.FileManager fileManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager activityColorThemeManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker analyticsTracker) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailRequest getAppDetailRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData> getAppDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getActionButtonVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter> getActionButtonAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.components.SnackBarComponent> getShowSnack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Unit> getClose() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<android.net.Uri> getOpenImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.OutputFilePickerRequest> getOpenExportFilePicker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.ui.manifest.ManifestRequest> getShowManifest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getOpenGooglePlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getOpenSystemInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> getToolbarTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.util.TextInfo> getToolbarSubtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getToolbarSubtitleVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<sk.styk.martin.apkanalyzer.core.uilibrary.ColorInfo> getAccentColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<android.graphics.drawable.Drawable> getToolbarIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultCallback<androidx.activity.result.ActivityResult> getExportFilePickerResult() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    private final kotlinx.coroutines.Job loadDetail() {
        return null;
    }
    
    private final java.lang.Object setupToolbar(sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData detail, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    public void onOffsetChanged(@org.jetbrains.annotations.NotNull
    com.google.android.material.appbar.AppBarLayout bar, int verticalOffset) {
    }
    
    private final void updateActionButtonAdapter() {
    }
    
    private final void observeApkActions() {
    }
    
    public final void onNavigationClick() {
    }
    
    private final void saveImage() {
    }
    
    private final void exportAppFileSelection() {
    }
    
    private final void saveApk(android.net.Uri targetUri) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "appDetailRequest", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailRequest;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailRequest appDetailRequest);
    }
}
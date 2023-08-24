package sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/receiver/AppReceiverDetailFragmentViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "receiverAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/provider/AppReceiverDetailListAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/page/provider/AppReceiverDetailListAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;)V", "value", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/provider/AppReceiverDetailListAdapter$ExpandedBroadcastReceiverData;", "receiverData", "setReceiverData", "(Ljava/util/List;)V", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDataReceived", "", "appDetailData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "updateLocalData", "editedExpandedReceiverData", "Factory", "app_freeDebug"})
public final class AppReceiverDetailFragmentViewModel extends sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragmentViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter receiverAdapter = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ExpandedBroadcastReceiverData> receiverData;
    
    @dagger.assisted.AssistedInject
    public AppReceiverDetailFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter receiverAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager) {
        super(null, null, null);
    }
    
    private final void setReceiverData(java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ExpandedBroadcastReceiverData> value) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override
    public boolean onDataReceived(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData appDetailData) {
        return false;
    }
    
    private final void updateLocalData(sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter.ExpandedBroadcastReceiverData editedExpandedReceiverData) {
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/receiver/AppReceiverDetailFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/receiver/AppReceiverDetailFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel);
    }
}
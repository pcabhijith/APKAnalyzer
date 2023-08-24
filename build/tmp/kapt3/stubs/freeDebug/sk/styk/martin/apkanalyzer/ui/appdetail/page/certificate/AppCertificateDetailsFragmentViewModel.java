package sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/certificate/AppCertificateDetailsFragmentViewModel;", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/AppDetailPageFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "detailInfoAdapter", "Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;", "clipBoardManager", "Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "formatter", "Lsk/styk/martin/apkanalyzer/util/Formatter;", "(Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;Lsk/styk/martin/apkanalyzer/util/Formatter;)V", "getDetailInfoAdapter", "()Lsk/styk/martin/apkanalyzer/ui/appdetail/adapters/DetailInfoAdapter;", "onDataReceived", "", "appDetailData", "Lsk/styk/martin/apkanalyzer/core/appanalysis/model/AppDetailData;", "Factory", "app_freeDebug"})
public final class AppCertificateDetailsFragmentViewModel extends sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragmentViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter detailInfoAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.util.Formatter formatter = null;
    
    @dagger.assisted.AssistedInject
    public AppCertificateDetailsFragmentViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter detailInfoAdapter, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager clipBoardManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.util.Formatter formatter) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter getDetailInfoAdapter() {
        return null;
    }
    
    @java.lang.Override
    public boolean onDataReceived(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.appanalysis.model.AppDetailData appDetailData) {
        return false;
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/page/certificate/AppCertificateDetailsFragmentViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/appdetail/page/certificate/AppCertificateDetailsFragmentViewModel;", "appDetailFragmentViewModel", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppDetailFragmentViewModel;", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailsFragmentViewModel create(@org.jetbrains.annotations.NotNull
        sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel appDetailFragmentViewModel);
    }
}
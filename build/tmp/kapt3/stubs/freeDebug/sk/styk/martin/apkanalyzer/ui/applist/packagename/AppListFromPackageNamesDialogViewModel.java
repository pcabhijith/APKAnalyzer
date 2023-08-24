package sk.styk.martin.apkanalyzer.ui.applist.packagename;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB/\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel;", "Lsk/styk/martin/apkanalyzer/ui/applist/BaseAppListViewModel;", "packageNames", "", "", "installedAppsRepository", "Lsk/styk/martin/apkanalyzer/core/applist/InstalledAppsRepository;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "appListAdapter", "Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;", "(Ljava/util/List;Lsk/styk/martin/apkanalyzer/core/applist/InstalledAppsRepository;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;Lsk/styk/martin/apkanalyzer/ui/applist/AppListAdapter;)V", "Factory", "app_freeDebug"})
public final class AppListFromPackageNamesDialogViewModel extends sk.styk.martin.apkanalyzer.ui.applist.BaseAppListViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository installedAppsRepository = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    
    @dagger.assisted.AssistedInject
    public AppListFromPackageNamesDialogViewModel(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> packageNames, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository installedAppsRepository, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter appListAdapter) {
        super(null);
    }
    
    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel$Factory;", "", "create", "Lsk/styk/martin/apkanalyzer/ui/applist/packagename/AppListFromPackageNamesDialogViewModel;", "packageNames", "", "", "app_freeDebug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel create(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> packageNames);
    }
}
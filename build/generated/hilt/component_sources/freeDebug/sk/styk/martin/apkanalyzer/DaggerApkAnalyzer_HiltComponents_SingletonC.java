package sk.styk.martin.apkanalyzer;

import android.app.Activity;
import android.app.Service;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.android.play.core.review.ReviewManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import dagger.internal.SingleCheck;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.appanalysis.AndroidManifestManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.AndroidVersionManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.AppComponentsManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.AppDetailDataManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.AppGeneralDataManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.AppInstallSourceManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.AppPermissionManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.CertificateManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.FeaturesManager;
import sk.styk.martin.apkanalyzer.core.appanalysis.di.AppAnalysisModule;
import sk.styk.martin.apkanalyzer.core.appanalysis.di.AppAnalysisModule_ProvidePackageManagerFactory;
import sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository;
import sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepositoryImpl;
import sk.styk.martin.apkanalyzer.core.apppermissions.LocalPermissionManager;
import sk.styk.martin.apkanalyzer.core.apppermissions.model.LocalPermissionData;
import sk.styk.martin.apkanalyzer.core.appstatistics.LocalApplicationStatisticManager;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.core.common.digest.DigestManager;
import sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule_ProvideColorThemeManagerFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule_ProvideForegroundFragmentWatcherFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule_ProvideFragmentScreenTrackerFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule_ProvidePermissionsManagerFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule_ProvideUserReviewManagerFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule_ProvidesResourcesFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule_ProvideColorThemeManagerImplFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule_ProvideContentResolverFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule_ProvideFirebaseAnalyticsFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule_ProvideNotificationManagerFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule_ProvidePersistenceSharedPreferencesFactory;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule_ProvideReviewManagerFactory;
import sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker;
import sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker;
import sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager;
import sk.styk.martin.apkanalyzer.manager.file.DrawableSaveManager;
import sk.styk.martin.apkanalyzer.manager.file.FileManager;
import sk.styk.martin.apkanalyzer.manager.media.MediaManager;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel;
import sk.styk.martin.apkanalyzer.manager.notification.NotificationManager;
import sk.styk.martin.apkanalyzer.manager.permission.PermissionManager;
import sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager;
import sk.styk.martin.apkanalyzer.manager.persistence.SettingsManager;
import sk.styk.martin.apkanalyzer.manager.promo.StartPromoManager;
import sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager;
import sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManagerImpl;
import sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.about.AboutFragment;
import sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.about.AboutFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailActivity;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailRequest;
import sk.styk.martin.apkanalyzer.ui.appdetail.OnInstallAppDetailActivity;
import sk.styk.martin.apkanalyzer.ui.appdetail.adapters.DetailInfoAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailListAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailsFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.definedpermission.AppDefinedPermissionFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailListAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailPageFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailPageFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.general.AppGeneralDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.general.AppGeneralDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.general.AppGeneralDetailsFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailListAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppReceiverDetailListAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailListAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppDefinedPermissionDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppDefinedPermissionDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppPermissionListAdapter;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionDetailFragment;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter;
import sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListFragment;
import sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel;
import sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel_HiltModules_KeyModule_ProvideFactory;
import sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialog;
import sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel;
import sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialog_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.intro.IntroActivity;
import sk.styk.martin.apkanalyzer.ui.intro.IntroActivity_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.main.MainActivity;
import sk.styk.martin.apkanalyzer.ui.main.MainActivityViewModel;
import sk.styk.martin.apkanalyzer.ui.main.MainActivity_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragment;
import sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.manifest.ManifestRequest;
import sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment;
import sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel;
import sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsFragment;
import sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragment;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListAdapter;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragment;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel_HiltModules_KeyModule_ProvideFactory;
import sk.styk.martin.apkanalyzer.ui.premium.PremiumFragment;
import sk.styk.martin.apkanalyzer.ui.premium.PremiumFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.premium.PremiumFragmentViewModel_HiltModules_KeyModule_ProvideFactory;
import sk.styk.martin.apkanalyzer.ui.settings.MainSettingsFragment;
import sk.styk.martin.apkanalyzer.ui.settings.MainSettingsFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.settings.SettingsFragment;
import sk.styk.martin.apkanalyzer.ui.settings.SettingsFragment_MembersInjector;
import sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragment;
import sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel_HiltModules_KeyModule_ProvideFactory;
import sk.styk.martin.apkanalyzer.util.Formatter;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerApkAnalyzer_HiltComponents_SingletonC {
  private DaggerApkAnalyzer_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AppAnalysisModule appAnalysisModule;

    private ApplicationContextModule applicationContextModule;

    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder appAnalysisModule(AppAnalysisModule appAnalysisModule) {
      this.appAnalysisModule = Preconditions.checkNotNull(appAnalysisModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public ApkAnalyzer_HiltComponents.SingletonC build() {
      if (appAnalysisModule == null) {
        this.appAnalysisModule = new AppAnalysisModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (applicationModule == null) {
        this.applicationModule = new ApplicationModule();
      }
      return new SingletonCImpl(appAnalysisModule, applicationContextModule, applicationModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements ApkAnalyzer_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ApkAnalyzer_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements ApkAnalyzer_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public ApkAnalyzer_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, new ActivityCommonModule(), activity);
    }
  }

  private static final class FragmentCBuilder implements ApkAnalyzer_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public ApkAnalyzer_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements ApkAnalyzer_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ApkAnalyzer_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements ApkAnalyzer_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ApkAnalyzer_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements ApkAnalyzer_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public ApkAnalyzer_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements ApkAnalyzer_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ApkAnalyzer_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends ApkAnalyzer_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends ApkAnalyzer_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private Provider<AboutFragmentViewModel.Factory> factoryProvider;

    private Provider<AppDetailFragmentViewModel.Factory> factoryProvider2;

    private Provider<AppActivityDetailFragmentViewModel.Factory> factoryProvider3;

    private Provider<AppCertificateDetailsFragmentViewModel.Factory> factoryProvider4;

    private Provider<AppFeatureDetailFragmentViewModel.Factory> factoryProvider5;

    private Provider<AppGeneralDetailsFragmentViewModel.Factory> factoryProvider6;

    private Provider<AppProviderDetailFragmentViewModel.Factory> factoryProvider7;

    private Provider<AppReceiverDetailFragmentViewModel.Factory> factoryProvider8;

    private Provider<AppServiceDetailFragmentViewModel.Factory> factoryProvider9;

    private Provider<AppDefinedPermissionFragmentViewModel.Factory> factoryProvider10;

    private Provider<AppUsedPermissionFragmentViewModel.Factory> factoryProvider11;

    private Provider<AppListFromPackageNamesDialogViewModel.Factory> factoryProvider12;

    private Provider<AndroidManifestFragmentViewModel.Factory> factoryProvider13;

    private Provider<PermissionsAppListViewModel.Factory> factoryProvider14;

    private Provider<PermissionDetailFragmentViewModel.Factory> factoryProvider15;

    private Provider<PermissionsGeneralDetailsViewModel.Factory> factoryProvider16;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;

      initialize(fragmentParam);

    }

    private AppPermissionManager appPermissionManager() {
      return new AppPermissionManager(singletonCImpl.providePackageManagerProvider.get());
    }

    private ResourcesManager resourcesManager() {
      return new ResourcesManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private AndroidVersionManager androidVersionManager() {
      return new AndroidVersionManager(resourcesManager());
    }

    private AndroidManifestManager androidManifestManager() {
      return new AndroidManifestManager(singletonCImpl.providePackageManagerProvider.get());
    }

    private AppInstallSourceManager appInstallSourceManager() {
      return new AppInstallSourceManager(singletonCImpl.providePackageManagerProvider.get());
    }

    private AppGeneralDataManager appGeneralDataManager() {
      return new AppGeneralDataManager(singletonCImpl.providePackageManagerProvider.get(), androidVersionManager(), androidManifestManager(), appInstallSourceManager());
    }

    private CertificateManager certificateManager() {
      return new CertificateManager(new DigestManager());
    }

    private AppComponentsManager appComponentsManager() {
      return new AppComponentsManager(singletonCImpl.providePackageManagerProvider.get());
    }

    private AppDetailDataManager appDetailDataManager() {
      return new AppDetailDataManager(singletonCImpl.providePackageManagerProvider.get(), appPermissionManager(), new FeaturesManager(), appGeneralDataManager(), certificateManager(), appComponentsManager());
    }

    private MediaManager mediaManager() {
      return new MediaManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private DrawableSaveManager drawableSaveManager() {
      return new DrawableSaveManager(singletonCImpl.provideContentResolverProvider.get(), mediaManager(), new DispatcherProvider());
    }

    private FileManager fileManager() {
      return new FileManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideContentResolverProvider.get(), new DispatcherProvider());
    }

    private ClipBoardManager clipBoardManager() {
      return new ClipBoardManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private Formatter formatter() {
      return new Formatter(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Fragment fragmentParam) {
      this.factoryProvider = SingleCheck.provider(new SwitchingProvider<AboutFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 0));
      this.factoryProvider2 = SingleCheck.provider(new SwitchingProvider<AppDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 1));
      this.factoryProvider3 = SingleCheck.provider(new SwitchingProvider<AppActivityDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 2));
      this.factoryProvider4 = SingleCheck.provider(new SwitchingProvider<AppCertificateDetailsFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 3));
      this.factoryProvider5 = SingleCheck.provider(new SwitchingProvider<AppFeatureDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 4));
      this.factoryProvider6 = SingleCheck.provider(new SwitchingProvider<AppGeneralDetailsFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 5));
      this.factoryProvider7 = SingleCheck.provider(new SwitchingProvider<AppProviderDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 6));
      this.factoryProvider8 = SingleCheck.provider(new SwitchingProvider<AppReceiverDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 7));
      this.factoryProvider9 = SingleCheck.provider(new SwitchingProvider<AppServiceDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 8));
      this.factoryProvider10 = SingleCheck.provider(new SwitchingProvider<AppDefinedPermissionFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 9));
      this.factoryProvider11 = SingleCheck.provider(new SwitchingProvider<AppUsedPermissionFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 10));
      this.factoryProvider12 = SingleCheck.provider(new SwitchingProvider<AppListFromPackageNamesDialogViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 11));
      this.factoryProvider13 = SingleCheck.provider(new SwitchingProvider<AndroidManifestFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 12));
      this.factoryProvider14 = SingleCheck.provider(new SwitchingProvider<PermissionsAppListViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 13));
      this.factoryProvider15 = SingleCheck.provider(new SwitchingProvider<PermissionDetailFragmentViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 14));
      this.factoryProvider16 = SingleCheck.provider(new SwitchingProvider<PermissionsGeneralDetailsViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, 15));
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectAboutFragment(AboutFragment arg0) {
      injectAboutFragment2(arg0);
    }

    @Override
    public void injectAppDetailFragment(AppDetailFragment arg0) {
      injectAppDetailFragment2(arg0);
    }

    @Override
    public void injectAppActivityDetailFragment(AppActivityDetailFragment arg0) {
      injectAppActivityDetailFragment2(arg0);
    }

    @Override
    public void injectAppCertificateDetailFragment(AppCertificateDetailFragment arg0) {
      injectAppCertificateDetailFragment2(arg0);
    }

    @Override
    public void injectAppFeatureDetailPageFragment(AppFeatureDetailPageFragment arg0) {
      injectAppFeatureDetailPageFragment2(arg0);
    }

    @Override
    public void injectAppGeneralDetailFragment(AppGeneralDetailFragment arg0) {
      injectAppGeneralDetailFragment2(arg0);
    }

    @Override
    public void injectAppProviderDetailFragment(AppProviderDetailFragment arg0) {
      injectAppProviderDetailFragment2(arg0);
    }

    @Override
    public void injectAppReceiverDetailFragment(AppReceiverDetailFragment arg0) {
      injectAppReceiverDetailFragment2(arg0);
    }

    @Override
    public void injectAppServiceDetailFragment(AppServiceDetailFragment arg0) {
      injectAppServiceDetailFragment2(arg0);
    }

    @Override
    public void injectAppDefinedPermissionDetailFragment(AppDefinedPermissionDetailFragment arg0) {
      injectAppDefinedPermissionDetailFragment2(arg0);
    }

    @Override
    public void injectAppUsedPermissionDetailFragment(AppUsedPermissionDetailFragment arg0) {
      injectAppUsedPermissionDetailFragment2(arg0);
    }

    @Override
    public void injectMainAppListFragment(MainAppListFragment arg0) {
      injectMainAppListFragment2(arg0);
    }

    @Override
    public void injectAppListFromPackageNamesDialog(AppListFromPackageNamesDialog arg0) {
      injectAppListFromPackageNamesDialog2(arg0);
    }

    @Override
    public void injectAndroidManifestFragment(AndroidManifestFragment arg0) {
      injectAndroidManifestFragment2(arg0);
    }

    @Override
    public void injectPermissionsAppListFragment(PermissionsAppListFragment arg0) {
      injectPermissionsAppListFragment2(arg0);
    }

    @Override
    public void injectPermissionsGeneralDetailsFragment(PermissionsGeneralDetailsFragment arg0) {
      injectPermissionsGeneralDetailsFragment2(arg0);
    }

    @Override
    public void injectPermissionDetailFragment(PermissionDetailFragment arg0) {
      injectPermissionDetailFragment2(arg0);
    }

    @Override
    public void injectPermissionListFragment(PermissionListFragment arg0) {
    }

    @Override
    public void injectPremiumFragment(PremiumFragment arg0) {
    }

    @Override
    public void injectMainSettingsFragment(MainSettingsFragment arg0) {
      injectMainSettingsFragment2(arg0);
    }

    @Override
    public void injectSettingsFragment(SettingsFragment arg0) {
      injectSettingsFragment2(arg0);
    }

    @Override
    public void injectStatisticsFragment(StatisticsFragment arg0) {
    }

    @CanIgnoreReturnValue
    private AboutFragment injectAboutFragment2(AboutFragment instance) {
      AboutFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppDetailFragment injectAppDetailFragment2(AppDetailFragment instance) {
      AppDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider2.get());
      AppDetailFragment_MembersInjector.injectBackPressedManager(instance, activityCImpl.backPressedManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppActivityDetailFragment injectAppActivityDetailFragment2(
        AppActivityDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppActivityDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider3.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppCertificateDetailFragment injectAppCertificateDetailFragment2(
        AppCertificateDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppCertificateDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider4.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppFeatureDetailPageFragment injectAppFeatureDetailPageFragment2(
        AppFeatureDetailPageFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppFeatureDetailPageFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider5.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppGeneralDetailFragment injectAppGeneralDetailFragment2(
        AppGeneralDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppGeneralDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider6.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppProviderDetailFragment injectAppProviderDetailFragment2(
        AppProviderDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppProviderDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider7.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppReceiverDetailFragment injectAppReceiverDetailFragment2(
        AppReceiverDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppReceiverDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider8.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppServiceDetailFragment injectAppServiceDetailFragment2(
        AppServiceDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppServiceDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider9.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppDefinedPermissionDetailFragment injectAppDefinedPermissionDetailFragment2(
        AppDefinedPermissionDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppDefinedPermissionDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider10.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppUsedPermissionDetailFragment injectAppUsedPermissionDetailFragment2(
        AppUsedPermissionDetailFragment instance) {
      AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider2.get());
      AppUsedPermissionDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider11.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainAppListFragment injectMainAppListFragment2(MainAppListFragment instance) {
      MainAppListFragment_MembersInjector.injectBackPressedManager(instance, activityCImpl.backPressedManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppListFromPackageNamesDialog injectAppListFromPackageNamesDialog2(
        AppListFromPackageNamesDialog instance) {
      AppListFromPackageNamesDialog_MembersInjector.injectViewModelFactory(instance, factoryProvider12.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AndroidManifestFragment injectAndroidManifestFragment2(
        AndroidManifestFragment instance) {
      AndroidManifestFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider13.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PermissionsAppListFragment injectPermissionsAppListFragment2(
        PermissionsAppListFragment instance) {
      PermissionsAppListFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider14.get());
      PermissionsAppListFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider15.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PermissionsGeneralDetailsFragment injectPermissionsGeneralDetailsFragment2(
        PermissionsGeneralDetailsFragment instance) {
      PermissionsGeneralDetailsFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider16.get());
      PermissionsGeneralDetailsFragment_MembersInjector.injectParentViewModelFactory(instance, factoryProvider15.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PermissionDetailFragment injectPermissionDetailFragment2(
        PermissionDetailFragment instance) {
      PermissionDetailFragment_MembersInjector.injectViewModelFactory(instance, factoryProvider15.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainSettingsFragment injectMainSettingsFragment2(MainSettingsFragment instance) {
      MainSettingsFragment_MembersInjector.injectColorThemeManager(instance, singletonCImpl.colorThemeManager());
      return instance;
    }

    @CanIgnoreReturnValue
    private SettingsFragment injectSettingsFragment2(SettingsFragment instance) {
      SettingsFragment_MembersInjector.injectNavigationDrawerModel(instance, singletonCImpl.navigationDrawerModelProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl;

      private final FragmentCImpl fragmentCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.activityCImpl = activityCImpl;
        this.fragmentCImpl = fragmentCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // sk.styk.martin.apkanalyzer.ui.about.AboutFragmentViewModel.Factory 
          return (T) new AboutFragmentViewModel.Factory() {
            @Override
            public AboutFragmentViewModel create() {
              return new AboutFragmentViewModel(singletonCImpl.navigationDrawerModelProvider.get(), activityCImpl.provideUserReviewManagerProvider.get());
            }
          };

          case 1: // sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel.Factory 
          return (T) new AppDetailFragmentViewModel.Factory() {
            @Override
            public AppDetailFragmentViewModel create(AppDetailRequest appDetailRequest) {
              return new AppDetailFragmentViewModel(appDetailRequest, new DispatcherProvider(), fragmentCImpl.appDetailDataManager(), fragmentCImpl.resourcesManager(), activityCImpl.providePermissionsManagerProvider.get(), new AppActionsSpeedMenuAdapter(), fragmentCImpl.drawableSaveManager(), singletonCImpl.notificationManagerProvider.get(), singletonCImpl.apkSaveManagerProvider.get(), fragmentCImpl.fileManager(), activityCImpl.provideColorThemeManagerProvider.get(), activityCImpl.analyticsTracker());
            }
          };

          case 2: // sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailFragmentViewModel.Factory 
          return (T) new AppActivityDetailFragmentViewModel.Factory() {
            @Override
            public AppActivityDetailFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel) {
              return new AppActivityDetailFragmentViewModel(appDetailFragmentViewModel, new AppActivityDetailListAdapter(), fragmentCImpl.clipBoardManager());
            }
          };

          case 3: // sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailsFragmentViewModel.Factory 
          return (T) new AppCertificateDetailsFragmentViewModel.Factory() {
            @Override
            public AppCertificateDetailsFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel2) {
              return new AppCertificateDetailsFragmentViewModel(appDetailFragmentViewModel2, new DetailInfoAdapter(), fragmentCImpl.clipBoardManager(), fragmentCImpl.formatter());
            }
          };

          case 4: // sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailFragmentViewModel.Factory 
          return (T) new AppFeatureDetailFragmentViewModel.Factory() {
            @Override
            public AppFeatureDetailFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel3) {
              return new AppFeatureDetailFragmentViewModel(appDetailFragmentViewModel3, new AppFeatureDetailListAdapter(), fragmentCImpl.clipBoardManager());
            }
          };

          case 5: // sk.styk.martin.apkanalyzer.ui.appdetail.page.general.AppGeneralDetailsFragmentViewModel.Factory 
          return (T) new AppGeneralDetailsFragmentViewModel.Factory() {
            @Override
            public AppGeneralDetailsFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel4) {
              return new AppGeneralDetailsFragmentViewModel(appDetailFragmentViewModel4, new DetailInfoAdapter(), fragmentCImpl.clipBoardManager(), fragmentCImpl.formatter());
            }
          };

          case 6: // sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailFragmentViewModel.Factory 
          return (T) new AppProviderDetailFragmentViewModel.Factory() {
            @Override
            public AppProviderDetailFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel5) {
              return new AppProviderDetailFragmentViewModel(appDetailFragmentViewModel5, new AppProviderDetailListAdapter(), fragmentCImpl.clipBoardManager());
            }
          };

          case 7: // sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragmentViewModel.Factory 
          return (T) new AppReceiverDetailFragmentViewModel.Factory() {
            @Override
            public AppReceiverDetailFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel6) {
              return new AppReceiverDetailFragmentViewModel(appDetailFragmentViewModel6, new AppReceiverDetailListAdapter(), fragmentCImpl.clipBoardManager());
            }
          };

          case 8: // sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailFragmentViewModel.Factory 
          return (T) new AppServiceDetailFragmentViewModel.Factory() {
            @Override
            public AppServiceDetailFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel7) {
              return new AppServiceDetailFragmentViewModel(appDetailFragmentViewModel7, new AppServiceDetailListAdapter(), fragmentCImpl.clipBoardManager());
            }
          };

          case 9: // sk.styk.martin.apkanalyzer.ui.appdetail.page.definedpermission.AppDefinedPermissionFragmentViewModel.Factory 
          return (T) new AppDefinedPermissionFragmentViewModel.Factory() {
            @Override
            public AppDefinedPermissionFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel8) {
              return new AppDefinedPermissionFragmentViewModel(appDetailFragmentViewModel8, new AppPermissionListAdapter(), fragmentCImpl.clipBoardManager(), singletonCImpl.providePackageManagerProvider.get());
            }
          };

          case 10: // sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionFragmentViewModel.Factory 
          return (T) new AppUsedPermissionFragmentViewModel.Factory() {
            @Override
            public AppUsedPermissionFragmentViewModel create(
                AppDetailFragmentViewModel appDetailFragmentViewModel9) {
              return new AppUsedPermissionFragmentViewModel(appDetailFragmentViewModel9, new AppPermissionListAdapter(), fragmentCImpl.clipBoardManager(), singletonCImpl.providePackageManagerProvider.get());
            }
          };

          case 11: // sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialogViewModel.Factory 
          return (T) new AppListFromPackageNamesDialogViewModel.Factory() {
            @Override
            public AppListFromPackageNamesDialogViewModel create(List<String> packageNames) {
              return new AppListFromPackageNamesDialogViewModel(packageNames, singletonCImpl.bindInstalledAppsRepositoryProvider.get(), new DispatcherProvider(), new AppListAdapter());
            }
          };

          case 12: // sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragmentViewModel.Factory 
          return (T) new AndroidManifestFragmentViewModel.Factory() {
            @Override
            public AndroidManifestFragmentViewModel create(ManifestRequest manifestRequest) {
              return new AndroidManifestFragmentViewModel(manifestRequest, activityCImpl.providePermissionsManagerProvider.get(), fragmentCImpl.androidManifestManager(), new DispatcherProvider(), fragmentCImpl.fileManager(), singletonCImpl.notificationManagerProvider.get());
            }
          };

          case 13: // sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListViewModel.Factory 
          return (T) new PermissionsAppListViewModel.Factory() {
            @Override
            public PermissionsAppListViewModel create(
                PermissionDetailFragmentViewModel permissionDetailFragmentViewModel,
                boolean showGranted) {
              return new PermissionsAppListViewModel(permissionDetailFragmentViewModel, showGranted, singletonCImpl.bindInstalledAppsRepositoryProvider.get(), new DispatcherProvider(), new AppListAdapter());
            }
          };

          case 14: // sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel.Factory 
          return (T) new PermissionDetailFragmentViewModel.Factory() {
            @Override
            public PermissionDetailFragmentViewModel create(
                LocalPermissionData localPermissionData) {
              return new PermissionDetailFragmentViewModel(localPermissionData, singletonCImpl.providePackageManagerProvider.get());
            }
          };

          case 15: // sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsViewModel.Factory 
          return (T) new PermissionsGeneralDetailsViewModel.Factory() {
            @Override
            public PermissionsGeneralDetailsViewModel create(
                PermissionDetailFragmentViewModel permissionDetailFragmentViewModel2) {
              return new PermissionsGeneralDetailsViewModel(permissionDetailFragmentViewModel2, new DetailInfoAdapter(), fragmentCImpl.clipBoardManager());
            }
          };

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ViewCImpl extends ApkAnalyzer_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends ApkAnalyzer_HiltComponents.ActivityC {
    private final ActivityCommonModule activityCommonModule;

    private final Activity activity;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private Provider<AppCompatActivity> providesResourcesProvider;

    private Provider<PermissionManager> providePermissionsManagerProvider;

    private Provider<ActivityColorThemeManager> provideColorThemeManagerProvider;

    private Provider<BackPressedManager> backPressedManagerProvider;

    private Provider<ForegroundFragmentWatcher> provideForegroundFragmentWatcherProvider;

    private Provider<FragmentScreenTracker> provideFragmentScreenTrackerProvider;

    private Provider<UserReviewManager> provideUserReviewManagerProvider;

    private Provider<MainActivityViewModel.Factory> factoryProvider;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCommonModule activityCommonModuleParam,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCommonModule = activityCommonModuleParam;
      this.activity = activityParam;
      initialize(activityCommonModuleParam, activityParam);

    }

    private AnalyticsTracker analyticsTracker() {
      return new AnalyticsTracker(singletonCImpl.firebaseAnalytics());
    }

    private PersistenceManager persistenceManager() {
      return new PersistenceManager(singletonCImpl.providePersistenceSharedPreferencesProvider.get());
    }

    private StartPromoManager startPromoManager() {
      return new StartPromoManager(persistenceManager());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ActivityCommonModule activityCommonModuleParam,
        final Activity activityParam) {
      this.providesResourcesProvider = DoubleCheck.provider(new SwitchingProvider<AppCompatActivity>(singletonCImpl, activityRetainedCImpl, activityCImpl, 1));
      this.providePermissionsManagerProvider = DoubleCheck.provider(new SwitchingProvider<PermissionManager>(singletonCImpl, activityRetainedCImpl, activityCImpl, 0));
      this.provideColorThemeManagerProvider = DoubleCheck.provider(new SwitchingProvider<ActivityColorThemeManager>(singletonCImpl, activityRetainedCImpl, activityCImpl, 2));
      this.backPressedManagerProvider = DoubleCheck.provider(new SwitchingProvider<BackPressedManager>(singletonCImpl, activityRetainedCImpl, activityCImpl, 3));
      this.provideForegroundFragmentWatcherProvider = DoubleCheck.provider(new SwitchingProvider<ForegroundFragmentWatcher>(singletonCImpl, activityRetainedCImpl, activityCImpl, 5));
      this.provideFragmentScreenTrackerProvider = DoubleCheck.provider(new SwitchingProvider<FragmentScreenTracker>(singletonCImpl, activityRetainedCImpl, activityCImpl, 4));
      this.provideUserReviewManagerProvider = DoubleCheck.provider(new SwitchingProvider<UserReviewManager>(singletonCImpl, activityRetainedCImpl, activityCImpl, 7));
      this.factoryProvider = SingleCheck.provider(new SwitchingProvider<MainActivityViewModel.Factory>(singletonCImpl, activityRetainedCImpl, activityCImpl, 6));
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(4).add(MainAppListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PermissionListFragmentViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PremiumFragmentViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StatisticsFragmentViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectAppDetailActivity(AppDetailActivity arg0) {
      injectAppDetailActivity2(arg0);
    }

    @Override
    public void injectOnInstallAppDetailActivity(OnInstallAppDetailActivity arg0) {
      injectOnInstallAppDetailActivity2(arg0);
    }

    @Override
    public void injectIntroActivity(IntroActivity arg0) {
      injectIntroActivity2(arg0);
    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
      injectMainActivity2(arg0);
    }

    @CanIgnoreReturnValue
    private AppDetailActivity injectAppDetailActivity2(AppDetailActivity instance) {
      ApkAnalyzerBaseActivity_MembersInjector.injectPermissionManager(instance, providePermissionsManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectActivityColorThemeManager(instance, provideColorThemeManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectBackPressedManager(instance, backPressedManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectFragmentScreenTracker(instance, provideFragmentScreenTrackerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectForegroundFragmentWatcher(instance, provideForegroundFragmentWatcherProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OnInstallAppDetailActivity injectOnInstallAppDetailActivity2(
        OnInstallAppDetailActivity instance) {
      ApkAnalyzerBaseActivity_MembersInjector.injectPermissionManager(instance, providePermissionsManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectActivityColorThemeManager(instance, provideColorThemeManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectBackPressedManager(instance, backPressedManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectFragmentScreenTracker(instance, provideFragmentScreenTrackerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectForegroundFragmentWatcher(instance, provideForegroundFragmentWatcherProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private IntroActivity injectIntroActivity2(IntroActivity instance) {
      IntroActivity_MembersInjector.injectPersistenceManager(instance, persistenceManager());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity2(MainActivity instance) {
      ApkAnalyzerBaseActivity_MembersInjector.injectPermissionManager(instance, providePermissionsManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectActivityColorThemeManager(instance, provideColorThemeManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectBackPressedManager(instance, backPressedManagerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectFragmentScreenTracker(instance, provideFragmentScreenTrackerProvider.get());
      ApkAnalyzerBaseActivity_MembersInjector.injectForegroundFragmentWatcher(instance, provideForegroundFragmentWatcherProvider.get());
      MainActivity_MembersInjector.injectFactory(instance, factoryProvider.get());
      MainActivity_MembersInjector.injectUserReviewManager(instance, provideUserReviewManagerProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ActivityCImpl activityCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.activityCImpl = activityCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // sk.styk.martin.apkanalyzer.manager.permission.PermissionManager 
          return (T) ActivityCommonModule_ProvidePermissionsManagerFactory.providePermissionsManager(activityCImpl.activityCommonModule, activityCImpl.providesResourcesProvider.get());

          case 1: // androidx.appcompat.app.AppCompatActivity 
          return (T) ActivityCommonModule_ProvidesResourcesFactory.providesResources(activityCImpl.activityCommonModule, activityCImpl.activity);

          case 2: // sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager 
          return (T) ActivityCommonModule_ProvideColorThemeManagerFactory.provideColorThemeManager(activityCImpl.activityCommonModule, activityCImpl.providesResourcesProvider.get(), singletonCImpl.colorThemeManager());

          case 3: // sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager 
          return (T) new BackPressedManager();

          case 4: // sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker 
          return (T) ActivityCommonModule_ProvideFragmentScreenTrackerFactory.provideFragmentScreenTracker(activityCImpl.activityCommonModule, activityCImpl.providesResourcesProvider.get(), activityCImpl.analyticsTracker(), activityCImpl.provideForegroundFragmentWatcherProvider.get(), new DispatcherProvider());

          case 5: // sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher 
          return (T) ActivityCommonModule_ProvideForegroundFragmentWatcherFactory.provideForegroundFragmentWatcher(activityCImpl.activityCommonModule, activityCImpl.providesResourcesProvider.get());

          case 6: // sk.styk.martin.apkanalyzer.ui.main.MainActivityViewModel.Factory 
          return (T) new MainActivityViewModel.Factory() {
            @Override
            public MainActivityViewModel create() {
              return new MainActivityViewModel(activityCImpl.startPromoManager(), activityCImpl.persistenceManager(), singletonCImpl.navigationDrawerModelProvider.get(), activityCImpl.provideUserReviewManagerProvider.get(), activityCImpl.provideForegroundFragmentWatcherProvider.get());
            }
          };

          case 7: // sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager 
          return (T) ActivityCommonModule_ProvideUserReviewManagerFactory.provideUserReviewManager(activityCImpl.activityCommonModule, activityCImpl.providesResourcesProvider.get(), singletonCImpl.reviewManager());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ViewModelCImpl extends ApkAnalyzer_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<MainAppListViewModel> mainAppListViewModelProvider;

    private Provider<PermissionListFragmentViewModel> permissionListFragmentViewModelProvider;

    private Provider<PremiumFragmentViewModel> premiumFragmentViewModelProvider;

    private Provider<StatisticsFragmentViewModel> statisticsFragmentViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private AppPermissionManager appPermissionManager() {
      return new AppPermissionManager(singletonCImpl.providePackageManagerProvider.get());
    }

    private LocalPermissionManager localPermissionManager() {
      return new LocalPermissionManager(appPermissionManager(), singletonCImpl.bindInstalledAppsRepositoryProvider.get());
    }

    private AndroidVersionManager androidVersionManager() {
      return new AndroidVersionManager(singletonCImpl.resourcesManager());
    }

    private AndroidManifestManager androidManifestManager() {
      return new AndroidManifestManager(singletonCImpl.providePackageManagerProvider.get());
    }

    private AppGeneralDataManager appGeneralDataManager() {
      return new AppGeneralDataManager(singletonCImpl.providePackageManagerProvider.get(), androidVersionManager(), androidManifestManager(), singletonCImpl.appInstallSourceManager());
    }

    private CertificateManager certificateManager() {
      return new CertificateManager(new DigestManager());
    }

    private LocalApplicationStatisticManager localApplicationStatisticManager() {
      return new LocalApplicationStatisticManager(singletonCImpl.providePackageManagerProvider.get(), singletonCImpl.bindInstalledAppsRepositoryProvider.get(), appGeneralDataManager(), certificateManager(), androidManifestManager(), singletonCImpl.appInstallSourceManager());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.mainAppListViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.permissionListFragmentViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.premiumFragmentViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.statisticsFragmentViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(4).put("sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel", ((Provider) mainAppListViewModelProvider)).put("sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel", ((Provider) permissionListFragmentViewModelProvider)).put("sk.styk.martin.apkanalyzer.ui.premium.PremiumFragmentViewModel", ((Provider) premiumFragmentViewModelProvider)).put("sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel", ((Provider) statisticsFragmentViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel 
          return (T) new MainAppListViewModel(singletonCImpl.bindInstalledAppsRepositoryProvider.get(), singletonCImpl.navigationDrawerModelProvider.get(), new DispatcherProvider(), new AppListAdapter());

          case 1: // sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel 
          return (T) new PermissionListFragmentViewModel(new DispatcherProvider(), new PermissionListAdapter(), singletonCImpl.navigationDrawerModelProvider.get(), viewModelCImpl.localPermissionManager());

          case 2: // sk.styk.martin.apkanalyzer.ui.premium.PremiumFragmentViewModel 
          return (T) new PremiumFragmentViewModel(singletonCImpl.navigationDrawerModelProvider.get(), singletonCImpl.resourcesManager());

          case 3: // sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel 
          return (T) new StatisticsFragmentViewModel(singletonCImpl.navigationDrawerModelProvider.get(), viewModelCImpl.localApplicationStatisticManager(), singletonCImpl.resourcesManager(), new DispatcherProvider());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends ApkAnalyzer_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends ApkAnalyzer_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends ApkAnalyzer_HiltComponents.SingletonC {
    private final ApplicationModule applicationModule;

    private final ApplicationContextModule applicationContextModule;

    private final AppAnalysisModule appAnalysisModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<SharedPreferences> providePersistenceSharedPreferencesProvider;

    private Provider<ColorThemeManagerImpl> colorThemeManagerImplProvider;

    private Provider<NavigationDrawerModel> navigationDrawerModelProvider;

    private Provider<PackageManager> providePackageManagerProvider;

    private Provider<ContentResolver> provideContentResolverProvider;

    private Provider<NotificationManager> notificationManagerProvider;

    private Provider<ApkSaveManager> apkSaveManagerProvider;

    private Provider<InstalledAppsRepositoryImpl> installedAppsRepositoryImplProvider;

    private Provider<InstalledAppsRepository> bindInstalledAppsRepositoryProvider;

    private SingletonCImpl(AppAnalysisModule appAnalysisModuleParam,
        ApplicationContextModule applicationContextModuleParam,
        ApplicationModule applicationModuleParam) {
      this.applicationModule = applicationModuleParam;
      this.applicationContextModule = applicationContextModuleParam;
      this.appAnalysisModule = appAnalysisModuleParam;
      initialize(appAnalysisModuleParam, applicationContextModuleParam, applicationModuleParam);

    }

    private SettingsManager settingsManager() {
      return new SettingsManager(providePersistenceSharedPreferencesProvider.get());
    }

    private ColorThemeManager colorThemeManager() {
      return ApplicationModule_ProvideColorThemeManagerImplFactory.provideColorThemeManagerImpl(applicationModule, colorThemeManagerImplProvider.get());
    }

    private FirebaseAnalytics firebaseAnalytics() {
      return ApplicationModule_ProvideFirebaseAnalyticsFactory.provideFirebaseAnalytics(applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private ReviewManager reviewManager() {
      return ApplicationModule_ProvideReviewManagerFactory.provideReviewManager(applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private ResourcesManager resourcesManager() {
      return new ResourcesManager(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private android.app.NotificationManager notificationManager() {
      return ApplicationModule_ProvideNotificationManagerFactory.provideNotificationManager(applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private AppInstallSourceManager appInstallSourceManager() {
      return new AppInstallSourceManager(providePackageManagerProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AppAnalysisModule appAnalysisModuleParam,
        final ApplicationContextModule applicationContextModuleParam,
        final ApplicationModule applicationModuleParam) {
      this.providePersistenceSharedPreferencesProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(singletonCImpl, 1));
      this.colorThemeManagerImplProvider = DoubleCheck.provider(new SwitchingProvider<ColorThemeManagerImpl>(singletonCImpl, 0));
      this.navigationDrawerModelProvider = DoubleCheck.provider(new SwitchingProvider<NavigationDrawerModel>(singletonCImpl, 2));
      this.providePackageManagerProvider = DoubleCheck.provider(new SwitchingProvider<PackageManager>(singletonCImpl, 3));
      this.provideContentResolverProvider = DoubleCheck.provider(new SwitchingProvider<ContentResolver>(singletonCImpl, 4));
      this.notificationManagerProvider = DoubleCheck.provider(new SwitchingProvider<NotificationManager>(singletonCImpl, 5));
      this.apkSaveManagerProvider = DoubleCheck.provider(new SwitchingProvider<ApkSaveManager>(singletonCImpl, 6));
      this.installedAppsRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 7);
      this.bindInstalledAppsRepositoryProvider = DoubleCheck.provider((Provider) installedAppsRepositoryImplProvider);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectApkAnalyzer(ApkAnalyzer arg0) {
      injectApkAnalyzer2(arg0);
    }

    @CanIgnoreReturnValue
    private ApkAnalyzer injectApkAnalyzer2(ApkAnalyzer instance) {
      ApkAnalyzer_MembersInjector.injectColorThemeManager(instance, colorThemeManager());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManagerImpl 
          return (T) new ColorThemeManagerImpl(singletonCImpl.settingsManager());

          case 1: // android.content.SharedPreferences 
          return (T) ApplicationModule_ProvidePersistenceSharedPreferencesFactory.providePersistenceSharedPreferences(singletonCImpl.applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 2: // sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel 
          return (T) new NavigationDrawerModel();

          case 3: // android.content.pm.PackageManager 
          return (T) AppAnalysisModule_ProvidePackageManagerFactory.providePackageManager(singletonCImpl.appAnalysisModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 4: // android.content.ContentResolver 
          return (T) ApplicationModule_ProvideContentResolverFactory.provideContentResolver(singletonCImpl.applicationModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 5: // sk.styk.martin.apkanalyzer.manager.notification.NotificationManager 
          return (T) new NotificationManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.resourcesManager(), singletonCImpl.notificationManager());

          case 6: // sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager 
          return (T) new ApkSaveManager(singletonCImpl.provideContentResolverProvider.get(), singletonCImpl.notificationManagerProvider.get(), new DispatcherProvider());

          case 7: // sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepositoryImpl 
          return (T) new InstalledAppsRepositoryImpl(singletonCImpl.providePackageManagerProvider.get(), singletonCImpl.appInstallSourceManager());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}

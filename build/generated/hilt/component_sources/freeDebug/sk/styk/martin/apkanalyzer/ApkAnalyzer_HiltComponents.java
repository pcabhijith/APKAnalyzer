package sk.styk.martin.apkanalyzer;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;
import sk.styk.martin.apkanalyzer.core.appanalysis.di.AppAnalysisModule;
import sk.styk.martin.apkanalyzer.core.applist.di.AppListModule;
import sk.styk.martin.apkanalyzer.dependencyinjection.ActivityCommonModule;
import sk.styk.martin.apkanalyzer.dependencyinjection.ApplicationModule;
import sk.styk.martin.apkanalyzer.ui.about.AboutFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailActivity_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.OnInstallAppDetailActivity_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.activity.AppActivityDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.feature.AppFeatureDetailPageFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.general.AppGeneralDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.service.AppServiceDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppDefinedPermissionDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission.AppUsedPermissionDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.applist.main.MainAppListViewModel_HiltModules;
import sk.styk.martin.apkanalyzer.ui.applist.packagename.AppListFromPackageNamesDialog_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.intro.IntroActivity_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.main.MainActivity_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.manifest.AndroidManifestFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.permission.detail.apps.PermissionsAppListFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.permission.detail.details.PermissionsGeneralDetailsFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragmentViewModel_HiltModules;
import sk.styk.martin.apkanalyzer.ui.permission.list.PermissionListFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.premium.PremiumFragmentViewModel_HiltModules;
import sk.styk.martin.apkanalyzer.ui.premium.PremiumFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.settings.MainSettingsFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.settings.SettingsFragment_GeneratedInjector;
import sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragmentViewModel_HiltModules;
import sk.styk.martin.apkanalyzer.ui.statistics.StatisticsFragment_GeneratedInjector;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class ApkAnalyzer_HiltComponents {
  private ApkAnalyzer_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          AppAnalysisModule.class,
          AppListModule.class,
          ApplicationContextModule.class,
          ApplicationModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent,
      ApkAnalyzer_GeneratedInjector {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          MainAppListViewModel_HiltModules.KeyModule.class,
          PermissionListFragmentViewModel_HiltModules.KeyModule.class,
          PremiumFragmentViewModel_HiltModules.KeyModule.class,
          StatisticsFragmentViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActivityCommonModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      AppDetailActivity_GeneratedInjector,
      OnInstallAppDetailActivity_GeneratedInjector,
      IntroActivity_GeneratedInjector,
      MainActivity_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          MainAppListViewModel_HiltModules.BindsModule.class,
          PermissionListFragmentViewModel_HiltModules.BindsModule.class,
          PremiumFragmentViewModel_HiltModules.BindsModule.class,
          StatisticsFragmentViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      AboutFragment_GeneratedInjector,
      AppDetailFragment_GeneratedInjector,
      AppActivityDetailFragment_GeneratedInjector,
      AppCertificateDetailFragment_GeneratedInjector,
      AppFeatureDetailPageFragment_GeneratedInjector,
      AppGeneralDetailFragment_GeneratedInjector,
      AppProviderDetailFragment_GeneratedInjector,
      AppReceiverDetailFragment_GeneratedInjector,
      AppServiceDetailFragment_GeneratedInjector,
      AppDefinedPermissionDetailFragment_GeneratedInjector,
      AppUsedPermissionDetailFragment_GeneratedInjector,
      MainAppListFragment_GeneratedInjector,
      AppListFromPackageNamesDialog_GeneratedInjector,
      AndroidManifestFragment_GeneratedInjector,
      PermissionsAppListFragment_GeneratedInjector,
      PermissionsGeneralDetailsFragment_GeneratedInjector,
      PermissionDetailFragment_GeneratedInjector,
      PermissionListFragment_GeneratedInjector,
      PremiumFragment_GeneratedInjector,
      MainSettingsFragment_GeneratedInjector,
      SettingsFragment_GeneratedInjector,
      StatisticsFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}

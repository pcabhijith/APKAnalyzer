package sk.styk.martin.apkanalyzer.manager.navigationdrawer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class NavigationDrawerModel_Factory implements Factory<NavigationDrawerModel> {
  @Override
  public NavigationDrawerModel get() {
    return newInstance();
  }

  public static NavigationDrawerModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NavigationDrawerModel newInstance() {
    return new NavigationDrawerModel();
  }

  private static final class InstanceHolder {
    private static final NavigationDrawerModel_Factory INSTANCE = new NavigationDrawerModel_Factory();
  }
}

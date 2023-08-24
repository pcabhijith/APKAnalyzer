package sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class AppPermissionListAdapter_Factory implements Factory<AppPermissionListAdapter> {
  @Override
  public AppPermissionListAdapter get() {
    return newInstance();
  }

  public static AppPermissionListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppPermissionListAdapter newInstance() {
    return new AppPermissionListAdapter();
  }

  private static final class InstanceHolder {
    private static final AppPermissionListAdapter_Factory INSTANCE = new AppPermissionListAdapter_Factory();
  }
}

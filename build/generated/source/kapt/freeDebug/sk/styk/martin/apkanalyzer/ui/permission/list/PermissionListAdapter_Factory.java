package sk.styk.martin.apkanalyzer.ui.permission.list;

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
public final class PermissionListAdapter_Factory implements Factory<PermissionListAdapter> {
  @Override
  public PermissionListAdapter get() {
    return newInstance();
  }

  public static PermissionListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PermissionListAdapter newInstance() {
    return new PermissionListAdapter();
  }

  private static final class InstanceHolder {
    private static final PermissionListAdapter_Factory INSTANCE = new PermissionListAdapter_Factory();
  }
}

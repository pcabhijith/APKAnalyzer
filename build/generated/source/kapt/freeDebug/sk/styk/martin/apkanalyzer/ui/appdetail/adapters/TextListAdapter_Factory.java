package sk.styk.martin.apkanalyzer.ui.appdetail.adapters;

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
public final class TextListAdapter_Factory implements Factory<TextListAdapter> {
  @Override
  public TextListAdapter get() {
    return newInstance();
  }

  public static TextListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TextListAdapter newInstance() {
    return new TextListAdapter();
  }

  private static final class InstanceHolder {
    private static final TextListAdapter_Factory INSTANCE = new TextListAdapter_Factory();
  }
}

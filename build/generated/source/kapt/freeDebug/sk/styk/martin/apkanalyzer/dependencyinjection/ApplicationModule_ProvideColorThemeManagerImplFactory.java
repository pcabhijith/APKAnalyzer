package sk.styk.martin.apkanalyzer.dependencyinjection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManagerImpl;

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
public final class ApplicationModule_ProvideColorThemeManagerImplFactory implements Factory<ColorThemeManager> {
  private final ApplicationModule module;

  private final Provider<ColorThemeManagerImpl> colorThemeManagerImplProvider;

  public ApplicationModule_ProvideColorThemeManagerImplFactory(ApplicationModule module,
      Provider<ColorThemeManagerImpl> colorThemeManagerImplProvider) {
    this.module = module;
    this.colorThemeManagerImplProvider = colorThemeManagerImplProvider;
  }

  @Override
  public ColorThemeManager get() {
    return provideColorThemeManagerImpl(module, colorThemeManagerImplProvider.get());
  }

  public static ApplicationModule_ProvideColorThemeManagerImplFactory create(
      ApplicationModule module, Provider<ColorThemeManagerImpl> colorThemeManagerImplProvider) {
    return new ApplicationModule_ProvideColorThemeManagerImplFactory(module, colorThemeManagerImplProvider);
  }

  public static ColorThemeManager provideColorThemeManagerImpl(ApplicationModule instance,
      ColorThemeManagerImpl colorThemeManagerImpl) {
    return Preconditions.checkNotNullFromProvides(instance.provideColorThemeManagerImpl(colorThemeManagerImpl));
  }
}

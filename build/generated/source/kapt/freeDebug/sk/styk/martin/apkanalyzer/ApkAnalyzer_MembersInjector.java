package sk.styk.martin.apkanalyzer;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager;

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
public final class ApkAnalyzer_MembersInjector implements MembersInjector<ApkAnalyzer> {
  private final Provider<ColorThemeManager> colorThemeManagerProvider;

  public ApkAnalyzer_MembersInjector(Provider<ColorThemeManager> colorThemeManagerProvider) {
    this.colorThemeManagerProvider = colorThemeManagerProvider;
  }

  public static MembersInjector<ApkAnalyzer> create(
      Provider<ColorThemeManager> colorThemeManagerProvider) {
    return new ApkAnalyzer_MembersInjector(colorThemeManagerProvider);
  }

  @Override
  public void injectMembers(ApkAnalyzer instance) {
    injectColorThemeManager(instance, colorThemeManagerProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ApkAnalyzer.colorThemeManager")
  public static void injectColorThemeManager(ApkAnalyzer instance,
      ColorThemeManager colorThemeManager) {
    instance.colorThemeManager = colorThemeManager;
  }
}

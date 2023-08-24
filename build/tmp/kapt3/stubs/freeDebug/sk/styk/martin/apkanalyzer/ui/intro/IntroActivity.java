package sk.styk.martin.apkanalyzer.ui.intro;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/intro/IntroActivity;", "Lcom/github/appintro/AppIntro;", "()V", "persistenceManager", "Lsk/styk/martin/apkanalyzer/manager/persistence/PersistenceManager;", "getPersistenceManager", "()Lsk/styk/martin/apkanalyzer/manager/persistence/PersistenceManager;", "setPersistenceManager", "(Lsk/styk/martin/apkanalyzer/manager/persistence/PersistenceManager;)V", "finishIntro", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDonePressed", "currentFragment", "Landroidx/fragment/app/Fragment;", "onSkipPressed", "app_freeDebug"})
public final class IntroActivity extends com.github.appintro.AppIntro {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager persistenceManager;
    
    public IntroActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager getPersistenceManager() {
        return null;
    }
    
    public final void setPersistenceManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onSkipPressed(@org.jetbrains.annotations.Nullable
    androidx.fragment.app.Fragment currentFragment) {
    }
    
    @java.lang.Override
    protected void onDonePressed(@org.jetbrains.annotations.Nullable
    androidx.fragment.app.Fragment currentFragment) {
    }
    
    private final void finishIntro() {
    }
}
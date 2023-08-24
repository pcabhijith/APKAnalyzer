package sk.styk.martin.apkanalyzer.manager.persistence;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/persistence/PersistenceManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "appStartNumber", "getAppStartNumber", "()I", "setAppStartNumber", "(I)V", "", "isOnboardingRequired", "()Z", "setOnboardingRequired", "(Z)V", "", "lastPromoShowTime", "getLastPromoShowTime", "()J", "setLastPromoShowTime", "(J)V", "app_freeDebug"})
public final class PersistenceManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject
    public PersistenceManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final boolean isOnboardingRequired() {
        return false;
    }
    
    public final void setOnboardingRequired(boolean value) {
    }
    
    public final long getLastPromoShowTime() {
        return 0L;
    }
    
    public final void setLastPromoShowTime(long value) {
    }
    
    public final int getAppStartNumber() {
        return 0;
    }
    
    public final void setAppStartNumber(int value) {
    }
}
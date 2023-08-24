package sk.styk.martin.apkanalyzer.manager.backpress;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager;", "", "()V", "backPressedListeners", "", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedListener;", "Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager$RegistrationData;", "onBackPressed", "", "registerBackPressedListener", "", "listener", "unregisterBackPressedListener", "RegistrationData", "app_freeDebug"})
@dagger.hilt.android.scopes.ActivityScoped
public final class BackPressedManager {
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<sk.styk.martin.apkanalyzer.manager.backpress.BackPressedListener, sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager.RegistrationData> backPressedListeners = null;
    
    @javax.inject.Inject
    public BackPressedManager() {
        super();
    }
    
    public final boolean onBackPressed() {
        return false;
    }
    
    public final void registerBackPressedListener(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.backpress.BackPressedListener listener) {
    }
    
    public final void unregisterBackPressedListener(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.backpress.BackPressedListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/backpress/BackPressedManager$RegistrationData;", "", "regTime", "", "(J)V", "getRegTime", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_freeDebug"})
    static final class RegistrationData {
        private final long regTime = 0L;
        
        public RegistrationData(long regTime) {
            super();
        }
        
        public final long getRegTime() {
            return 0L;
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager.RegistrationData copy(long regTime) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}
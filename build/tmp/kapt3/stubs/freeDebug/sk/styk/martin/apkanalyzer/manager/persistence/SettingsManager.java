package sk.styk.martin.apkanalyzer.manager.persistence;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager$ColorScheme;", "colorScheme", "getColorScheme", "()Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager$ColorScheme;", "setColorScheme", "(Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager$ColorScheme;)V", "ColorScheme", "app_freeDebug"})
public final class SettingsManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject
    public SettingsManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.persistence.SettingsManager.ColorScheme getColorScheme() {
        return null;
    }
    
    public final void setColorScheme(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.persistence.SettingsManager.ColorScheme value) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager$ColorScheme;", "", "persisted", "", "(Ljava/lang/String;ILjava/lang/String;)V", "persist", "LIGHT", "DARK", "DEFAULT", "Companion", "app_freeDebug"})
    public static enum ColorScheme {
        /*public static final*/ LIGHT /* = new LIGHT(null) */,
        /*public static final*/ DARK /* = new DARK(null) */,
        /*public static final*/ DEFAULT /* = new DEFAULT(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String persisted = null;
        @org.jetbrains.annotations.NotNull
        public static final sk.styk.martin.apkanalyzer.manager.persistence.SettingsManager.ColorScheme.Companion Companion = null;
        
        ColorScheme(java.lang.String persisted) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String persist() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager$ColorScheme$Companion;", "", "()V", "from", "Lsk/styk/martin/apkanalyzer/manager/persistence/SettingsManager$ColorScheme;", "persisted", "", "app_freeDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final sk.styk.martin.apkanalyzer.manager.persistence.SettingsManager.ColorScheme from(@org.jetbrains.annotations.NotNull
            java.lang.String persisted) {
                return null;
            }
        }
    }
}
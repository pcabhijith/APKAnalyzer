package sk.styk.martin.apkanalyzer.util;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\b\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/util/AppFlavour;", "", "()V", "FREE", "", "PREMIUM", "isPremium", "", "()Z", "app_freeDebug"})
public final class AppFlavour {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FREE = "free";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREMIUM = "premium";
    private static final boolean isPremium = false;
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.util.AppFlavour INSTANCE = null;
    
    private AppFlavour() {
        super();
    }
    
    public final boolean isPremium() {
        return false;
    }
}
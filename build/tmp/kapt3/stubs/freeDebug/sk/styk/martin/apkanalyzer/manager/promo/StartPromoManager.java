package sk.styk.martin.apkanalyzer.manager.promo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/promo/StartPromoManager;", "", "persistenceManager", "Lsk/styk/martin/apkanalyzer/manager/persistence/PersistenceManager;", "(Lsk/styk/martin/apkanalyzer/manager/persistence/PersistenceManager;)V", "getPromoAction", "Lsk/styk/martin/apkanalyzer/manager/promo/StartPromoManager$PromoResult;", "shouldShowPromo", "", "PromoResult", "app_freeDebug"})
public final class StartPromoManager {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager persistenceManager = null;
    
    @javax.inject.Inject
    public StartPromoManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager persistenceManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.promo.StartPromoManager.PromoResult getPromoAction() {
        return null;
    }
    
    private final boolean shouldShowPromo() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/promo/StartPromoManager$PromoResult;", "", "(Ljava/lang/String;I)V", "NO_ACTION", "ONBOARDING", "PROMO_DIALOG", "INAPP_RATE_DIALOG", "app_freeDebug"})
    public static enum PromoResult {
        /*public static final*/ NO_ACTION /* = new NO_ACTION() */,
        /*public static final*/ ONBOARDING /* = new ONBOARDING() */,
        /*public static final*/ PROMO_DIALOG /* = new PROMO_DIALOG() */,
        /*public static final*/ INAPP_RATE_DIALOG /* = new INAPP_RATE_DIALOG() */;
        
        PromoResult() {
        }
    }
}
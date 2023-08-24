package sk.styk.martin.apkanalyzer.manager.clipboard;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/clipboard/ClipBoardManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "copyToClipBoard", "", "text", "", "label", "Lsk/styk/martin/apkanalyzer/util/TextInfo;", "app_freeDebug"})
public final class ClipBoardManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public ClipBoardManager(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void copyToClipBoard(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.util.TextInfo text, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.util.TextInfo label) {
    }
    
    public final void copyToClipBoard(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence text, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence label) {
    }
}
package sk.styk.martin.apkanalyzer.manager.file;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J=\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/file/DrawableSaveManager;", "", "contentResolver", "Landroid/content/ContentResolver;", "mediaManager", "Lsk/styk/martin/apkanalyzer/manager/media/MediaManager;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "(Landroid/content/ContentResolver;Lsk/styk/martin/apkanalyzer/manager/media/MediaManager;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;)V", "save", "", "stream", "Ljava/io/OutputStream;", "bitmap", "Landroid/graphics/Bitmap;", "saveDrawable", "Landroid/net/Uri;", "drawable", "Landroid/graphics/drawable/Drawable;", "fileName", "", "mimeType", "directory", "mediaContentUri", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_freeDebug"})
public final class DrawableSaveManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.ContentResolver contentResolver = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.media.MediaManager mediaManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    
    @javax.inject.Inject
    public DrawableSaveManager(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.media.MediaManager mediaManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveDrawable(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.lang.String mimeType, @org.jetbrains.annotations.NotNull
    java.lang.String directory, @org.jetbrains.annotations.NotNull
    android.net.Uri mediaContentUri, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.net.Uri> $completion) {
        return null;
    }
    
    private final boolean save(java.io.OutputStream stream, android.graphics.Bitmap bitmap) {
        return false;
    }
}
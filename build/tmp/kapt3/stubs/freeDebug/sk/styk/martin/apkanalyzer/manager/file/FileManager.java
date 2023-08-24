package sk.styk.martin.apkanalyzer.manager.file;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0018R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/file/FileManager;", "", "context", "Landroid/content/Context;", "contentResolver", "Landroid/content/ContentResolver;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "(Landroid/content/Context;Landroid/content/ContentResolver;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;)V", "cacheDirectory", "Ljava/io/File;", "kotlin.jvm.PlatformType", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory$delegate", "Lkotlin/Lazy;", "copy", "", "src", "Ljava/io/InputStream;", "dst", "(Ljava/io/InputStream;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTempFileFromUri", "uri", "Landroid/net/Uri;", "fileName", "", "(Landroid/net/Uri;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTempFile", "writeString", "content", "targetFileUri", "app_freeDebug"})
public final class FileManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.ContentResolver contentResolver = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cacheDirectory$delegate = null;
    
    @javax.inject.Inject
    public FileManager(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    private final java.io.File getCacheDirectory() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object createTempFileFromUri(@org.jetbrains.annotations.NotNull
    android.net.Uri uri, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.io.File> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final void deleteTempFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) throws java.io.IOException {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final void writeString(@org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    android.net.Uri targetFileUri) throws java.io.IOException {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object copy(@org.jetbrains.annotations.NotNull
    java.io.InputStream src, @org.jetbrains.annotations.NotNull
    java.io.File dst, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}
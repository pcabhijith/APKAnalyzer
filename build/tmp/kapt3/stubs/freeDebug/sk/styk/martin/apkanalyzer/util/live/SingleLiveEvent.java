package sk.styk.martin.apkanalyzer.util.live;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0017J\b\u0010\r\u001a\u00020\u0007H\u0007J\u0017\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "pending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "call", "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "postCall", "postValue", "t", "(Ljava/lang/Object;)V", "setValue", "Companion", "app_freeDebug"})
public class SingleLiveEvent<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean pending = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "SingleLiveEvent";
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.util.live.SingleLiveEvent.Companion Companion = null;
    
    public SingleLiveEvent() {
        super(null);
    }
    
    @java.lang.Override
    @androidx.annotation.MainThread
    public void observe(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    @java.lang.Override
    @androidx.annotation.MainThread
    public void setValue(@org.jetbrains.annotations.Nullable
    T t) {
    }
    
    @java.lang.Override
    @androidx.annotation.AnyThread
    public void postValue(@org.jetbrains.annotations.Nullable
    T t) {
    }
    
    @androidx.annotation.MainThread
    public final void call() {
    }
    
    @androidx.annotation.AnyThread
    public final void postCall() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lsk/styk/martin/apkanalyzer/util/live/SingleLiveEvent$Companion;", "", "()V", "TAG", "", "app_freeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
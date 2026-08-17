package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import i7.C2735B;
import j7.AbstractC2800q;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c\u0012\u0004\u0012\u00020\u00130\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0018\u00010\u001fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldCreateDestructorThread", "<init>", "(Z)V", "Ljava/lang/Thread;", "Li7/B;", "deallocator", "(Ljava/lang/Thread;)V", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "deallocate$expo_modules_core_release", "()Li7/B;", "deallocate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/jni/HybridData;", "inspectMemory", "()Ljava/util/List;", "close", "()V", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/ref/PhantomReference;", "destructorMap", "Ljava/util/Map;", "Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;", "destructorThread", "Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;", "DeallocatorThread", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class JNIDeallocator implements AutoCloseable {
    private final Map<PhantomReference<Destructible>, HybridData> destructorMap;
    private final DeallocatorThread destructorThread;
    private final ReferenceQueue<Destructible> referenceQueue;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;", "Ljava/lang/Thread;", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "Li7/B;", "run", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class DeallocatorThread extends Thread {
        public DeallocatorThread() {
            super("Expo JNI deallocator");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            JNIDeallocator.this.deallocator(this);
        }
    }

    public JNIDeallocator() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deallocator(Thread thread) {
        while (!thread.isInterrupted()) {
            try {
                Reference<? extends Destructible> referenceRemove = this.referenceQueue.remove();
                HybridData hybridData = this.destructorMap.get(referenceRemove);
                if (hybridData != null) {
                    hybridData.resetNative();
                }
                synchronized (this) {
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @DoNotStrip
    public final void addReference(Destructible destructible) {
        AbstractC2855l.g(destructible, "destructible");
        synchronized (this) {
            this.destructorMap.put(new PhantomReference<>(destructible, this.referenceQueue), destructible.getMHybridData());
            C2735B c2735b = C2735B.f28704a;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        deallocate$expo_modules_core_release();
    }

    public final C2735B deallocate$expo_modules_core_release() {
        C2735B c2735b;
        synchronized (this) {
            try {
                Iterator<T> it = this.destructorMap.values().iterator();
                while (it.hasNext()) {
                    ((HybridData) it.next()).resetNative();
                }
                this.destructorMap.clear();
                DeallocatorThread deallocatorThread = this.destructorThread;
                if (deallocatorThread != null) {
                    deallocatorThread.interrupt();
                    c2735b = C2735B.f28704a;
                } else {
                    c2735b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2735b;
    }

    public final List<HybridData> inspectMemory() {
        ArrayList arrayList;
        boolean zIsValid;
        synchronized (this) {
            try {
                Collection<HybridData> collectionValues = this.destructorMap.values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionValues) {
                    HybridData hybridData = (HybridData) obj;
                    synchronized (hybridData) {
                        zIsValid = hybridData.isValid();
                    }
                    if (zIsValid) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC2800q.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add((HybridData) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public JNIDeallocator(boolean z10) {
        DeallocatorThread deallocatorThread;
        this.referenceQueue = new ReferenceQueue<>();
        this.destructorMap = new LinkedHashMap();
        if (z10) {
            deallocatorThread = new DeallocatorThread();
            deallocatorThread.start();
        } else {
            deallocatorThread = null;
        }
        this.destructorThread = deallocatorThread;
    }

    public /* synthetic */ JNIDeallocator(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}

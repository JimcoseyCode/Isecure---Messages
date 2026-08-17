package com.margelo.nitro.core;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/core/HybridObject;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "getCxxPart", "()Lcom/margelo/nitro/core/HybridObject$CxxPart;", "Li7/B;", "dispose", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "createCxxPart", "Ljava/lang/ref/WeakReference;", "cxxPartCache", "Ljava/lang/ref/WeakReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMemorySize", "()J", "memorySize", "CxxPart", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC3112a
public abstract class HybridObject {
    private WeakReference<CxxPart> cxxPartCache;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\tH\u0094 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/core/HybridObject$CxxPart;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "javaPart", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "(Lcom/margelo/nitro/core/HybridObject;)V", "getJavaPart", "()Lcom/margelo/nitro/core/HybridObject;", "mHybridData", "Lcom/facebook/jni/HybridData;", "initHybrid", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @InterfaceC3112a
    protected static class CxxPart {

        @Keep
        @InterfaceC3112a
        private final HybridObject javaPart;

        @Keep
        @InterfaceC3112a
        private HybridData mHybridData;

        public CxxPart(HybridObject javaPart) {
            AbstractC2855l.g(javaPart, "javaPart");
            this.javaPart = javaPart;
            this.mHybridData = initHybrid();
        }

        public final HybridObject getJavaPart() {
            return this.javaPart;
        }

        protected native HybridData initHybrid();
    }

    @Keep
    @InterfaceC3112a
    private final CxxPart getCxxPart() {
        CxxPart cxxPart;
        WeakReference<CxxPart> weakReference = this.cxxPartCache;
        if (weakReference != null && (cxxPart = weakReference.get()) != null) {
            return cxxPart;
        }
        CxxPart cxxPartCreateCxxPart = createCxxPart();
        this.cxxPartCache = new WeakReference<>(cxxPartCreateCxxPart);
        return cxxPartCreateCxxPart;
    }

    protected CxxPart createCxxPart() {
        return new CxxPart(this);
    }

    @Keep
    @InterfaceC3112a
    public long getMemorySize() {
        return 0L;
    }

    @Keep
    @InterfaceC3112a
    public String toString() {
        return "[HybridObject " + D.b(getClass()).o() + "]";
    }

    @Keep
    @InterfaceC3112a
    public void dispose() {
    }
}

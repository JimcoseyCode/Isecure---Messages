package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import v7.C3431b;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2846c implements C7.c, Serializable {
    public static final Object NO_RECEIVER = a.f29387g;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C7.c reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final a f29387g = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f29387g;
        }
    }

    public AbstractC2846c() {
        this(NO_RECEIVER);
    }

    @Override // C7.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // C7.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C7.c compute() {
        C7.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        C7.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    protected abstract C7.c computeReflected();

    @Override // C7.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // C7.c
    public String getName() {
        return this.name;
    }

    public C7.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? D.c(cls) : D.b(cls);
    }

    @Override // C7.c
    public List<C7.j> getParameters() {
        return getReflected().getParameters();
    }

    protected C7.c getReflected() {
        C7.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new C3431b();
    }

    @Override // C7.c
    public C7.o getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // C7.c
    public List<C7.p> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // C7.c
    public C7.s getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // C7.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // C7.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // C7.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // C7.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC2846c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC2846c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}

package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2852i extends AbstractC2846c implements InterfaceC2851h, C7.g {
    private final int arity;
    private final int flags;

    public AbstractC2852i(int i10) {
        this(i10, AbstractC2846c.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC2846c
    protected C7.c computeReflected() {
        return D.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2852i) {
            AbstractC2852i abstractC2852i = (AbstractC2852i) obj;
            return getName().equals(abstractC2852i.getName()) && getSignature().equals(abstractC2852i.getSignature()) && this.flags == abstractC2852i.flags && this.arity == abstractC2852i.arity && AbstractC2855l.b(getBoundReceiver(), abstractC2852i.getBoundReceiver()) && AbstractC2855l.b(getOwner(), abstractC2852i.getOwner());
        }
        if (obj instanceof C7.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2851h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // C7.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // C7.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // C7.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // C7.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C7.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC2852i(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC2846c
    public C7.g getReflected() {
        return (C7.g) super.getReflected();
    }

    public AbstractC2852i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}

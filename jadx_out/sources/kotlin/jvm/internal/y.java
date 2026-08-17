package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends AbstractC2846c implements C7.k {
    private final boolean syntheticJavaProperty;

    public y() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC2846c
    public C7.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return getOwner().equals(yVar.getOwner()) && getName().equals(yVar.getName()) && getSignature().equals(yVar.getSignature()) && AbstractC2855l.b(getBoundReceiver(), yVar.getBoundReceiver());
        }
        if (obj instanceof C7.k) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // C7.k
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // C7.k
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C7.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC2846c
    public C7.k getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (C7.k) super.getReflected();
    }

    public y(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}

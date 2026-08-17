package x1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class x implements v1.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Q1.h f33482j = new Q1.h(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.b f33483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1.f f33484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v1.f f33485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f33487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f33488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v1.h f33489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v1.l f33490i;

    x(y1.b bVar, v1.f fVar, v1.f fVar2, int i10, int i11, v1.l lVar, Class cls, v1.h hVar) {
        this.f33483b = bVar;
        this.f33484c = fVar;
        this.f33485d = fVar2;
        this.f33486e = i10;
        this.f33487f = i11;
        this.f33490i = lVar;
        this.f33488g = cls;
        this.f33489h = hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private byte[] b() {
        Q1.h hVar = f33482j;
        byte[] bArr = (byte[]) hVar.g(this.f33488g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f33488g.getName().getBytes(v1.f.f32884a);
        hVar.k(this.f33488g, bytes);
        return bytes;
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f33487f == xVar.f33487f && this.f33486e == xVar.f33486e && Q1.l.e(this.f33490i, xVar.f33490i) && this.f33488g.equals(xVar.f33488g) && this.f33484c.equals(xVar.f33484c) && this.f33485d.equals(xVar.f33485d) && this.f33489h.equals(xVar.f33489h)) {
                return true;
            }
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        int iHashCode = (((((this.f33484c.hashCode() * 31) + this.f33485d.hashCode()) * 31) + this.f33486e) * 31) + this.f33487f;
        v1.l lVar = this.f33490i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f33488g.hashCode()) * 31) + this.f33489h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f33484c + ", signature=" + this.f33485d + ", width=" + this.f33486e + ", height=" + this.f33487f + ", decodedResourceClass=" + this.f33488g + ", transformation='" + this.f33490i + "', options=" + this.f33489h + '}';
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f33483b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f33486e).putInt(this.f33487f).array();
        this.f33485d.updateDiskCacheKey(messageDigest);
        this.f33484c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        v1.l lVar = this.f33490i;
        if (lVar != null) {
            lVar.updateDiskCacheKey(messageDigest);
        }
        this.f33489h.updateDiskCacheKey(messageDigest);
        messageDigest.update(b());
        this.f33483b.put(bArr);
    }
}

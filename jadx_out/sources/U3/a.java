package U3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f11342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f11344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f11345d;

    a(Integer num, Object obj, e eVar, f fVar) {
        this.f11342a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f11343b = obj;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f11344c = eVar;
        this.f11345d = fVar;
    }

    @Override // U3.d
    public Integer a() {
        return this.f11342a;
    }

    @Override // U3.d
    public Object b() {
        return this.f11343b;
    }

    @Override // U3.d
    public e c() {
        return this.f11344c;
    }

    @Override // U3.d
    public f d() {
        return this.f11345d;
    }

    public boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f11342a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f11343b.equals(dVar.b()) && this.f11344c.equals(dVar.c()) && ((fVar = this.f11345d) != null ? fVar.equals(dVar.d()) : dVar.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f11342a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f11343b.hashCode()) * 1000003) ^ this.f11344c.hashCode()) * 1000003;
        f fVar = this.f11345d;
        return iHashCode ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f11342a + ", payload=" + this.f11343b + ", priority=" + this.f11344c + ", productData=" + this.f11345d + "}";
    }
}

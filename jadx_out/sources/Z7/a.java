package Z7;

import C8.AbstractC0407d0;
import C8.G;
import C8.I0;
import L7.m0;
import j7.T;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0 f13625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f13626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f13627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f13628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f13629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC0407d0 f13630i;

    public /* synthetic */ a(I0 i02, c cVar, boolean z10, boolean z11, Set set, AbstractC0407d0 abstractC0407d0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i02, (i10 & 2) != 0 ? c.f13631g : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : abstractC0407d0);
    }

    public static /* synthetic */ a f(a aVar, I0 i02, c cVar, boolean z10, boolean z11, Set set, AbstractC0407d0 abstractC0407d0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i02 = aVar.f13625d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f13626e;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f13627f;
        }
        if ((i10 & 8) != 0) {
            z11 = aVar.f13628g;
        }
        if ((i10 & 16) != 0) {
            set = aVar.f13629h;
        }
        if ((i10 & 32) != 0) {
            abstractC0407d0 = aVar.f13630i;
        }
        Set set2 = set;
        AbstractC0407d0 abstractC0407d02 = abstractC0407d0;
        return aVar.e(i02, cVar, z10, z11, set2, abstractC0407d02);
    }

    @Override // C8.G
    public AbstractC0407d0 a() {
        return this.f13630i;
    }

    @Override // C8.G
    public I0 b() {
        return this.f13625d;
    }

    @Override // C8.G
    public Set c() {
        return this.f13629h;
    }

    public final a e(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC0407d0 abstractC0407d0) {
        AbstractC2855l.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC2855l.g(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, abstractC0407d0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC2855l.b(aVar.a(), a()) && aVar.b() == b() && aVar.f13626e == this.f13626e && aVar.f13627f == this.f13627f && aVar.f13628g == this.f13628g;
    }

    public final c g() {
        return this.f13626e;
    }

    public final boolean h() {
        return this.f13628g;
    }

    @Override // C8.G
    public int hashCode() {
        AbstractC0407d0 abstractC0407d0A = a();
        int iHashCode = abstractC0407d0A != null ? abstractC0407d0A.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f13626e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f13627f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f13628g ? 1 : 0);
    }

    public final boolean i() {
        return this.f13627f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(AbstractC0407d0 abstractC0407d0) {
        return f(this, null, null, false, false, null, abstractC0407d0, 31, null);
    }

    public final a l(c flexibility) {
        AbstractC2855l.g(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // C8.G
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(m0 typeParameter) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? T.l(c(), typeParameter) : T.d(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f13625d + ", flexibility=" + this.f13626e + ", isRaw=" + this.f13627f + ", isForAnnotationParameter=" + this.f13628g + ", visitedTypeParameters=" + this.f13629h + ", defaultType=" + this.f13630i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC0407d0 abstractC0407d0) {
        super(howThisTypeIsUsed, set, abstractC0407d0);
        AbstractC2855l.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC2855l.g(flexibility, "flexibility");
        this.f13625d = howThisTypeIsUsed;
        this.f13626e = flexibility;
        this.f13627f = z10;
        this.f13628g = z11;
        this.f13629h = set;
        this.f13630i = abstractC0407d0;
    }
}

package I4;

import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class G2 implements v5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final G2 f4109a = new G2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.c f4110b;

    static {
        c.b bVarA = v5.c.a("format");
        J0 j02 = new J0();
        j02.a(1);
        f4110b = bVarA.b(j02.b()).a();
    }

    private G2() {
    }

    @Override // v5.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((v5.e) obj2).a(f4110b, ((C0883g9) obj).a());
    }
}

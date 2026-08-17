package s2;

import Y2.C1533t;
import Y2.y;
import a2.i;
import android.content.Context;
import c2.n;
import java.util.Set;
import v2.AbstractC3419a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1533t f32263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f32264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f32265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f32266e;

    public g(Context context, C3318b c3318b) {
        this(context, y.l(), c3318b);
    }

    @Override // c2.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f get() {
        return new f(this.f32262a, this.f32264c, this.f32263b, this.f32265d, this.f32266e).K(null);
    }

    public g(Context context, y yVar, C3318b c3318b) {
        this(context, yVar, null, null, c3318b);
    }

    public g(Context context, y yVar, Set set, Set set2, C3318b c3318b) {
        this.f32262a = context;
        C1533t c1533tJ = yVar.j();
        this.f32263b = c1533tJ;
        if (c3318b != null && c3318b.d() != null) {
            this.f32264c = c3318b.d();
        } else {
            this.f32264c = new h();
        }
        this.f32264c.a(context.getResources(), AbstractC3419a.b(), yVar.b(context), yVar.q(), i.B(), c1533tJ.q(), c3318b != null ? c3318b.a() : null, c3318b != null ? c3318b.b() : null);
        this.f32265d = set;
        this.f32266e = set2;
        if (c3318b != null) {
            c3318b.c();
        }
    }
}

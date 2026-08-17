package A3;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f45b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46c;

    public f(Context context, int i10) {
        this.f44a = context;
        this.f46c = i10;
        a aVar = new a(5);
        this.f45b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    @Override // A3.i
    public h get() {
        return new e(new g(this.f44a, this.f45b), new b(this.f44a, this.f45b), new l(), new c(this.f44a), new j(this.f46c), new d(), new k(), new l());
    }
}

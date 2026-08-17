package J1;

import J1.b;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f5327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final b.a f5328h;

    d(Context context, b.a aVar) {
        this.f5327g = context.getApplicationContext();
        this.f5328h = aVar;
    }

    private void a() {
        r.a(this.f5327g).d(this.f5328h);
    }

    private void b() {
        r.a(this.f5327g).e(this.f5328h);
    }

    @Override // J1.l
    public void onStart() {
        a();
    }

    @Override // J1.l
    public void onStop() {
        b();
    }

    @Override // J1.l
    public void onDestroy() {
    }
}

package E0;

import E0.g;
import E0.h;
import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.c f1013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f1014b;

    /* JADX INFO: renamed from: E0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class RunnableC0033a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.c f1015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Typeface f1016h;

        RunnableC0033a(h.c cVar, Typeface typeface) {
            this.f1015g = cVar;
            this.f1016h = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1015g.b(this.f1016h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.c f1018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f1019h;

        b(h.c cVar, int i10) {
            this.f1018g = cVar;
            this.f1019h = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1018g.a(this.f1019h);
        }
    }

    a(h.c cVar, Executor executor) {
        this.f1013a = cVar;
        this.f1014b = executor;
    }

    private void a(int i10) {
        this.f1014b.execute(new b(this.f1013a, i10));
    }

    private void c(Typeface typeface) {
        this.f1014b.execute(new RunnableC0033a(this.f1013a, typeface));
    }

    void b(g.e eVar) {
        if (eVar.a()) {
            c(eVar.f1049a);
        } else {
            a(eVar.f1050b);
        }
    }
}

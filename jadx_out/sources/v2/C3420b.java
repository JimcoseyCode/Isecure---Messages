package v2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import v2.AbstractC3419a;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3420b extends AbstractC3419a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f32895b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f32899f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f32897d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f32898e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f32896c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: v2.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3420b.this.f32895b) {
                ArrayList arrayList = C3420b.this.f32898e;
                C3420b c3420b = C3420b.this;
                c3420b.f32898e = c3420b.f32897d;
                C3420b.this.f32897d = arrayList;
            }
            int size = C3420b.this.f32898e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC3419a.InterfaceC0362a) C3420b.this.f32898e.get(i10)).a();
            }
            C3420b.this.f32898e.clear();
        }
    }

    @Override // v2.AbstractC3419a
    public void a(AbstractC3419a.InterfaceC0362a interfaceC0362a) {
        synchronized (this.f32895b) {
            this.f32897d.remove(interfaceC0362a);
        }
    }

    @Override // v2.AbstractC3419a
    public void d(AbstractC3419a.InterfaceC0362a interfaceC0362a) {
        if (!AbstractC3419a.c()) {
            interfaceC0362a.a();
            return;
        }
        synchronized (this.f32895b) {
            try {
                if (this.f32897d.contains(interfaceC0362a)) {
                    return;
                }
                this.f32897d.add(interfaceC0362a);
                boolean z10 = true;
                if (this.f32897d.size() != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f32896c.post(this.f32899f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

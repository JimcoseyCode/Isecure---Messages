package D0;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f733d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f733d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f730a) {
                    return;
                }
                this.f730a = true;
                this.f733d = true;
                a aVar = this.f731b;
                Object obj = this.f732c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f733d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f733d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f732c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f732c = cancellationSignal;
                    if (this.f730a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f732c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f731b == aVar) {
                    return;
                }
                this.f731b = aVar;
                if (this.f730a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}

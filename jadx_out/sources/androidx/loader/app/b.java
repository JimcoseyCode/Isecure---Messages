package androidx.loader.app;

import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m0.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f17643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f17644b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends T {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final U.c f17645d = new C0182a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j f17646b = new j();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f17647c = false;

        /* JADX INFO: renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0182a implements U.c {
            C0182a() {
            }

            @Override // androidx.lifecycle.U.c
            public T a(Class cls) {
                return new a();
            }
        }

        a() {
        }

        static a f(V v10) {
            return (a) new U(v10, f17645d).b(a.class);
        }

        @Override // androidx.lifecycle.T
        protected void d() {
            super.d();
            if (this.f17646b.l() <= 0) {
                this.f17646b.b();
            } else {
                android.support.v4.media.session.b.a(this.f17646b.m(0));
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f17646b.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f17646b.l() <= 0) {
                    return;
                }
                android.support.v4.media.session.b.a(this.f17646b.m(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f17646b.i(0));
                printWriter.print(": ");
                throw null;
            }
        }

        void g() {
            if (this.f17646b.l() <= 0) {
                return;
            }
            android.support.v4.media.session.b.a(this.f17646b.m(0));
            throw null;
        }
    }

    b(r rVar, V v10) {
        this.f17643a = rVar;
        this.f17644b = a.f(v10);
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f17644b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f17644b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        H0.b.a(this.f17643a, sb);
        sb.append("}}");
        return sb.toString();
    }
}

package Q2;

import Q2.c;
import c2.AbstractC1840a;
import c2.p;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9084e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f9085f = AbstractC2746i.a(EnumC2749l.f28716g, new InterfaceC3487a() { // from class: Q2.d
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return e.f();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f9087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q2.a f9088c = new Q2.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9089d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int i10, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            }
            if (!inputStream.markSupported()) {
                return AbstractC1840a.b(inputStream, bArr, 0, i10);
            }
            try {
                inputStream.mark(i10);
                return AbstractC1840a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }

        public final c b(InputStream is) {
            AbstractC2855l.g(is, "is");
            return d().c(is);
        }

        public final c c(InputStream is) {
            AbstractC2855l.g(is, "is");
            try {
                return b(is);
            } catch (IOException e10) {
                throw p.a(e10);
            }
        }

        public final e d() {
            return (e) e.f9085f.getValue();
        }

        private a() {
        }
    }

    private e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return f9084e.c(inputStream);
    }

    public static final e e() {
        return f9084e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f() {
        return new e();
    }

    private final void h() {
        this.f9086a = this.f9088c.a();
        List list = this.f9087b;
        if (list != null) {
            AbstractC2855l.d(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f9086a = Math.max(this.f9086a, ((c.b) it.next()).a());
            }
        }
    }

    public final c c(InputStream is) throws IOException {
        AbstractC2855l.g(is, "is");
        int i10 = this.f9086a;
        byte[] bArr = new byte[i10];
        int iE = f9084e.e(i10, is, bArr);
        c cVarB = this.f9088c.b(bArr, iE);
        if (AbstractC2855l.b(cVarB, b.f9077n) && !this.f9089d) {
            cVarB = c.f9081d;
        }
        if (cVarB != c.f9081d) {
            return cVarB;
        }
        List list = this.f9087b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVarB2 = ((c.b) it.next()).b(bArr, iE);
                if (cVarB2 != c.f9081d) {
                    return cVarB2;
                }
            }
        }
        return c.f9081d;
    }

    public final e g(boolean z10) {
        this.f9089d = z10;
        return this;
    }
}

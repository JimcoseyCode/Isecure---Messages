package z8;

import B8.n;
import L7.H;
import f8.m;
import g8.AbstractC2685c;
import g8.C2683a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s8.AbstractC3340e;
import y8.AbstractC3658u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC3658u implements I7.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f34294u = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f34295t;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(k8.c fqName, n storageManager, H module, InputStream inputStream, boolean z10) throws IOException {
            AbstractC2855l.g(fqName, "fqName");
            AbstractC2855l.g(storageManager, "storageManager");
            AbstractC2855l.g(module, "module");
            AbstractC2855l.g(inputStream, "inputStream");
            Pair pairA = AbstractC2685c.a(inputStream);
            m mVar = (m) pairA.getFirst();
            C2683a c2683a = (C2683a) pairA.getSecond();
            if (mVar != null) {
                return new c(fqName, storageManager, module, mVar, c2683a, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C2683a.f28233h + ", actual " + c2683a + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ c(k8.c cVar, n nVar, H h10, m mVar, C2683a c2683a, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, h10, mVar, c2683a, z10);
    }

    @Override // O7.H, O7.AbstractC1334m
    public String toString() {
        return "builtins package fragment for " + d() + " from " + AbstractC3340e.s(this);
    }

    private c(k8.c cVar, n nVar, H h10, m mVar, C2683a c2683a, boolean z10) {
        super(cVar, nVar, h10, mVar, c2683a, null);
        this.f34295t = z10;
    }
}

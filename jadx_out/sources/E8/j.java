package E8;

import C8.v0;
import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f1162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f1163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1164c;

    public j(k kind, String... formatParams) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(formatParams, "formatParams");
        this.f1162a = kind;
        this.f1163b = formatParams;
        String strJ = b.f1126m.j();
        String strJ2 = kind.j();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strJ2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC2855l.f(str, "format(...)");
        String str2 = String.format(strJ, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC2855l.f(str2, "format(...)");
        this.f1164c = str2;
    }

    public final k a() {
        return this.f1162a;
    }

    public final String b(int i10) {
        return this.f1163b[i10];
    }

    @Override // C8.v0
    public Collection g() {
        return AbstractC2800q.j();
    }

    @Override // C8.v0
    public List getParameters() {
        return AbstractC2800q.j();
    }

    @Override // C8.v0
    public I7.i n() {
        return I7.g.f5059h.a();
    }

    @Override // C8.v0
    public v0 o(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // C8.v0
    public InterfaceC1283h p() {
        return l.f1253a.h();
    }

    @Override // C8.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return this.f1164c;
    }
}

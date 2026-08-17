package t4;

import P4.AbstractC1378l;
import P4.C1379m;
import android.content.Context;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.internal.TelemetryData;
import o4.AbstractC3012e;
import o4.C3008a;
import p4.InterfaceC3062i;
import r4.m;
import r4.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC3012e implements m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C3008a.g f32478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C3008a.AbstractC0335a f32479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C3008a f32480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f32481n = 0;

    static {
        C3008a.g gVar = new C3008a.g();
        f32478k = gVar;
        c cVar = new c();
        f32479l = cVar;
        f32480m = new C3008a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, n nVar) {
        super(context, f32480m, nVar, AbstractC3012e.a.f30492c);
    }

    @Override // r4.m
    public final AbstractC1378l a(final TelemetryData telemetryData) {
        d.a aVarA = com.google.android.gms.common.api.internal.d.a();
        aVarA.d(D4.d.f789a);
        aVarA.c(false);
        aVarA.b(new InterfaceC3062i() { // from class: t4.b
            @Override // p4.InterfaceC3062i
            public final void accept(Object obj, Object obj2) {
                int i10 = d.f32481n;
                ((C3364a) ((e) obj).C()).x(telemetryData);
                ((C1379m) obj2).c(null);
            }
        });
        return e(aVarA.a());
    }
}

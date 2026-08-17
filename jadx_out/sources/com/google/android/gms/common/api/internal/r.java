package com.google.android.gms.common.api.internal;

import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import o4.C3009b;
import p4.C3055b;
import r4.C3269j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class r implements InterfaceC1372f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2098b f21092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3055b f21094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f21095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f21096e;

    r(C2098b c2098b, int i10, C3055b c3055b, long j10, long j11, String str, String str2) {
        this.f21092a = c2098b;
        this.f21093b = i10;
        this.f21094c = c3055b;
        this.f21095d = j10;
        this.f21096e = j11;
    }

    static r a(C2098b c2098b, int i10, C3055b c3055b) {
        boolean zK0;
        if (!c2098b.d()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = C3269j.b().a();
        if (rootTelemetryConfigurationA == null) {
            zK0 = true;
        } else {
            if (!rootTelemetryConfigurationA.X()) {
                return null;
            }
            zK0 = rootTelemetryConfigurationA.k0();
            n nVarS = c2098b.s(c3055b);
            if (nVarS != null) {
                if (!(nVarS.v() instanceof com.google.android.gms.common.internal.b)) {
                    return null;
                }
                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) nVarS.v();
                if (bVar.I() && !bVar.d()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(nVarS, bVar, i10);
                    if (connectionTelemetryConfigurationB == null) {
                        return null;
                    }
                    nVarS.G();
                    zK0 = connectionTelemetryConfigurationB.l0();
                }
            }
        }
        return new r(c2098b, i10, c3055b, zK0 ? System.currentTimeMillis() : 0L, zK0 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration b(n nVar, com.google.android.gms.common.internal.b bVar, int i10) {
        int[] iArrS;
        int[] iArrX;
        ConnectionTelemetryConfiguration connectionTelemetryConfigurationG = bVar.G();
        if (connectionTelemetryConfigurationG == null || !connectionTelemetryConfigurationG.k0() || ((iArrS = connectionTelemetryConfigurationG.s()) != null ? !y4.b.a(iArrS, i10) : !((iArrX = connectionTelemetryConfigurationG.X()) == null || !y4.b.a(iArrX, i10))) || nVar.t() >= connectionTelemetryConfigurationG.e()) {
            return null;
        }
        return connectionTelemetryConfigurationG;
    }

    @Override // P4.InterfaceC1372f
    public final void onComplete(AbstractC1378l abstractC1378l) {
        n nVarS;
        int iL0;
        int i10;
        int i11;
        int iE;
        long j10;
        long j11;
        if (this.f21092a.d()) {
            RootTelemetryConfiguration rootTelemetryConfigurationA = C3269j.b().a();
            if ((rootTelemetryConfigurationA == null || rootTelemetryConfigurationA.X()) && (nVarS = this.f21092a.s(this.f21094c)) != null && (nVarS.v() instanceof com.google.android.gms.common.internal.b)) {
                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) nVarS.v();
                int i12 = 0;
                boolean zK0 = this.f21095d > 0;
                int iY = bVar.y();
                int iS = 100;
                if (rootTelemetryConfigurationA != null) {
                    zK0 &= rootTelemetryConfigurationA.k0();
                    int iE2 = rootTelemetryConfigurationA.e();
                    int iS2 = rootTelemetryConfigurationA.s();
                    iL0 = rootTelemetryConfigurationA.l0();
                    if (bVar.I() && !bVar.d()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(nVarS, bVar, this.f21093b);
                        if (connectionTelemetryConfigurationB == null) {
                            return;
                        }
                        boolean z10 = connectionTelemetryConfigurationB.l0() && this.f21095d > 0;
                        iS2 = connectionTelemetryConfigurationB.e();
                        zK0 = z10;
                    }
                    i11 = iE2;
                    i10 = iS2;
                } else {
                    iL0 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C2098b c2098b = this.f21092a;
                int iElapsedRealtime = -1;
                if (abstractC1378l.p()) {
                    iE = 0;
                } else if (abstractC1378l.n()) {
                    i12 = iS;
                    iE = -1;
                } else {
                    Exception excK = abstractC1378l.k();
                    if (excK instanceof C3009b) {
                        Status statusA = ((C3009b) excK).a();
                        iS = statusA.s();
                        ConnectionResult connectionResultE = statusA.e();
                        if (connectionResultE != null) {
                            iE = connectionResultE.e();
                            i12 = iS;
                        }
                        i12 = iS;
                        iE = -1;
                    } else {
                        i12 = 101;
                        iE = -1;
                    }
                }
                if (zK0) {
                    long j12 = this.f21095d;
                    long j13 = this.f21096e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                c2098b.A(new MethodInvocation(this.f21093b, i12, iE, j10, j11, null, null, iY, iElapsedRealtime), iL0, i11, i10);
            }
        }
    }
}

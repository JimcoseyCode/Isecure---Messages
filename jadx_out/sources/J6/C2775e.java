package j6;

import G4.C0684n6;
import G4.C0690o4;
import G4.C0708q6;
import G4.C0715r6;
import G4.EnumC0674m4;
import G4.EnumC0682n4;
import G4.F3;
import G4.z6;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1368b;
import P4.C1379m;
import P4.InterfaceC1372f;
import P4.InterfaceC1377k;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Pair;
import c6.l;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import f6.C2615a;
import i6.C2731b;
import i6.InterfaceC2730a;
import java.util.concurrent.atomic.AtomicReference;
import o4.g;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: j6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2775e implements InterfaceC2730a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final AtomicReference f28884k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f28885l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f28886m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f28887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2731b f28888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0684n6 f28889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0708q6 f28890j;

    public C2775e(Context context, C2731b c2731b) {
        C0708q6 c0708q6A = C0708q6.a(context);
        this.f28889i = z6.b("play-services-code-scanner");
        this.f28887g = context;
        this.f28888h = c2731b;
        this.f28890j = c0708q6A;
    }

    static void c(C2615a c2615a, int i10) {
        Pair pair = (Pair) f28884k.getAndSet(null);
        if (pair != null) {
            if (c2615a != null) {
                ((C1379m) pair.first).c(c2615a);
            } else if (i10 == 201) {
                ((C1368b) pair.second).a();
            } else {
                ((C1379m) pair.first).b(new Y5.a("Failed to scan code.", i10));
            }
        }
    }

    final /* synthetic */ AbstractC1378l a(ModuleAvailabilityResponse moduleAvailabilityResponse) throws Throwable {
        boolean z10 = false;
        if (moduleAvailabilityResponse.e()) {
            if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE").resolveActivity(this.f28887g.getApplicationContext().getPackageManager()) != null) {
                z10 = true;
            }
        }
        synchronized (f28885l) {
            try {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (!z10) {
                    try {
                        if (!f28886m) {
                            l.c(this.f28887g, "barcode_ui");
                            f28886m = true;
                        }
                        b(200, jElapsedRealtime, jCurrentTimeMillis);
                        return AbstractC1381o.e(new Y5.a("Waiting for the Barcode UI module to be downloaded.", 200));
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                AtomicReference atomicReference = f28884k;
                Pair pair = (Pair) atomicReference.getAndSet(null);
                if (pair != null) {
                    ((C1368b) pair.second).a();
                }
                C1368b c1368b = new C1368b();
                C1379m c1379m = new C1379m(c1368b.b());
                atomicReference.set(new Pair(c1379m, c1368b));
                Intent intent = new Intent(this.f28887g, (Class<?>) GmsBarcodeScanningDelegateActivity.class);
                intent.putExtra("extra_supported_formats", this.f28888h.a());
                intent.putExtra("extra_allow_manual_input", this.f28888h.c());
                intent.putExtra("extra_enable_auto_zoom", this.f28888h.b());
                intent.setFlags(268435456);
                this.f28887g.startActivity(intent);
                return c1379m.a().c(new InterfaceC1372f() { // from class: j6.b
                    @Override // P4.InterfaceC1372f
                    public final void onComplete(AbstractC1378l abstractC1378l) {
                        this.f28879a.b(abstractC1378l.n() ? 201 : !abstractC1378l.p() ? ((Y5.a) AbstractC3268i.k((Y5.a) abstractC1378l.k())).a() : 0, jElapsedRealtime, jCurrentTimeMillis);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    final void b(int i10, long j10, long j11) {
        EnumC0674m4 enumC0674m4;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0684n6 c0684n6 = this.f28889i;
        C0690o4 c0690o4 = new C0690o4();
        F3 f32 = new F3();
        f32.d(Integer.valueOf(this.f28888h.a()));
        f32.a(Boolean.valueOf(this.f28888h.c()));
        f32.b(Long.valueOf(jElapsedRealtime - j10));
        if (i10 == 0) {
            enumC0674m4 = EnumC0674m4.NO_ERROR;
        } else if (i10 != 207) {
            switch (i10) {
                case 200:
                    enumC0674m4 = EnumC0674m4.CODE_SCANNER_UNAVAILABLE;
                    break;
                case 201:
                    enumC0674m4 = EnumC0674m4.CODE_SCANNER_CANCELLED;
                    break;
                case 202:
                    enumC0674m4 = EnumC0674m4.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED;
                    break;
                case 203:
                    enumC0674m4 = EnumC0674m4.CODE_SCANNER_APP_NAME_UNAVAILABLE;
                    break;
                case 204:
                    enumC0674m4 = EnumC0674m4.CODE_SCANNER_TASK_IN_PROGRESS;
                    break;
                case 205:
                    enumC0674m4 = EnumC0674m4.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
                    break;
                default:
                    enumC0674m4 = EnumC0674m4.UNKNOWN_ERROR;
                    break;
            }
        } else {
            enumC0674m4 = EnumC0674m4.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
        }
        f32.c(enumC0674m4);
        c0690o4.c(f32.e());
        c0684n6.c(C0715r6.e(c0690o4), EnumC0682n4.CODE_SCANNER_SCAN_API);
        this.f28890j.c(24323, i10, j11, jCurrentTimeMillis);
    }

    @Override // o4.g
    public final Feature[] d() {
        return new Feature[]{l.f18876o};
    }

    @Override // i6.InterfaceC2730a
    public final AbstractC1378l m() {
        if (com.google.android.gms.common.b.f().a(this.f28887g) >= 221500000) {
            return u4.b.a(this.f28887g).b(new g() { // from class: j6.c
                @Override // o4.g
                public final Feature[] d() {
                    AtomicReference atomicReference = C2775e.f28884k;
                    return new Feature[]{l.f18863b};
                }
            }).q(new InterfaceC1377k() { // from class: j6.d
                @Override // P4.InterfaceC1377k
                public final AbstractC1378l a(Object obj) {
                    return this.f28883a.a((ModuleAvailabilityResponse) obj);
                }
            });
        }
        b(207, SystemClock.elapsedRealtime(), System.currentTimeMillis());
        return AbstractC1381o.e(new Y5.a("Code scanner module is not supported on current Google Play Services version, please upgrade.", 207));
    }
}

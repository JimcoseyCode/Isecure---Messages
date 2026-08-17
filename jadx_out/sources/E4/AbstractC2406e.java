package e4;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import e4.C2402a;

/* JADX INFO: renamed from: e4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2406e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC2406e f25878a = a().f(10485760).d(200).b(ModuleDescriptor.MODULE_VERSION).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: e4.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {
        a() {
        }

        abstract AbstractC2406e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    AbstractC2406e() {
    }

    static a a() {
        return new C2402a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}

package v6;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: v6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3429a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3429a f32948a = new C3429a();

    private C3429a() {
    }

    public static /* synthetic */ void b(C3429a c3429a, String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        c3429a.a(str, str2, th);
    }

    public static /* synthetic */ void d(C3429a c3429a, String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        c3429a.c(str, str2, th);
    }

    public final void a(String str, String message, Throwable th) {
        AbstractC2855l.g(message, "message");
    }

    public final void c(String str, String message, Throwable th) {
        AbstractC2855l.g(message, "message");
    }
}

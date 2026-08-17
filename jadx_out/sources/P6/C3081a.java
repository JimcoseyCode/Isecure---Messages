package p6;

import android.os.Build;

/* JADX INFO: renamed from: p6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3081a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3081a f30663a = new C3081a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f30664b;

    static {
        f30664b = Build.VERSION.SDK_INT < 30;
    }

    private C3081a() {
    }

    public final boolean a() {
        return f30664b;
    }
}

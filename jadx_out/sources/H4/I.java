package H4;

import P4.AbstractC1378l;
import android.content.Context;
import c6.AbstractC1858c;
import c6.C1862g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import r4.C3266g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AbstractC0787i f3740i = AbstractC0787i.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f3743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.m f3744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1378l f3745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1378l f3746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3748h;

    public I(Context context, final c6.m mVar, B b10, String str) {
        new HashMap();
        new HashMap();
        this.f3741a = context.getPackageName();
        this.f3742b = AbstractC1858c.a(context);
        this.f3744d = mVar;
        this.f3743c = b10;
        T.a();
        this.f3747g = str;
        this.f3745e = C1862g.a().b(new Callable() { // from class: H4.G
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3738a.a();
            }
        });
        C1862g c1862gA = C1862g.a();
        Objects.requireNonNull(mVar);
        this.f3746f = c1862gA.b(new Callable() { // from class: H4.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC0787i abstractC0787i = f3740i;
        this.f3748h = abstractC0787i.containsKey(str) ? DynamiteModule.b(context, (String) abstractC0787i.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C3266g.a().b(this.f3747g);
    }
}

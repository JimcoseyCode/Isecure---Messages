package y2;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.AbstractC2855l;
import w2.C3470c;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3610a extends C3470c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3611b f33927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33928i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f33929j = -1;

    public C3610a(InterfaceC3611b interfaceC3611b) {
        this.f33927h = interfaceC3611b;
    }

    @Override // w2.C3470c, w2.InterfaceC3471d
    public void onFinalImageSet(String id, Object obj, Animatable animatable) {
        AbstractC2855l.g(id, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f33929j = jCurrentTimeMillis;
        InterfaceC3611b interfaceC3611b = this.f33927h;
        if (interfaceC3611b != null) {
            interfaceC3611b.a(jCurrentTimeMillis - this.f33928i);
        }
    }

    @Override // w2.C3470c, w2.InterfaceC3471d
    public void onSubmit(String id, Object obj) {
        AbstractC2855l.g(id, "id");
        this.f33928i = System.currentTimeMillis();
    }
}

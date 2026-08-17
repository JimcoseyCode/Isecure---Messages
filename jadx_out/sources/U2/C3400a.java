package u2;

import N2.j;
import f3.AbstractC2607a;
import j2.InterfaceC2764b;

/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3400a extends AbstractC2607a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2764b f32663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f32664b;

    public C3400a(InterfaceC2764b interfaceC2764b, j jVar) {
        this.f32663a = interfaceC2764b;
        this.f32664b = jVar;
    }

    @Override // f3.InterfaceC2611e
    public void onRequestCancellation(String str) {
        this.f32664b.J(this.f32663a.now());
        this.f32664b.P(str);
    }

    @Override // f3.InterfaceC2611e
    public void onRequestFailure(com.facebook.imagepipeline.request.b bVar, String str, Throwable th, boolean z10) {
        this.f32664b.J(this.f32663a.now());
        this.f32664b.I(bVar);
        this.f32664b.P(str);
        this.f32664b.O(z10);
    }

    @Override // f3.InterfaceC2611e
    public void onRequestStart(com.facebook.imagepipeline.request.b bVar, Object obj, String str, boolean z10) {
        this.f32664b.K(this.f32663a.now());
        this.f32664b.I(bVar);
        this.f32664b.y(obj);
        this.f32664b.P(str);
        this.f32664b.O(z10);
    }

    @Override // f3.InterfaceC2611e
    public void onRequestSuccess(com.facebook.imagepipeline.request.b bVar, String str, boolean z10) {
        this.f32664b.J(this.f32663a.now());
        this.f32664b.I(bVar);
        this.f32664b.P(str);
        this.f32664b.O(z10);
    }
}

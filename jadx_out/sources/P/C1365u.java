package P;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: P.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1365u implements H0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H0.a f8754a;

    public void a(H0.a aVar) {
        this.f8754a = aVar;
    }

    @Override // H0.a
    public void accept(Object obj) {
        AbstractC2855l.e(this.f8754a, "Listener is not set.");
        this.f8754a.accept(obj);
    }
}

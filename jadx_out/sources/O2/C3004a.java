package o2;

import kotlin.jvm.internal.AbstractC2855l;
import n2.C2960a;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3004a implements InterfaceC3005b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3004a f30474a = new C3004a();

    private C3004a() {
    }

    @Override // o2.InterfaceC3005b
    public void a(C2960a tag, String message) {
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(message, "message");
    }

    @Override // o2.InterfaceC3005b
    public boolean b(C2960a tag) {
        AbstractC2855l.g(tag, "tag");
        return false;
    }

    @Override // o2.InterfaceC3005b
    public void c(C2960a tag, String message, Object... args) {
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(message, "message");
        AbstractC2855l.g(args, "args");
    }
}

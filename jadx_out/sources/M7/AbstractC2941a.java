package m7;

import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: m7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2941a {

    /* JADX INFO: renamed from: m7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0317a extends Thread {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3487a f29630g;

        C0317a(InterfaceC3487a interfaceC3487a) {
            this.f29630g = interfaceC3487a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f29630g.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC3487a block) {
        AbstractC2855l.g(block, "block");
        C0317a c0317a = new C0317a(block);
        if (z11) {
            c0317a.setDaemon(true);
        }
        if (i10 > 0) {
            c0317a.setPriority(i10);
        }
        if (str != null) {
            c0317a.setName(str);
        }
        if (classLoader != null) {
            c0317a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0317a.start();
        }
        return c0317a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC3487a interfaceC3487a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z10, z11, classLoader, str2, i12, interfaceC3487a);
    }
}

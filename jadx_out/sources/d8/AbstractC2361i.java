package d8;

import L7.M;
import j8.C2810e;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2361i {
    public static final C2360h a(L7.H module, M notFoundClasses, B8.n storageManager, InterfaceC2374v kotlinClassFinder, C2810e jvmMetadataVersion) {
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
        C2360h c2360h = new C2360h(module, notFoundClasses, storageManager, kotlinClassFinder);
        c2360h.S(jvmMetadataVersion);
        return c2360h;
    }
}

package s5;

import R0.f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: s5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3329d {
    public static final Object a(f fVar, f.a key, Object obj) {
        AbstractC2855l.g(fVar, "<this>");
        AbstractC2855l.g(key, "key");
        Object objB = fVar.b(key);
        return objB == null ? obj : objB;
    }
}

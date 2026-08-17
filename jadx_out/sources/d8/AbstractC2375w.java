package d8;

import b8.InterfaceC1823g;
import d8.InterfaceC2374v;
import j8.C2810e;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2375w {
    public static final InterfaceC2376x a(InterfaceC2374v interfaceC2374v, InterfaceC1823g javaClass, C2810e jvmMetadataVersion) {
        AbstractC2855l.g(interfaceC2374v, "<this>");
        AbstractC2855l.g(javaClass, "javaClass");
        AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
        InterfaceC2374v.a aVarA = interfaceC2374v.a(javaClass, jvmMetadataVersion);
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }

    public static final InterfaceC2376x b(InterfaceC2374v interfaceC2374v, k8.b classId, C2810e jvmMetadataVersion) {
        AbstractC2855l.g(interfaceC2374v, "<this>");
        AbstractC2855l.g(classId, "classId");
        AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
        InterfaceC2374v.a aVarC = interfaceC2374v.c(classId, jvmMetadataVersion);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }
}

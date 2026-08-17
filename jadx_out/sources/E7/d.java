package E7;

import C7.f;
import C7.g;
import F7.C0539i0;
import F7.C0542k;
import F7.j1;
import L7.g0;
import f8.i;
import f8.t;
import i7.InterfaceC2740c;
import j8.C2810e;
import j8.C2811f;
import j8.C2814i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import y8.C3637K;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2852i implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f1120g = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final f getOwner() {
            return D.b(C3637K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final g0 invoke(C3637K p02, i p12) {
            AbstractC2855l.g(p02, "p0");
            AbstractC2855l.g(p12, "p1");
            return p02.s(p12);
        }
    }

    public static final g a(InterfaceC2740c interfaceC2740c) {
        AbstractC2855l.g(interfaceC2740c, "<this>");
        Metadata metadata = (Metadata) interfaceC2740c.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair pairJ = C2814i.j(strArrD1, metadata.d2());
        C2811f c2811f = (C2811f) pairJ.getFirst();
        i iVar = (i) pairJ.getSecond();
        C2810e c2810e = new C2810e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC2740c.getClass();
        t tVarM0 = iVar.m0();
        AbstractC2855l.f(tVarM0, "getTypeTable(...)");
        return new C0539i0(C0542k.f2075j, (g0) j1.h(cls, iVar, c2811f, new h8.g(tVarM0), c2810e, a.f1120g));
    }
}

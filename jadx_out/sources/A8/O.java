package A8;

import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.g0;
import L7.h0;
import O7.AbstractC1339s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import h8.InterfaceC2710c;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class O extends O7.O implements InterfaceC0382b {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final f8.i f114K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final InterfaceC2710c f115L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final h8.g f116M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final h8.h f117N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC0398s f118O;

    public /* synthetic */ O(InterfaceC1288m interfaceC1288m, g0 g0Var, M7.h hVar, k8.f fVar, InterfaceC1277b.a aVar, f8.i iVar, InterfaceC2710c interfaceC2710c, h8.g gVar, h8.h hVar2, InterfaceC0398s interfaceC0398s, h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1288m, g0Var, hVar, fVar, aVar, iVar, interfaceC2710c, gVar, hVar2, interfaceC0398s, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : h0Var);
    }

    @Override // O7.O, O7.AbstractC1339s
    /* JADX INFO: renamed from: I0 */
    protected AbstractC1339s l1(InterfaceC1288m newOwner, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a kind, k8.f fVar, M7.h annotations, h0 source) {
        k8.f fVar2;
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(source, "source");
        g0 g0Var = (g0) interfaceC1300z;
        if (fVar == null) {
            k8.f name = getName();
            AbstractC2855l.f(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        O o10 = new O(newOwner, g0Var, annotations, fVar2, kind, D(), W(), Q(), n1(), Y(), source);
        o10.V0(N0());
        return o10;
    }

    @Override // A8.InterfaceC0399t
    public h8.g Q() {
        return this.f116M;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC2710c W() {
        return this.f115L;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC0398s Y() {
        return this.f118O;
    }

    @Override // A8.InterfaceC0399t
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public f8.i D() {
        return this.f114K;
    }

    public h8.h n1() {
        return this.f117N;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public O(L7.InterfaceC1288m r12, L7.g0 r13, M7.h r14, k8.f r15, L7.InterfaceC1277b.a r16, f8.i r17, h8.InterfaceC2710c r18, h8.g r19, h8.h r20, A8.InterfaceC0398s r21, L7.h0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.AbstractC2855l.g(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.AbstractC2855l.g(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.AbstractC2855l.g(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.AbstractC2855l.g(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.AbstractC2855l.g(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.AbstractC2855l.g(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.AbstractC2855l.g(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.AbstractC2855l.g(r10, r0)
            if (r22 != 0) goto L3d
            L7.h0 r0 = L7.h0.f7335a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f114K = r7
            r11.f115L = r8
            r11.f116M = r9
            r11.f117N = r10
            r1 = r21
            r11.f118O = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A8.O.<init>(L7.m, L7.g0, M7.h, k8.f, L7.b$a, f8.i, h8.c, h8.g, h8.h, A8.s, L7.h0):void");
    }
}

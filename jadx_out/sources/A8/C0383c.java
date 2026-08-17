package A8;

import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.h0;
import O7.C1330i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import h8.InterfaceC2710c;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: A8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0383c extends C1330i implements InterfaceC0382b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final f8.d f134L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final InterfaceC2710c f135M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final h8.g f136N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final h8.h f137O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final InterfaceC0398s f138P;

    public /* synthetic */ C0383c(InterfaceC1280e interfaceC1280e, InterfaceC1287l interfaceC1287l, M7.h hVar, boolean z10, InterfaceC1277b.a aVar, f8.d dVar, InterfaceC2710c interfaceC2710c, h8.g gVar, h8.h hVar2, InterfaceC0398s interfaceC0398s, h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1280e, interfaceC1287l, hVar, z10, aVar, dVar, interfaceC2710c, gVar, hVar2, interfaceC0398s, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : h0Var);
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z
    public boolean N() {
        return false;
    }

    @Override // A8.InterfaceC0399t
    public h8.g Q() {
        return this.f136N;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC2710c W() {
        return this.f135M;
    }

    @Override // A8.InterfaceC0399t
    public InterfaceC0398s Y() {
        return this.f138P;
    }

    @Override // O7.AbstractC1339s, L7.D
    public boolean isExternal() {
        return false;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z
    public boolean isInline() {
        return false;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.C1330i
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0383c l1(InterfaceC1288m newOwner, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a kind, k8.f fVar, M7.h annotations, h0 source) {
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(source, "source");
        C0383c c0383c = new C0383c((InterfaceC1280e) newOwner, (InterfaceC1287l) interfaceC1300z, annotations, this.f8465K, kind, D(), W(), Q(), r1(), Y(), source);
        c0383c.V0(N0());
        return c0383c;
    }

    @Override // A8.InterfaceC0399t
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public f8.d D() {
        return this.f134L;
    }

    public h8.h r1() {
        return this.f137O;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C0383c(L7.InterfaceC1280e r12, L7.InterfaceC1287l r13, M7.h r14, boolean r15, L7.InterfaceC1277b.a r16, f8.d r17, h8.InterfaceC2710c r18, h8.g r19, h8.h r20, A8.InterfaceC0398s r21, L7.h0 r22) {
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
            if (r22 != 0) goto L38
            L7.h0 r0 = L7.h0.f7335a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f134L = r7
            r11.f135M = r8
            r11.f136N = r9
            r11.f137O = r10
            r1 = r21
            r11.f138P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A8.C0383c.<init>(L7.e, L7.l, M7.h, boolean, L7.b$a, f8.d, h8.c, h8.g, h8.h, A8.s, L7.h0):void");
    }
}

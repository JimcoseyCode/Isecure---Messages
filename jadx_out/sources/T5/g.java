package T5;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class g implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f10521A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f10523C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f10525E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f10527G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f10529I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f10531K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f10533M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f10535O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f10537Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f10539S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f10541U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f10543W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f10545Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f10547a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f10549c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f10551e0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10553g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10557i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f10558i0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10561k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f10562k0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10565m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f10566m0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10569o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10571q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10573s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10575u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10577w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10579y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f10555h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f10559j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f10563l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f10567n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i f10570p = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private i f10572r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private i f10574t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f10576v = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private i f10578x = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private i f10580z = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private i f10522B = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private i f10524D = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private i f10526F = null;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private i f10528H = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private i f10530J = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private i f10532L = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private i f10534N = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f10536P = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f10538R = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f10540T = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private String f10542V = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private String f10544X = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f10546Z = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f10548b0 = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f10550d0 = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f10552f0 = false;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private List f10554g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private List f10556h0 = new ArrayList();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f10560j0 = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private String f10564l0 = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f10568n0 = false;

    public int A() {
        return l();
    }

    public g B(i iVar) {
        iVar.getClass();
        this.f10529I = true;
        this.f10530J = iVar;
        return this;
    }

    public g C(int i10) {
        this.f10537Q = true;
        this.f10538R = i10;
        return this;
    }

    public g D(i iVar) {
        iVar.getClass();
        this.f10521A = true;
        this.f10522B = iVar;
        return this;
    }

    public g E(i iVar) {
        iVar.getClass();
        this.f10557i = true;
        this.f10559j = iVar;
        return this;
    }

    public g F(i iVar) {
        iVar.getClass();
        this.f10553g = true;
        this.f10555h = iVar;
        return this;
    }

    public g G(String str) {
        this.f10535O = true;
        this.f10536P = str;
        return this;
    }

    public g H(String str) {
        this.f10539S = true;
        this.f10540T = str;
        return this;
    }

    public g I(String str) {
        this.f10562k0 = true;
        this.f10564l0 = str;
        return this;
    }

    public g J(boolean z10) {
        this.f10558i0 = true;
        this.f10560j0 = z10;
        return this;
    }

    public g K(i iVar) {
        iVar.getClass();
        this.f10561k = true;
        this.f10563l = iVar;
        return this;
    }

    public g L(boolean z10) {
        this.f10566m0 = true;
        this.f10568n0 = z10;
        return this;
    }

    public g M(String str) {
        this.f10543W = true;
        this.f10544X = str;
        return this;
    }

    public g N(String str) {
        this.f10547a0 = true;
        this.f10548b0 = str;
        return this;
    }

    public g O(String str) {
        this.f10549c0 = true;
        this.f10550d0 = str;
        return this;
    }

    public g P(i iVar) {
        iVar.getClass();
        this.f10533M = true;
        this.f10534N = iVar;
        return this;
    }

    public g Q(i iVar) {
        iVar.getClass();
        this.f10577w = true;
        this.f10578x = iVar;
        return this;
    }

    public g R(i iVar) {
        iVar.getClass();
        this.f10573s = true;
        this.f10574t = iVar;
        return this;
    }

    public g S(String str) {
        this.f10545Y = true;
        this.f10546Z = str;
        return this;
    }

    public g T(String str) {
        this.f10541U = true;
        this.f10542V = str;
        return this;
    }

    public g U(i iVar) {
        iVar.getClass();
        this.f10569o = true;
        this.f10570p = iVar;
        return this;
    }

    public g V(boolean z10) {
        this.f10551e0 = true;
        this.f10552f0 = z10;
        return this;
    }

    public g W(i iVar) {
        iVar.getClass();
        this.f10571q = true;
        this.f10572r = iVar;
        return this;
    }

    public g X(i iVar) {
        iVar.getClass();
        this.f10525E = true;
        this.f10526F = iVar;
        return this;
    }

    public g Y(i iVar) {
        iVar.getClass();
        this.f10531K = true;
        this.f10532L = iVar;
        return this;
    }

    public g Z(i iVar) {
        iVar.getClass();
        this.f10527G = true;
        this.f10528H = iVar;
        return this;
    }

    public int a() {
        return this.f10538R;
    }

    public g a0(i iVar) {
        iVar.getClass();
        this.f10565m = true;
        this.f10567n = iVar;
        return this;
    }

    public i b() {
        return this.f10559j;
    }

    public g b0(i iVar) {
        iVar.getClass();
        this.f10579y = true;
        this.f10580z = iVar;
        return this;
    }

    public i c() {
        return this.f10555h;
    }

    public g c0(i iVar) {
        iVar.getClass();
        this.f10523C = true;
        this.f10524D = iVar;
        return this;
    }

    public String d() {
        return this.f10536P;
    }

    public g d0(i iVar) {
        iVar.getClass();
        this.f10575u = true;
        this.f10576v = iVar;
        return this;
    }

    public String e() {
        return this.f10540T;
    }

    public int f() {
        return this.f10556h0.size();
    }

    public List g() {
        return this.f10556h0;
    }

    public String h() {
        return this.f10564l0;
    }

    public i i() {
        return this.f10563l;
    }

    public String j() {
        return this.f10548b0;
    }

    public String k() {
        return this.f10550d0;
    }

    public int l() {
        return this.f10554g0.size();
    }

    public List m() {
        return this.f10554g0;
    }

    public i n() {
        return this.f10578x;
    }

    public i o() {
        return this.f10574t;
    }

    public String p() {
        return this.f10546Z;
    }

    public i q() {
        return this.f10570p;
    }

    public boolean r() {
        return this.f10552f0;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            i iVar = new i();
            iVar.readExternal(objectInput);
            F(iVar);
        }
        if (objectInput.readBoolean()) {
            i iVar2 = new i();
            iVar2.readExternal(objectInput);
            E(iVar2);
        }
        if (objectInput.readBoolean()) {
            i iVar3 = new i();
            iVar3.readExternal(objectInput);
            K(iVar3);
        }
        if (objectInput.readBoolean()) {
            i iVar4 = new i();
            iVar4.readExternal(objectInput);
            a0(iVar4);
        }
        if (objectInput.readBoolean()) {
            i iVar5 = new i();
            iVar5.readExternal(objectInput);
            U(iVar5);
        }
        if (objectInput.readBoolean()) {
            i iVar6 = new i();
            iVar6.readExternal(objectInput);
            W(iVar6);
        }
        if (objectInput.readBoolean()) {
            i iVar7 = new i();
            iVar7.readExternal(objectInput);
            R(iVar7);
        }
        if (objectInput.readBoolean()) {
            i iVar8 = new i();
            iVar8.readExternal(objectInput);
            d0(iVar8);
        }
        if (objectInput.readBoolean()) {
            i iVar9 = new i();
            iVar9.readExternal(objectInput);
            Q(iVar9);
        }
        if (objectInput.readBoolean()) {
            i iVar10 = new i();
            iVar10.readExternal(objectInput);
            b0(iVar10);
        }
        if (objectInput.readBoolean()) {
            i iVar11 = new i();
            iVar11.readExternal(objectInput);
            D(iVar11);
        }
        if (objectInput.readBoolean()) {
            i iVar12 = new i();
            iVar12.readExternal(objectInput);
            c0(iVar12);
        }
        if (objectInput.readBoolean()) {
            i iVar13 = new i();
            iVar13.readExternal(objectInput);
            X(iVar13);
        }
        if (objectInput.readBoolean()) {
            i iVar14 = new i();
            iVar14.readExternal(objectInput);
            Z(iVar14);
        }
        if (objectInput.readBoolean()) {
            i iVar15 = new i();
            iVar15.readExternal(objectInput);
            B(iVar15);
        }
        if (objectInput.readBoolean()) {
            i iVar16 = new i();
            iVar16.readExternal(objectInput);
            Y(iVar16);
        }
        if (objectInput.readBoolean()) {
            i iVar17 = new i();
            iVar17.readExternal(objectInput);
            P(iVar17);
        }
        G(objectInput.readUTF());
        C(objectInput.readInt());
        H(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            T(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            M(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            S(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            N(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            O(objectInput.readUTF());
        }
        V(objectInput.readBoolean());
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            f fVar = new f();
            fVar.readExternal(objectInput);
            this.f10554g0.add(fVar);
        }
        int i12 = objectInput.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            f fVar2 = new f();
            fVar2.readExternal(objectInput);
            this.f10556h0.add(fVar2);
        }
        J(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            I(objectInput.readUTF());
        }
        L(objectInput.readBoolean());
    }

    public i s() {
        return this.f10572r;
    }

    public i t() {
        return this.f10567n;
    }

    public i u() {
        return this.f10580z;
    }

    public i v() {
        return this.f10524D;
    }

    public i w() {
        return this.f10576v;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f10553g);
        if (this.f10553g) {
            this.f10555h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10557i);
        if (this.f10557i) {
            this.f10559j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10561k);
        if (this.f10561k) {
            this.f10563l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10565m);
        if (this.f10565m) {
            this.f10567n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10569o);
        if (this.f10569o) {
            this.f10570p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10571q);
        if (this.f10571q) {
            this.f10572r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10573s);
        if (this.f10573s) {
            this.f10574t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10575u);
        if (this.f10575u) {
            this.f10576v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10577w);
        if (this.f10577w) {
            this.f10578x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10579y);
        if (this.f10579y) {
            this.f10580z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10521A);
        if (this.f10521A) {
            this.f10522B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10523C);
        if (this.f10523C) {
            this.f10524D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10525E);
        if (this.f10525E) {
            this.f10526F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10527G);
        if (this.f10527G) {
            this.f10528H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10529I);
        if (this.f10529I) {
            this.f10530J.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10531K);
        if (this.f10531K) {
            this.f10532L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10533M);
        if (this.f10533M) {
            this.f10534N.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f10536P);
        objectOutput.writeInt(this.f10538R);
        objectOutput.writeUTF(this.f10540T);
        objectOutput.writeBoolean(this.f10541U);
        if (this.f10541U) {
            objectOutput.writeUTF(this.f10542V);
        }
        objectOutput.writeBoolean(this.f10543W);
        if (this.f10543W) {
            objectOutput.writeUTF(this.f10544X);
        }
        objectOutput.writeBoolean(this.f10545Y);
        if (this.f10545Y) {
            objectOutput.writeUTF(this.f10546Z);
        }
        objectOutput.writeBoolean(this.f10547a0);
        if (this.f10547a0) {
            objectOutput.writeUTF(this.f10548b0);
        }
        objectOutput.writeBoolean(this.f10549c0);
        if (this.f10549c0) {
            objectOutput.writeUTF(this.f10550d0);
        }
        objectOutput.writeBoolean(this.f10552f0);
        int iA = A();
        objectOutput.writeInt(iA);
        for (int i10 = 0; i10 < iA; i10++) {
            ((f) this.f10554g0.get(i10)).writeExternal(objectOutput);
        }
        int iZ = z();
        objectOutput.writeInt(iZ);
        for (int i11 = 0; i11 < iZ; i11++) {
            ((f) this.f10556h0.get(i11)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10560j0);
        objectOutput.writeBoolean(this.f10562k0);
        if (this.f10562k0) {
            objectOutput.writeUTF(this.f10564l0);
        }
        objectOutput.writeBoolean(this.f10568n0);
    }

    public boolean x() {
        return this.f10562k0;
    }

    public boolean y() {
        return this.f10545Y;
    }

    public int z() {
        return f();
    }
}

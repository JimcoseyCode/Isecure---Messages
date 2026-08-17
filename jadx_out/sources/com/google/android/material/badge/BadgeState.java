package com.google.android.material.badge;

import Q4.c;
import Q4.h;
import Q4.i;
import Q4.j;
import Q4.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.l;
import e5.AbstractC2425c;
import e5.e;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class BadgeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final State f22650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final State f22651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f22652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f22653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f22654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f22655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f22656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f22657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f22658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f22659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f22660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f22661l;

    BadgeState(Context context, int i10, int i11, int i12, State state) {
        State state2 = new State();
        this.f22651b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f22673g = i10;
        }
        TypedArray typedArrayC = c(context, state.f22673g, i11, i12);
        Resources resources = context.getResources();
        this.f22652c = typedArrayC.getDimensionPixelSize(k.f9810v, -1);
        this.f22658i = context.getResources().getDimensionPixelSize(c.f9209V);
        this.f22659j = context.getResources().getDimensionPixelSize(c.f9211X);
        this.f22653d = typedArrayC.getDimensionPixelSize(k.f9468F, -1);
        this.f22654e = typedArrayC.getDimension(k.f9452D, resources.getDimension(c.f9252t));
        this.f22656g = typedArrayC.getDimension(k.f9492I, resources.getDimension(c.f9254u));
        this.f22655f = typedArrayC.getDimension(k.f9802u, resources.getDimension(c.f9252t));
        this.f22657h = typedArrayC.getDimension(k.f9460E, resources.getDimension(c.f9254u));
        boolean z10 = true;
        this.f22660k = typedArrayC.getInt(k.f9548P, 1);
        this.f22661l = typedArrayC.getInt(k.f9786s, 0);
        state2.f22681o = state.f22681o == -2 ? 255 : state.f22681o;
        if (state.f22683q != -2) {
            state2.f22683q = state.f22683q;
        } else if (typedArrayC.hasValue(k.f9540O)) {
            state2.f22683q = typedArrayC.getInt(k.f9540O, 0);
        } else {
            state2.f22683q = -1;
        }
        if (state.f22682p != null) {
            state2.f22682p = state.f22682p;
        } else if (typedArrayC.hasValue(k.f9834y)) {
            state2.f22682p = typedArrayC.getString(k.f9834y);
        }
        state2.f22687u = state.f22687u;
        state2.f22688v = state.f22688v == null ? context.getString(i.f9382j) : state.f22688v;
        state2.f22689w = state.f22689w == 0 ? h.f9351a : state.f22689w;
        state2.f22690x = state.f22690x == 0 ? i.f9387o : state.f22690x;
        if (state.f22692z != null && !state.f22692z.booleanValue()) {
            z10 = false;
        }
        state2.f22692z = Boolean.valueOf(z10);
        state2.f22684r = state.f22684r == -2 ? typedArrayC.getInt(k.f9524M, -2) : state.f22684r;
        state2.f22685s = state.f22685s == -2 ? typedArrayC.getInt(k.f9532N, -2) : state.f22685s;
        state2.f22677k = Integer.valueOf(state.f22677k == null ? typedArrayC.getResourceId(k.f9818w, j.f9403b) : state.f22677k.intValue());
        state2.f22678l = Integer.valueOf(state.f22678l == null ? typedArrayC.getResourceId(k.f9826x, 0) : state.f22678l.intValue());
        state2.f22679m = Integer.valueOf(state.f22679m == null ? typedArrayC.getResourceId(k.f9476G, j.f9403b) : state.f22679m.intValue());
        state2.f22680n = Integer.valueOf(state.f22680n == null ? typedArrayC.getResourceId(k.f9484H, 0) : state.f22680n.intValue());
        state2.f22674h = Integer.valueOf(state.f22674h == null ? J(context, typedArrayC, k.f9778r) : state.f22674h.intValue());
        state2.f22676j = Integer.valueOf(state.f22676j == null ? typedArrayC.getResourceId(k.f9842z, j.f9404c) : state.f22676j.intValue());
        if (state.f22675i != null) {
            state2.f22675i = state.f22675i;
        } else if (typedArrayC.hasValue(k.f9428A)) {
            state2.f22675i = Integer.valueOf(J(context, typedArrayC, k.f9428A));
        } else {
            state2.f22675i = Integer.valueOf(new e(context, state2.f22676j.intValue()).j().getDefaultColor());
        }
        state2.f22691y = Integer.valueOf(state.f22691y == null ? typedArrayC.getInt(k.f9794t, 8388661) : state.f22691y.intValue());
        state2.f22662A = Integer.valueOf(state.f22662A == null ? typedArrayC.getDimensionPixelSize(k.f9444C, resources.getDimensionPixelSize(c.f9210W)) : state.f22662A.intValue());
        state2.f22663B = Integer.valueOf(state.f22663B == null ? typedArrayC.getDimensionPixelSize(k.f9436B, resources.getDimensionPixelSize(c.f9256v)) : state.f22663B.intValue());
        state2.f22664C = Integer.valueOf(state.f22664C == null ? typedArrayC.getDimensionPixelOffset(k.f9500J, 0) : state.f22664C.intValue());
        state2.f22665D = Integer.valueOf(state.f22665D == null ? typedArrayC.getDimensionPixelOffset(k.f9556Q, 0) : state.f22665D.intValue());
        state2.f22666E = Integer.valueOf(state.f22666E == null ? typedArrayC.getDimensionPixelOffset(k.f9508K, state2.f22664C.intValue()) : state.f22666E.intValue());
        state2.f22667F = Integer.valueOf(state.f22667F == null ? typedArrayC.getDimensionPixelOffset(k.f9564R, state2.f22665D.intValue()) : state.f22667F.intValue());
        state2.f22670I = Integer.valueOf(state.f22670I == null ? typedArrayC.getDimensionPixelOffset(k.f9516L, 0) : state.f22670I.intValue());
        state2.f22668G = Integer.valueOf(state.f22668G == null ? 0 : state.f22668G.intValue());
        state2.f22669H = Integer.valueOf(state.f22669H == null ? 0 : state.f22669H.intValue());
        state2.f22671J = Boolean.valueOf(state.f22671J == null ? typedArrayC.getBoolean(k.f9770q, false) : state.f22671J.booleanValue());
        typedArrayC.recycle();
        if (state.f22686t == null) {
            state2.f22686t = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f22686t = state.f22686t;
        }
        this.f22650a = state;
    }

    private static int J(Context context, TypedArray typedArray, int i10) {
        return AbstractC2425c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray c(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return l.i(context, attributeSetI, k.f9762p, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    State A() {
        return this.f22650a;
    }

    String B() {
        return this.f22651b.f22682p;
    }

    int C() {
        return this.f22651b.f22676j.intValue();
    }

    int D() {
        return this.f22651b.f22667F.intValue();
    }

    int E() {
        return this.f22651b.f22665D.intValue();
    }

    boolean F() {
        return this.f22651b.f22683q != -1;
    }

    boolean G() {
        return this.f22651b.f22682p != null;
    }

    boolean H() {
        return this.f22651b.f22671J.booleanValue();
    }

    boolean I() {
        return this.f22651b.f22692z.booleanValue();
    }

    void K(int i10) {
        this.f22650a.f22681o = i10;
        this.f22651b.f22681o = i10;
    }

    void L(int i10) {
        this.f22650a.f22674h = Integer.valueOf(i10);
        this.f22651b.f22674h = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f22650a.f22675i = Integer.valueOf(i10);
        this.f22651b.f22675i = Integer.valueOf(i10);
    }

    void N(int i10) {
        this.f22650a.f22683q = i10;
        this.f22651b.f22683q = i10;
    }

    void O(String str) {
        this.f22650a.f22682p = str;
        this.f22651b.f22682p = str;
    }

    void P(boolean z10) {
        this.f22650a.f22692z = Boolean.valueOf(z10);
        this.f22651b.f22692z = Boolean.valueOf(z10);
    }

    void a() {
        N(-1);
    }

    void b() {
        O(null);
    }

    int d() {
        return this.f22651b.f22668G.intValue();
    }

    int e() {
        return this.f22651b.f22669H.intValue();
    }

    int f() {
        return this.f22651b.f22681o;
    }

    int g() {
        return this.f22651b.f22674h.intValue();
    }

    int h() {
        return this.f22651b.f22691y.intValue();
    }

    int i() {
        return this.f22651b.f22662A.intValue();
    }

    int j() {
        return this.f22651b.f22678l.intValue();
    }

    int k() {
        return this.f22651b.f22677k.intValue();
    }

    int l() {
        return this.f22651b.f22675i.intValue();
    }

    int m() {
        return this.f22651b.f22663B.intValue();
    }

    int n() {
        return this.f22651b.f22680n.intValue();
    }

    int o() {
        return this.f22651b.f22679m.intValue();
    }

    int p() {
        return this.f22651b.f22690x;
    }

    CharSequence q() {
        return this.f22651b.f22687u;
    }

    CharSequence r() {
        return this.f22651b.f22688v;
    }

    int s() {
        return this.f22651b.f22689w;
    }

    int t() {
        return this.f22651b.f22666E.intValue();
    }

    int u() {
        return this.f22651b.f22664C.intValue();
    }

    int v() {
        return this.f22651b.f22670I.intValue();
    }

    int w() {
        return this.f22651b.f22684r;
    }

    int x() {
        return this.f22651b.f22685s;
    }

    int y() {
        return this.f22651b.f22683q;
    }

    Locale z() {
        return this.f22651b.f22686t;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private Integer f22662A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private Integer f22663B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private Integer f22664C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private Integer f22665D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private Integer f22666E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private Integer f22667F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private Integer f22668G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private Integer f22669H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private Integer f22670I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private Boolean f22671J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private Integer f22672K;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f22674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f22675i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Integer f22676j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f22677k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f22678l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Integer f22679m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f22680n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f22681o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f22682p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f22683q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f22684r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f22685s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Locale f22686t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private CharSequence f22687u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private CharSequence f22688v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f22689w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f22690x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f22691y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Boolean f22692z;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f22681o = 255;
            this.f22683q = -2;
            this.f22684r = -2;
            this.f22685s = -2;
            this.f22692z = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22673g);
            parcel.writeSerializable(this.f22674h);
            parcel.writeSerializable(this.f22675i);
            parcel.writeSerializable(this.f22676j);
            parcel.writeSerializable(this.f22677k);
            parcel.writeSerializable(this.f22678l);
            parcel.writeSerializable(this.f22679m);
            parcel.writeSerializable(this.f22680n);
            parcel.writeInt(this.f22681o);
            parcel.writeString(this.f22682p);
            parcel.writeInt(this.f22683q);
            parcel.writeInt(this.f22684r);
            parcel.writeInt(this.f22685s);
            CharSequence charSequence = this.f22687u;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f22688v;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f22689w);
            parcel.writeSerializable(this.f22691y);
            parcel.writeSerializable(this.f22662A);
            parcel.writeSerializable(this.f22663B);
            parcel.writeSerializable(this.f22664C);
            parcel.writeSerializable(this.f22665D);
            parcel.writeSerializable(this.f22666E);
            parcel.writeSerializable(this.f22667F);
            parcel.writeSerializable(this.f22670I);
            parcel.writeSerializable(this.f22668G);
            parcel.writeSerializable(this.f22669H);
            parcel.writeSerializable(this.f22692z);
            parcel.writeSerializable(this.f22686t);
            parcel.writeSerializable(this.f22671J);
            parcel.writeSerializable(this.f22672K);
        }

        State(Parcel parcel) {
            this.f22681o = 255;
            this.f22683q = -2;
            this.f22684r = -2;
            this.f22685s = -2;
            this.f22692z = Boolean.TRUE;
            this.f22673g = parcel.readInt();
            this.f22674h = (Integer) parcel.readSerializable();
            this.f22675i = (Integer) parcel.readSerializable();
            this.f22676j = (Integer) parcel.readSerializable();
            this.f22677k = (Integer) parcel.readSerializable();
            this.f22678l = (Integer) parcel.readSerializable();
            this.f22679m = (Integer) parcel.readSerializable();
            this.f22680n = (Integer) parcel.readSerializable();
            this.f22681o = parcel.readInt();
            this.f22682p = parcel.readString();
            this.f22683q = parcel.readInt();
            this.f22684r = parcel.readInt();
            this.f22685s = parcel.readInt();
            this.f22687u = parcel.readString();
            this.f22688v = parcel.readString();
            this.f22689w = parcel.readInt();
            this.f22691y = (Integer) parcel.readSerializable();
            this.f22662A = (Integer) parcel.readSerializable();
            this.f22663B = (Integer) parcel.readSerializable();
            this.f22664C = (Integer) parcel.readSerializable();
            this.f22665D = (Integer) parcel.readSerializable();
            this.f22666E = (Integer) parcel.readSerializable();
            this.f22667F = (Integer) parcel.readSerializable();
            this.f22670I = (Integer) parcel.readSerializable();
            this.f22668G = (Integer) parcel.readSerializable();
            this.f22669H = (Integer) parcel.readSerializable();
            this.f22692z = (Boolean) parcel.readSerializable();
            this.f22686t = (Locale) parcel.readSerializable();
            this.f22671J = (Boolean) parcel.readSerializable();
            this.f22672K = (Integer) parcel.readSerializable();
        }
    }
}

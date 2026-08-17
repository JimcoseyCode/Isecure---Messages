package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends AbstractC2294g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f25099p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f25100g = new a("LEFT", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f25101h = new a("CENTER", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f25102i = new a("RIGHT", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f25103j = new a("BACK", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f25104k = new a("SEARCH_BAR", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ a[] f25105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25106m;

        static {
            a[] aVarArrH = h();
            f25105l = aVarArrH;
            f25106m = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f25100g, f25101h, f25102i, f25103j, f25104k};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25105l.clone();
        }
    }

    public d0(ReactContext reactContext) {
        super(reactContext);
        this.f25099p = a.f25100g;
    }

    public final a0 getConfig() {
        ViewParent parent = getParent();
        C2292e c2292e = parent instanceof C2292e ? (C2292e) parent : null;
        if (c2292e != null) {
            return c2292e.getConfig();
        }
        return null;
    }

    public final a getType() {
        return this.f25099p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f25098o) {
                b(i14, i15, i10, i11);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) {
            this.f25096m = View.MeasureSpec.getSize(i10);
            this.f25097n = View.MeasureSpec.getSize(i11);
            this.f25098o = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f25096m, this.f25097n);
    }

    public final void setType(a aVar) {
        AbstractC2855l.g(aVar, "<set-?>");
        this.f25099p = aVar;
    }
}

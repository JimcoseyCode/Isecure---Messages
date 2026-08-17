package U1;

import U1.b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f10911g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F f10912a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10913b = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10914c = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10915d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.r f10916e = new b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f10917f = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class A extends C1472z {
        A() {
        }

        @Override // U1.g.C1472z, U1.g.N
        String o() {
            return "polygon";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class B extends AbstractC1458l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1462p f10918o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f10919p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f10920q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f10921r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1462p f10922s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f10923t;

        B() {
        }

        @Override // U1.g.N
        String o() {
            return "rect";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class E implements Cloneable {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        f f10925A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        Boolean f10926B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        C1450c f10927C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        String f10928D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        String f10929E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        String f10930F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        Boolean f10931G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        Boolean f10932H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        O f10933I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        Float f10934J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        String f10935K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        a f10936L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        String f10937M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        O f10938N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Float f10939O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        O f10940P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        Float f10941Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        i f10942R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        e f10943S;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f10944g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        O f10945h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        a f10946i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Float f10947j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        O f10948k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Float f10949l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C1462p f10950m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        c f10951n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        d f10952o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f10953p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p[] f10954q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f10955r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Float f10956s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1453f f10957t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        List f10958u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        C1462p f10959v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Integer f10960w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        b f10961x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        EnumC0113g f10962y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        h f10963z;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: U1.g$E$g, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum EnumC0113g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum h {
            LTR,
            RTL
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E a() {
            E e10 = new E();
            e10.f10944g = -1L;
            C1453f c1453f = C1453f.f11075h;
            e10.f10945h = c1453f;
            a aVar = a.NonZero;
            e10.f10946i = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e10.f10947j = fValueOf;
            e10.f10948k = null;
            e10.f10949l = fValueOf;
            e10.f10950m = new C1462p(1.0f);
            e10.f10951n = c.Butt;
            e10.f10952o = d.Miter;
            e10.f10953p = Float.valueOf(4.0f);
            e10.f10954q = null;
            e10.f10955r = new C1462p(0.0f);
            e10.f10956s = fValueOf;
            e10.f10957t = c1453f;
            e10.f10958u = null;
            e10.f10959v = new C1462p(12.0f, d0.pt);
            e10.f10960w = Integer.valueOf(ReactFontManager.TypefaceStyle.NORMAL);
            e10.f10961x = b.Normal;
            e10.f10962y = EnumC0113g.None;
            e10.f10963z = h.LTR;
            e10.f10925A = f.Start;
            Boolean bool = Boolean.TRUE;
            e10.f10926B = bool;
            e10.f10927C = null;
            e10.f10928D = null;
            e10.f10929E = null;
            e10.f10930F = null;
            e10.f10931G = bool;
            e10.f10932H = bool;
            e10.f10933I = c1453f;
            e10.f10934J = fValueOf;
            e10.f10935K = null;
            e10.f10936L = aVar;
            e10.f10937M = null;
            e10.f10938N = null;
            e10.f10939O = fValueOf;
            e10.f10940P = null;
            e10.f10941Q = fValueOf;
            e10.f10942R = i.None;
            e10.f10943S = e.auto;
            return e10;
        }

        void b(boolean z10) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f10931G = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f10926B = bool;
            this.f10927C = null;
            this.f10935K = null;
            this.f10956s = fValueOf;
            this.f10933I = C1453f.f11075h;
            this.f10934J = fValueOf;
            this.f10937M = null;
            this.f10938N = null;
            this.f10939O = fValueOf;
            this.f10940P = null;
            this.f10941Q = fValueOf;
            this.f10942R = i.None;
        }

        protected Object clone() {
            E e10 = (E) super.clone();
            C1462p[] c1462pArr = this.f10954q;
            if (c1462pArr != null) {
                e10.f10954q = (C1462p[]) c1462pArr.clone();
            }
            return e10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class F extends R {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f10999q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11000r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1462p f11001s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f11002t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f11003u;

        F() {
        }

        @Override // U1.g.N
        String o() {
            return "svg";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface G {
        Set c();

        void d(Set set);

        String e();

        void f(Set set);

        void h(Set set);

        Set i();

        void j(String str);

        void l(Set set);

        Set m();

        Set n();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class H extends K implements J, G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List f11004i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set f11005j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f11006k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f11007l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f11008m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set f11009n = null;

        H() {
        }

        @Override // U1.g.J
        public void a(N n10) {
            this.f11004i.add(n10);
        }

        @Override // U1.g.J
        public List b() {
            return this.f11004i;
        }

        @Override // U1.g.G
        public Set c() {
            return null;
        }

        @Override // U1.g.G
        public void d(Set set) {
            this.f11008m = set;
        }

        @Override // U1.g.G
        public String e() {
            return this.f11006k;
        }

        @Override // U1.g.G
        public void f(Set set) {
            this.f11009n = set;
        }

        @Override // U1.g.G
        public void h(Set set) {
            this.f11005j = set;
        }

        @Override // U1.g.G
        public Set i() {
            return this.f11005j;
        }

        @Override // U1.g.G
        public void j(String str) {
            this.f11006k = str;
        }

        @Override // U1.g.G
        public void l(Set set) {
            this.f11007l = set;
        }

        @Override // U1.g.G
        public Set m() {
            return this.f11008m;
        }

        @Override // U1.g.G
        public Set n() {
            return this.f11009n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class I extends K implements G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Set f11010i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f11011j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Set f11012k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f11013l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f11014m = null;

        I() {
        }

        @Override // U1.g.G
        public Set c() {
            return this.f11012k;
        }

        @Override // U1.g.G
        public void d(Set set) {
            this.f11013l = set;
        }

        @Override // U1.g.G
        public String e() {
            return this.f11011j;
        }

        @Override // U1.g.G
        public void f(Set set) {
            this.f11014m = set;
        }

        @Override // U1.g.G
        public void h(Set set) {
            this.f11010i = set;
        }

        @Override // U1.g.G
        public Set i() {
            return this.f11010i;
        }

        @Override // U1.g.G
        public void j(String str) {
            this.f11011j = str;
        }

        @Override // U1.g.G
        public void l(Set set) {
            this.f11012k = set;
        }

        @Override // U1.g.G
        public Set m() {
            return this.f11013l;
        }

        @Override // U1.g.G
        public Set n() {
            return this.f11014m;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface J {
        void a(N n10);

        List b();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class K extends L {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C1449b f11015h = null;

        K() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class L extends N {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f11016c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f11017d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        E f11018e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        E f11019f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f11020g = null;

        L() {
        }

        public String toString() {
            return o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class M extends AbstractC1456j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C1462p f11021m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C1462p f11022n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1462p f11023o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f11024p;

        M() {
        }

        @Override // U1.g.N
        String o() {
            return "linearGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f11025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        J f11026b;

        N() {
        }

        abstract String o();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class O implements Cloneable {
        O() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class P extends H {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        e f11027o = null;

        P() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class Q extends AbstractC1456j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C1462p f11028m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C1462p f11029n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1462p f11030o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f11031p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11032q;

        Q() {
        }

        @Override // U1.g.N
        String o() {
            return "radialGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class R extends P {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1449b f11033p;

        R() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class S extends C1459m {
        S() {
        }

        @Override // U1.g.C1459m, U1.g.N
        String o() {
            return "switch";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class T extends R implements InterfaceC1466t {
        T() {
        }

        @Override // U1.g.N
        String o() {
            return "symbol";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class U extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f11034o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b0 f11035p;

        U() {
        }

        @Override // U1.g.X
        public b0 g() {
            return this.f11035p;
        }

        @Override // U1.g.N
        String o() {
            return "tref";
        }

        public void p(b0 b0Var) {
            this.f11035p = b0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class V extends a0 implements X {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b0 f11036s;

        V() {
        }

        @Override // U1.g.X
        public b0 g() {
            return this.f11036s;
        }

        @Override // U1.g.N
        String o() {
            return "tspan";
        }

        public void p(b0 b0Var) {
            this.f11036s = b0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class W extends a0 implements b0, InterfaceC1460n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f11037s;

        W() {
        }

        @Override // U1.g.InterfaceC1460n
        public void k(Matrix matrix) {
            this.f11037s = matrix;
        }

        @Override // U1.g.N
        String o() {
            return ReactTextInputShadowNode.PROP_TEXT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface X {
        b0 g();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class Y extends H {
        Y() {
        }

        @Override // U1.g.H, U1.g.J
        public void a(N n10) throws j {
            if (n10 instanceof X) {
                this.f11004i.add(n10);
                return;
            }
            throw new j("Text content elements cannot contain " + n10 + " elements.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class Z extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f11038o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f11039p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b0 f11040q;

        Z() {
        }

        @Override // U1.g.X
        public b0 g() {
            return this.f11040q;
        }

        @Override // U1.g.N
        String o() {
            return "textPath";
        }

        public void p(b0 b0Var) {
            this.f11040q = b0Var;
        }
    }

    /* JADX INFO: renamed from: U1.g$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class C1448a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11041a;

        static {
            int[] iArr = new int[d0.values().length];
            f11041a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11041a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11041a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11041a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11041a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11041a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11041a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11041a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11041a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a0 extends Y {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List f11042o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f11043p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List f11044q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List f11045r;

        a0() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b0 {
    }

    /* JADX INFO: renamed from: U1.g$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1450c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C1462p f11050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C1462p f11051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        C1462p f11052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        C1462p f11053d;

        C1450c(C1462p c1462p, C1462p c1462p2, C1462p c1462p3, C1462p c1462p4) {
            this.f11050a = c1462p;
            this.f11051b = c1462p2;
            this.f11052c = c1462p3;
            this.f11053d = c1462p4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c0 extends N implements X {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f11054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b0 f11055d;

        c0(String str) {
            this.f11054c = str;
        }

        @Override // U1.g.X
        public b0 g() {
            return this.f11055d;
        }

        public String toString() {
            return "TextChild: '" + this.f11054c + "'";
        }
    }

    /* JADX INFO: renamed from: U1.g$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1451d extends AbstractC1458l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1462p f11056o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f11057p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11058q;

        C1451d() {
        }

        @Override // U1.g.N
        String o() {
            return "circle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: renamed from: U1.g$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1452e extends C1459m implements InterfaceC1466t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f11069p;

        C1452e() {
        }

        @Override // U1.g.C1459m, U1.g.N
        String o() {
            return "clipPath";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e0 extends C1459m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f11070p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11071q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11072r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1462p f11073s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f11074t;

        e0() {
        }

        @Override // U1.g.C1459m, U1.g.N
        String o() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: U1.g$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1453f extends O {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final C1453f f11075h = new C1453f(-16777216);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final C1453f f11076i = new C1453f(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11077g;

        C1453f(int i10) {
            this.f11077g = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f11077g));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f0 extends R implements InterfaceC1466t {
        f0() {
        }

        @Override // U1.g.N
        String o() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: U1.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C0114g extends O {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static C0114g f11078g = new C0114g();

        private C0114g() {
        }

        static C0114g a() {
            return f11078g;
        }
    }

    /* JADX INFO: renamed from: U1.g$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1454h extends C1459m implements InterfaceC1466t {
        C1454h() {
        }

        @Override // U1.g.C1459m, U1.g.N
        String o() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: U1.g$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1455i extends AbstractC1458l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1462p f11079o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f11080p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11081q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11082r;

        C1455i() {
        }

        @Override // U1.g.N
        String o() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: U1.g$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class AbstractC1456j extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f11083h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f11084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f11085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        EnumC1457k f11086k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f11087l;

        AbstractC1456j() {
        }

        @Override // U1.g.J
        public void a(N n10) throws j {
            if (n10 instanceof D) {
                this.f11083h.add(n10);
                return;
            }
            throw new j("Gradient elements cannot contain " + n10 + " elements.");
        }

        @Override // U1.g.J
        public List b() {
            return this.f11083h;
        }
    }

    /* JADX INFO: renamed from: U1.g$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum EnumC1457k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: renamed from: U1.g$l, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class AbstractC1458l extends I implements InterfaceC1460n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f11092n;

        AbstractC1458l() {
        }

        @Override // U1.g.InterfaceC1460n
        public void k(Matrix matrix) {
            this.f11092n = matrix;
        }
    }

    /* JADX INFO: renamed from: U1.g$m, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1459m extends H implements InterfaceC1460n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Matrix f11093o;

        C1459m() {
        }

        @Override // U1.g.InterfaceC1460n
        public void k(Matrix matrix) {
            this.f11093o = matrix;
        }

        @Override // U1.g.N
        String o() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: U1.g$n, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface InterfaceC1460n {
        void k(Matrix matrix);
    }

    /* JADX INFO: renamed from: U1.g$o, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1461o extends P implements InterfaceC1460n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f11094p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11095q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11096r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1462p f11097s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f11098t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Matrix f11099u;

        C1461o() {
        }

        @Override // U1.g.InterfaceC1460n
        public void k(Matrix matrix) {
            this.f11099u = matrix;
        }

        @Override // U1.g.N
        String o() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: U1.g$q, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1463q extends AbstractC1458l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1462p f11102o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1462p f11103p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11104q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11105r;

        C1463q() {
        }

        @Override // U1.g.N
        String o() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: U1.g$r, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1464r extends R implements InterfaceC1466t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f11106q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11107r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1462p f11108s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f11109t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C1462p f11110u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Float f11111v;

        C1464r() {
        }

        @Override // U1.g.N
        String o() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: U1.g$s, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1465s extends H implements InterfaceC1466t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f11112o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f11113p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1462p f11114q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1462p f11115r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1462p f11116s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f11117t;

        C1465s() {
        }

        @Override // U1.g.N
        String o() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: U1.g$t, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface InterfaceC1466t {
    }

    /* JADX INFO: renamed from: U1.g$u, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1467u extends O {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f11118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        O f11119h;

        C1467u(String str, O o10) {
            this.f11118g = str;
            this.f11119h = o10;
        }

        public String toString() {
            return this.f11118g + " " + this.f11119h;
        }
    }

    /* JADX INFO: renamed from: U1.g$v, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1468v extends AbstractC1458l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1469w f11120o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f11121p;

        C1468v() {
        }

        @Override // U1.g.N
        String o() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: U1.g$w, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1469w implements InterfaceC1470x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11123b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11125d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f11122a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f11124c = new float[16];

        C1469w() {
        }

        private void f(byte b10) {
            int i10 = this.f11123b;
            byte[] bArr = this.f11122a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f11122a = bArr2;
            }
            byte[] bArr3 = this.f11122a;
            int i11 = this.f11123b;
            this.f11123b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void g(int i10) {
            float[] fArr = this.f11124c;
            if (fArr.length < this.f11125d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f11124c = fArr2;
            }
        }

        @Override // U1.g.InterfaceC1470x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f11124c;
            int i10 = this.f11125d;
            int i11 = i10 + 1;
            this.f11125d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f11125d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f11125d = i13;
            fArr[i12] = f12;
            this.f11125d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // U1.g.InterfaceC1470x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f11124c;
            int i10 = this.f11125d;
            int i11 = i10 + 1;
            this.f11125d = i11;
            fArr[i10] = f10;
            this.f11125d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // U1.g.InterfaceC1470x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f11124c;
            int i10 = this.f11125d;
            int i11 = i10 + 1;
            this.f11125d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f11125d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f11125d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f11125d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f11125d = i15;
            fArr[i14] = f14;
            this.f11125d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // U1.g.InterfaceC1470x
        public void close() {
            f((byte) 8);
        }

        @Override // U1.g.InterfaceC1470x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f11124c;
            int i10 = this.f11125d;
            int i11 = i10 + 1;
            this.f11125d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f11125d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f11125d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f11125d = i14;
            fArr[i13] = f13;
            this.f11125d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // U1.g.InterfaceC1470x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f11124c;
            int i10 = this.f11125d;
            int i11 = i10 + 1;
            this.f11125d = i11;
            fArr[i10] = f10;
            this.f11125d = i10 + 2;
            fArr[i11] = f11;
        }

        void h(InterfaceC1470x interfaceC1470x) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f11123b; i11++) {
                byte b10 = this.f11122a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f11124c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    interfaceC1470x.b(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f11124c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    interfaceC1470x.e(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f11124c;
                    interfaceC1470x.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f11124c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    interfaceC1470x.a(f12, f13, f14, fArr4[i14]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f11124c;
                    interfaceC1470x.d(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    interfaceC1470x.close();
                }
            }
        }

        boolean i() {
            return this.f11123b == 0;
        }
    }

    /* JADX INFO: renamed from: U1.g$x, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface InterfaceC1470x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void e(float f10, float f11);
    }

    /* JADX INFO: renamed from: U1.g$y, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1471y extends R implements InterfaceC1466t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f11126q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f11127r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f11128s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1462p f11129t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C1462p f11130u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        C1462p f11131v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        C1462p f11132w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f11133x;

        C1471y() {
        }

        @Override // U1.g.N
        String o() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: U1.g$z, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1472z extends AbstractC1458l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f11134o;

        C1472z() {
        }

        @Override // U1.g.N
        String o() {
            return "polyline";
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", PointerEventHelper.POINTER_TYPE_UNKNOWN).replace("\\A", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    private C1449b e(float f10) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fB;
        d0 d0Var5;
        F f11 = this.f10912a;
        C1462p c1462p = f11.f11001s;
        C1462p c1462p2 = f11.f11002t;
        if (c1462p == null || c1462p.i() || (d0Var = c1462p.f11101h) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C1449b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = c1462p.b(f10);
        if (c1462p2 == null) {
            C1449b c1449b = this.f10912a.f11033p;
            fB = c1449b != null ? (c1449b.f11049d * fB2) / c1449b.f11048c : fB2;
        } else {
            if (c1462p2.i() || (d0Var5 = c1462p2.f11101h) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C1449b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = c1462p2.b(f10);
        }
        return new C1449b(0.0f, 0.0f, fB2, fB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L i(J j10, String str) {
        L lI;
        L l10 = (L) j10;
        if (str.equals(l10.f11016c)) {
            return l10;
        }
        for (Object obj : j10.b()) {
            if (obj instanceof L) {
                L l11 = (L) obj;
                if (str.equals(l11.f11016c)) {
                    return l11;
                }
                if ((obj instanceof J) && (lI = i((J) obj, str)) != null) {
                    return lI;
                }
            }
        }
        return null;
    }

    static i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new k().z(inputStream, f10911g);
    }

    void a(b.r rVar) {
        this.f10916e.b(rVar);
    }

    void b() {
        this.f10916e.e(b.u.RenderOptions);
    }

    List d() {
        return this.f10916e.c();
    }

    public float f() {
        if (this.f10912a != null) {
            return e(this.f10915d).f11049d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f10 = this.f10912a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C1449b c1449b = f10.f11033p;
        if (c1449b == null) {
            return null;
        }
        return c1449b.d();
    }

    public float h() {
        if (this.f10912a != null) {
            return e(this.f10915d).f11048c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f10912a.f11016c)) {
            return this.f10912a;
        }
        if (this.f10917f.containsKey(str)) {
            return (L) this.f10917f.get(str);
        }
        L lI = i(this.f10912a, str);
        this.f10917f.put(str, lI);
        return lI;
    }

    F m() {
        return this.f10912a;
    }

    boolean n() {
        return !this.f10916e.d();
    }

    public Picture o() {
        return q(null);
    }

    public Picture p(int i10, int i11, f fVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (fVar == null || fVar.f10910f == null) {
            fVar = fVar == null ? new f() : new f(fVar);
            fVar.g(0.0f, 0.0f, i10, i11);
        }
        new h(canvasBeginRecording, this.f10915d).G0(this, fVar);
        picture.endRecording();
        return picture;
    }

    public Picture q(f fVar) {
        C1462p c1462p;
        C1449b c1449b = (fVar == null || !fVar.e()) ? this.f10912a.f11033p : fVar.f10908d;
        if (fVar != null && fVar.f()) {
            return p((int) Math.ceil(fVar.f10910f.b()), (int) Math.ceil(fVar.f10910f.c()), fVar);
        }
        F f10 = this.f10912a;
        C1462p c1462p2 = f10.f11001s;
        if (c1462p2 != null) {
            d0 d0Var = c1462p2.f11101h;
            d0 d0Var2 = d0.percent;
            if (d0Var != d0Var2 && (c1462p = f10.f11002t) != null && c1462p.f11101h != d0Var2) {
                return p((int) Math.ceil(c1462p2.b(this.f10915d)), (int) Math.ceil(this.f10912a.f11002t.b(this.f10915d)), fVar);
            }
        }
        if (c1462p2 != null && c1449b != null) {
            return p((int) Math.ceil(c1462p2.b(this.f10915d)), (int) Math.ceil((c1449b.f11049d * r1) / c1449b.f11048c), fVar);
        }
        C1462p c1462p3 = f10.f11002t;
        if (c1462p3 == null || c1449b == null) {
            return p(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, fVar);
        }
        return p((int) Math.ceil((c1449b.f11048c * r1) / c1449b.f11049d), (int) Math.ceil(c1462p3.b(this.f10915d)), fVar);
    }

    N r(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    void s(String str) {
        this.f10914c = str;
    }

    public void t(float f10) {
        F f11 = this.f10912a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f11002t = new C1462p(f10);
    }

    public void u(float f10, float f11, float f12, float f13) {
        F f14 = this.f10912a;
        if (f14 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f14.f11033p = new C1449b(f10, f11, f12, f13);
    }

    public void v(float f10) {
        F f11 = this.f10912a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f11001s = new C1462p(f10);
    }

    void w(F f10) {
        this.f10912a = f10;
    }

    void x(String str) {
        this.f10913b = str;
    }

    /* JADX INFO: renamed from: U1.g$p, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1462p implements Cloneable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f11100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        d0 f11101h;

        C1462p(float f10, d0 d0Var) {
            this.f11100g = f10;
            this.f11101h = d0Var;
        }

        float a() {
            return this.f11100g;
        }

        float b(float f10) {
            int i10 = C1448a.f11041a[this.f11101h.ordinal()];
            if (i10 == 1) {
                return this.f11100g;
            }
            switch (i10) {
                case 4:
                    return this.f11100g * f10;
                case 5:
                    return (this.f11100g * f10) / 2.54f;
                case 6:
                    return (this.f11100g * f10) / 25.4f;
                case 7:
                    return (this.f11100g * f10) / 72.0f;
                case 8:
                    return (this.f11100g * f10) / 6.0f;
                default:
                    return this.f11100g;
            }
        }

        float c(h hVar) {
            if (this.f11101h != d0.percent) {
                return f(hVar);
            }
            C1449b c1449bS = hVar.S();
            if (c1449bS == null) {
                return this.f11100g;
            }
            float f10 = c1449bS.f11048c;
            if (f10 == c1449bS.f11049d) {
                return (this.f11100g * f10) / 100.0f;
            }
            return (this.f11100g * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        float e(h hVar, float f10) {
            return this.f11101h == d0.percent ? (this.f11100g * f10) / 100.0f : f(hVar);
        }

        float f(h hVar) {
            switch (C1448a.f11041a[this.f11101h.ordinal()]) {
                case 9:
                    C1449b c1449bS = hVar.S();
                    if (c1449bS != null) {
                    }
                    break;
            }
            return this.f11100g;
        }

        float g(h hVar) {
            if (this.f11101h != d0.percent) {
                return f(hVar);
            }
            C1449b c1449bS = hVar.S();
            return c1449bS == null ? this.f11100g : (this.f11100g * c1449bS.f11049d) / 100.0f;
        }

        boolean h() {
            return this.f11100g < 0.0f;
        }

        boolean i() {
            return this.f11100g == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f11100g) + this.f11101h;
        }

        C1462p(float f10) {
            this.f11100g = f10;
            this.f11101h = d0.px;
        }
    }

    /* JADX INFO: renamed from: U1.g$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C1449b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f11046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f11049d;

        C1449b(float f10, float f11, float f12, float f13) {
            this.f11046a = f10;
            this.f11047b = f11;
            this.f11048c = f12;
            this.f11049d = f13;
        }

        static C1449b a(float f10, float f11, float f12, float f13) {
            return new C1449b(f10, f11, f12 - f10, f13 - f11);
        }

        float b() {
            return this.f11046a + this.f11048c;
        }

        float c() {
            return this.f11047b + this.f11049d;
        }

        RectF d() {
            return new RectF(this.f11046a, this.f11047b, b(), c());
        }

        void e(C1449b c1449b) {
            float f10 = c1449b.f11046a;
            if (f10 < this.f11046a) {
                this.f11046a = f10;
            }
            float f11 = c1449b.f11047b;
            if (f11 < this.f11047b) {
                this.f11047b = f11;
            }
            if (c1449b.b() > b()) {
                this.f11048c = c1449b.b() - this.f11046a;
            }
            if (c1449b.c() > c()) {
                this.f11049d = c1449b.c() - this.f11047b;
            }
        }

        public String toString() {
            return "[" + this.f11046a + " " + this.f11047b + " " + this.f11048c + " " + this.f11049d + "]";
        }

        C1449b(C1449b c1449b) {
            this.f11046a = c1449b.f11046a;
            this.f11047b = c1449b.f11047b;
            this.f11048c = c1449b.f11048c;
            this.f11049d = c1449b.f11049d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C extends L implements J {
        C() {
        }

        @Override // U1.g.J
        public List b() {
            return Collections.EMPTY_LIST;
        }

        @Override // U1.g.N
        String o() {
            return "solidColor";
        }

        @Override // U1.g.J
        public void a(N n10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class D extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f10924h;

        D() {
        }

        @Override // U1.g.J
        public List b() {
            return Collections.EMPTY_LIST;
        }

        @Override // U1.g.N
        String o() {
            return "stop";
        }

        @Override // U1.g.J
        public void a(N n10) {
        }
    }
}

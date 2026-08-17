package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.C3045a;
import t0.AbstractC3357a;
import t0.AbstractC3358b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f15629f = {0, 4, 8};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SparseIntArray f15630g = new SparseIntArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static SparseIntArray f15631h = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15632a = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15633b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f15634c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15635d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap f15636e = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f15638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f15639c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f15640d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f15641e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C0156e f15642f = new C0156e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap f15643g = new HashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0155a f15644h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0155a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f15645a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f15646b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f15647c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f15648d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f15649e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f15650f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f15651g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f15652h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f15653i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f15654j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f15655k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f15656l = 0;

            C0155a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f15650f;
                int[] iArr = this.f15648d;
                if (i11 >= iArr.length) {
                    this.f15648d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f15649e;
                    this.f15649e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f15648d;
                int i12 = this.f15650f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f15649e;
                this.f15650f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f15647c;
                int[] iArr = this.f15645a;
                if (i12 >= iArr.length) {
                    this.f15645a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f15646b;
                    this.f15646b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f15645a;
                int i13 = this.f15647c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f15646b;
                this.f15647c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f15653i;
                int[] iArr = this.f15651g;
                if (i11 >= iArr.length) {
                    this.f15651g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f15652h;
                    this.f15652h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f15651g;
                int i12 = this.f15653i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f15652h;
                this.f15653i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f15656l;
                int[] iArr = this.f15654j;
                if (i11 >= iArr.length) {
                    this.f15654j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f15655k;
                    this.f15655k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f15654j;
                int i12 = this.f15656l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f15655k;
                this.f15656l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f15637a = i10;
            b bVar2 = this.f15641e;
            bVar2.f15700i = bVar.f15533d;
            bVar2.f15702j = bVar.f15535e;
            bVar2.f15704k = bVar.f15537f;
            bVar2.f15706l = bVar.f15539g;
            bVar2.f15708m = bVar.f15541h;
            bVar2.f15710n = bVar.f15543i;
            bVar2.f15712o = bVar.f15545j;
            bVar2.f15714p = bVar.f15547k;
            bVar2.f15716q = bVar.f15549l;
            bVar2.f15717r = bVar.f15551m;
            bVar2.f15718s = bVar.f15553n;
            bVar2.f15719t = bVar.f15561r;
            bVar2.f15720u = bVar.f15563s;
            bVar2.f15721v = bVar.f15565t;
            bVar2.f15722w = bVar.f15567u;
            bVar2.f15723x = bVar.f15506F;
            bVar2.f15724y = bVar.f15507G;
            bVar2.f15725z = bVar.f15508H;
            bVar2.f15658A = bVar.f15555o;
            bVar2.f15659B = bVar.f15557p;
            bVar2.f15660C = bVar.f15559q;
            bVar2.f15661D = bVar.f15523W;
            bVar2.f15662E = bVar.f15524X;
            bVar2.f15663F = bVar.f15525Y;
            bVar2.f15698h = bVar.f15531c;
            bVar2.f15694f = bVar.f15527a;
            bVar2.f15696g = bVar.f15529b;
            bVar2.f15690d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f15692e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f15664G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f15665H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f15666I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f15667J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f15670M = bVar.f15503C;
            bVar2.f15678U = bVar.f15512L;
            bVar2.f15679V = bVar.f15511K;
            bVar2.f15681X = bVar.f15514N;
            bVar2.f15680W = bVar.f15513M;
            bVar2.f15709m0 = bVar.f15526Z;
            bVar2.f15711n0 = bVar.f15528a0;
            bVar2.f15682Y = bVar.f15515O;
            bVar2.f15683Z = bVar.f15516P;
            bVar2.f15685a0 = bVar.f15519S;
            bVar2.f15687b0 = bVar.f15520T;
            bVar2.f15689c0 = bVar.f15517Q;
            bVar2.f15691d0 = bVar.f15518R;
            bVar2.f15693e0 = bVar.f15521U;
            bVar2.f15695f0 = bVar.f15522V;
            bVar2.f15707l0 = bVar.f15530b0;
            bVar2.f15672O = bVar.f15571w;
            bVar2.f15674Q = bVar.f15573y;
            bVar2.f15671N = bVar.f15569v;
            bVar2.f15673P = bVar.f15572x;
            bVar2.f15676S = bVar.f15574z;
            bVar2.f15675R = bVar.f15501A;
            bVar2.f15677T = bVar.f15502B;
            bVar2.f15715p0 = bVar.f15532c0;
            bVar2.f15668K = bVar.getMarginEnd();
            this.f15641e.f15669L = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f15641e;
            bVar.f15533d = bVar2.f15700i;
            bVar.f15535e = bVar2.f15702j;
            bVar.f15537f = bVar2.f15704k;
            bVar.f15539g = bVar2.f15706l;
            bVar.f15541h = bVar2.f15708m;
            bVar.f15543i = bVar2.f15710n;
            bVar.f15545j = bVar2.f15712o;
            bVar.f15547k = bVar2.f15714p;
            bVar.f15549l = bVar2.f15716q;
            bVar.f15551m = bVar2.f15717r;
            bVar.f15553n = bVar2.f15718s;
            bVar.f15561r = bVar2.f15719t;
            bVar.f15563s = bVar2.f15720u;
            bVar.f15565t = bVar2.f15721v;
            bVar.f15567u = bVar2.f15722w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f15664G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f15665H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f15666I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f15667J;
            bVar.f15574z = bVar2.f15676S;
            bVar.f15501A = bVar2.f15675R;
            bVar.f15571w = bVar2.f15672O;
            bVar.f15573y = bVar2.f15674Q;
            bVar.f15506F = bVar2.f15723x;
            bVar.f15507G = bVar2.f15724y;
            bVar.f15555o = bVar2.f15658A;
            bVar.f15557p = bVar2.f15659B;
            bVar.f15559q = bVar2.f15660C;
            bVar.f15508H = bVar2.f15725z;
            bVar.f15523W = bVar2.f15661D;
            bVar.f15524X = bVar2.f15662E;
            bVar.f15512L = bVar2.f15678U;
            bVar.f15511K = bVar2.f15679V;
            bVar.f15514N = bVar2.f15681X;
            bVar.f15513M = bVar2.f15680W;
            bVar.f15526Z = bVar2.f15709m0;
            bVar.f15528a0 = bVar2.f15711n0;
            bVar.f15515O = bVar2.f15682Y;
            bVar.f15516P = bVar2.f15683Z;
            bVar.f15519S = bVar2.f15685a0;
            bVar.f15520T = bVar2.f15687b0;
            bVar.f15517Q = bVar2.f15689c0;
            bVar.f15518R = bVar2.f15691d0;
            bVar.f15521U = bVar2.f15693e0;
            bVar.f15522V = bVar2.f15695f0;
            bVar.f15525Y = bVar2.f15663F;
            bVar.f15531c = bVar2.f15698h;
            bVar.f15527a = bVar2.f15694f;
            bVar.f15529b = bVar2.f15696g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f15690d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f15692e;
            String str = bVar2.f15707l0;
            if (str != null) {
                bVar.f15530b0 = str;
            }
            bVar.f15532c0 = bVar2.f15715p0;
            bVar.setMarginStart(bVar2.f15669L);
            bVar.setMarginEnd(this.f15641e.f15668K);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f15641e.a(this.f15641e);
            aVar.f15640d.a(this.f15640d);
            aVar.f15639c.a(this.f15639c);
            aVar.f15642f.a(this.f15642f);
            aVar.f15637a = this.f15637a;
            aVar.f15644h = this.f15644h;
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        private static SparseIntArray f15657q0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15692e;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int[] f15703j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public String f15705k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f15707l0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15684a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15686b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15688c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15694f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15696g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f15698h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15700i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15702j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15704k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15706l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f15708m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15710n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f15712o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f15714p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f15716q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f15717r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f15718s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15719t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f15720u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15721v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f15722w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f15723x = 0.5f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f15724y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f15725z = null;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f15658A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f15659B = 0;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public float f15660C = 0.0f;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f15661D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f15662E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f15663F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f15664G = 0;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f15665H = 0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f15666I = 0;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f15667J = 0;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f15668K = 0;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f15669L = 0;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f15670M = 0;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f15671N = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f15672O = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f15673P = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f15674Q = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f15675R = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f15676S = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f15677T = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public float f15678U = -1.0f;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public float f15679V = -1.0f;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f15680W = 0;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f15681X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f15682Y = 0;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f15683Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f15685a0 = -1;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f15687b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f15689c0 = -1;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f15691d0 = -1;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public float f15693e0 = 1.0f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f15695f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f15697g0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f15699h0 = 0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f15701i0 = -1;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public boolean f15709m0 = false;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f15711n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f15713o0 = true;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f15715p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15657q0 = sparseIntArray;
            sparseIntArray.append(i.f15938U5, 24);
            f15657q0.append(i.f15946V5, 25);
            f15657q0.append(i.f15962X5, 28);
            f15657q0.append(i.f15970Y5, 29);
            f15657q0.append(i.f16014d6, 35);
            f15657q0.append(i.f16005c6, 34);
            f15657q0.append(i.f15803E5, 4);
            f15657q0.append(i.f15794D5, 3);
            f15657q0.append(i.f15776B5, 1);
            f15657q0.append(i.f16068j6, 6);
            f15657q0.append(i.f16077k6, 7);
            f15657q0.append(i.f15866L5, 17);
            f15657q0.append(i.f15874M5, 18);
            f15657q0.append(i.f15882N5, 19);
            f15657q0.append(i.f16076k5, 26);
            f15657q0.append(i.f15978Z5, 31);
            f15657q0.append(i.f15987a6, 32);
            f15657q0.append(i.f15857K5, 10);
            f15657q0.append(i.f15848J5, 9);
            f15657q0.append(i.f16104n6, 13);
            f15657q0.append(i.f16131q6, 16);
            f15657q0.append(i.f16113o6, 14);
            f15657q0.append(i.f16086l6, 11);
            f15657q0.append(i.f16122p6, 15);
            f15657q0.append(i.f16095m6, 12);
            f15657q0.append(i.f16041g6, 38);
            f15657q0.append(i.f15922S5, 37);
            f15657q0.append(i.f15914R5, 39);
            f15657q0.append(i.f16032f6, 40);
            f15657q0.append(i.f15906Q5, 20);
            f15657q0.append(i.f16023e6, 36);
            f15657q0.append(i.f15839I5, 5);
            f15657q0.append(i.f15930T5, 76);
            f15657q0.append(i.f15996b6, 76);
            f15657q0.append(i.f15954W5, 76);
            f15657q0.append(i.f15785C5, 76);
            f15657q0.append(i.f15767A5, 76);
            f15657q0.append(i.f16103n5, 23);
            f15657q0.append(i.f16121p5, 27);
            f15657q0.append(i.f16139r5, 30);
            f15657q0.append(i.f16148s5, 8);
            f15657q0.append(i.f16112o5, 33);
            f15657q0.append(i.f16130q5, 2);
            f15657q0.append(i.f16085l5, 22);
            f15657q0.append(i.f16094m5, 21);
            f15657q0.append(i.f16050h6, 41);
            f15657q0.append(i.f15890O5, 42);
            f15657q0.append(i.f16211z5, 41);
            f15657q0.append(i.f16202y5, 42);
            f15657q0.append(i.f16140r6, 97);
            f15657q0.append(i.f15812F5, 61);
            f15657q0.append(i.f15830H5, 62);
            f15657q0.append(i.f15821G5, 63);
            f15657q0.append(i.f16059i6, 69);
            f15657q0.append(i.f15898P5, 70);
            f15657q0.append(i.f16184w5, 71);
            f15657q0.append(i.f16166u5, 72);
            f15657q0.append(i.f16175v5, 73);
            f15657q0.append(i.f16193x5, 74);
            f15657q0.append(i.f16157t5, 75);
        }

        public void a(b bVar) {
            this.f15684a = bVar.f15684a;
            this.f15690d = bVar.f15690d;
            this.f15686b = bVar.f15686b;
            this.f15692e = bVar.f15692e;
            this.f15694f = bVar.f15694f;
            this.f15696g = bVar.f15696g;
            this.f15698h = bVar.f15698h;
            this.f15700i = bVar.f15700i;
            this.f15702j = bVar.f15702j;
            this.f15704k = bVar.f15704k;
            this.f15706l = bVar.f15706l;
            this.f15708m = bVar.f15708m;
            this.f15710n = bVar.f15710n;
            this.f15712o = bVar.f15712o;
            this.f15714p = bVar.f15714p;
            this.f15716q = bVar.f15716q;
            this.f15717r = bVar.f15717r;
            this.f15718s = bVar.f15718s;
            this.f15719t = bVar.f15719t;
            this.f15720u = bVar.f15720u;
            this.f15721v = bVar.f15721v;
            this.f15722w = bVar.f15722w;
            this.f15723x = bVar.f15723x;
            this.f15724y = bVar.f15724y;
            this.f15725z = bVar.f15725z;
            this.f15658A = bVar.f15658A;
            this.f15659B = bVar.f15659B;
            this.f15660C = bVar.f15660C;
            this.f15661D = bVar.f15661D;
            this.f15662E = bVar.f15662E;
            this.f15663F = bVar.f15663F;
            this.f15664G = bVar.f15664G;
            this.f15665H = bVar.f15665H;
            this.f15666I = bVar.f15666I;
            this.f15667J = bVar.f15667J;
            this.f15668K = bVar.f15668K;
            this.f15669L = bVar.f15669L;
            this.f15670M = bVar.f15670M;
            this.f15671N = bVar.f15671N;
            this.f15672O = bVar.f15672O;
            this.f15673P = bVar.f15673P;
            this.f15674Q = bVar.f15674Q;
            this.f15675R = bVar.f15675R;
            this.f15676S = bVar.f15676S;
            this.f15677T = bVar.f15677T;
            this.f15678U = bVar.f15678U;
            this.f15679V = bVar.f15679V;
            this.f15680W = bVar.f15680W;
            this.f15681X = bVar.f15681X;
            this.f15682Y = bVar.f15682Y;
            this.f15683Z = bVar.f15683Z;
            this.f15685a0 = bVar.f15685a0;
            this.f15687b0 = bVar.f15687b0;
            this.f15689c0 = bVar.f15689c0;
            this.f15691d0 = bVar.f15691d0;
            this.f15693e0 = bVar.f15693e0;
            this.f15695f0 = bVar.f15695f0;
            this.f15697g0 = bVar.f15697g0;
            this.f15699h0 = bVar.f15699h0;
            this.f15701i0 = bVar.f15701i0;
            this.f15707l0 = bVar.f15707l0;
            int[] iArr = bVar.f15703j0;
            if (iArr != null) {
                this.f15703j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f15703j0 = null;
            }
            this.f15705k0 = bVar.f15705k0;
            this.f15709m0 = bVar.f15709m0;
            this.f15711n0 = bVar.f15711n0;
            this.f15713o0 = bVar.f15713o0;
            this.f15715p0 = bVar.f15715p0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f16067j5);
            this.f15686b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f15657q0.get(index);
                if (i11 == 80) {
                    this.f15709m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15709m0);
                } else if (i11 == 81) {
                    this.f15711n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15711n0);
                } else if (i11 != 97) {
                    switch (i11) {
                        case 1:
                            this.f15716q = e.m(typedArrayObtainStyledAttributes, index, this.f15716q);
                            break;
                        case 2:
                            this.f15667J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15667J);
                            break;
                        case 3:
                            this.f15714p = e.m(typedArrayObtainStyledAttributes, index, this.f15714p);
                            break;
                        case 4:
                            this.f15712o = e.m(typedArrayObtainStyledAttributes, index, this.f15712o);
                            break;
                        case 5:
                            this.f15725z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f15661D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15661D);
                            break;
                        case 7:
                            this.f15662E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15662E);
                            break;
                        case 8:
                            this.f15668K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15668K);
                            break;
                        case 9:
                            this.f15722w = e.m(typedArrayObtainStyledAttributes, index, this.f15722w);
                            break;
                        case 10:
                            this.f15721v = e.m(typedArrayObtainStyledAttributes, index, this.f15721v);
                            break;
                        case 11:
                            this.f15674Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15674Q);
                            break;
                        case 12:
                            this.f15675R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15675R);
                            break;
                        case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                            this.f15671N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15671N);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                            this.f15673P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15673P);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                            this.f15676S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15676S);
                            break;
                        case 16:
                            this.f15672O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15672O);
                            break;
                        case 17:
                            this.f15694f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15694f);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                            this.f15696g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15696g);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                            this.f15698h = typedArrayObtainStyledAttributes.getFloat(index, this.f15698h);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                            this.f15723x = typedArrayObtainStyledAttributes.getFloat(index, this.f15723x);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                            this.f15692e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f15692e);
                            break;
                        case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                            this.f15690d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f15690d);
                            break;
                        case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                            this.f15664G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15664G);
                            break;
                        case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                            this.f15700i = e.m(typedArrayObtainStyledAttributes, index, this.f15700i);
                            break;
                        case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                            this.f15702j = e.m(typedArrayObtainStyledAttributes, index, this.f15702j);
                            break;
                        case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                            this.f15663F = typedArrayObtainStyledAttributes.getInt(index, this.f15663F);
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                            this.f15665H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15665H);
                            break;
                        case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                            this.f15704k = e.m(typedArrayObtainStyledAttributes, index, this.f15704k);
                            break;
                        case 29:
                            this.f15706l = e.m(typedArrayObtainStyledAttributes, index, this.f15706l);
                            break;
                        case 30:
                            this.f15669L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15669L);
                            break;
                        case 31:
                            this.f15719t = e.m(typedArrayObtainStyledAttributes, index, this.f15719t);
                            break;
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                            this.f15720u = e.m(typedArrayObtainStyledAttributes, index, this.f15720u);
                            break;
                        case 33:
                            this.f15666I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15666I);
                            break;
                        case 34:
                            this.f15710n = e.m(typedArrayObtainStyledAttributes, index, this.f15710n);
                            break;
                        case 35:
                            this.f15708m = e.m(typedArrayObtainStyledAttributes, index, this.f15708m);
                            break;
                        case 36:
                            this.f15724y = typedArrayObtainStyledAttributes.getFloat(index, this.f15724y);
                            break;
                        case 37:
                            this.f15679V = typedArrayObtainStyledAttributes.getFloat(index, this.f15679V);
                            break;
                        case 38:
                            this.f15678U = typedArrayObtainStyledAttributes.getFloat(index, this.f15678U);
                            break;
                        case 39:
                            this.f15680W = typedArrayObtainStyledAttributes.getInt(index, this.f15680W);
                            break;
                        case 40:
                            this.f15681X = typedArrayObtainStyledAttributes.getInt(index, this.f15681X);
                            break;
                        case 41:
                            e.n(this, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            e.n(this, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f15682Y = typedArrayObtainStyledAttributes.getInt(index, this.f15682Y);
                                    break;
                                case 55:
                                    this.f15683Z = typedArrayObtainStyledAttributes.getInt(index, this.f15683Z);
                                    break;
                                case 56:
                                    this.f15685a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15685a0);
                                    break;
                                case 57:
                                    this.f15687b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15687b0);
                                    break;
                                case 58:
                                    this.f15689c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15689c0);
                                    break;
                                case 59:
                                    this.f15691d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15691d0);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f15658A = e.m(typedArrayObtainStyledAttributes, index, this.f15658A);
                                            break;
                                        case 62:
                                            this.f15659B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15659B);
                                            break;
                                        case 63:
                                            this.f15660C = typedArrayObtainStyledAttributes.getFloat(index, this.f15660C);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f15693e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f15695f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.f15697g0 = typedArrayObtainStyledAttributes.getInt(index, this.f15697g0);
                                                    break;
                                                case 73:
                                                    this.f15699h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15699h0);
                                                    break;
                                                case 74:
                                                    this.f15705k0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f15713o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15713o0);
                                                    break;
                                                case 76:
                                                    Integer.toHexString(index);
                                                    f15657q0.get(index);
                                                    break;
                                                case 77:
                                                    this.f15707l0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 91:
                                                            this.f15717r = e.m(typedArrayObtainStyledAttributes, index, this.f15717r);
                                                            break;
                                                        case 92:
                                                            this.f15718s = e.m(typedArrayObtainStyledAttributes, index, this.f15718s);
                                                            break;
                                                        case 93:
                                                            this.f15670M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15670M);
                                                            break;
                                                        case 94:
                                                            this.f15677T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15677T);
                                                            break;
                                                        default:
                                                            Integer.toHexString(index);
                                                            f15657q0.get(index);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f15715p0 = typedArrayObtainStyledAttributes.getInt(index, this.f15715p0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f15726o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15727a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15728b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15729c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15730d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15731e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15732f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15733g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15734h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f15735i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f15736j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15737k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f15738l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f15739m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15740n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15726o = sparseIntArray;
            sparseIntArray.append(i.f15795D6, 1);
            f15726o.append(i.f15813F6, 2);
            f15726o.append(i.f15849J6, 3);
            f15726o.append(i.f15786C6, 4);
            f15726o.append(i.f15777B6, 5);
            f15726o.append(i.f15768A6, 6);
            f15726o.append(i.f15804E6, 7);
            f15726o.append(i.f15840I6, 8);
            f15726o.append(i.f15831H6, 9);
            f15726o.append(i.f15822G6, 10);
        }

        public void a(c cVar) {
            this.f15727a = cVar.f15727a;
            this.f15728b = cVar.f15728b;
            this.f15730d = cVar.f15730d;
            this.f15731e = cVar.f15731e;
            this.f15732f = cVar.f15732f;
            this.f15735i = cVar.f15735i;
            this.f15733g = cVar.f15733g;
            this.f15734h = cVar.f15734h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f16212z6);
            this.f15727a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f15726o.get(index)) {
                    case 1:
                        this.f15735i = typedArrayObtainStyledAttributes.getFloat(index, this.f15735i);
                        break;
                    case 2:
                        this.f15731e = typedArrayObtainStyledAttributes.getInt(index, this.f15731e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f15730d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f15730d = C3045a.f30604c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f15732f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f15728b = e.m(typedArrayObtainStyledAttributes, index, this.f15728b);
                        break;
                    case 6:
                        this.f15729c = typedArrayObtainStyledAttributes.getInteger(index, this.f15729c);
                        break;
                    case 7:
                        this.f15733g = typedArrayObtainStyledAttributes.getFloat(index, this.f15733g);
                        break;
                    case 8:
                        this.f15737k = typedArrayObtainStyledAttributes.getInteger(index, this.f15737k);
                        break;
                    case 9:
                        this.f15736j = typedArrayObtainStyledAttributes.getFloat(index, this.f15736j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f15740n = resourceId;
                            if (resourceId != -1) {
                                this.f15739m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f15738l = string;
                            if (string.indexOf("/") > 0) {
                                this.f15740n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f15739m = -2;
                            } else {
                                this.f15739m = -1;
                            }
                        } else {
                            this.f15739m = typedArrayObtainStyledAttributes.getInteger(index, this.f15740n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15741a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15742b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15743c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f15744d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15745e = Float.NaN;

        public void a(d dVar) {
            this.f15741a = dVar.f15741a;
            this.f15742b = dVar.f15742b;
            this.f15744d = dVar.f15744d;
            this.f15745e = dVar.f15745e;
            this.f15743c = dVar.f15743c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f15939U6);
            this.f15741a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f15955W6) {
                    this.f15744d = typedArrayObtainStyledAttributes.getFloat(index, this.f15744d);
                } else if (index == i.f15947V6) {
                    this.f15742b = typedArrayObtainStyledAttributes.getInt(index, this.f15742b);
                    this.f15742b = e.f15629f[this.f15742b];
                } else if (index == i.f15971Y6) {
                    this.f15743c = typedArrayObtainStyledAttributes.getInt(index, this.f15743c);
                } else if (index == i.f15963X6) {
                    this.f15745e = typedArrayObtainStyledAttributes.getFloat(index, this.f15745e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0156e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f15746o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15747a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15748b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15749c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f15750d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15751e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f15752f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15753g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f15754h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15755i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f15756j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f15757k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f15758l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f15759m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f15760n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15746o = sparseIntArray;
            sparseIntArray.append(i.f16159t7, 1);
            f15746o.append(i.f16168u7, 2);
            f15746o.append(i.f16177v7, 3);
            f15746o.append(i.f16141r7, 4);
            f15746o.append(i.f16150s7, 5);
            f15746o.append(i.f16105n7, 6);
            f15746o.append(i.f16114o7, 7);
            f15746o.append(i.f16123p7, 8);
            f15746o.append(i.f16132q7, 9);
            f15746o.append(i.f16186w7, 10);
            f15746o.append(i.f16195x7, 11);
            f15746o.append(i.f16204y7, 12);
        }

        public void a(C0156e c0156e) {
            this.f15747a = c0156e.f15747a;
            this.f15748b = c0156e.f15748b;
            this.f15749c = c0156e.f15749c;
            this.f15750d = c0156e.f15750d;
            this.f15751e = c0156e.f15751e;
            this.f15752f = c0156e.f15752f;
            this.f15753g = c0156e.f15753g;
            this.f15754h = c0156e.f15754h;
            this.f15755i = c0156e.f15755i;
            this.f15756j = c0156e.f15756j;
            this.f15757k = c0156e.f15757k;
            this.f15758l = c0156e.f15758l;
            this.f15759m = c0156e.f15759m;
            this.f15760n = c0156e.f15760n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f16096m7);
            this.f15747a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f15746o.get(index)) {
                    case 1:
                        this.f15748b = typedArrayObtainStyledAttributes.getFloat(index, this.f15748b);
                        break;
                    case 2:
                        this.f15749c = typedArrayObtainStyledAttributes.getFloat(index, this.f15749c);
                        break;
                    case 3:
                        this.f15750d = typedArrayObtainStyledAttributes.getFloat(index, this.f15750d);
                        break;
                    case 4:
                        this.f15751e = typedArrayObtainStyledAttributes.getFloat(index, this.f15751e);
                        break;
                    case 5:
                        this.f15752f = typedArrayObtainStyledAttributes.getFloat(index, this.f15752f);
                        break;
                    case 6:
                        this.f15753g = typedArrayObtainStyledAttributes.getDimension(index, this.f15753g);
                        break;
                    case 7:
                        this.f15754h = typedArrayObtainStyledAttributes.getDimension(index, this.f15754h);
                        break;
                    case 8:
                        this.f15756j = typedArrayObtainStyledAttributes.getDimension(index, this.f15756j);
                        break;
                    case 9:
                        this.f15757k = typedArrayObtainStyledAttributes.getDimension(index, this.f15757k);
                        break;
                    case 10:
                        this.f15758l = typedArrayObtainStyledAttributes.getDimension(index, this.f15758l);
                        break;
                    case 11:
                        this.f15759m = true;
                        this.f15760n = typedArrayObtainStyledAttributes.getDimension(index, this.f15760n);
                        break;
                    case 12:
                        this.f15755i = e.m(typedArrayObtainStyledAttributes, index, this.f15755i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f15630g.append(i.f16206z0, 25);
        f15630g.append(i.f15762A0, 26);
        f15630g.append(i.f15780C0, 29);
        f15630g.append(i.f15789D0, 30);
        f15630g.append(i.f15843J0, 36);
        f15630g.append(i.f15834I0, 35);
        f15630g.append(i.f16035g0, 4);
        f15630g.append(i.f16026f0, 3);
        f15630g.append(i.f15990b0, 1);
        f15630g.append(i.f16008d0, 91);
        f15630g.append(i.f15999c0, 92);
        f15630g.append(i.f15917S0, 6);
        f15630g.append(i.f15925T0, 7);
        f15630g.append(i.f16098n0, 17);
        f15630g.append(i.f16107o0, 18);
        f15630g.append(i.f16116p0, 19);
        f15630g.append(i.f16160u, 27);
        f15630g.append(i.f15798E0, 32);
        f15630g.append(i.f15807F0, 33);
        f15630g.append(i.f16089m0, 10);
        f15630g.append(i.f16080l0, 9);
        f15630g.append(i.f15949W0, 13);
        f15630g.append(i.f15973Z0, 16);
        f15630g.append(i.f15957X0, 14);
        f15630g.append(i.f15933U0, 11);
        f15630g.append(i.f15965Y0, 15);
        f15630g.append(i.f15941V0, 12);
        f15630g.append(i.f15869M0, 40);
        f15630g.append(i.f16188x0, 39);
        f15630g.append(i.f16179w0, 41);
        f15630g.append(i.f15861L0, 42);
        f15630g.append(i.f16170v0, 20);
        f15630g.append(i.f15852K0, 37);
        f15630g.append(i.f16071k0, 5);
        f15630g.append(i.f16197y0, 87);
        f15630g.append(i.f15825H0, 87);
        f15630g.append(i.f15771B0, 87);
        f15630g.append(i.f16017e0, 87);
        f15630g.append(i.f15981a0, 87);
        f15630g.append(i.f16205z, 24);
        f15630g.append(i.f15770B, 28);
        f15630g.append(i.f15876N, 31);
        f15630g.append(i.f15884O, 8);
        f15630g.append(i.f15761A, 34);
        f15630g.append(i.f15779C, 2);
        f15630g.append(i.f16187x, 23);
        f15630g.append(i.f16196y, 21);
        f15630g.append(i.f15877N0, 95);
        f15630g.append(i.f16125q0, 96);
        f15630g.append(i.f16178w, 22);
        f15630g.append(i.f15788D, 43);
        f15630g.append(i.f15900Q, 44);
        f15630g.append(i.f15860L, 45);
        f15630g.append(i.f15868M, 46);
        f15630g.append(i.f15851K, 60);
        f15630g.append(i.f15833I, 47);
        f15630g.append(i.f15842J, 48);
        f15630g.append(i.f15797E, 49);
        f15630g.append(i.f15806F, 50);
        f15630g.append(i.f15815G, 51);
        f15630g.append(i.f15824H, 52);
        f15630g.append(i.f15892P, 53);
        f15630g.append(i.f15885O0, 54);
        f15630g.append(i.f16134r0, 55);
        f15630g.append(i.f15893P0, 56);
        f15630g.append(i.f16143s0, 57);
        f15630g.append(i.f15901Q0, 58);
        f15630g.append(i.f16152t0, 59);
        f15630g.append(i.f16044h0, 61);
        f15630g.append(i.f16062j0, 62);
        f15630g.append(i.f16053i0, 63);
        f15630g.append(i.f15908R, 64);
        f15630g.append(i.f16063j1, 65);
        f15630g.append(i.f15956X, 66);
        f15630g.append(i.f16072k1, 67);
        f15630g.append(i.f16000c1, 79);
        f15630g.append(i.f16169v, 38);
        f15630g.append(i.f15991b1, 68);
        f15630g.append(i.f15909R0, 69);
        f15630g.append(i.f16161u0, 70);
        f15630g.append(i.f15982a1, 97);
        f15630g.append(i.f15940V, 71);
        f15630g.append(i.f15924T, 72);
        f15630g.append(i.f15932U, 73);
        f15630g.append(i.f15948W, 74);
        f15630g.append(i.f15916S, 75);
        f15630g.append(i.f16009d1, 76);
        f15630g.append(i.f15816G0, 77);
        f15630g.append(i.f16081l1, 78);
        f15630g.append(i.f15972Z, 80);
        f15630g.append(i.f15964Y, 81);
        f15630g.append(i.f16018e1, 82);
        f15630g.append(i.f16054i1, 83);
        f15630g.append(i.f16045h1, 84);
        f15630g.append(i.f16036g1, 85);
        f15630g.append(i.f16027f1, 86);
        f15631h.append(i.f16111o4, 6);
        f15631h.append(i.f16111o4, 7);
        f15631h.append(i.f16065j3, 27);
        f15631h.append(i.f16138r4, 13);
        f15631h.append(i.f16165u4, 16);
        f15631h.append(i.f16147s4, 14);
        f15631h.append(i.f16120p4, 11);
        f15631h.append(i.f16156t4, 15);
        f15631h.append(i.f16129q4, 12);
        f15631h.append(i.f16057i4, 40);
        f15631h.append(i.f15994b4, 39);
        f15631h.append(i.f15985a4, 41);
        f15631h.append(i.f16048h4, 42);
        f15631h.append(i.f15976Z3, 20);
        f15631h.append(i.f16039g4, 37);
        f15631h.append(i.f15928T3, 5);
        f15631h.append(i.f16003c4, 87);
        f15631h.append(i.f16030f4, 87);
        f15631h.append(i.f16012d4, 87);
        f15631h.append(i.f15904Q3, 87);
        f15631h.append(i.f15896P3, 87);
        f15631h.append(i.f16110o3, 24);
        f15631h.append(i.f16128q3, 28);
        f15631h.append(i.f15783C3, 31);
        f15631h.append(i.f15792D3, 8);
        f15631h.append(i.f16119p3, 34);
        f15631h.append(i.f16137r3, 2);
        f15631h.append(i.f16092m3, 23);
        f15631h.append(i.f16101n3, 21);
        f15631h.append(i.f16066j4, 95);
        f15631h.append(i.f15936U3, 96);
        f15631h.append(i.f16083l3, 22);
        f15631h.append(i.f16146s3, 43);
        f15631h.append(i.f15810F3, 44);
        f15631h.append(i.f15765A3, 45);
        f15631h.append(i.f15774B3, 46);
        f15631h.append(i.f16209z3, 60);
        f15631h.append(i.f16191x3, 47);
        f15631h.append(i.f16200y3, 48);
        f15631h.append(i.f16155t3, 49);
        f15631h.append(i.f16164u3, 50);
        f15631h.append(i.f16173v3, 51);
        f15631h.append(i.f16182w3, 52);
        f15631h.append(i.f15801E3, 53);
        f15631h.append(i.f16075k4, 54);
        f15631h.append(i.f15944V3, 55);
        f15631h.append(i.f16084l4, 56);
        f15631h.append(i.f15952W3, 57);
        f15631h.append(i.f16093m4, 58);
        f15631h.append(i.f15960X3, 59);
        f15631h.append(i.f15920S3, 62);
        f15631h.append(i.f15912R3, 63);
        f15631h.append(i.f15819G3, 64);
        f15631h.append(i.f15811F4, 65);
        f15631h.append(i.f15872M3, 66);
        f15631h.append(i.f15820G4, 67);
        f15631h.append(i.f16192x4, 79);
        f15631h.append(i.f16074k3, 38);
        f15631h.append(i.f16201y4, 98);
        f15631h.append(i.f16183w4, 68);
        f15631h.append(i.f16102n4, 69);
        f15631h.append(i.f15968Y3, 70);
        f15631h.append(i.f15855K3, 71);
        f15631h.append(i.f15837I3, 72);
        f15631h.append(i.f15846J3, 73);
        f15631h.append(i.f15864L3, 74);
        f15631h.append(i.f15828H3, 75);
        f15631h.append(i.f16210z4, 76);
        f15631h.append(i.f16021e4, 77);
        f15631h.append(i.f15829H4, 78);
        f15631h.append(i.f15888O3, 80);
        f15631h.append(i.f15880N3, 81);
        f15631h.append(i.f15766A4, 82);
        f15631h.append(i.f15802E4, 83);
        f15631h.append(i.f15793D4, 84);
        f15631h.append(i.f15784C4, 85);
        f15631h.append(i.f15775B4, 86);
        f15631h.append(i.f16174v4, 97);
    }

    private int[] h(View view, String str) {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? i.f16056i3 : i.f16151t);
        q(context, aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f15636e.containsKey(Integer.valueOf(i10))) {
            this.f15636e.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f15636e.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void n(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            o(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (!(obj instanceof ConstraintLayout.b)) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i13;
                    bVar.f15526Z = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar).height = i13;
                    bVar.f15528a0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i11 == 0) {
                    bVar2.f15690d = i13;
                    bVar2.f15709m0 = z10;
                    return;
                } else {
                    bVar2.f15692e = i13;
                    bVar2.f15711n0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0155a) {
                a.C0155a c0155a = (a.C0155a) obj;
                if (i11 == 0) {
                    c0155a.b(23, i13);
                    c0155a.d(80, z10);
                    return;
                } else {
                    c0155a.b(21, i13);
                    c0155a.d(81, z10);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (!(obj instanceof ConstraintLayout.b)) {
        }
    }

    static void o(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    p(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f15725z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0155a) {
                        ((a.C0155a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f15511K = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f15512L = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f15690d = 0;
                            bVar3.f15679V = f10;
                            return;
                        } else {
                            bVar3.f15692e = 0;
                            bVar3.f15678U = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0155a) {
                        a.C0155a c0155a = (a.C0155a) obj;
                        if (i10 == 0) {
                            c0155a.b(23, 0);
                            c0155a.a(39, f10);
                            return;
                        } else {
                            c0155a.b(21, 0);
                            c0155a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f15521U = fMax;
                            bVar4.f15515O = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f15522V = fMax;
                            bVar4.f15516P = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f15690d = 0;
                            bVar5.f15693e0 = fMax;
                            bVar5.f15682Y = 2;
                            return;
                        } else {
                            bVar5.f15692e = 0;
                            bVar5.f15695f0 = fMax;
                            bVar5.f15683Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0155a) {
                        a.C0155a c0155a2 = (a.C0155a) obj;
                        if (i10 == 0) {
                            c0155a2.b(23, 0);
                            c0155a2.b(54, 2);
                        } else {
                            c0155a2.b(21, 0);
                            c0155a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void p(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f15508H = str;
        bVar.f15509I = fAbs;
        bVar.f15510J = i10;
    }

    private void q(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            r(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f16169v && i.f15876N != index && i.f15884O != index) {
                aVar.f15640d.f15727a = true;
                aVar.f15641e.f15686b = true;
                aVar.f15639c.f15741a = true;
                aVar.f15642f.f15747a = true;
            }
            switch (f15630g.get(index)) {
                case 1:
                    b bVar = aVar.f15641e;
                    bVar.f15716q = m(typedArray, index, bVar.f15716q);
                    break;
                case 2:
                    b bVar2 = aVar.f15641e;
                    bVar2.f15667J = typedArray.getDimensionPixelSize(index, bVar2.f15667J);
                    break;
                case 3:
                    b bVar3 = aVar.f15641e;
                    bVar3.f15714p = m(typedArray, index, bVar3.f15714p);
                    break;
                case 4:
                    b bVar4 = aVar.f15641e;
                    bVar4.f15712o = m(typedArray, index, bVar4.f15712o);
                    break;
                case 5:
                    aVar.f15641e.f15725z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f15641e;
                    bVar5.f15661D = typedArray.getDimensionPixelOffset(index, bVar5.f15661D);
                    break;
                case 7:
                    b bVar6 = aVar.f15641e;
                    bVar6.f15662E = typedArray.getDimensionPixelOffset(index, bVar6.f15662E);
                    break;
                case 8:
                    b bVar7 = aVar.f15641e;
                    bVar7.f15668K = typedArray.getDimensionPixelSize(index, bVar7.f15668K);
                    break;
                case 9:
                    b bVar8 = aVar.f15641e;
                    bVar8.f15722w = m(typedArray, index, bVar8.f15722w);
                    break;
                case 10:
                    b bVar9 = aVar.f15641e;
                    bVar9.f15721v = m(typedArray, index, bVar9.f15721v);
                    break;
                case 11:
                    b bVar10 = aVar.f15641e;
                    bVar10.f15674Q = typedArray.getDimensionPixelSize(index, bVar10.f15674Q);
                    break;
                case 12:
                    b bVar11 = aVar.f15641e;
                    bVar11.f15675R = typedArray.getDimensionPixelSize(index, bVar11.f15675R);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    b bVar12 = aVar.f15641e;
                    bVar12.f15671N = typedArray.getDimensionPixelSize(index, bVar12.f15671N);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    b bVar13 = aVar.f15641e;
                    bVar13.f15673P = typedArray.getDimensionPixelSize(index, bVar13.f15673P);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    b bVar14 = aVar.f15641e;
                    bVar14.f15676S = typedArray.getDimensionPixelSize(index, bVar14.f15676S);
                    break;
                case 16:
                    b bVar15 = aVar.f15641e;
                    bVar15.f15672O = typedArray.getDimensionPixelSize(index, bVar15.f15672O);
                    break;
                case 17:
                    b bVar16 = aVar.f15641e;
                    bVar16.f15694f = typedArray.getDimensionPixelOffset(index, bVar16.f15694f);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    b bVar17 = aVar.f15641e;
                    bVar17.f15696g = typedArray.getDimensionPixelOffset(index, bVar17.f15696g);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    b bVar18 = aVar.f15641e;
                    bVar18.f15698h = typedArray.getFloat(index, bVar18.f15698h);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    b bVar19 = aVar.f15641e;
                    bVar19.f15723x = typedArray.getFloat(index, bVar19.f15723x);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    b bVar20 = aVar.f15641e;
                    bVar20.f15692e = typedArray.getLayoutDimension(index, bVar20.f15692e);
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    d dVar = aVar.f15639c;
                    dVar.f15742b = typedArray.getInt(index, dVar.f15742b);
                    d dVar2 = aVar.f15639c;
                    dVar2.f15742b = f15629f[dVar2.f15742b];
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    b bVar21 = aVar.f15641e;
                    bVar21.f15690d = typedArray.getLayoutDimension(index, bVar21.f15690d);
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    b bVar22 = aVar.f15641e;
                    bVar22.f15664G = typedArray.getDimensionPixelSize(index, bVar22.f15664G);
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    b bVar23 = aVar.f15641e;
                    bVar23.f15700i = m(typedArray, index, bVar23.f15700i);
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    b bVar24 = aVar.f15641e;
                    bVar24.f15702j = m(typedArray, index, bVar24.f15702j);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    b bVar25 = aVar.f15641e;
                    bVar25.f15663F = typedArray.getInt(index, bVar25.f15663F);
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    b bVar26 = aVar.f15641e;
                    bVar26.f15665H = typedArray.getDimensionPixelSize(index, bVar26.f15665H);
                    break;
                case 29:
                    b bVar27 = aVar.f15641e;
                    bVar27.f15704k = m(typedArray, index, bVar27.f15704k);
                    break;
                case 30:
                    b bVar28 = aVar.f15641e;
                    bVar28.f15706l = m(typedArray, index, bVar28.f15706l);
                    break;
                case 31:
                    b bVar29 = aVar.f15641e;
                    bVar29.f15669L = typedArray.getDimensionPixelSize(index, bVar29.f15669L);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    b bVar30 = aVar.f15641e;
                    bVar30.f15719t = m(typedArray, index, bVar30.f15719t);
                    break;
                case 33:
                    b bVar31 = aVar.f15641e;
                    bVar31.f15720u = m(typedArray, index, bVar31.f15720u);
                    break;
                case 34:
                    b bVar32 = aVar.f15641e;
                    bVar32.f15666I = typedArray.getDimensionPixelSize(index, bVar32.f15666I);
                    break;
                case 35:
                    b bVar33 = aVar.f15641e;
                    bVar33.f15710n = m(typedArray, index, bVar33.f15710n);
                    break;
                case 36:
                    b bVar34 = aVar.f15641e;
                    bVar34.f15708m = m(typedArray, index, bVar34.f15708m);
                    break;
                case 37:
                    b bVar35 = aVar.f15641e;
                    bVar35.f15724y = typedArray.getFloat(index, bVar35.f15724y);
                    break;
                case 38:
                    aVar.f15637a = typedArray.getResourceId(index, aVar.f15637a);
                    break;
                case 39:
                    b bVar36 = aVar.f15641e;
                    bVar36.f15679V = typedArray.getFloat(index, bVar36.f15679V);
                    break;
                case 40:
                    b bVar37 = aVar.f15641e;
                    bVar37.f15678U = typedArray.getFloat(index, bVar37.f15678U);
                    break;
                case 41:
                    b bVar38 = aVar.f15641e;
                    bVar38.f15680W = typedArray.getInt(index, bVar38.f15680W);
                    break;
                case 42:
                    b bVar39 = aVar.f15641e;
                    bVar39.f15681X = typedArray.getInt(index, bVar39.f15681X);
                    break;
                case 43:
                    d dVar3 = aVar.f15639c;
                    dVar3.f15744d = typedArray.getFloat(index, dVar3.f15744d);
                    break;
                case 44:
                    C0156e c0156e = aVar.f15642f;
                    c0156e.f15759m = true;
                    c0156e.f15760n = typedArray.getDimension(index, c0156e.f15760n);
                    break;
                case BuildConfig.VERSION_CODE /* 45 */:
                    C0156e c0156e2 = aVar.f15642f;
                    c0156e2.f15749c = typedArray.getFloat(index, c0156e2.f15749c);
                    break;
                case 46:
                    C0156e c0156e3 = aVar.f15642f;
                    c0156e3.f15750d = typedArray.getFloat(index, c0156e3.f15750d);
                    break;
                case 47:
                    C0156e c0156e4 = aVar.f15642f;
                    c0156e4.f15751e = typedArray.getFloat(index, c0156e4.f15751e);
                    break;
                case 48:
                    C0156e c0156e5 = aVar.f15642f;
                    c0156e5.f15752f = typedArray.getFloat(index, c0156e5.f15752f);
                    break;
                case 49:
                    C0156e c0156e6 = aVar.f15642f;
                    c0156e6.f15753g = typedArray.getDimension(index, c0156e6.f15753g);
                    break;
                case 50:
                    C0156e c0156e7 = aVar.f15642f;
                    c0156e7.f15754h = typedArray.getDimension(index, c0156e7.f15754h);
                    break;
                case 51:
                    C0156e c0156e8 = aVar.f15642f;
                    c0156e8.f15756j = typedArray.getDimension(index, c0156e8.f15756j);
                    break;
                case 52:
                    C0156e c0156e9 = aVar.f15642f;
                    c0156e9.f15757k = typedArray.getDimension(index, c0156e9.f15757k);
                    break;
                case 53:
                    C0156e c0156e10 = aVar.f15642f;
                    c0156e10.f15758l = typedArray.getDimension(index, c0156e10.f15758l);
                    break;
                case 54:
                    b bVar40 = aVar.f15641e;
                    bVar40.f15682Y = typedArray.getInt(index, bVar40.f15682Y);
                    break;
                case 55:
                    b bVar41 = aVar.f15641e;
                    bVar41.f15683Z = typedArray.getInt(index, bVar41.f15683Z);
                    break;
                case 56:
                    b bVar42 = aVar.f15641e;
                    bVar42.f15685a0 = typedArray.getDimensionPixelSize(index, bVar42.f15685a0);
                    break;
                case 57:
                    b bVar43 = aVar.f15641e;
                    bVar43.f15687b0 = typedArray.getDimensionPixelSize(index, bVar43.f15687b0);
                    break;
                case 58:
                    b bVar44 = aVar.f15641e;
                    bVar44.f15689c0 = typedArray.getDimensionPixelSize(index, bVar44.f15689c0);
                    break;
                case 59:
                    b bVar45 = aVar.f15641e;
                    bVar45.f15691d0 = typedArray.getDimensionPixelSize(index, bVar45.f15691d0);
                    break;
                case 60:
                    C0156e c0156e11 = aVar.f15642f;
                    c0156e11.f15748b = typedArray.getFloat(index, c0156e11.f15748b);
                    break;
                case 61:
                    b bVar46 = aVar.f15641e;
                    bVar46.f15658A = m(typedArray, index, bVar46.f15658A);
                    break;
                case 62:
                    b bVar47 = aVar.f15641e;
                    bVar47.f15659B = typedArray.getDimensionPixelSize(index, bVar47.f15659B);
                    break;
                case 63:
                    b bVar48 = aVar.f15641e;
                    bVar48.f15660C = typedArray.getFloat(index, bVar48.f15660C);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    c cVar = aVar.f15640d;
                    cVar.f15728b = m(typedArray, index, cVar.f15728b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f15640d.f15730d = typedArray.getString(index);
                    } else {
                        aVar.f15640d.f15730d = C3045a.f30604c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f15640d.f15732f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f15640d;
                    cVar2.f15735i = typedArray.getFloat(index, cVar2.f15735i);
                    break;
                case 68:
                    d dVar4 = aVar.f15639c;
                    dVar4.f15745e = typedArray.getFloat(index, dVar4.f15745e);
                    break;
                case 69:
                    aVar.f15641e.f15693e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f15641e.f15695f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f15641e;
                    bVar49.f15697g0 = typedArray.getInt(index, bVar49.f15697g0);
                    break;
                case 73:
                    b bVar50 = aVar.f15641e;
                    bVar50.f15699h0 = typedArray.getDimensionPixelSize(index, bVar50.f15699h0);
                    break;
                case 74:
                    aVar.f15641e.f15705k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f15641e;
                    bVar51.f15713o0 = typedArray.getBoolean(index, bVar51.f15713o0);
                    break;
                case 76:
                    c cVar3 = aVar.f15640d;
                    cVar3.f15731e = typedArray.getInt(index, cVar3.f15731e);
                    break;
                case 77:
                    aVar.f15641e.f15707l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f15639c;
                    dVar5.f15743c = typedArray.getInt(index, dVar5.f15743c);
                    break;
                case 79:
                    c cVar4 = aVar.f15640d;
                    cVar4.f15733g = typedArray.getFloat(index, cVar4.f15733g);
                    break;
                case 80:
                    b bVar52 = aVar.f15641e;
                    bVar52.f15709m0 = typedArray.getBoolean(index, bVar52.f15709m0);
                    break;
                case 81:
                    b bVar53 = aVar.f15641e;
                    bVar53.f15711n0 = typedArray.getBoolean(index, bVar53.f15711n0);
                    break;
                case 82:
                    c cVar5 = aVar.f15640d;
                    cVar5.f15729c = typedArray.getInteger(index, cVar5.f15729c);
                    break;
                case 83:
                    C0156e c0156e12 = aVar.f15642f;
                    c0156e12.f15755i = m(typedArray, index, c0156e12.f15755i);
                    break;
                case 84:
                    c cVar6 = aVar.f15640d;
                    cVar6.f15737k = typedArray.getInteger(index, cVar6.f15737k);
                    break;
                case 85:
                    c cVar7 = aVar.f15640d;
                    cVar7.f15736j = typedArray.getFloat(index, cVar7.f15736j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f15640d.f15740n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f15640d;
                        if (cVar8.f15740n != -1) {
                            cVar8.f15739m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f15640d.f15738l = typedArray.getString(index);
                        if (aVar.f15640d.f15738l.indexOf("/") > 0) {
                            aVar.f15640d.f15740n = typedArray.getResourceId(index, -1);
                            aVar.f15640d.f15739m = -2;
                        } else {
                            aVar.f15640d.f15739m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f15640d;
                        cVar9.f15739m = typedArray.getInteger(index, cVar9.f15740n);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    f15630g.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    f15630g.get(index);
                    break;
                case 91:
                    b bVar54 = aVar.f15641e;
                    bVar54.f15717r = m(typedArray, index, bVar54.f15717r);
                    break;
                case 92:
                    b bVar55 = aVar.f15641e;
                    bVar55.f15718s = m(typedArray, index, bVar55.f15718s);
                    break;
                case 93:
                    b bVar56 = aVar.f15641e;
                    bVar56.f15670M = typedArray.getDimensionPixelSize(index, bVar56.f15670M);
                    break;
                case 94:
                    b bVar57 = aVar.f15641e;
                    bVar57.f15677T = typedArray.getDimensionPixelSize(index, bVar57.f15677T);
                    break;
                case 95:
                    n(aVar.f15641e, typedArray, index, 0);
                    break;
                case 96:
                    n(aVar.f15641e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f15641e;
                    bVar58.f15715p0 = typedArray.getInt(index, bVar58.f15715p0);
                    break;
            }
        }
    }

    private static void r(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0155a c0155a = new a.C0155a();
        aVar.f15644h = c0155a;
        aVar.f15640d.f15727a = false;
        aVar.f15641e.f15686b = false;
        aVar.f15639c.f15741a = false;
        aVar.f15642f.f15747a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f15631h.get(index)) {
                case 2:
                    c0155a.b(2, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15667J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case 29:
                case 30:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    f15630g.get(index);
                    break;
                case 5:
                    c0155a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0155a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f15641e.f15661D));
                    break;
                case 7:
                    c0155a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f15641e.f15662E));
                    break;
                case 8:
                    c0155a.b(8, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15668K));
                    break;
                case 11:
                    c0155a.b(11, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15674Q));
                    break;
                case 12:
                    c0155a.b(12, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15675R));
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    c0155a.b(13, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15671N));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    c0155a.b(14, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15673P));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    c0155a.b(15, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15676S));
                    break;
                case 16:
                    c0155a.b(16, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15672O));
                    break;
                case 17:
                    c0155a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f15641e.f15694f));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    c0155a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f15641e.f15696g));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    c0155a.a(19, typedArray.getFloat(index, aVar.f15641e.f15698h));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    c0155a.a(20, typedArray.getFloat(index, aVar.f15641e.f15723x));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    c0155a.b(21, typedArray.getLayoutDimension(index, aVar.f15641e.f15692e));
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    c0155a.b(22, f15629f[typedArray.getInt(index, aVar.f15639c.f15742b)]);
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    c0155a.b(23, typedArray.getLayoutDimension(index, aVar.f15641e.f15690d));
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    c0155a.b(24, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15664G));
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    c0155a.b(27, typedArray.getInt(index, aVar.f15641e.f15663F));
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    c0155a.b(28, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15665H));
                    break;
                case 31:
                    c0155a.b(31, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15669L));
                    break;
                case 34:
                    c0155a.b(34, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15666I));
                    break;
                case 37:
                    c0155a.a(37, typedArray.getFloat(index, aVar.f15641e.f15724y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f15637a);
                    aVar.f15637a = resourceId;
                    c0155a.b(38, resourceId);
                    break;
                case 39:
                    c0155a.a(39, typedArray.getFloat(index, aVar.f15641e.f15679V));
                    break;
                case 40:
                    c0155a.a(40, typedArray.getFloat(index, aVar.f15641e.f15678U));
                    break;
                case 41:
                    c0155a.b(41, typedArray.getInt(index, aVar.f15641e.f15680W));
                    break;
                case 42:
                    c0155a.b(42, typedArray.getInt(index, aVar.f15641e.f15681X));
                    break;
                case 43:
                    c0155a.a(43, typedArray.getFloat(index, aVar.f15639c.f15744d));
                    break;
                case 44:
                    c0155a.d(44, true);
                    c0155a.a(44, typedArray.getDimension(index, aVar.f15642f.f15760n));
                    break;
                case BuildConfig.VERSION_CODE /* 45 */:
                    c0155a.a(45, typedArray.getFloat(index, aVar.f15642f.f15749c));
                    break;
                case 46:
                    c0155a.a(46, typedArray.getFloat(index, aVar.f15642f.f15750d));
                    break;
                case 47:
                    c0155a.a(47, typedArray.getFloat(index, aVar.f15642f.f15751e));
                    break;
                case 48:
                    c0155a.a(48, typedArray.getFloat(index, aVar.f15642f.f15752f));
                    break;
                case 49:
                    c0155a.a(49, typedArray.getDimension(index, aVar.f15642f.f15753g));
                    break;
                case 50:
                    c0155a.a(50, typedArray.getDimension(index, aVar.f15642f.f15754h));
                    break;
                case 51:
                    c0155a.a(51, typedArray.getDimension(index, aVar.f15642f.f15756j));
                    break;
                case 52:
                    c0155a.a(52, typedArray.getDimension(index, aVar.f15642f.f15757k));
                    break;
                case 53:
                    c0155a.a(53, typedArray.getDimension(index, aVar.f15642f.f15758l));
                    break;
                case 54:
                    c0155a.b(54, typedArray.getInt(index, aVar.f15641e.f15682Y));
                    break;
                case 55:
                    c0155a.b(55, typedArray.getInt(index, aVar.f15641e.f15683Z));
                    break;
                case 56:
                    c0155a.b(56, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15685a0));
                    break;
                case 57:
                    c0155a.b(57, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15687b0));
                    break;
                case 58:
                    c0155a.b(58, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15689c0));
                    break;
                case 59:
                    c0155a.b(59, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15691d0));
                    break;
                case 60:
                    c0155a.a(60, typedArray.getFloat(index, aVar.f15642f.f15748b));
                    break;
                case 62:
                    c0155a.b(62, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15659B));
                    break;
                case 63:
                    c0155a.a(63, typedArray.getFloat(index, aVar.f15641e.f15660C));
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    c0155a.b(64, m(typedArray, index, aVar.f15640d.f15728b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0155a.c(65, typedArray.getString(index));
                    } else {
                        c0155a.c(65, C3045a.f30604c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0155a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0155a.a(67, typedArray.getFloat(index, aVar.f15640d.f15735i));
                    break;
                case 68:
                    c0155a.a(68, typedArray.getFloat(index, aVar.f15639c.f15745e));
                    break;
                case 69:
                    c0155a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0155a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0155a.b(72, typedArray.getInt(index, aVar.f15641e.f15697g0));
                    break;
                case 73:
                    c0155a.b(73, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15699h0));
                    break;
                case 74:
                    c0155a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0155a.d(75, typedArray.getBoolean(index, aVar.f15641e.f15713o0));
                    break;
                case 76:
                    c0155a.b(76, typedArray.getInt(index, aVar.f15640d.f15731e));
                    break;
                case 77:
                    c0155a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0155a.b(78, typedArray.getInt(index, aVar.f15639c.f15743c));
                    break;
                case 79:
                    c0155a.a(79, typedArray.getFloat(index, aVar.f15640d.f15733g));
                    break;
                case 80:
                    c0155a.d(80, typedArray.getBoolean(index, aVar.f15641e.f15709m0));
                    break;
                case 81:
                    c0155a.d(81, typedArray.getBoolean(index, aVar.f15641e.f15711n0));
                    break;
                case 82:
                    c0155a.b(82, typedArray.getInteger(index, aVar.f15640d.f15729c));
                    break;
                case 83:
                    c0155a.b(83, m(typedArray, index, aVar.f15642f.f15755i));
                    break;
                case 84:
                    c0155a.b(84, typedArray.getInteger(index, aVar.f15640d.f15737k));
                    break;
                case 85:
                    c0155a.a(85, typedArray.getFloat(index, aVar.f15640d.f15736j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f15640d.f15740n = typedArray.getResourceId(index, -1);
                        c0155a.b(89, aVar.f15640d.f15740n);
                        c cVar = aVar.f15640d;
                        if (cVar.f15740n != -1) {
                            cVar.f15739m = -2;
                            c0155a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f15640d.f15738l = typedArray.getString(index);
                        c0155a.c(90, aVar.f15640d.f15738l);
                        if (aVar.f15640d.f15738l.indexOf("/") > 0) {
                            aVar.f15640d.f15740n = typedArray.getResourceId(index, -1);
                            c0155a.b(89, aVar.f15640d.f15740n);
                            aVar.f15640d.f15739m = -2;
                            c0155a.b(88, -2);
                        } else {
                            aVar.f15640d.f15739m = -1;
                            c0155a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f15640d;
                        cVar2.f15739m = typedArray.getInteger(index, cVar2.f15740n);
                        c0155a.b(88, aVar.f15640d.f15739m);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    f15630g.get(index);
                    break;
                case 93:
                    c0155a.b(93, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15670M));
                    break;
                case 94:
                    c0155a.b(94, typedArray.getDimensionPixelSize(index, aVar.f15641e.f15677T));
                    break;
                case 95:
                    n(c0155a, typedArray, index, 0);
                    break;
                case 96:
                    n(c0155a, typedArray, index, 1);
                    break;
                case 97:
                    c0155a.b(97, typedArray.getInt(index, aVar.f15641e.f15715p0));
                    break;
                case 98:
                    if (AbstractC3358b.f32463E) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f15637a);
                        aVar.f15637a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f15638b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f15638b = typedArray.getString(index);
                    } else {
                        aVar.f15637a = typedArray.getResourceId(index, aVar.f15637a);
                    }
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f15636e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f15636e.containsKey(Integer.valueOf(id))) {
                AbstractC3357a.a(childAt);
            } else {
                if (this.f15635d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.f15636e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) this.f15636e.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f15641e.f15701i0 = 1;
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f15641e.f15697g0);
                            aVar2.setMargin(aVar.f15641e.f15699h0);
                            aVar2.setAllowsGoneWidget(aVar.f15641e.f15713o0);
                            b bVar = aVar.f15641e;
                            int[] iArr = bVar.f15703j0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f15705k0;
                                if (str != null) {
                                    bVar.f15703j0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f15641e.f15703j0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f15643g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f15639c;
                        if (dVar.f15743c == 0) {
                            childAt.setVisibility(dVar.f15742b);
                        }
                        childAt.setAlpha(aVar.f15639c.f15744d);
                        childAt.setRotation(aVar.f15642f.f15748b);
                        childAt.setRotationX(aVar.f15642f.f15749c);
                        childAt.setRotationY(aVar.f15642f.f15750d);
                        childAt.setScaleX(aVar.f15642f.f15751e);
                        childAt.setScaleY(aVar.f15642f.f15752f);
                        C0156e c0156e = aVar.f15642f;
                        if (c0156e.f15755i != -1) {
                            if (((View) childAt.getParent()).findViewById(aVar.f15642f.f15755i) != null) {
                                float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - childAt.getLeft());
                                    childAt.setPivotY(top - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(c0156e.f15753g)) {
                                childAt.setPivotX(aVar.f15642f.f15753g);
                            }
                            if (!Float.isNaN(aVar.f15642f.f15754h)) {
                                childAt.setPivotY(aVar.f15642f.f15754h);
                            }
                        }
                        childAt.setTranslationX(aVar.f15642f.f15756j);
                        childAt.setTranslationY(aVar.f15642f.f15757k);
                        childAt.setTranslationZ(aVar.f15642f.f15758l);
                        C0156e c0156e2 = aVar.f15642f;
                        if (c0156e2.f15759m) {
                            childAt.setElevation(c0156e2.f15760n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = (a) this.f15636e.get(num);
            if (aVar3 != null) {
                if (aVar3.f15641e.f15701i0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f15641e;
                    int[] iArr2 = bVar3.f15703j0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f15705k0;
                        if (str2 != null) {
                            bVar3.f15703j0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f15641e.f15703j0);
                        }
                    }
                    aVar4.setType(aVar3.f15641e.f15697g0);
                    aVar4.setMargin(aVar3.f15641e.f15699h0);
                    ConstraintLayout.b bVarE = constraintLayout.generateDefaultLayoutParams();
                    aVar4.o();
                    aVar3.b(bVarE);
                    constraintLayout.addView(aVar4, bVarE);
                }
                if (aVar3.f15641e.f15684a) {
                    View gVar = new g(constraintLayout.getContext());
                    gVar.setId(num.intValue());
                    ConstraintLayout.b bVarE2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(bVarE2);
                    constraintLayout.addView(gVar, bVarE2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f15636e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f15635d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f15636e.containsKey(Integer.valueOf(id))) {
                this.f15636e.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f15636e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f15643g = androidx.constraintlayout.widget.b.a(this.f15634c, childAt);
                aVar.d(id, bVar);
                aVar.f15639c.f15742b = childAt.getVisibility();
                aVar.f15639c.f15744d = childAt.getAlpha();
                aVar.f15642f.f15748b = childAt.getRotation();
                aVar.f15642f.f15749c = childAt.getRotationX();
                aVar.f15642f.f15750d = childAt.getRotationY();
                aVar.f15642f.f15751e = childAt.getScaleX();
                aVar.f15642f.f15752f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0156e c0156e = aVar.f15642f;
                    c0156e.f15753g = pivotX;
                    c0156e.f15754h = pivotY;
                }
                aVar.f15642f.f15756j = childAt.getTranslationX();
                aVar.f15642f.f15757k = childAt.getTranslationY();
                aVar.f15642f.f15758l = childAt.getTranslationZ();
                C0156e c0156e2 = aVar.f15642f;
                if (c0156e2.f15759m) {
                    c0156e2.f15760n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f15641e.f15713o0 = aVar2.getAllowsGoneWidget();
                    aVar.f15641e.f15703j0 = aVar2.getReferencedIds();
                    aVar.f15641e.f15697g0 = aVar2.getType();
                    aVar.f15641e.f15699h0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f15641e;
        bVar.f15658A = i11;
        bVar.f15659B = i12;
        bVar.f15660C = f10;
    }

    public void k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f15641e.f15684a = true;
                    }
                    this.f15636e.put(Integer.valueOf(aVarI.f15637a), aVarI);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01aa, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarI = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f15641e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f15640d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f15639c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f15642f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarI.f15641e;
                                bVar.f15684a = true;
                                bVar.f15686b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarI.f15641e.f15701i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                    }
                    if (aVarI == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.b.b(context, xmlPullParser, aVarI.f15643g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f15636e.put(Integer.valueOf(aVarI.f15637a), aVarI);
                    aVarI = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}

package H2;

import H2.j;
import H2.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import g2.AbstractC2662a;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.J;
import j7.K;
import j7.T;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f3703n = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V2.d f3704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D2.c f3705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G2.c f3706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2.d f3707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f3710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f3711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f3712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f3713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f3715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f3716m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC2662a f3717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3718b;

        public a(AbstractC2662a bitmapRef) {
            AbstractC2855l.g(bitmapRef, "bitmapRef");
            this.f3717a = bitmapRef;
        }

        public final AbstractC2662a a() {
            return this.f3717a;
        }

        public final boolean b() {
            return !this.f3718b && this.f3717a.W();
        }

        public final void c() {
            AbstractC2662a.B(this.f3717a);
        }

        public final void d(boolean z10) {
            this.f3718b = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public g(V2.d platformBitmapFactory, D2.c bitmapFrameRenderer, G2.c fpsCompressor, C2.d animationInformation, int i10) {
        AbstractC2855l.g(platformBitmapFactory, "platformBitmapFactory");
        AbstractC2855l.g(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC2855l.g(fpsCompressor, "fpsCompressor");
        AbstractC2855l.g(animationInformation, "animationInformation");
        this.f3704a = platformBitmapFactory;
        this.f3705b = bitmapFrameRenderer;
        this.f3706c = fpsCompressor;
        this.f3707d = animationInformation;
        this.f3708e = i10;
        int iD = B7.d.d((j(k()) * i10) / ProgressBarContainerView.MAX_PROGRESS, 1);
        this.f3709f = iD;
        this.f3710g = new ConcurrentHashMap();
        this.f3713j = new h(k().a());
        this.f3714k = -1;
        this.f3715l = K.i();
        this.f3716m = T.e();
        c(j(k()));
        this.f3711h = (int) (iD * 0.5f);
    }

    private final void e(AbstractC2662a abstractC2662a) {
        if (abstractC2662a.W()) {
            new Canvas((Bitmap) abstractC2662a.J()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    private final boolean f(int i10, int i11, int i12, int i13) throws IOException {
        int iIntValue;
        AbstractC2662a abstractC2662aA;
        List listD = this.f3713j.d(i10, this.f3709f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (this.f3716m.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set setT0 = AbstractC2800q.T0(arrayList);
        Set setKeySet = this.f3710g.keySet();
        AbstractC2855l.f(setKeySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(T.i(setKeySet, setT0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.f3710g.get(Integer.valueOf(iIntValue2)) == null) {
                int i14 = this.f3714k;
                if (i14 != -1 && !setT0.contains(Integer.valueOf(i14))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                a aVar = (a) this.f3710g.get(Integer.valueOf(iIntValue3));
                AbstractC2662a abstractC2662aM = (aVar == null || (abstractC2662aA = aVar.a()) == null) ? null : abstractC2662aA.m();
                if (abstractC2662aM == null) {
                    AbstractC2662a abstractC2662aA2 = this.f3704a.a(i11, i12);
                    AbstractC2855l.f(abstractC2662aA2, "createBitmap(...)");
                    aVar = new a(abstractC2662aA2);
                    abstractC2662aM = aVar.a().clone();
                }
                aVar.d(true);
                try {
                    n(abstractC2662aM, iIntValue2, i11, i12);
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(abstractC2662aM, null);
                    this.f3710g.remove(Integer.valueOf(iIntValue3));
                    aVar.d(false);
                    this.f3710g.put(Integer.valueOf(iIntValue2), aVar);
                } finally {
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.f3709f * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(B7.d.l((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.f3711h = iIntValue;
        return true;
    }

    static /* synthetic */ boolean g(g gVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return gVar.f(i10, i11, i12, i13);
    }

    private final H2.a h(int i10) {
        H2.a aVar;
        Iterator it = new B7.c(0, this.f3713j.b()).iterator();
        do {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            int iA = this.f3713j.a(i10 - ((J) it).nextInt());
            a aVar2 = (a) this.f3710g.get(Integer.valueOf(iA));
            if (aVar2 != null) {
                if (!aVar2.b()) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar = new H2.a(iA, aVar2.a());
                }
            }
        } while (aVar == null);
        return aVar;
    }

    private final l i(int i10) {
        H2.a aVarH = h(i10);
        if (aVarH == null) {
            return new l(null, l.a.f3729i);
        }
        AbstractC2662a abstractC2662aClone = aVarH.d().clone();
        AbstractC2855l.f(abstractC2662aClone, "clone(...)");
        this.f3714k = aVarH.e();
        return new l(abstractC2662aClone, l.a.f3728h);
    }

    private final int j(C2.d dVar) {
        return (int) B7.d.e(TimeUnit.SECONDS.toMillis(1L) / ((long) (dVar.i() / dVar.a())), 1L);
    }

    private final void l(final int i10, final int i11) {
        if (this.f3712i) {
            return;
        }
        this.f3712i = true;
        G2.b.f2187a.b(new Runnable() { // from class: H2.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(this.f3700g, i10, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(g this$0, int i10, int i11) {
        AbstractC2855l.g(this$0, "this$0");
        while (true) {
            g gVar = this$0;
            int i12 = i10;
            int i13 = i11;
            if (g(gVar, B7.d.d(this$0.f3714k, 0), i12, i13, 0, 8, null)) {
                gVar.f3712i = false;
                return;
            } else {
                this$0 = gVar;
                i10 = i12;
                i11 = i13;
            }
        }
    }

    private final void n(AbstractC2662a abstractC2662a, int i10, int i11, int i12) throws IOException {
        AbstractC2662a abstractC2662aD;
        AbstractC2662a abstractC2662aM;
        H2.a aVarH = h(i10);
        if (aVarH != null && (abstractC2662aD = aVarH.d()) != null && (abstractC2662aM = abstractC2662aD.m()) != null) {
            try {
                int iE = aVarH.e();
                if (iE < i10) {
                    Object objJ = abstractC2662aM.J();
                    AbstractC2855l.f(objJ, "get(...)");
                    o(abstractC2662a, (Bitmap) objJ);
                    Iterator it = new B7.c(iE + 1, i10).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((J) it).nextInt();
                        D2.c cVar = this.f3705b;
                        Object objJ2 = abstractC2662a.J();
                        AbstractC2855l.f(objJ2, "get(...)");
                        cVar.a(iNextInt, (Bitmap) objJ2);
                    }
                    AbstractC3376c.a(abstractC2662aM, null);
                    return;
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(abstractC2662aM, null);
            } finally {
            }
        }
        e(abstractC2662a);
        Iterator it2 = new B7.c(0, i10).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((J) it2).nextInt();
            D2.c cVar2 = this.f3705b;
            Object objJ3 = abstractC2662a.J();
            AbstractC2855l.f(objJ3, "get(...)");
            cVar2.a(iNextInt2, (Bitmap) objJ3);
        }
    }

    private final AbstractC2662a o(AbstractC2662a abstractC2662a, Bitmap bitmap) {
        if (abstractC2662a.W() && !AbstractC2855l.b(abstractC2662a.J(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) abstractC2662a.J());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return abstractC2662a;
    }

    @Override // H2.j
    public void a(int i10, int i11, InterfaceC3487a onAnimationLoaded) {
        AbstractC2855l.g(onAnimationLoaded, "onAnimationLoaded");
        l(i10, i11);
        onAnimationLoaded.invoke();
    }

    @Override // H2.j
    public l b(int i10, int i11, int i12) {
        Integer num = (Integer) this.f3715l.get(Integer.valueOf(i10));
        if (num == null) {
            return i(i10);
        }
        int iIntValue = num.intValue();
        this.f3714k = iIntValue;
        a aVar = (a) this.f3710g.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar == null) {
            l(i11, i12);
            return i(iIntValue);
        }
        if (this.f3713j.c(this.f3711h, iIntValue, this.f3709f)) {
            l(i11, i12);
        }
        return new l(aVar.a().clone(), l.a.f3727g);
    }

    @Override // H2.j
    public void c(int i10) {
        Map mapA = this.f3706c.a(k().i() * B7.d.d(k().b(), 1), k().a(), B7.d.h(i10, j(k())));
        this.f3715l = mapA;
        this.f3716m = AbstractC2800q.T0(mapA.values());
    }

    @Override // H2.j
    public void clear() {
        Collection collectionValues = this.f3710g.values();
        AbstractC2855l.f(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        this.f3710g.clear();
        this.f3714k = -1;
    }

    public C2.d k() {
        return this.f3707d;
    }

    @Override // H2.j
    public void onStop() {
        j.a.a(this);
    }
}

package i0;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import F.L;
import Z.AbstractC1582v;
import android.util.Size;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g0.s0;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: i0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2715c implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28651h = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f28652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f28653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s0.a f28654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f28655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f28656g;

    /* JADX INFO: renamed from: i0.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2715c(L cameraInfo, List targetQualities, s0.a videoEncoderInfoFinder) {
        AbstractC2855l.g(cameraInfo, "cameraInfo");
        AbstractC2855l.g(targetQualities, "targetQualities");
        AbstractC2855l.g(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        this.f28652c = cameraInfo;
        this.f28653d = targetQualities;
        this.f28654e = videoEncoderInfoFinder;
        this.f28655f = AbstractC2746i.b(new InterfaceC3487a() { // from class: i0.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return C2715c.q(this.f28650g);
            }
        });
        this.f28656g = new LinkedHashMap();
    }

    private final InterfaceC0515w0.a d(int i10, String str, int i11, int i12, int i13, int i14) {
        InterfaceC0515w0.a aVarA = InterfaceC0515w0.a.a(i10, str, i11, i12, i13, i14);
        AbstractC2855l.f(aVarA, "create(...)");
        return aVarA;
    }

    static /* synthetic */ InterfaceC0515w0.a e(C2715c c2715c, int i10, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = 3;
        }
        if ((i15 & 2) != 0) {
            str = "audio/mp4a-latm";
        }
        if ((i15 & 4) != 0) {
            i11 = 96000;
        }
        if ((i15 & 8) != 0) {
            i12 = 44100;
        }
        if ((i15 & 16) != 0) {
            i13 = 1;
        }
        if ((i15 & 32) != 0) {
            i14 = 2;
        }
        int i16 = i13;
        int i17 = i14;
        return c2715c.d(i10, str, i11, i12, i16, i17);
    }

    private final InterfaceC0515w0 f(int i10, int i11, InterfaceC0515w0.c cVar, InterfaceC0515w0.a aVar) {
        InterfaceC0515w0.b bVarH = InterfaceC0515w0.b.h(i10, i11, AbstractC2800q.e(aVar), AbstractC2800q.e(cVar));
        AbstractC2855l.f(bVarH, "create(...)");
        return bVarH;
    }

    static /* synthetic */ InterfaceC0515w0 g(C2715c c2715c, int i10, int i11, InterfaceC0515w0.c cVar, InterfaceC0515w0.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 60;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        return c2715c.f(i10, i11, cVar, aVar);
    }

    private final InterfaceC0515w0.c h(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        InterfaceC0515w0.c cVarA = InterfaceC0515w0.c.a(i10, str, i13, i14, i11, i12, i15, i16, i17, i18);
        AbstractC2855l.f(cVarA, "create(...)");
        return cVarA;
    }

    static /* synthetic */ InterfaceC0515w0.c i(C2715c c2715c, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str2;
        C2715c c2715c2;
        if ((i19 & 1) != 0) {
            i10 = 2;
        }
        if ((i19 & 2) != 0) {
            str = "video/avc";
        }
        if ((i19 & 32) != 0) {
            i14 = 30;
        }
        if ((i19 & 64) != 0) {
            i15 = -1;
        }
        if ((i19 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i16 = 8;
        }
        if ((i19 & 256) != 0) {
            i17 = 0;
        }
        if ((i19 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            i20 = 0;
            i23 = i16;
            i21 = i17;
            i25 = i14;
            i22 = i15;
            i27 = i12;
            i24 = i13;
            str2 = str;
            i26 = i11;
            c2715c2 = c2715c;
            i28 = i10;
        } else {
            i20 = i18;
            i21 = i17;
            i22 = i15;
            i23 = i16;
            i24 = i13;
            i25 = i14;
            i26 = i11;
            i27 = i12;
            i28 = i10;
            str2 = str;
            c2715c2 = c2715c;
        }
        return c2715c2.h(i28, str2, i26, i27, i24, i25, i22, i23, i21, i20);
    }

    private final AbstractC1582v.b j(List list, int i10) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC1582v abstractC1582v = (AbstractC1582v) next;
            AbstractC2855l.e(abstractC1582v, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
            if (((AbstractC1582v.b) abstractC1582v).e(1) == i10) {
                break;
            }
        }
        if (next instanceof AbstractC1582v.b) {
            return (AbstractC1582v.b) next;
        }
        return null;
    }

    private final InterfaceC0515w0 k(int i10) {
        InterfaceC0515w0.c cVarL = l(i10);
        if (cVarL == null) {
            return null;
        }
        return g(this, 0, 0, cVarL, e(this, 0, null, 0, 0, 0, 0, 63, null), 3, null);
    }

    private final InterfaceC0515w0.c l(int i10) {
        InterfaceC0515w0.c cVarP;
        AbstractC1582v.b bVarJ = j(this.f28653d, i10);
        if (bVarJ == null) {
            return null;
        }
        for (Size size : bVarJ.f()) {
            if (n().contains(size) && (cVarP = p(size.getWidth(), size.getHeight(), o(bVarJ))) != null) {
                return cVarP;
            }
        }
        return null;
    }

    private final InterfaceC0515w0 m(int i10) {
        if (this.f28656g.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC0515w0) this.f28656g.get(Integer.valueOf(i10));
        }
        InterfaceC0515w0 interfaceC0515w0K = k(i10);
        this.f28656g.put(Integer.valueOf(i10), interfaceC0515w0K);
        return interfaceC0515w0K;
    }

    private final List n() {
        return (List) this.f28655f.getValue();
    }

    private final int o(AbstractC1582v abstractC1582v) {
        if (AbstractC2855l.b(abstractC1582v, AbstractC1582v.f13486d)) {
            return 40000000;
        }
        if (AbstractC2855l.b(abstractC1582v, AbstractC1582v.f13485c)) {
            return 10000000;
        }
        if (AbstractC2855l.b(abstractC1582v, AbstractC1582v.f13484b)) {
            return 4000000;
        }
        if (AbstractC2855l.b(abstractC1582v, AbstractC1582v.f13483a)) {
            return 2000000;
        }
        throw new IllegalArgumentException("Undefined bitrate for quality: " + abstractC1582v);
    }

    private final InterfaceC0515w0.c p(int i10, int i11, int i12) {
        InterfaceC0515w0.c cVarI = i(this, 0, null, i10, i11, i12, 0, 0, 0, 0, 0, 995, null);
        s0 s0VarA = this.f28654e.a(cVarI.i());
        if (s0VarA == null || !s0VarA.a(i10, i11)) {
            return null;
        }
        Integer num = (Integer) s0VarA.c().clamp(Integer.valueOf(i12));
        if (num != null && num.intValue() == i12) {
            return cVarI;
        }
        AbstractC2855l.d(num);
        return i(this, 0, null, i10, i11, num.intValue(), 0, 0, 0, 0, 0, 995, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(C2715c c2715c) {
        return c2715c.f28652c.x(34);
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return m(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        return m(i10);
    }
}

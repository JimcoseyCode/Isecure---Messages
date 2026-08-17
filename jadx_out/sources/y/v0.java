package y;

import F.o1;
import android.util.Range;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f33861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Range f33863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f33864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f33865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f33866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H0.a f33868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f33869i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33870a;

        static {
            int[] iArr = new int[C.b.values().length];
            try {
                iArr[C.b.f444g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.b.f445h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.b.f446i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C.b.f447j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33870a = iArr;
        }
    }

    public v0(List useCases, L0 l02, List effects, Range frameRateRange, Set requiredFeatureGroup, List preferredFeatureGroup) {
        AbstractC2855l.g(useCases, "useCases");
        AbstractC2855l.g(effects, "effects");
        AbstractC2855l.g(frameRateRange, "frameRateRange");
        AbstractC2855l.g(requiredFeatureGroup, "requiredFeatureGroup");
        AbstractC2855l.g(preferredFeatureGroup, "preferredFeatureGroup");
        this.f33861a = l02;
        this.f33862b = effects;
        this.f33863c = frameRateRange;
        this.f33864d = requiredFeatureGroup;
        this.f33865e = preferredFeatureGroup;
        this.f33866f = AbstractC2800q.Y(useCases);
        this.f33868h = new H0.a() { // from class: y.u0
            @Override // H0.a
            public final void accept(Object obj) {
                v0.b((Set) obj);
            }
        };
        ScheduledExecutorService scheduledExecutorServiceE = I.c.e();
        AbstractC2855l.f(scheduledExecutorServiceE, "mainThreadExecutor(...)");
        this.f33869i = scheduledExecutorServiceE;
        p();
        o();
    }

    private final String j(J0 j02) {
        return j02 instanceof p0 ? "Preview" : j02 instanceof V ? "ImageCapture" : j02 instanceof androidx.camera.core.g ? "ImageAnalysis" : K.f.e0(j02) ? "VideoCapture" : "UseCase";
    }

    private final void n(J0 j02) {
        String str;
        String str2;
        String str3;
        String strJ = j(j02);
        C.b bVarA = B.c.f233i.a(j02);
        if (bVarA == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("A ");
        AbstractC2855l.d(bVarA);
        sb.append(bVarA.name());
        sb.append(" value is set to ");
        sb.append(strJ);
        sb.append(" despite using feature groups. Do not use APIs like ");
        sb.append(strJ);
        sb.append(".Builder.");
        int[] iArr = a.f33870a;
        int i10 = iArr[bVarA.ordinal()];
        if (i10 == 1) {
            str = "setDynamicRange";
        } else if (i10 == 2) {
            str = "setTargetFrameRateRange";
        } else if (i10 == 3) {
            str = K.f.e0(j02) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
        } else {
            if (i10 != 4) {
                throw new C2750m();
            }
            str = "setOutputFormat";
        }
        sb.append(str);
        sb.append(" while using feature groups. If ");
        int i11 = iArr[bVarA.ordinal()];
        if (i11 == 1) {
            str2 = "HDR";
        } else if (i11 == 2) {
            str2 = "60 FPS";
        } else if (i11 == 3) {
            str2 = "stabilization";
        } else {
            if (i11 != 4) {
                throw new C2750m();
            }
            str2 = "JPEG_R output format";
        }
        sb.append(str2);
        sb.append(" is required, instead set ");
        int i12 = iArr[bVarA.ordinal()];
        if (i12 == 1) {
            str3 = "GroupableFeature.HDR_HLG10";
        } else if (i12 == 2) {
            str3 = "GroupableFeature.FPS_60";
        } else if (i12 == 3) {
            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
        } else {
            if (i12 != 4) {
                throw new C2750m();
            }
            str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
        }
        sb.append(str3);
        sb.append(" as either a required or preferred feature.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private final void o() {
        if (this.f33864d.isEmpty() && this.f33865e.isEmpty()) {
            return;
        }
        q();
        if (AbstractC2800q.Y(this.f33865e).size() != this.f33865e.size()) {
            throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + this.f33865e + ')').toString());
        }
        Set setK0 = AbstractC2800q.k0(this.f33864d, this.f33865e);
        if (!setK0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setK0).toString());
        }
        for (J0 j02 : this.f33866f) {
            if (B.c.f233i.c(j02) == B.c.f238n) {
                throw new IllegalArgumentException((j02 + " is not supported with feature group").toString());
            }
            n(j02);
        }
        if (!this.f33862b.isEmpty()) {
            throw new IllegalArgumentException("Effects aren't supported with feature group yet");
        }
    }

    private final void p() {
        if (AbstractC2855l.b(this.f33863c, o1.f1588a)) {
            return;
        }
        Iterator it = this.f33866f.iterator();
        while (it.hasNext()) {
            if (((J0) it.next()).e().b0()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    private final void q() {
        Set set = this.f33864d;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((A.b) it.next()).c());
        }
        for (C.b bVar : AbstractC2800q.Y(arrayList)) {
            Set set2 = this.f33864d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((A.b) obj).c() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    public final List c() {
        return this.f33862b;
    }

    public final H0.a d() {
        return this.f33868h;
    }

    public final Executor e() {
        return this.f33869i;
    }

    public final Range f() {
        return this.f33863c;
    }

    public final List g() {
        return this.f33865e;
    }

    public final Set h() {
        return this.f33864d;
    }

    public int i() {
        return this.f33867g;
    }

    public final List k() {
        return this.f33866f;
    }

    public final L0 l() {
        return this.f33861a;
    }

    public abstract boolean m();

    public /* synthetic */ v0(List list, L0 l02, List list2, Range range, Set set, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : l02, (i10 & 4) != 0 ? AbstractC2800q.j() : list2, (i10 & 8) != 0 ? o1.f1588a : range, (i10 & 16) != 0 ? j7.T.e() : set, (i10 & 32) != 0 ? AbstractC2800q.j() : list3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Set set) {
    }
}

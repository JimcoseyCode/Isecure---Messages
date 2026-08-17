package M6;

import android.animation.Animator;
import com.swmansion.rnscreens.Y;
import i7.C2750m;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7509e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f7511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f7512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f7513d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f7514g = new a("ENTER", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f7515h = new a("EXIT", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ a[] f7516i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f7517j;

        static {
            a[] aVarArrH = h();
            f7516i = aVarArrH;
            f7517j = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f7514g, f7515h};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7516i.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f7518g = new c("INITIALIZED", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f7519h = new c("START_DISPATCHED", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f7520i = new c("END_DISPATCHED", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ c[] f7521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f7522k;

        static {
            c[] cVarArrH = h();
            f7521j = cVarArrH;
            f7522k = AbstractC3083a.a(cVarArrH);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] h() {
            return new c[]{f7518g, f7519h, f7520i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f7521j.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7524b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f7518g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f7519h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f7520i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7523a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.f7514g.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.f7515h.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f7524b = iArr2;
        }
    }

    public e(Y wrapper, i iVar, a animationType) {
        AbstractC2855l.g(wrapper, "wrapper");
        AbstractC2855l.g(animationType, "animationType");
        this.f7510a = wrapper;
        this.f7511b = iVar;
        this.f7512c = animationType;
        this.f7513d = c.f7518g;
    }

    private final void a() {
        c cVar;
        int i10 = d.f7523a[this.f7513d.ordinal()];
        if (i10 == 1) {
            cVar = c.f7519h;
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C2750m();
            }
            cVar = c.f7520i;
        }
        this.f7513d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        AbstractC2855l.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        AbstractC2855l.g(animation, "animation");
        if (this.f7513d == c.f7519h) {
            a();
            animation.removeListener(this);
            int i10 = d.f7524b[this.f7512c.ordinal()];
            if (i10 == 1) {
                i iVar = this.f7511b;
                if (iVar != null) {
                    iVar.a();
                }
            } else {
                if (i10 != 2) {
                    throw new C2750m();
                }
                i iVar2 = this.f7511b;
                if (iVar2 != null) {
                    iVar2.b();
                }
            }
            boolean z10 = this.f7512c == a.f7515h;
            i iVar3 = this.f7511b;
            if (iVar3 != null) {
                iVar3.e(1.0f, z10, z10);
            }
            this.f7510a.j().k();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        AbstractC2855l.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        AbstractC2855l.g(animation, "animation");
        if (this.f7513d == c.f7518g) {
            a();
            int i10 = d.f7524b[this.f7512c.ordinal()];
            if (i10 == 1) {
                i iVar = this.f7511b;
                if (iVar != null) {
                    iVar.c();
                }
            } else {
                if (i10 != 2) {
                    throw new C2750m();
                }
                i iVar2 = this.f7511b;
                if (iVar2 != null) {
                    iVar2.d();
                }
            }
            boolean z10 = this.f7512c == a.f7515h;
            i iVar3 = this.f7511b;
            if (iVar3 != null) {
                iVar3.e(0.0f, z10, z10);
            }
        }
    }
}

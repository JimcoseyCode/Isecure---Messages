package o8;

import C8.C0412g;
import C8.L;
import C8.S;
import C8.W;
import C8.u0;
import C8.v0;
import D8.e;
import D8.f;
import D8.g;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.D;
import L7.E;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1292q;
import L7.InterfaceC1300z;
import L7.Y;
import L7.Z;
import L7.c0;
import L7.m0;
import L7.t0;
import O7.AbstractC1339s;
import O7.J;
import O7.K;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o8.InterfaceC3028j;
import s8.AbstractC3340e;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: o8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3033o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f30532e = AbstractC2800q.P0(ServiceLoader.load(InterfaceC3028j.class, InterfaceC3028j.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3033o f30533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e.a f30534g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D8.g f30535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D8.f f30536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e.a f30537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f30538d;

    /* JADX INFO: renamed from: o8.o$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // D8.e.a
        public boolean a(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                b(0);
            }
            if (v0Var2 == null) {
                b(1);
            }
            return v0Var.equals(v0Var2);
        }
    }

    /* JADX INFO: renamed from: o8.o$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements Function2 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
            return new Pair(interfaceC1276a, interfaceC1276a2);
        }
    }

    /* JADX INFO: renamed from: o8.o$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1288m f30539g;

        c(InterfaceC1288m interfaceC1288m) {
            this.f30539g = interfaceC1288m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1277b interfaceC1277b) {
            return Boolean.valueOf(interfaceC1277b.b() == this.f30539g);
        }
    }

    /* JADX INFO: renamed from: o8.o$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1280e f30540g;

        e(InterfaceC1280e interfaceC1280e) {
            this.f30540g = interfaceC1280e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1277b interfaceC1277b) {
            boolean z10 = false;
            if (!AbstractC1294t.g(interfaceC1277b.getVisibility()) && AbstractC1294t.h(interfaceC1277b, this.f30540g, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: o8.o$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class g implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC3032n f30541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC1277b f30542h;

        g(AbstractC3032n abstractC3032n, InterfaceC1277b interfaceC1277b) {
            this.f30541g = abstractC3032n;
            this.f30542h = interfaceC1277b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2735B invoke(InterfaceC1277b interfaceC1277b) {
            this.f30541g.b(this.f30542h, interfaceC1277b);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: o8.o$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f30545c;

        static {
            int[] iArr = new int[E.values().length];
            f30545c = iArr;
            try {
                iArr[E.f7283h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30545c[E.f7284i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30545c[E.f7285j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30545c[E.f7286k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f30544b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30544b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30544b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC3028j.b.values().length];
            f30543a = iArr3;
            try {
                iArr3[InterfaceC3028j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30543a[InterfaceC3028j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30543a[InterfaceC3028j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: o8.o$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final i f30546c = new i(a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f30547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30548b;

        /* JADX INFO: renamed from: o8.o$i$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f30547a = aVar;
            this.f30548b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 == 1 || i10 == 2) {
                objArr[0] = "debugMessage";
            } else if (i10 == 3) {
                objArr[0] = "success";
            } else if (i10 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i10 == 1) {
                objArr[2] = "incompatible";
            } else if (i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f30546c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f30547a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f30547a + ": " + this.f30548b;
        }
    }

    static {
        a aVar = new a();
        f30534g = aVar;
        f30533f = new C3033o(aVar, g.a.f821a, f.a.f820a, null);
    }

    private C3033o(e.a aVar, D8.g gVar, D8.f fVar, Function2 function2) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f30537c = aVar;
        this.f30535a = gVar;
        this.f30536b = fVar;
        this.f30538d = function2;
    }

    private static boolean A(Y y10, Y y11) {
        if (y10 == null || y11 == null) {
            return true;
        }
        return H(y10, y11);
    }

    public static boolean B(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        if (interfaceC1276a == null) {
            a(65);
        }
        if (interfaceC1276a2 == null) {
            a(66);
        }
        S returnType = interfaceC1276a.getReturnType();
        S returnType2 = interfaceC1276a2.getReturnType();
        if (!H(interfaceC1276a, interfaceC1276a2)) {
            return false;
        }
        u0 u0VarL = f30533f.l(interfaceC1276a.getTypeParameters(), interfaceC1276a2.getTypeParameters());
        if (interfaceC1276a instanceof InterfaceC1300z) {
            return G(interfaceC1276a, returnType, interfaceC1276a2, returnType2, u0VarL);
        }
        if (!(interfaceC1276a instanceof Z)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC1276a.getClass());
        }
        Z z10 = (Z) interfaceC1276a;
        Z z11 = (Z) interfaceC1276a2;
        if (A(z10.h(), z11.h())) {
            return (z10.d0() && z11.d0()) ? C0412g.f645a.m(u0VarL, returnType.N0(), returnType2.N0()) : (z10.d0() || !z11.d0()) && G(interfaceC1276a, returnType, interfaceC1276a2, returnType2, u0VarL);
        }
        return false;
    }

    private static boolean C(InterfaceC1276a interfaceC1276a, Collection collection) {
        if (interfaceC1276a == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC1276a, (InterfaceC1276a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(InterfaceC1276a interfaceC1276a, S s10, InterfaceC1276a interfaceC1276a2, S s11, u0 u0Var) {
        if (interfaceC1276a == null) {
            a(71);
        }
        if (s10 == null) {
            a(72);
        }
        if (interfaceC1276a2 == null) {
            a(73);
        }
        if (s11 == null) {
            a(74);
        }
        if (u0Var == null) {
            a(75);
        }
        return C0412g.f645a.t(u0Var, s10.N0(), s11.N0());
    }

    private static boolean H(InterfaceC1292q interfaceC1292q, InterfaceC1292q interfaceC1292q2) {
        if (interfaceC1292q == null) {
            a(67);
        }
        if (interfaceC1292q2 == null) {
            a(68);
        }
        Integer numD = AbstractC1294t.d(interfaceC1292q.getVisibility(), interfaceC1292q2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(D d10, D d11, boolean z10) {
        if (d10 == null) {
            a(55);
        }
        if (d11 == null) {
            a(56);
        }
        return !AbstractC1294t.g(d11.getVisibility()) && AbstractC1294t.h(d11, d10, z10);
    }

    public static boolean J(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, boolean z10, boolean z11) {
        if (interfaceC1276a == null) {
            a(13);
        }
        if (interfaceC1276a2 == null) {
            a(14);
        }
        if (!interfaceC1276a.equals(interfaceC1276a2) && C3025g.f30519a.k(interfaceC1276a.a(), interfaceC1276a2.a(), z10, z11)) {
            return true;
        }
        InterfaceC1276a interfaceC1276aA = interfaceC1276a2.a();
        Iterator it = AbstractC3027i.d(interfaceC1276a).iterator();
        while (it.hasNext()) {
            if (C3025g.f30519a.k(interfaceC1276aA, (InterfaceC1276a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC1277b interfaceC1277b, Function1 function1) {
        AbstractC1295u abstractC1295u;
        if (interfaceC1277b == null) {
            a(105);
        }
        for (InterfaceC1277b interfaceC1277b2 : interfaceC1277b.e()) {
            if (interfaceC1277b2.getVisibility() == AbstractC1294t.f7349g) {
                K(interfaceC1277b2, function1);
            }
        }
        if (interfaceC1277b.getVisibility() != AbstractC1294t.f7349g) {
            return;
        }
        AbstractC1295u abstractC1295uH = h(interfaceC1277b);
        if (abstractC1295uH == null) {
            if (function1 != null) {
                function1.invoke(interfaceC1277b);
            }
            abstractC1295u = AbstractC1294t.f7347e;
        } else {
            abstractC1295u = abstractC1295uH;
        }
        if (interfaceC1277b instanceof K) {
            ((K) interfaceC1277b).Z0(abstractC1295u);
            Iterator it = ((Z) interfaceC1277b).u().iterator();
            while (it.hasNext()) {
                K((Y) it.next(), abstractC1295uH == null ? null : function1);
            }
            return;
        }
        if (interfaceC1277b instanceof AbstractC1339s) {
            ((AbstractC1339s) interfaceC1277b).g1(abstractC1295u);
            return;
        }
        J j10 = (J) interfaceC1277b;
        j10.K0(abstractC1295u);
        if (abstractC1295u != j10.y0().getVisibility()) {
            j10.I0(false);
        }
    }

    public static Object L(Collection collection, Function1 function1) {
        Object next;
        if (collection == null) {
            a(76);
        }
        if (function1 == null) {
            a(77);
        }
        if (collection.size() == 1) {
            Object objD0 = AbstractC2800q.d0(collection);
            if (objD0 == null) {
                a(78);
            }
            return objD0;
        }
        ArrayList arrayList = new ArrayList(2);
        List listT0 = AbstractC2800q.t0(collection, function1);
        Object objD02 = AbstractC2800q.d0(collection);
        InterfaceC1276a interfaceC1276a = (InterfaceC1276a) function1.invoke(objD02);
        for (Object obj : collection) {
            InterfaceC1276a interfaceC1276a2 = (InterfaceC1276a) function1.invoke(obj);
            if (C(interfaceC1276a2, listT0)) {
                arrayList.add(obj);
            }
            if (B(interfaceC1276a2, interfaceC1276a) && !B(interfaceC1276a, interfaceC1276a2)) {
                objD02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objD02 == null) {
                a(79);
            }
            return objD02;
        }
        if (arrayList.size() == 1) {
            Object objD03 = AbstractC2800q.d0(arrayList);
            if (objD03 == null) {
                a(80);
            }
            return objD03;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!L.b(((InterfaceC1276a) function1.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objD04 = AbstractC2800q.d0(arrayList);
        if (objD04 == null) {
            a(82);
        }
        return objD04;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 93 && i10 != 96 && i10 != 101 && i10 != 42 && i10 != 43) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                            }
                        case 30:
                        case 31:
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                    }
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 93 && i10 != 96 && i10 != 101 && i10 != 42 && i10 != 43) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 30:
                        case 31:
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "f";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "g";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
                objArr[0] = "descriptor";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[0] = "result";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case BuildConfig.VERSION_CODE /* 45 */:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 42 && i10 != 43) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    break;
                default:
                    switch (i10) {
                        case 30:
                        case 31:
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "overrides";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[2] = "isOverridableBy";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 93 && i10 != 96 && i10 != 101 && i10 != 42 && i10 != 43) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    break;
                default:
                    switch (i10) {
                        case 30:
                        case 31:
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i10) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static boolean b(Collection collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return AbstractC2800q.U(collection, new c(((InterfaceC1277b) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(m0 m0Var, m0 m0Var2, u0 u0Var) {
        if (m0Var == null) {
            a(47);
        }
        if (m0Var2 == null) {
            a(48);
        }
        if (u0Var == null) {
            a(49);
        }
        List<S> upperBounds = m0Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(m0Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (S s10 : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(s10, (S) listIterator.next(), u0Var)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(S s10, S s11, u0 u0Var) {
        if (s10 == null) {
            a(44);
        }
        if (s11 == null) {
            a(45);
        }
        if (u0Var == null) {
            a(46);
        }
        if (W.a(s10) && W.a(s11)) {
            return true;
        }
        return C0412g.f645a.m(u0Var, s10.N0(), s11.N0());
    }

    private static i e(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        if ((interfaceC1276a.h0() == null) != (interfaceC1276a2.h0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC1276a.i().size() != interfaceC1276a2.i().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(InterfaceC1277b interfaceC1277b, Set set) {
        if (interfaceC1277b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC1277b.getKind().h()) {
            set.add(interfaceC1277b);
            return;
        }
        if (interfaceC1277b.e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC1277b);
        }
        Iterator it = interfaceC1277b.e().iterator();
        while (it.hasNext()) {
            f((InterfaceC1277b) it.next(), set);
        }
    }

    private static List g(InterfaceC1276a interfaceC1276a) {
        c0 c0VarH0 = interfaceC1276a.h0();
        ArrayList arrayList = new ArrayList();
        if (c0VarH0 != null) {
            arrayList.add(c0VarH0.getType());
        }
        Iterator it = interfaceC1276a.i().iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).getType());
        }
        return arrayList;
    }

    private static AbstractC1295u h(InterfaceC1277b interfaceC1277b) {
        if (interfaceC1277b == null) {
            a(106);
        }
        Collection<InterfaceC1277b> collectionE = interfaceC1277b.e();
        AbstractC1295u abstractC1295uU = u(collectionE);
        if (abstractC1295uU == null) {
            return null;
        }
        if (interfaceC1277b.getKind() != InterfaceC1277b.a.FAKE_OVERRIDE) {
            return abstractC1295uU.f();
        }
        for (InterfaceC1277b interfaceC1277b2 : collectionE) {
            if (interfaceC1277b2.k() != E.f7286k && !interfaceC1277b2.getVisibility().equals(abstractC1295uU)) {
                return null;
            }
        }
        return abstractC1295uU;
    }

    public static C3033o i(D8.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new C3033o(aVar, gVar, f.a.f820a, null);
    }

    private static void j(Collection collection, InterfaceC1280e interfaceC1280e, AbstractC3032n abstractC3032n) {
        if (collection == null) {
            a(83);
        }
        if (interfaceC1280e == null) {
            a(84);
        }
        if (abstractC3032n == null) {
            a(85);
        }
        Collection collectionT = t(interfaceC1280e, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        InterfaceC1277b interfaceC1277bX = ((InterfaceC1277b) L(collection, new d())).x(interfaceC1280e, n(collection, interfaceC1280e), zIsEmpty ? AbstractC1294t.f7350h : AbstractC1294t.f7349g, InterfaceC1277b.a.FAKE_OVERRIDE, false);
        abstractC3032n.d(interfaceC1277bX, collection);
        abstractC3032n.a(interfaceC1277bX);
    }

    private static void k(InterfaceC1280e interfaceC1280e, Collection collection, AbstractC3032n abstractC3032n) {
        if (interfaceC1280e == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (abstractC3032n == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((InterfaceC1277b) it.next()), interfaceC1280e, abstractC3032n);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(AbstractC3041w.a(linkedList), linkedList, abstractC3032n), interfaceC1280e, abstractC3032n);
            }
        }
    }

    private u0 l(List list, List list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            u0 u0VarK0 = new C3034p(null, this.f30537c, this.f30535a, this.f30536b, this.f30538d).K0(true, true);
            if (u0VarK0 == null) {
                a(42);
            }
            return u0VarK0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((m0) list.get(i10)).j(), ((m0) list2.get(i10)).j());
        }
        u0 u0VarK02 = new C3034p(map, this.f30537c, this.f30535a, this.f30536b, this.f30538d).K0(true, true);
        if (u0VarK02 == null) {
            a(43);
        }
        return u0VarK02;
    }

    public static C3033o m(D8.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new C3033o(f30534g, gVar, f.a.f820a, null);
    }

    private static E n(Collection collection, InterfaceC1280e interfaceC1280e) {
        if (collection == null) {
            a(86);
        }
        if (interfaceC1280e == null) {
            a(87);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            InterfaceC1277b interfaceC1277b = (InterfaceC1277b) it.next();
            int i10 = h.f30545c[interfaceC1277b.k().ordinal()];
            if (i10 == 1) {
                E e10 = E.f7283h;
                if (e10 == null) {
                    a(88);
                }
                return e10;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC1277b);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC1280e.J() && interfaceC1280e.k() != E.f7286k && interfaceC1280e.k() != E.f7284i) {
            z10 = true;
        }
        if (z11 && !z12) {
            E e11 = E.f7285j;
            if (e11 == null) {
                a(89);
            }
            return e11;
        }
        if (!z11 && z12) {
            E eK = z10 ? interfaceC1280e.k() : E.f7286k;
            if (eK == null) {
                a(90);
            }
            return eK;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((InterfaceC1277b) it2.next()));
        }
        return y(r(hashSet), z10, interfaceC1280e.k());
    }

    private Collection o(InterfaceC1277b interfaceC1277b, Collection collection, InterfaceC1280e interfaceC1280e, AbstractC3032n abstractC3032n) {
        if (interfaceC1277b == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (interfaceC1280e == null) {
            a(59);
        }
        if (abstractC3032n == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        M8.l lVarO = M8.l.o();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC1277b interfaceC1277b2 = (InterfaceC1277b) it.next();
            i.a aVarC = D(interfaceC1277b2, interfaceC1277b, interfaceC1280e).c();
            boolean zI = I(interfaceC1277b, interfaceC1277b2, false);
            int i10 = h.f30544b[aVarC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    lVarO.add(interfaceC1277b2);
                }
                arrayList.add(interfaceC1277b2);
            } else if (i10 == 2) {
                if (zI) {
                    abstractC3032n.c(interfaceC1277b2, interfaceC1277b);
                }
                arrayList.add(interfaceC1277b2);
            }
        }
        abstractC3032n.d(interfaceC1277b, lVarO);
        return arrayList;
    }

    private static Collection p(InterfaceC1277b interfaceC1277b, Queue queue, AbstractC3032n abstractC3032n) {
        if (interfaceC1277b == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (abstractC3032n == null) {
            a(104);
        }
        return q(interfaceC1277b, queue, new f(), new g(abstractC3032n, interfaceC1277b));
    }

    public static Collection q(Object obj, Collection collection, Function1 function1, Function1 function12) {
        if (obj == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (function1 == null) {
            a(99);
        }
        if (function12 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC1276a interfaceC1276a = (InterfaceC1276a) function1.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC1276a interfaceC1276a2 = (InterfaceC1276a) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarX = x(interfaceC1276a, interfaceC1276a2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && AbstractC3340e.y(AbstractC3340e.s((InterfaceC1288m) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z10, InterfaceC3487a interfaceC3487a, Function2 function2) {
        if (set == null) {
            a(9);
        }
        if (function2 == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (interfaceC3487a != null) {
                interfaceC3487a.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair pair = (Pair) function2.invoke(obj, it.next());
                InterfaceC1276a interfaceC1276a = (InterfaceC1276a) pair.getFirst();
                InterfaceC1276a interfaceC1276a2 = (InterfaceC1276a) pair.getSecond();
                if (!J(interfaceC1276a, interfaceC1276a2, z10, true)) {
                    if (J(interfaceC1276a2, interfaceC1276a, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(InterfaceC1280e interfaceC1280e, Collection collection) {
        if (interfaceC1280e == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listB0 = AbstractC2800q.b0(collection, new e(interfaceC1280e));
        if (listB0 == null) {
            a(96);
        }
        return listB0;
    }

    public static AbstractC1295u u(Collection collection) {
        AbstractC1295u abstractC1295u;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return AbstractC1294t.f7354l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC1295u = null;
            while (it.hasNext()) {
                AbstractC1295u visibility = ((InterfaceC1277b) it.next()).getVisibility();
                if (abstractC1295u != null) {
                    Integer numD = AbstractC1294t.d(visibility, abstractC1295u);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC1295u = visibility;
            }
        }
        if (abstractC1295u == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = AbstractC1294t.d(abstractC1295u, ((InterfaceC1277b) it2.next()).getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC1295u;
    }

    public static i w(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        boolean z10;
        if (interfaceC1276a == null) {
            a(38);
        }
        if (interfaceC1276a2 == null) {
            a(39);
        }
        boolean z11 = interfaceC1276a instanceof InterfaceC1300z;
        if ((z11 && !(interfaceC1276a2 instanceof InterfaceC1300z)) || (((z10 = interfaceC1276a instanceof Z)) && !(interfaceC1276a2 instanceof Z))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC1276a);
        }
        if (!interfaceC1276a.getName().equals(interfaceC1276a2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(interfaceC1276a, interfaceC1276a2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        C3033o c3033o = f30533f;
        i.a aVarC = c3033o.D(interfaceC1276a2, interfaceC1276a, null).c();
        i.a aVarC2 = c3033o.D(interfaceC1276a, interfaceC1276a2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    private static E y(Collection collection, boolean z10, E e10) {
        if (collection == null) {
            a(91);
        }
        if (e10 == null) {
            a(92);
        }
        E e11 = E.f7286k;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC1277b interfaceC1277b = (InterfaceC1277b) it.next();
            E eK = (z10 && interfaceC1277b.k() == E.f7286k) ? e10 : interfaceC1277b.k();
            if (eK.compareTo(e11) < 0) {
                e11 = eK;
            }
        }
        if (e11 == null) {
            a(93);
        }
        return e11;
    }

    public static Set z(InterfaceC1277b interfaceC1277b) {
        if (interfaceC1277b == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC1277b, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, InterfaceC1280e interfaceC1280e) {
        if (interfaceC1276a == null) {
            a(19);
        }
        if (interfaceC1276a2 == null) {
            a(20);
        }
        i iVarE = E(interfaceC1276a, interfaceC1276a2, interfaceC1280e, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, InterfaceC1280e interfaceC1280e, boolean z10) {
        if (interfaceC1276a == null) {
            a(22);
        }
        if (interfaceC1276a2 == null) {
            a(23);
        }
        i iVarF = F(interfaceC1276a, interfaceC1276a2, z10);
        boolean z11 = iVarF.c() == i.a.OVERRIDABLE;
        for (InterfaceC3028j interfaceC3028j : f30532e) {
            if (interfaceC3028j.a() != InterfaceC3028j.a.CONFLICTS_ONLY && (!z11 || interfaceC3028j.a() != InterfaceC3028j.a.SUCCESS_ONLY)) {
                int i10 = h.f30543a[interfaceC3028j.b(interfaceC1276a, interfaceC1276a2, interfaceC1280e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z11) {
            return iVarF;
        }
        for (InterfaceC3028j interfaceC3028j2 : f30532e) {
            if (interfaceC3028j2.a() == InterfaceC3028j.a.CONFLICTS_ONLY) {
                int i11 = h.f30543a[interfaceC3028j2.b(interfaceC1276a, interfaceC1276a2, interfaceC1280e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC3028j2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, boolean z10) {
        if (interfaceC1276a == null) {
            a(28);
        }
        if (interfaceC1276a2 == null) {
            a(29);
        }
        i iVarW = w(interfaceC1276a, interfaceC1276a2);
        if (iVarW != null) {
            return iVarW;
        }
        List listG = g(interfaceC1276a);
        List listG2 = g(interfaceC1276a2);
        List typeParameters = interfaceC1276a.getTypeParameters();
        List typeParameters2 = interfaceC1276a2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!D8.e.f819a.c((S) listG.get(i10), (S) listG2.get(i10))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i10++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        u0 u0VarL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c((m0) typeParameters.get(i11), (m0) typeParameters2.get(i11), u0VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d((S) listG.get(i10), (S) listG2.get(i10), u0VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i10++;
        }
        if ((interfaceC1276a instanceof InterfaceC1300z) && (interfaceC1276a2 instanceof InterfaceC1300z) && ((InterfaceC1300z) interfaceC1276a).isSuspend() != ((InterfaceC1300z) interfaceC1276a2).isSuspend()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z10) {
            S returnType = interfaceC1276a.getReturnType();
            S returnType2 = interfaceC1276a2.getReturnType();
            if (returnType != null && returnType2 != null && ((!W.a(returnType2) || !W.a(returnType)) && !C0412g.f645a.t(u0VarL, returnType2.N0(), returnType.N0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public void v(k8.f fVar, Collection collection, Collection collection2, InterfaceC1280e interfaceC1280e, AbstractC3032n abstractC3032n) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (interfaceC1280e == null) {
            a(53);
        }
        if (abstractC3032n == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((InterfaceC1277b) it.next(), collection, interfaceC1280e, abstractC3032n));
        }
        k(interfaceC1280e, linkedHashSet, abstractC3032n);
    }

    /* JADX INFO: renamed from: o8.o$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d implements Function1 {
        d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1277b invoke(InterfaceC1277b interfaceC1277b) {
            return interfaceC1277b;
        }
    }

    /* JADX INFO: renamed from: o8.o$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f implements Function1 {
        f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1276a invoke(InterfaceC1277b interfaceC1277b) {
            return interfaceC1277b;
        }
    }
}

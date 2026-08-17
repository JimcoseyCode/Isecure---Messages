package kotlin.jvm.internal;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.functions.Function1;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements C7.o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f29379k = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C7.e f29380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f29381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C7.o f29382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f29383j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29384a;

        static {
            int[] iArr = new int[C7.r.values().length];
            try {
                iArr[C7.r.f523g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7.r.f524h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7.r.f525i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29384a = iArr;
        }
    }

    public L(C7.e classifier, List arguments, C7.o oVar, int i10) {
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.g(arguments, "arguments");
        this.f29380g = classifier;
        this.f29381h = arguments;
        this.f29382i = oVar;
        this.f29383j = i10;
    }

    private final String e(C7.q qVar) {
        String strValueOf;
        if (qVar.d() == null) {
            return "*";
        }
        C7.o oVarC = qVar.c();
        L l10 = oVarC instanceof L ? (L) oVarC : null;
        if (l10 == null || (strValueOf = l10.i(true)) == null) {
            strValueOf = String.valueOf(qVar.c());
        }
        C7.r rVarD = qVar.d();
        int i10 = rVarD == null ? -1 : b.f29384a[rVarD.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new C2750m();
        }
        return "out " + strValueOf;
    }

    private final String i(boolean z10) {
        String name;
        C7.e classifier = getClassifier();
        C7.d dVar = classifier instanceof C7.d ? (C7.d) classifier : null;
        Class clsB = dVar != null ? AbstractC3430a.b(dVar) : null;
        if (clsB == null) {
            name = getClassifier().toString();
        } else if ((this.f29383j & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = k(clsB);
        } else if (z10 && clsB.isPrimitive()) {
            C7.e classifier2 = getClassifier();
            AbstractC2855l.e(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC3430a.c((C7.d) classifier2).getName();
        } else {
            name = clsB.getName();
        }
        boolean zIsEmpty = getArguments().isEmpty();
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        String strO0 = zIsEmpty ? PointerEventHelper.POINTER_TYPE_UNKNOWN : AbstractC2800q.o0(getArguments(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.j(this.f29378g, (C7.q) obj);
            }
        }, 24, null);
        if (getIsMarkedNullable()) {
            str = "?";
        }
        String str2 = name + strO0 + str;
        C7.o oVar = this.f29382i;
        if (!(oVar instanceof L)) {
            return str2;
        }
        String strI = ((L) oVar).i(true);
        if (AbstractC2855l.b(strI, str2)) {
            return str2;
        }
        if (AbstractC2855l.b(strI, str2 + '?')) {
            return str2 + '!';
        }
        return '(' + str2 + ".." + strI + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(L l10, C7.q it) {
        AbstractC2855l.g(it, "it");
        return l10.e(it);
    }

    private final String k(Class cls) {
        return AbstractC2855l.b(cls, boolean[].class) ? "kotlin.BooleanArray" : AbstractC2855l.b(cls, char[].class) ? "kotlin.CharArray" : AbstractC2855l.b(cls, byte[].class) ? "kotlin.ByteArray" : AbstractC2855l.b(cls, short[].class) ? "kotlin.ShortArray" : AbstractC2855l.b(cls, int[].class) ? "kotlin.IntArray" : AbstractC2855l.b(cls, float[].class) ? "kotlin.FloatArray" : AbstractC2855l.b(cls, long[].class) ? "kotlin.LongArray" : AbstractC2855l.b(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return AbstractC2855l.b(getClassifier(), l10.getClassifier()) && AbstractC2855l.b(getArguments(), l10.getArguments()) && AbstractC2855l.b(this.f29382i, l10.f29382i) && this.f29383j == l10.f29383j;
    }

    @Override // C7.b
    public List getAnnotations() {
        return AbstractC2800q.j();
    }

    @Override // C7.o
    public List getArguments() {
        return this.f29381h;
    }

    @Override // C7.o
    public C7.e getClassifier() {
        return this.f29380g;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.f29383j);
    }

    @Override // C7.o
    /* JADX INFO: renamed from: isMarkedNullable */
    public boolean getIsMarkedNullable() {
        return (this.f29383j & 1) != 0;
    }

    public String toString() {
        return i(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(C7.e classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.g(arguments, "arguments");
    }
}

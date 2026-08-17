package G7;

import G7.h;
import R7.AbstractC1394f;
import j7.AbstractC2800q;
import j7.K;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f3484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC0047a f3485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f3487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f3489g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: G7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class EnumC0047a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0047a f3490g = new EnumC0047a("CALL_BY_NAME", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0047a f3491h = new EnumC0047a("POSITIONAL_CALL", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumC0047a[] f3492i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f3493j;

        static {
            EnumC0047a[] enumC0047aArrH = h();
            f3492i = enumC0047aArrH;
            f3493j = AbstractC3083a.a(enumC0047aArrH);
        }

        private EnumC0047a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0047a[] h() {
            return new EnumC0047a[]{f3490g, f3491h};
        }

        public static EnumC0047a valueOf(String str) {
            return (EnumC0047a) Enum.valueOf(EnumC0047a.class, str);
        }

        public static EnumC0047a[] values() {
            return (EnumC0047a[]) f3492i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f3494g = new b("JAVA", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f3495h = new b("KOTLIN", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ b[] f3496i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f3497j;

        static {
            b[] bVarArrH = h();
            f3496i = bVarArrH;
            f3497j = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f3494g, f3495h};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f3496i.clone();
        }
    }

    public a(Class jClass, List parameterNames, EnumC0047a callMode, b origin, List methods) {
        AbstractC2855l.g(jClass, "jClass");
        AbstractC2855l.g(parameterNames, "parameterNames");
        AbstractC2855l.g(callMode, "callMode");
        AbstractC2855l.g(origin, "origin");
        AbstractC2855l.g(methods, "methods");
        this.f3483a = jClass;
        this.f3484b = parameterNames;
        this.f3485c = callMode;
        this.f3486d = methods;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f3487e = arrayList;
        List list = this.f3486d;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            AbstractC2855l.d(returnType);
            Class<?> clsK = AbstractC1394f.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.f3488f = arrayList2;
        List list2 = this.f3486d;
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f3489g = arrayList3;
        if (this.f3485c == EnumC0047a.f3491h && origin == b.f3494g && !AbstractC2800q.w0(this.f3484b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // G7.h
    public List a() {
        return this.f3487e;
    }

    @Override // G7.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // G7.h
    public Object call(Object[] args) {
        AbstractC2855l.g(args, "args");
        c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objQ = (obj == null && this.f3485c == EnumC0047a.f3490g) ? this.f3489g.get(i11) : f.q(obj, (Class) this.f3488f.get(i11));
            if (objQ == null) {
                f.p(i11, (String) this.f3484b.get(i11), (Class) this.f3488f.get(i11));
                throw null;
            }
            arrayList.add(objQ);
            i10++;
            i11 = i12;
        }
        return f.g(this.f3483a, K.r(AbstractC2800q.X0(this.f3484b, arrayList)), this.f3486d);
    }

    public Void d() {
        return null;
    }

    @Override // G7.h
    public Type getReturnType() {
        return this.f3483a;
    }

    public /* synthetic */ a(Class cls, List list, EnumC0047a enumC0047a, b bVar, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 16) != 0) {
            list2 = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, enumC0047a, bVar, list2);
    }
}

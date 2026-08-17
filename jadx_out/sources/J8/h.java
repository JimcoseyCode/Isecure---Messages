package J8;

import J8.g;
import L7.InterfaceC1300z;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.f f6854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P8.o f6855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f6856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f6857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f6858e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f6859g = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1300z interfaceC1300z) {
            AbstractC2855l.g(interfaceC1300z, "<this>");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f6860g = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1300z interfaceC1300z) {
            AbstractC2855l.g(interfaceC1300z, "<this>");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f6861g = new c();

        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1300z interfaceC1300z) {
            AbstractC2855l.g(interfaceC1300z, "<this>");
            return null;
        }
    }

    private h(k8.f fVar, P8.o oVar, Collection collection, Function1 function1, f... fVarArr) {
        this.f6854a = fVar;
        this.f6855b = oVar;
        this.f6856c = collection;
        this.f6857d = function1;
        this.f6858e = fVarArr;
    }

    public final g a(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f6858e) {
            String strB = fVar.b(functionDescriptor);
            if (strB != null) {
                return new g.b(strB);
            }
        }
        String str = (String) this.f6857d.invoke(functionDescriptor);
        return str != null ? new g.b(str) : g.c.f6853b;
    }

    public final boolean b(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        if (this.f6854a != null && !AbstractC2855l.b(functionDescriptor.getName(), this.f6854a)) {
            return false;
        }
        if (this.f6855b != null) {
            String strJ = functionDescriptor.getName().j();
            AbstractC2855l.f(strJ, "asString(...)");
            if (!this.f6855b.d(strJ)) {
                return false;
            }
        }
        Collection collection = this.f6856c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ h(k8.f fVar, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f6859g : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(k8.f name, f[] checks, Function1 additionalChecks) {
        this(name, (P8.o) null, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(checks, "checks");
        AbstractC2855l.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(P8.o oVar, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, fVarArr, (i10 & 4) != 0 ? b.f6860g : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(P8.o regex, f[] checks, Function1 additionalChecks) {
        this((k8.f) null, regex, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC2855l.g(regex, "regex");
        AbstractC2855l.g(checks, "checks");
        AbstractC2855l.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f6861g : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection nameList, f[] checks, Function1 additionalChecks) {
        this((k8.f) null, (P8.o) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC2855l.g(nameList, "nameList");
        AbstractC2855l.g(checks, "checks");
        AbstractC2855l.g(additionalChecks, "additionalChecks");
    }
}

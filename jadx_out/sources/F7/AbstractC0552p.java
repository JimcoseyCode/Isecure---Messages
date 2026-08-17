package F7;

import A8.C0393m;
import A8.InterfaceC0398s;
import F7.AbstractC0548n;
import L7.AbstractC1294t;
import L7.InterfaceC1288m;
import R7.AbstractC1394f;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d8.C2370r;
import h8.InterfaceC2710c;
import i8.AbstractC2757a;
import j8.AbstractC2809d;
import j8.C2814i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.AbstractC2950i;

/* JADX INFO: renamed from: F7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0552p {

    /* JADX INFO: renamed from: F7.p$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC0552p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f2097a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            AbstractC2855l.g(field, "field");
            this.f2097a = field;
        }

        @Override // F7.AbstractC0552p
        public String a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f2097a.getName();
            AbstractC2855l.f(name, "getName(...)");
            sb.append(U7.H.b(name));
            sb.append("()");
            Class<?> type = this.f2097a.getType();
            AbstractC2855l.f(type, "getType(...)");
            sb.append(AbstractC1394f.f(type));
            return sb.toString();
        }

        public final Field b() {
            return this.f2097a;
        }
    }

    /* JADX INFO: renamed from: F7.p$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC0552p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f2098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f2099b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            AbstractC2855l.g(getterMethod, "getterMethod");
            this.f2098a = getterMethod;
            this.f2099b = method;
        }

        @Override // F7.AbstractC0552p
        public String a() {
            return h1.d(this.f2098a);
        }

        public final Method b() {
            return this.f2098a;
        }

        public final Method c() {
            return this.f2099b;
        }
    }

    /* JADX INFO: renamed from: F7.p$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC0552p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final L7.Z f2100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f8.n f2101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC2757a.d f2102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC2710c f2103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h8.g f2104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f2105f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L7.Z descriptor, f8.n proto, AbstractC2757a.d signature, InterfaceC2710c nameResolver, h8.g typeTable) {
            String str;
            super(null);
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(proto, "proto");
            AbstractC2855l.g(signature, "signature");
            AbstractC2855l.g(nameResolver, "nameResolver");
            AbstractC2855l.g(typeTable, "typeTable");
            this.f2100a = descriptor;
            this.f2101b = proto;
            this.f2102c = signature;
            this.f2103d = nameResolver;
            this.f2104e = typeTable;
            if (signature.F()) {
                str = nameResolver.getString(signature.A().w()) + nameResolver.getString(signature.A().v());
            } else {
                AbstractC2809d.a aVarD = C2814i.d(C2814i.f28956a, proto, nameResolver, typeTable, false, 8, null);
                if (aVarD == null) {
                    throw new Y0("No field signature for property: " + descriptor);
                }
                String strB = aVarD.b();
                str = U7.H.b(strB) + c() + "()" + aVarD.c();
            }
            this.f2105f = str;
        }

        private final String c() {
            String string;
            InterfaceC1288m interfaceC1288mB = this.f2100a.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (AbstractC2855l.b(this.f2100a.getVisibility(), AbstractC1294t.f7346d) && (interfaceC1288mB instanceof C0393m)) {
                f8.c cVarB1 = ((C0393m) interfaceC1288mB).b1();
                AbstractC2950i.f classModuleName = AbstractC2757a.f28752i;
                AbstractC2855l.f(classModuleName, "classModuleName");
                Integer num = (Integer) h8.e.a(cVarB1, classModuleName);
                if (num == null || (string = this.f2103d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + k8.g.b(string);
            }
            if (!AbstractC2855l.b(this.f2100a.getVisibility(), AbstractC1294t.f7343a) || !(interfaceC1288mB instanceof L7.N)) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            L7.Z z10 = this.f2100a;
            AbstractC2855l.e(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC0398s interfaceC0398sY = ((A8.N) z10).Y();
            if (!(interfaceC0398sY instanceof C2370r)) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            C2370r c2370r = (C2370r) interfaceC0398sY;
            if (c2370r.f() == null) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            return '$' + c2370r.h().j();
        }

        @Override // F7.AbstractC0552p
        public String a() {
            return this.f2105f;
        }

        public final L7.Z b() {
            return this.f2100a;
        }

        public final InterfaceC2710c d() {
            return this.f2103d;
        }

        public final f8.n e() {
            return this.f2101b;
        }

        public final AbstractC2757a.d f() {
            return this.f2102c;
        }

        public final h8.g g() {
            return this.f2104e;
        }
    }

    /* JADX INFO: renamed from: F7.p$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends AbstractC0552p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0548n.e f2106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC0548n.e f2107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC0548n.e getterSignature, AbstractC0548n.e eVar) {
            super(null);
            AbstractC2855l.g(getterSignature, "getterSignature");
            this.f2106a = getterSignature;
            this.f2107b = eVar;
        }

        @Override // F7.AbstractC0552p
        public String a() {
            return this.f2106a.a();
        }

        public final AbstractC0548n.e b() {
            return this.f2106a;
        }

        public final AbstractC0548n.e c() {
            return this.f2107b;
        }
    }

    public /* synthetic */ AbstractC0552p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC0552p() {
    }
}

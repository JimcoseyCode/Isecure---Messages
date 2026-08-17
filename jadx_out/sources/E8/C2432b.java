package e8;

import L7.h0;
import U7.I;
import d8.InterfaceC2376x;
import e8.C2431a;
import j8.AbstractC2806a;
import j8.C2810e;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k8.f;

/* JADX INFO: renamed from: e8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2432b implements InterfaceC2376x.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f25963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f25964k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f25965a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25966b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25967c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f25968d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f25969e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f25970f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f25971g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2431a.EnumC0258a f25972h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f25973i = null;

    /* JADX INFO: renamed from: e8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class AbstractC0260b implements InterfaceC2376x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f25974a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // d8.InterfaceC2376x.b
        public void a() {
            g((String[]) this.f25974a.toArray(new String[0]));
        }

        @Override // d8.InterfaceC2376x.b
        public void b(k8.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // d8.InterfaceC2376x.b
        public InterfaceC2376x.a c(k8.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // d8.InterfaceC2376x.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f25974a.add((String) obj);
            }
        }

        @Override // d8.InterfaceC2376x.b
        public void e(q8.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);
    }

    static {
        try {
            f25963j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f25963j = false;
        }
        HashMap map = new HashMap();
        f25964k = map;
        map.put(k8.b.k(new k8.c("kotlin.jvm.internal.KotlinClass")), C2431a.EnumC0258a.f25955k);
        map.put(k8.b.k(new k8.c("kotlin.jvm.internal.KotlinFileFacade")), C2431a.EnumC0258a.f25956l);
        map.put(k8.b.k(new k8.c("kotlin.jvm.internal.KotlinMultifileClass")), C2431a.EnumC0258a.f25958n);
        map.put(k8.b.k(new k8.c("kotlin.jvm.internal.KotlinMultifileClassPart")), C2431a.EnumC0258a.f25959o);
        map.put(k8.b.k(new k8.c("kotlin.jvm.internal.KotlinSyntheticClass")), C2431a.EnumC0258a.f25957m);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        C2431a.EnumC0258a enumC0258a = this.f25972h;
        return enumC0258a == C2431a.EnumC0258a.f25955k || enumC0258a == C2431a.EnumC0258a.f25956l || enumC0258a == C2431a.EnumC0258a.f25959o;
    }

    @Override // d8.InterfaceC2376x.c
    public InterfaceC2376x.a c(k8.b bVar, h0 h0Var) {
        C2431a.EnumC0258a enumC0258a;
        if (bVar == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        k8.c cVarA = bVar.a();
        if (cVarA.equals(I.f11396a)) {
            return new c();
        }
        if (cVarA.equals(I.f11415t)) {
            return new d();
        }
        if (f25963j || this.f25972h != null || (enumC0258a = (C2431a.EnumC0258a) f25964k.get(bVar)) == null) {
            return null;
        }
        this.f25972h = enumC0258a;
        return new e();
    }

    public C2431a m(C2810e c2810e) {
        if (this.f25972h == null || this.f25965a == null) {
            return null;
        }
        C2810e c2810e2 = new C2810e(this.f25965a, (this.f25967c & 8) != 0);
        if (!c2810e2.h(c2810e)) {
            this.f25971g = this.f25969e;
            this.f25969e = null;
        } else if (o() && this.f25969e == null) {
            return null;
        }
        String[] strArr = this.f25973i;
        return new C2431a(this.f25972h, c2810e2, this.f25969e, this.f25971g, this.f25970f, this.f25966b, this.f25967c, this.f25968d, strArr != null ? AbstractC2806a.e(strArr) : null);
    }

    public C2431a n() {
        return m(C2810e.f28943i);
    }

    /* JADX INFO: renamed from: e8.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c implements InterfaceC2376x.a {

        /* JADX INFO: renamed from: e8.b$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends AbstractC0260b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // e8.C2432b.AbstractC0260b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C2432b.this.f25969e = strArr;
            }
        }

        /* JADX INFO: renamed from: e8.b$c$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0261b extends AbstractC0260b {
            C0261b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // e8.C2432b.AbstractC0260b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C2432b.this.f25970f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private InterfaceC2376x.b h() {
            return new a();
        }

        private InterfaceC2376x.b i() {
            return new C0261b();
        }

        @Override // d8.InterfaceC2376x.a
        public void b(f fVar, k8.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.b c(f fVar) {
            String strJ = fVar != null ? fVar.j() : null;
            if ("d1".equals(strJ)) {
                return h();
            }
            if ("d2".equals(strJ)) {
                return i();
            }
            return null;
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.a d(f fVar, k8.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // d8.InterfaceC2376x.a
        public void e(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strJ = fVar.j();
            if ("k".equals(strJ)) {
                if (obj instanceof Integer) {
                    C2432b.this.f25972h = C2431a.EnumC0258a.k(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strJ)) {
                if (obj instanceof int[]) {
                    C2432b.this.f25965a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strJ)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    C2432b.this.f25966b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strJ)) {
                if (obj instanceof Integer) {
                    C2432b.this.f25967c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strJ) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                C2432b.this.f25968d = str2;
            }
        }

        @Override // d8.InterfaceC2376x.a
        public void f(f fVar, q8.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // d8.InterfaceC2376x.a
        public void a() {
        }
    }

    /* JADX INFO: renamed from: e8.b$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d implements InterfaceC2376x.a {

        /* JADX INFO: renamed from: e8.b$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends AbstractC0260b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // e8.C2432b.AbstractC0260b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C2432b.this.f25973i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private InterfaceC2376x.b h() {
            return new a();
        }

        @Override // d8.InterfaceC2376x.a
        public void b(f fVar, k8.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.b c(f fVar) {
            if ("b".equals(fVar != null ? fVar.j() : null)) {
                return h();
            }
            return null;
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.a d(f fVar, k8.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // d8.InterfaceC2376x.a
        public void f(f fVar, q8.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // d8.InterfaceC2376x.a
        public void a() {
        }

        @Override // d8.InterfaceC2376x.a
        public void e(f fVar, Object obj) {
        }
    }

    /* JADX INFO: renamed from: e8.b$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e implements InterfaceC2376x.a {

        /* JADX INFO: renamed from: e8.b$e$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends AbstractC0260b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // e8.C2432b.AbstractC0260b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C2432b.this.f25969e = strArr;
            }
        }

        /* JADX INFO: renamed from: e8.b$e$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0262b extends AbstractC0260b {
            C0262b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // e8.C2432b.AbstractC0260b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C2432b.this.f25970f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private InterfaceC2376x.b h() {
            return new a();
        }

        private InterfaceC2376x.b i() {
            return new C0262b();
        }

        @Override // d8.InterfaceC2376x.a
        public void b(f fVar, k8.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.b c(f fVar) {
            String strJ = fVar != null ? fVar.j() : null;
            if ("data".equals(strJ) || "filePartClassNames".equals(strJ)) {
                return h();
            }
            if ("strings".equals(strJ)) {
                return i();
            }
            return null;
        }

        @Override // d8.InterfaceC2376x.a
        public InterfaceC2376x.a d(f fVar, k8.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // d8.InterfaceC2376x.a
        public void e(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strJ = fVar.j();
            if ("version".equals(strJ)) {
                if (obj instanceof int[]) {
                    C2432b.this.f25965a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strJ)) {
                C2432b.this.f25966b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // d8.InterfaceC2376x.a
        public void f(f fVar, q8.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // d8.InterfaceC2376x.a
        public void a() {
        }
    }

    @Override // d8.InterfaceC2376x.c
    public void a() {
    }
}

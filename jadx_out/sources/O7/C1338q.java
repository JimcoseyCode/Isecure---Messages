package O7;

import C8.C0434u;
import C8.v0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.h0;
import L7.r0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import o8.AbstractC3031m;
import o8.C3033o;
import v8.AbstractC3443l;
import v8.C3435d;
import v8.InterfaceC3442k;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: O7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1338q extends AbstractC1331j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final v0 f8480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC3442k f8481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B8.i f8482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final M7.h f8483r;

    /* JADX INFO: renamed from: O7.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC3443l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final B8.g f8484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final B8.g f8485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B8.i f8486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1338q f8487e;

        /* JADX INFO: renamed from: O7.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0093a implements Function1 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1338q f8488g;

            C0093a(C1338q c1338q) {
                this.f8488g = c1338q;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(k8.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* JADX INFO: renamed from: O7.q$a$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements Function1 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1338q f8490g;

            b(C1338q c1338q) {
                this.f8490g = c1338q;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(k8.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* JADX INFO: renamed from: O7.q$a$c */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class c implements InterfaceC3487a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1338q f8492g;

            c(C1338q c1338q) {
                this.f8492g = c1338q;
            }

            @Override // w7.InterfaceC3487a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* JADX INFO: renamed from: O7.q$a$d */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class d extends AbstractC3031m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f8494a;

            d(Set set) {
                this.f8494a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o8.AbstractC3032n
            public void a(InterfaceC1277b interfaceC1277b) {
                if (interfaceC1277b == null) {
                    f(0);
                }
                C3033o.K(interfaceC1277b, null);
                this.f8494a.add(interfaceC1277b);
            }

            @Override // o8.AbstractC3031m
            protected void e(InterfaceC1277b interfaceC1277b, InterfaceC1277b interfaceC1277b2) {
                if (interfaceC1277b == null) {
                    f(1);
                }
                if (interfaceC1277b2 == null) {
                    f(2);
                }
            }
        }

        public a(C1338q c1338q, B8.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f8487e = c1338q;
            this.f8484b = nVar.h(new C0093a(c1338q));
            this.f8485c = nVar.h(new b(c1338q));
            this.f8486d = nVar.e(new c(c1338q));
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void h(int i10) {
            String str;
            int i11;
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    case 16:
                    case 17:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    case 16:
                    case 17:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        i11 = 2;
                        break;
                    default:
                        i11 = 3;
                        break;
                }
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    objArr[0] = "kindFilter";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    objArr[0] = "nameFilter";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i10 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i10 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i10 != 12) {
                switch (i10) {
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                        objArr[1] = "getClassifierNames";
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    case 16:
                    case 17:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection l() {
            HashSet hashSet = new HashSet();
            for (k8.f fVar : (Set) this.f8487e.f8482q.invoke()) {
                T7.d dVar = T7.d.f10641v;
                hashSet.addAll(b(fVar, dVar));
                hashSet.addAll(d(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection m(k8.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().b(fVar, T7.d.f10641v));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection n(k8.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().d(fVar, T7.d.f10641v));
        }

        private InterfaceC3442k o() {
            InterfaceC3442k interfaceC3442kO = ((C8.S) this.f8487e.j().g().iterator().next()).o();
            if (interfaceC3442kO == null) {
                h(9);
            }
            return interfaceC3442kO;
        }

        private Collection p(k8.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C3033o.f30533f.v(fVar, collection, Collections.EMPTY_SET, this.f8487e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Set a() {
            Set set = (Set) this.f8487e.f8482q.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Collection b(k8.f fVar, T7.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f8484b.invoke(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Set c() {
            Set set = (Set) this.f8487e.f8482q.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Collection d(k8.f fVar, T7.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f8485c.invoke(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Set e() {
            Set set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3445n
        public Collection g(C3435d c3435d, Function1 function1) {
            if (c3435d == null) {
                h(13);
            }
            if (function1 == null) {
                h(14);
            }
            Collection collection = (Collection) this.f8486d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1338q(B8.n nVar, InterfaceC1280e interfaceC1280e, C8.S s10, k8.f fVar, B8.i iVar, M7.h hVar, h0 h0Var) {
        super(nVar, interfaceC1280e, fVar, h0Var, false);
        if (nVar == null) {
            x0(6);
        }
        if (interfaceC1280e == null) {
            x0(7);
        }
        if (s10 == null) {
            x0(8);
        }
        if (fVar == null) {
            x0(9);
        }
        if (iVar == null) {
            x0(10);
        }
        if (hVar == null) {
            x0(11);
        }
        if (h0Var == null) {
            x0(12);
        }
        this.f8483r = hVar;
        this.f8480o = new C0434u(this, Collections.EMPTY_LIST, Collections.singleton(s10), nVar);
        this.f8481p = new a(this, nVar);
        this.f8482q = iVar;
    }

    public static C1338q I0(B8.n nVar, InterfaceC1280e interfaceC1280e, k8.f fVar, B8.i iVar, M7.h hVar, h0 h0Var) {
        if (nVar == null) {
            x0(0);
        }
        if (interfaceC1280e == null) {
            x0(1);
        }
        if (fVar == null) {
            x0(2);
        }
        if (iVar == null) {
            x0(3);
        }
        if (hVar == null) {
            x0(4);
        }
        if (h0Var == null) {
            x0(5);
        }
        return new C1338q(nVar, interfaceC1280e, interfaceC1280e.r(), fVar, iVar, hVar, h0Var);
    }

    private static /* synthetic */ void x0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "getKind";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[1] = "getModality";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[1] = "getVisibility";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[1] = "getAnnotations";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L7.D
    public boolean B0() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean C() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean F0() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public Collection I() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(23);
        }
        return list;
    }

    @Override // L7.D
    public boolean J() {
        return false;
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return false;
    }

    @Override // O7.z
    public InterfaceC3442k L(D8.g gVar) {
        if (gVar == null) {
            x0(13);
        }
        InterfaceC3442k interfaceC3442k = this.f8481p;
        if (interfaceC3442k == null) {
            x0(14);
        }
        return interfaceC3442k;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1279d O() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k P() {
        InterfaceC3442k.b bVar = InterfaceC3442k.b.f32996b;
        if (bVar == null) {
            x0(15);
        }
        return bVar;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1280e R() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public Collection f() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(16);
        }
        return list;
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        M7.h hVar = this.f8483r;
        if (hVar == null) {
            x0(21);
        }
        return hVar;
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        EnumC1281f enumC1281f = EnumC1281f.f7323k;
        if (enumC1281f == null) {
            x0(18);
        }
        return enumC1281f;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = AbstractC1294t.f7347e;
        if (abstractC1295u == null) {
            x0(20);
        }
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return false;
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        v0 v0Var = this.f8480o;
        if (v0Var == null) {
            x0(17);
        }
        return v0Var;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public L7.E k() {
        L7.E e10 = L7.E.f7283h;
        if (e10 == null) {
            x0(19);
        }
        return e10;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return false;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(22);
        }
        return list;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // L7.InterfaceC1280e
    public r0 w0() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public boolean y() {
        return false;
    }
}

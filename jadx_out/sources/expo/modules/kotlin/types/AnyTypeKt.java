package expo.modules.kotlin.types;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u000e\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u000e\u0010\u0010\u001a:\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aR\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0019\u001aj\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u001c\u001a\u0082\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u001f\u001a\u009a\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u00122\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010\"\u001a²\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u00122\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u00122\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00050\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010%\u001aÊ\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u0001\"\u0006\b\u0006\u0010&\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u00122\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u00122\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00050\u00122\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00060\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010(\u001aâ\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0006\b\u0001\u0010\u0017\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u0001\"\u0006\b\u0006\u0010&\u0018\u0001\"\u0006\b\u0007\u0010)\u0018\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u00122\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u00122\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00050\u00122\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00060\u00122\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00070\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0015\u0010+\u001a\u001c\u0010-\u001a\u00020,\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"T", "Lexpo/modules/kotlin/types/AnyTypeProvider;", "Lexpo/modules/kotlin/types/AnyType;", "cachedAnyType", "(Lexpo/modules/kotlin/types/AnyTypeProvider;)Lexpo/modules/kotlin/types/AnyType;", "Lexpo/modules/kotlin/types/LazyKType;", "lazyTypeOf", "()Lexpo/modules/kotlin/types/LazyKType;", "Lkotlin/Function0;", "LC7/o;", "toLazyType", "(Lw7/a;)Lexpo/modules/kotlin/types/LazyKType;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "toAnyType", "(Lw7/a;Lexpo/modules/kotlin/types/TypeConverterProvider;)Lexpo/modules/kotlin/types/AnyType;", "(Lexpo/modules/kotlin/types/TypeConverterProvider;)Lexpo/modules/kotlin/types/AnyType;", "P0", "Ljava/lang/Class;", "p0", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toArgsArray", "(Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P1", "p1", "(Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P2", "p2", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P3", "p3", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P4", "p4", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P5", "p5", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P6", "p6", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P7", "p7", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "inheritFrom", "(Lexpo/modules/kotlin/types/AnyType;)Z", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnyTypeKt {

    /* JADX INFO: renamed from: expo.modules.kotlin.types.AnyTypeKt$toAnyType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C25091 implements InterfaceC3487a {
        public static final C25091 INSTANCE = new C25091();

        @Override // w7.InterfaceC3487a
        public final C7.o invoke() {
            AbstractC2855l.m(6, "T");
            return null;
        }
    }

    public static final /* synthetic */ <T> AnyType cachedAnyType(AnyTypeProvider anyTypeProvider) {
        AbstractC2855l.g(anyTypeProvider, "<this>");
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
    }

    public static final /* synthetic */ <T> boolean inheritFrom(AnyType anyType) {
        AbstractC2855l.g(anyType, "<this>");
        C7.e classifier = anyType.getKType().getClassifier();
        C7.d dVar = classifier instanceof C7.d ? (C7.d) classifier : null;
        if (dVar == null) {
            return false;
        }
        Class clsB = AbstractC3430a.b(dVar);
        AbstractC2855l.m(4, "T");
        return Object.class.isAssignableFrom(clsB);
    }

    public static final /* synthetic */ <T> LazyKType lazyTypeOf() {
        AbstractC2855l.l();
        AnonymousClass1 anonymousClass1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.types.AnyTypeKt.lazyTypeOf.1
            @Override // w7.InterfaceC3487a
            public final C7.o invoke() {
                AbstractC2855l.m(6, "T");
                return null;
            }
        };
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return new LazyKType(dVarB, false, anonymousClass1);
    }

    public static final /* synthetic */ <T> AnyType toAnyType(InterfaceC3487a interfaceC3487a, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(interfaceC3487a, "<this>");
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return new AnyType(new LazyKType(dVarB, false, interfaceC3487a), typeConverterProvider);
    }

    public static /* synthetic */ AnyType toAnyType$default(InterfaceC3487a interfaceC3487a, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeConverterProvider = null;
        }
        AbstractC2855l.g(interfaceC3487a, "<this>");
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return new AnyType(new LazyKType(dVarB, false, interfaceC3487a), typeConverterProvider);
    }

    public static final /* synthetic */ <P0> AnyType[] toArgsArray(Class<P0> p02, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(p02, "p0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$1 anyTypeKt$toArgsArray$$inlined$toAnyType$1 = AnyTypeKt$toArgsArray$$inlined$toAnyType$1.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$1), typeConverterProvider);
        }
        return new AnyType[]{anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p02, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        }
        if ((i10 & 2) != 0) {
            typeConverterProvider = null;
        }
        AbstractC2855l.g(p02, "p0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$1 anyTypeKt$toArgsArray$$inlined$toAnyType$1 = AnyTypeKt$toArgsArray$$inlined$toAnyType$1.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$1), typeConverterProvider);
        }
        return new AnyType[]{anyType};
    }

    public static final /* synthetic */ <T> LazyKType toLazyType(InterfaceC3487a interfaceC3487a) {
        AbstractC2855l.g(interfaceC3487a, "<this>");
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return new LazyKType(dVarB, false, interfaceC3487a);
    }

    public static final /* synthetic */ <T> AnyType toAnyType(TypeConverterProvider typeConverterProvider) {
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType != null) {
            return anyType;
        }
        AbstractC2855l.l();
        C25091 c25091 = C25091.INSTANCE;
        AbstractC2855l.m(4, "T");
        C7.d dVarB2 = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return new AnyType(new LazyKType(dVarB2, false, c25091), typeConverterProvider);
    }

    public static /* synthetic */ AnyType toAnyType$default(TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeConverterProvider = null;
        }
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType != null) {
            return anyType;
        }
        AbstractC2855l.l();
        C25091 c25091 = C25091.INSTANCE;
        AbstractC2855l.m(4, "T");
        C7.d dVarB2 = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        return new AnyType(new LazyKType(dVarB2, false, c25091), typeConverterProvider);
    }

    public static final /* synthetic */ <P0, P1> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$2 anyTypeKt$toArgsArray$$inlined$toAnyType$2 = AnyTypeKt$toArgsArray$$inlined$toAnyType$2.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$2), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$3 anyTypeKt$toArgsArray$$inlined$toAnyType$3 = AnyTypeKt$toArgsArray$$inlined$toAnyType$3.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$3), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p02, Class p12, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        }
        if ((i10 & 4) != 0) {
            typeConverterProvider = null;
        }
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$2 anyTypeKt$toArgsArray$$inlined$toAnyType$2 = AnyTypeKt$toArgsArray$$inlined$toAnyType$2.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$2), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$3 anyTypeKt$toArgsArray$$inlined$toAnyType$3 = AnyTypeKt$toArgsArray$$inlined$toAnyType$3.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$3), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2};
    }

    public static final /* synthetic */ <P0, P1, P2> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, Class<P2> p22, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$4 anyTypeKt$toArgsArray$$inlined$toAnyType$4 = AnyTypeKt$toArgsArray$$inlined$toAnyType$4.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$4), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$5 anyTypeKt$toArgsArray$$inlined$toAnyType$5 = AnyTypeKt$toArgsArray$$inlined$toAnyType$5.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$5), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$6 anyTypeKt$toArgsArray$$inlined$toAnyType$6 = AnyTypeKt$toArgsArray$$inlined$toAnyType$6.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$6), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p02, Class p12, Class p22, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        }
        if ((i10 & 4) != 0) {
            AbstractC2855l.m(4, "P2");
            p22 = Object.class;
        }
        if ((i10 & 8) != 0) {
            typeConverterProvider = null;
        }
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$4 anyTypeKt$toArgsArray$$inlined$toAnyType$4 = AnyTypeKt$toArgsArray$$inlined$toAnyType$4.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$4), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$5 anyTypeKt$toArgsArray$$inlined$toAnyType$5 = AnyTypeKt$toArgsArray$$inlined$toAnyType$5.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$5), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$6 anyTypeKt$toArgsArray$$inlined$toAnyType$6 = AnyTypeKt$toArgsArray$$inlined$toAnyType$6.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$6), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3};
    }

    public static final /* synthetic */ <P0, P1, P2, P3> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, Class<P2> p22, Class<P3> p32, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$7 anyTypeKt$toArgsArray$$inlined$toAnyType$7 = AnyTypeKt$toArgsArray$$inlined$toAnyType$7.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$7), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$8 anyTypeKt$toArgsArray$$inlined$toAnyType$8 = AnyTypeKt$toArgsArray$$inlined$toAnyType$8.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$8), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$9 anyTypeKt$toArgsArray$$inlined$toAnyType$9 = AnyTypeKt$toArgsArray$$inlined$toAnyType$9.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$9), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$10 anyTypeKt$toArgsArray$$inlined$toAnyType$10 = AnyTypeKt$toArgsArray$$inlined$toAnyType$10.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$10), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p02, Class p12, Class p22, Class p32, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        }
        if ((i10 & 4) != 0) {
            AbstractC2855l.m(4, "P2");
            p22 = Object.class;
        }
        if ((i10 & 8) != 0) {
            AbstractC2855l.m(4, "P3");
            p32 = Object.class;
        }
        if ((i10 & 16) != 0) {
            typeConverterProvider = null;
        }
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$7 anyTypeKt$toArgsArray$$inlined$toAnyType$7 = AnyTypeKt$toArgsArray$$inlined$toAnyType$7.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$7), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$8 anyTypeKt$toArgsArray$$inlined$toAnyType$8 = AnyTypeKt$toArgsArray$$inlined$toAnyType$8.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$8), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$9 anyTypeKt$toArgsArray$$inlined$toAnyType$9 = AnyTypeKt$toArgsArray$$inlined$toAnyType$9.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$9), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$10 anyTypeKt$toArgsArray$$inlined$toAnyType$10 = AnyTypeKt$toArgsArray$$inlined$toAnyType$10.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$10), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, Class<P2> p22, Class<P3> p32, Class<P4> p42, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$11 anyTypeKt$toArgsArray$$inlined$toAnyType$11 = AnyTypeKt$toArgsArray$$inlined$toAnyType$11.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$11), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$12 anyTypeKt$toArgsArray$$inlined$toAnyType$12 = AnyTypeKt$toArgsArray$$inlined$toAnyType$12.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$12), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$13 anyTypeKt$toArgsArray$$inlined$toAnyType$13 = AnyTypeKt$toArgsArray$$inlined$toAnyType$13.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$13), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$14 anyTypeKt$toArgsArray$$inlined$toAnyType$14 = AnyTypeKt$toArgsArray$$inlined$toAnyType$14.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$14), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$15 anyTypeKt$toArgsArray$$inlined$toAnyType$15 = AnyTypeKt$toArgsArray$$inlined$toAnyType$15.INSTANCE;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$15), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        Class p02;
        Class p12;
        Class p22;
        Class p32;
        Class p42;
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        } else {
            p02 = cls;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i10 & 4) != 0) {
            AbstractC2855l.m(4, "P2");
            p22 = Object.class;
        } else {
            p22 = cls3;
        }
        if ((i10 & 8) != 0) {
            AbstractC2855l.m(4, "P3");
            p32 = Object.class;
        } else {
            p32 = cls4;
        }
        if ((i10 & 16) != 0) {
            AbstractC2855l.m(4, "P4");
            p42 = Object.class;
        } else {
            p42 = cls5;
        }
        TypeConverterProvider typeConverterProvider2 = (i10 & 32) != 0 ? null : typeConverterProvider;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$11 anyTypeKt$toArgsArray$$inlined$toAnyType$11 = AnyTypeKt$toArgsArray$$inlined$toAnyType$11.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$11), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$12 anyTypeKt$toArgsArray$$inlined$toAnyType$12 = AnyTypeKt$toArgsArray$$inlined$toAnyType$12.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$12), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$13 anyTypeKt$toArgsArray$$inlined$toAnyType$13 = AnyTypeKt$toArgsArray$$inlined$toAnyType$13.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$13), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$14 anyTypeKt$toArgsArray$$inlined$toAnyType$14 = AnyTypeKt$toArgsArray$$inlined$toAnyType$14.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$14), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$15 anyTypeKt$toArgsArray$$inlined$toAnyType$15 = AnyTypeKt$toArgsArray$$inlined$toAnyType$15.INSTANCE;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$15), typeConverterProvider2);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4, P5> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, Class<P2> p22, Class<P3> p32, Class<P4> p42, Class<P5> p52, TypeConverterProvider typeConverterProvider) {
        AnyType anyType;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AbstractC2855l.g(p52, "p5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$16 anyTypeKt$toArgsArray$$inlined$toAnyType$16 = AnyTypeKt$toArgsArray$$inlined$toAnyType$16.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$16), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$17 anyTypeKt$toArgsArray$$inlined$toAnyType$17 = AnyTypeKt$toArgsArray$$inlined$toAnyType$17.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$17), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$18 anyTypeKt$toArgsArray$$inlined$toAnyType$18 = AnyTypeKt$toArgsArray$$inlined$toAnyType$18.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$18), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$19 anyTypeKt$toArgsArray$$inlined$toAnyType$19 = AnyTypeKt$toArgsArray$$inlined$toAnyType$19.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$19), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$20 anyTypeKt$toArgsArray$$inlined$toAnyType$20 = AnyTypeKt$toArgsArray$$inlined$toAnyType$20.INSTANCE;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$20), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$21 anyTypeKt$toArgsArray$$inlined$toAnyType$21 = AnyTypeKt$toArgsArray$$inlined$toAnyType$21.INSTANCE;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$21), typeConverterProvider);
        } else {
            anyType = anyType7;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        Class p02;
        Class p12;
        Class p22;
        Class p32;
        Class p42;
        Class p52;
        TypeConverterProvider typeConverterProvider2;
        AnyType anyType;
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        } else {
            p02 = cls;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i10 & 4) != 0) {
            AbstractC2855l.m(4, "P2");
            p22 = Object.class;
        } else {
            p22 = cls3;
        }
        if ((i10 & 8) != 0) {
            AbstractC2855l.m(4, "P3");
            p32 = Object.class;
        } else {
            p32 = cls4;
        }
        if ((i10 & 16) != 0) {
            AbstractC2855l.m(4, "P4");
            p42 = Object.class;
        } else {
            p42 = cls5;
        }
        if ((i10 & 32) != 0) {
            AbstractC2855l.m(4, "P5");
            p52 = Object.class;
        } else {
            p52 = cls6;
        }
        TypeConverterProvider typeConverterProvider3 = (i10 & 64) != 0 ? null : typeConverterProvider;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AbstractC2855l.g(p52, "p5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$16 anyTypeKt$toArgsArray$$inlined$toAnyType$16 = AnyTypeKt$toArgsArray$$inlined$toAnyType$16.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            typeConverterProvider2 = typeConverterProvider3;
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$16), typeConverterProvider2);
        } else {
            typeConverterProvider2 = typeConverterProvider3;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$17 anyTypeKt$toArgsArray$$inlined$toAnyType$17 = AnyTypeKt$toArgsArray$$inlined$toAnyType$17.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$17), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$18 anyTypeKt$toArgsArray$$inlined$toAnyType$18 = AnyTypeKt$toArgsArray$$inlined$toAnyType$18.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$18), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$19 anyTypeKt$toArgsArray$$inlined$toAnyType$19 = AnyTypeKt$toArgsArray$$inlined$toAnyType$19.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$19), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$20 anyTypeKt$toArgsArray$$inlined$toAnyType$20 = AnyTypeKt$toArgsArray$$inlined$toAnyType$20.INSTANCE;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$20), typeConverterProvider2);
        }
        AbstractC2855l.m(4, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$21 anyTypeKt$toArgsArray$$inlined$toAnyType$21 = AnyTypeKt$toArgsArray$$inlined$toAnyType$21.INSTANCE;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$21), typeConverterProvider2);
        } else {
            anyType = anyType7;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, Class<P2> p22, Class<P3> p32, Class<P4> p42, Class<P5> p52, Class<P6> p62, TypeConverterProvider typeConverterProvider) {
        AnyType anyType;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AbstractC2855l.g(p52, "p5");
        AbstractC2855l.g(p62, "p6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$22 anyTypeKt$toArgsArray$$inlined$toAnyType$22 = AnyTypeKt$toArgsArray$$inlined$toAnyType$22.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$22), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$23 anyTypeKt$toArgsArray$$inlined$toAnyType$23 = AnyTypeKt$toArgsArray$$inlined$toAnyType$23.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$23), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$24 anyTypeKt$toArgsArray$$inlined$toAnyType$24 = AnyTypeKt$toArgsArray$$inlined$toAnyType$24.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$24), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$25 anyTypeKt$toArgsArray$$inlined$toAnyType$25 = AnyTypeKt$toArgsArray$$inlined$toAnyType$25.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$25), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$26 anyTypeKt$toArgsArray$$inlined$toAnyType$26 = AnyTypeKt$toArgsArray$$inlined$toAnyType$26.INSTANCE;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$26), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$27 anyTypeKt$toArgsArray$$inlined$toAnyType$27 = AnyTypeKt$toArgsArray$$inlined$toAnyType$27.INSTANCE;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$27), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P6");
        C7.d dVarB13 = D.b(Object.class);
        AbstractC2855l.m(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$28 anyTypeKt$toArgsArray$$inlined$toAnyType$28 = AnyTypeKt$toArgsArray$$inlined$toAnyType$28.INSTANCE;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(Object.class);
            AbstractC2855l.m(3, "P6");
            anyType = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$28), typeConverterProvider);
        } else {
            anyType = anyType8;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        Class p02;
        Class p12;
        Class p22;
        Class p32;
        Class p42;
        Class p52;
        Class p62;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AnyType anyType;
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        } else {
            p02 = cls;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i10 & 4) != 0) {
            AbstractC2855l.m(4, "P2");
            p22 = Object.class;
        } else {
            p22 = cls3;
        }
        if ((i10 & 8) != 0) {
            AbstractC2855l.m(4, "P3");
            p32 = Object.class;
        } else {
            p32 = cls4;
        }
        if ((i10 & 16) != 0) {
            AbstractC2855l.m(4, "P4");
            p42 = Object.class;
        } else {
            p42 = cls5;
        }
        if ((i10 & 32) != 0) {
            AbstractC2855l.m(4, "P5");
            p52 = Object.class;
        } else {
            p52 = cls6;
        }
        if ((i10 & 64) != 0) {
            AbstractC2855l.m(4, "P6");
            p62 = Object.class;
        } else {
            p62 = cls7;
        }
        TypeConverterProvider typeConverterProvider2 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : typeConverterProvider;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AbstractC2855l.g(p52, "p5");
        AbstractC2855l.g(p62, "p6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$22 anyTypeKt$toArgsArray$$inlined$toAnyType$22 = AnyTypeKt$toArgsArray$$inlined$toAnyType$22.INSTANCE;
            i11 = 4;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$22), typeConverterProvider2);
        } else {
            i11 = 4;
        }
        AbstractC2855l.m(i11, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$23 anyTypeKt$toArgsArray$$inlined$toAnyType$23 = AnyTypeKt$toArgsArray$$inlined$toAnyType$23.INSTANCE;
            i12 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$23), typeConverterProvider2);
        } else {
            i12 = 4;
        }
        AbstractC2855l.m(i12, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$24 anyTypeKt$toArgsArray$$inlined$toAnyType$24 = AnyTypeKt$toArgsArray$$inlined$toAnyType$24.INSTANCE;
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$24), typeConverterProvider2);
        } else {
            i13 = 4;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$25 anyTypeKt$toArgsArray$$inlined$toAnyType$25 = AnyTypeKt$toArgsArray$$inlined$toAnyType$25.INSTANCE;
            i14 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$25), typeConverterProvider2);
        } else {
            i14 = 4;
        }
        AbstractC2855l.m(i14, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$26 anyTypeKt$toArgsArray$$inlined$toAnyType$26 = AnyTypeKt$toArgsArray$$inlined$toAnyType$26.INSTANCE;
            i15 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$26), typeConverterProvider2);
        } else {
            i15 = 4;
        }
        AbstractC2855l.m(i15, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$27 anyTypeKt$toArgsArray$$inlined$toAnyType$27 = AnyTypeKt$toArgsArray$$inlined$toAnyType$27.INSTANCE;
            i16 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$27), typeConverterProvider2);
        } else {
            i16 = 4;
        }
        AbstractC2855l.m(i16, "P6");
        C7.d dVarB13 = D.b(Object.class);
        AbstractC2855l.m(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$28 anyTypeKt$toArgsArray$$inlined$toAnyType$28 = AnyTypeKt$toArgsArray$$inlined$toAnyType$28.INSTANCE;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(Object.class);
            AbstractC2855l.m(3, "P6");
            anyType = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$28), typeConverterProvider2);
        } else {
            anyType = anyType8;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6, P7> AnyType[] toArgsArray(Class<P0> p02, Class<P1> p12, Class<P2> p22, Class<P3> p32, Class<P4> p42, Class<P5> p52, Class<P6> p62, Class<P7> p72, TypeConverterProvider typeConverterProvider) {
        AnyType anyType;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AbstractC2855l.g(p52, "p5");
        AbstractC2855l.g(p62, "p6");
        AbstractC2855l.g(p72, "p7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$29 anyTypeKt$toArgsArray$$inlined$toAnyType$29 = AnyTypeKt$toArgsArray$$inlined$toAnyType$29.INSTANCE;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$29), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$30 anyTypeKt$toArgsArray$$inlined$toAnyType$30 = AnyTypeKt$toArgsArray$$inlined$toAnyType$30.INSTANCE;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$30), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$31 anyTypeKt$toArgsArray$$inlined$toAnyType$31 = AnyTypeKt$toArgsArray$$inlined$toAnyType$31.INSTANCE;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$31), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$32 anyTypeKt$toArgsArray$$inlined$toAnyType$32 = AnyTypeKt$toArgsArray$$inlined$toAnyType$32.INSTANCE;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$32), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$33 anyTypeKt$toArgsArray$$inlined$toAnyType$33 = AnyTypeKt$toArgsArray$$inlined$toAnyType$33.INSTANCE;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$33), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$34 anyTypeKt$toArgsArray$$inlined$toAnyType$34 = AnyTypeKt$toArgsArray$$inlined$toAnyType$34.INSTANCE;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$34), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P6");
        C7.d dVarB13 = D.b(Object.class);
        AbstractC2855l.m(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$35 anyTypeKt$toArgsArray$$inlined$toAnyType$35 = AnyTypeKt$toArgsArray$$inlined$toAnyType$35.INSTANCE;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(Object.class);
            AbstractC2855l.m(3, "P6");
            anyType8 = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$35), typeConverterProvider);
        }
        AbstractC2855l.m(4, "P7");
        C7.d dVarB15 = D.b(Object.class);
        AbstractC2855l.m(3, "P7");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$36 anyTypeKt$toArgsArray$$inlined$toAnyType$36 = AnyTypeKt$toArgsArray$$inlined$toAnyType$36.INSTANCE;
            AbstractC2855l.m(4, "P7");
            C7.d dVarB16 = D.b(Object.class);
            AbstractC2855l.m(3, "P7");
            anyType = new AnyType(new LazyKType(dVarB16, false, anyTypeKt$toArgsArray$$inlined$toAnyType$36), typeConverterProvider);
        } else {
            anyType = anyType9;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8, anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, TypeConverterProvider typeConverterProvider, int i10, Object obj) {
        Class p02;
        Class p12;
        Class p22;
        Class p32;
        Class p42;
        Class p52;
        Class cls9;
        String str;
        Class p72;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        AnyType anyType;
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "P0");
            p02 = Object.class;
        } else {
            p02 = cls;
        }
        if ((i10 & 2) != 0) {
            AbstractC2855l.m(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i10 & 4) != 0) {
            AbstractC2855l.m(4, "P2");
            p22 = Object.class;
        } else {
            p22 = cls3;
        }
        if ((i10 & 8) != 0) {
            AbstractC2855l.m(4, "P3");
            p32 = Object.class;
        } else {
            p32 = cls4;
        }
        if ((i10 & 16) != 0) {
            AbstractC2855l.m(4, "P4");
            p42 = Object.class;
        } else {
            p42 = cls5;
        }
        if ((i10 & 32) != 0) {
            AbstractC2855l.m(4, "P5");
            p52 = Object.class;
        } else {
            p52 = cls6;
        }
        if ((i10 & 64) != 0) {
            AbstractC2855l.m(4, "P6");
            cls9 = Object.class;
        } else {
            cls9 = cls7;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str = "P6";
            AbstractC2855l.m(4, "P7");
            p72 = Object.class;
        } else {
            str = "P6";
            p72 = cls8;
        }
        TypeConverterProvider typeConverterProvider2 = (i10 & 256) != 0 ? null : typeConverterProvider;
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        AbstractC2855l.g(p22, "p2");
        AbstractC2855l.g(p32, "p3");
        AbstractC2855l.g(p42, "p4");
        AbstractC2855l.g(p52, "p5");
        Class p62 = cls9;
        AbstractC2855l.g(p62, "p6");
        AbstractC2855l.g(p72, "p7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$29 anyTypeKt$toArgsArray$$inlined$toAnyType$29 = AnyTypeKt$toArgsArray$$inlined$toAnyType$29.INSTANCE;
            i11 = 4;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$29), typeConverterProvider2);
        } else {
            i11 = 4;
        }
        AbstractC2855l.m(i11, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$30 anyTypeKt$toArgsArray$$inlined$toAnyType$30 = AnyTypeKt$toArgsArray$$inlined$toAnyType$30.INSTANCE;
            i12 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$30), typeConverterProvider2);
        } else {
            i12 = 4;
        }
        AbstractC2855l.m(i12, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$31 anyTypeKt$toArgsArray$$inlined$toAnyType$31 = AnyTypeKt$toArgsArray$$inlined$toAnyType$31.INSTANCE;
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$31), typeConverterProvider2);
        } else {
            i13 = 4;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$32 anyTypeKt$toArgsArray$$inlined$toAnyType$32 = AnyTypeKt$toArgsArray$$inlined$toAnyType$32.INSTANCE;
            i14 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$32), typeConverterProvider2);
        } else {
            i14 = 4;
        }
        AbstractC2855l.m(i14, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$33 anyTypeKt$toArgsArray$$inlined$toAnyType$33 = AnyTypeKt$toArgsArray$$inlined$toAnyType$33.INSTANCE;
            i15 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$33), typeConverterProvider2);
        } else {
            i15 = 4;
        }
        AbstractC2855l.m(i15, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$34 anyTypeKt$toArgsArray$$inlined$toAnyType$34 = AnyTypeKt$toArgsArray$$inlined$toAnyType$34.INSTANCE;
            i16 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$34), typeConverterProvider2);
        } else {
            i16 = 4;
        }
        String str2 = str;
        AbstractC2855l.m(i16, str2);
        C7.d dVarB13 = D.b(Object.class);
        AbstractC2855l.m(3, str2);
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$35 anyTypeKt$toArgsArray$$inlined$toAnyType$35 = AnyTypeKt$toArgsArray$$inlined$toAnyType$35.INSTANCE;
            i17 = 4;
            AbstractC2855l.m(4, str2);
            C7.d dVarB14 = D.b(Object.class);
            AbstractC2855l.m(3, str2);
            anyType8 = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$35), typeConverterProvider2);
        } else {
            i17 = 4;
        }
        AbstractC2855l.m(i17, "P7");
        C7.d dVarB15 = D.b(Object.class);
        AbstractC2855l.m(3, "P7");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$36 anyTypeKt$toArgsArray$$inlined$toAnyType$36 = AnyTypeKt$toArgsArray$$inlined$toAnyType$36.INSTANCE;
            AbstractC2855l.m(4, "P7");
            C7.d dVarB16 = D.b(Object.class);
            AbstractC2855l.m(3, "P7");
            anyType = new AnyType(new LazyKType(dVarB16, false, anyTypeKt$toArgsArray$$inlined$toAnyType$36), typeConverterProvider2);
        } else {
            anyType = anyType9;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8, anyType};
    }
}

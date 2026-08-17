package expo.modules.kotlin.jni;

import C7.o;
import C7.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.exception.InvalidExpectedType;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0003\"\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\r\u001a\u00020\fH\u0007J\u0015\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "innerPossibleTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/jni/SingleType;", "<init>", "([Lexpo/modules/kotlin/jni/SingleType;)V", "expectedTypes", "Lexpo/modules/kotlin/jni/CppType;", "([Lexpo/modules/kotlin/jni/CppType;)V", "[Lexpo/modules/kotlin/jni/SingleType;", "innerCombinedTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCombinedTypes", "getPossibleTypes", "()[Lexpo/modules/kotlin/jni/SingleType;", "getFirstType", "hashCode", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class ExpectedType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int innerCombinedTypes;
    private final SingleType[] innerPossibleTypes;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0014\"\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/kotlin/jni/CppType;", "parameterType", "Lexpo/modules/kotlin/jni/ExpectedType;", "forPrimitiveArray", "(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;", "(Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;", "forArray", "forEnum", "()Lexpo/modules/kotlin/jni/ExpectedType;", "forList", "valueType", "forMap", "LC7/o;", NotificationsService.EVENT_TYPE_KEY, "fromKType", "(LC7/o;)Lexpo/modules/kotlin/jni/ExpectedType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "types", "merge", "([Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExpectedType forArray(CppType parameterType) {
            AbstractC2855l.g(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.ARRAY, new ExpectedType[]{new ExpectedType(parameterType)}));
        }

        public final ExpectedType forEnum() {
            return new ExpectedType(CppType.STRING, CppType.INT);
        }

        public final ExpectedType forList(CppType parameterType) {
            AbstractC2855l.g(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.LIST, new ExpectedType[]{new ExpectedType(parameterType)}));
        }

        public final ExpectedType forMap(CppType valueType) {
            AbstractC2855l.g(valueType, "valueType");
            return new ExpectedType(new SingleType(CppType.MAP, new ExpectedType[]{new ExpectedType(valueType)}));
        }

        public final ExpectedType forPrimitiveArray(CppType parameterType) {
            AbstractC2855l.g(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.PRIMITIVE_ARRAY, new ExpectedType[]{new ExpectedType(parameterType)}));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ExpectedType fromKType(o type) throws InvalidExpectedType {
            AbstractC2855l.g(type, "type");
            C7.e classifier = type.getClassifier();
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            C7.d dVar = classifier instanceof C7.d ? (C7.d) classifier : null;
            if (dVar == null) {
                throw new IllegalArgumentException("Cannot obtain KClass from '" + type + "'");
            }
            int i10 = 2;
            if (AbstractC2855l.b(dVar, D.b(Integer.TYPE))) {
                return new ExpectedType(new SingleType(CppType.INT, objArr12 == true ? 1 : 0, i10, objArr11 == true ? 1 : 0));
            }
            if (AbstractC2855l.b(dVar, D.b(Long.TYPE))) {
                return new ExpectedType(new SingleType(CppType.LONG, objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0));
            }
            if (AbstractC2855l.b(dVar, D.b(Double.TYPE))) {
                return new ExpectedType(new SingleType(CppType.DOUBLE, objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0));
            }
            if (AbstractC2855l.b(dVar, D.b(Float.TYPE))) {
                return new ExpectedType(new SingleType(CppType.FLOAT, objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0));
            }
            if (AbstractC2855l.b(dVar, D.b(Boolean.TYPE))) {
                return new ExpectedType(new SingleType(CppType.BOOLEAN, objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0));
            }
            if (AbstractC2855l.b(dVar, D.b(String.class))) {
                return new ExpectedType(new SingleType(CppType.STRING, objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0));
            }
            if (AbstractC3430a.b(dVar).isAssignableFrom(List.class)) {
                q qVar = (q) AbstractC2800q.g0(type.getArguments());
                o oVarC = qVar != null ? qVar.c() : null;
                if (oVarC != null) {
                    return forList(fromKType(oVarC));
                }
            }
            if (AbstractC3430a.b(dVar).isAssignableFrom(Map.class)) {
                q qVar2 = (q) AbstractC2800q.h0(type.getArguments(), 1);
                o oVarC2 = qVar2 != null ? qVar2.c() : null;
                if (oVarC2 != null) {
                    return forMap(fromKType(oVarC2));
                }
            }
            throw new InvalidExpectedType(type);
        }

        public final ExpectedType merge(ExpectedType... types) {
            AbstractC2855l.g(types, "types");
            ArrayList arrayList = new ArrayList();
            for (ExpectedType expectedType : types) {
                AbstractC2800q.A(arrayList, AbstractC2793j.x(expectedType.innerPossibleTypes));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                CppType expectedCppType$expo_modules_core_release = ((SingleType) obj).getExpectedCppType();
                Object arrayList2 = linkedHashMap.get(expectedCppType$expo_modules_core_release);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(expectedCppType$expo_modules_core_release, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = SingleType.INSTANCE.merge((SingleType) next, (SingleType) it2.next());
                }
                arrayList3.add((SingleType) next);
            }
            SingleType[] singleTypeArr = (SingleType[]) arrayList3.toArray(new SingleType[0]);
            return new ExpectedType((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
        }

        private Companion() {
        }

        public final ExpectedType forArray(ExpectedType parameterType) {
            AbstractC2855l.g(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.ARRAY, new ExpectedType[]{parameterType}));
        }

        public final ExpectedType forList(ExpectedType parameterType) {
            AbstractC2855l.g(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.LIST, new ExpectedType[]{parameterType}));
        }

        public final ExpectedType forMap(ExpectedType valueType) {
            AbstractC2855l.g(valueType, "valueType");
            return new ExpectedType(new SingleType(CppType.MAP, new ExpectedType[]{valueType}));
        }

        public final ExpectedType forPrimitiveArray(ExpectedType parameterType) {
            AbstractC2855l.g(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.PRIMITIVE_ARRAY, new ExpectedType[]{parameterType}));
        }
    }

    public ExpectedType(SingleType... innerPossibleTypes) {
        AbstractC2855l.g(innerPossibleTypes, "innerPossibleTypes");
        this.innerPossibleTypes = innerPossibleTypes;
        int cppType = 0;
        for (SingleType singleType : innerPossibleTypes) {
            cppType |= singleType.getCppType();
        }
        this.innerCombinedTypes = cppType;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ExpectedType)) {
            return false;
        }
        SingleType[] singleTypeArr = this.innerPossibleTypes;
        ExpectedType expectedType = (ExpectedType) other;
        if (singleTypeArr.length != expectedType.innerPossibleTypes.length) {
            return false;
        }
        int length = singleTypeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.innerPossibleTypes[i10].getExpectedCppType() != expectedType.innerPossibleTypes[i10].getExpectedCppType() || !AbstractC2855l.b(this.innerPossibleTypes[i10], expectedType.innerPossibleTypes[i10])) {
                return false;
            }
        }
        return true;
    }

    @DoNotStrip
    /* JADX INFO: renamed from: getCombinedTypes, reason: from getter */
    public final int getInnerCombinedTypes() {
        return this.innerCombinedTypes;
    }

    @DoNotStrip
    public final SingleType getFirstType() {
        return (SingleType) AbstractC2793j.F(this.innerPossibleTypes);
    }

    @DoNotStrip
    /* JADX INFO: renamed from: getPossibleTypes, reason: from getter */
    public final SingleType[] getInnerPossibleTypes() {
        return this.innerPossibleTypes;
    }

    public int hashCode() {
        return (this.innerCombinedTypes * 31) + Arrays.hashCode(this.innerPossibleTypes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpectedType(CppType... expectedTypes) {
        AbstractC2855l.g(expectedTypes, "expectedTypes");
        ArrayList arrayList = new ArrayList(expectedTypes.length);
        for (CppType cppType : expectedTypes) {
            arrayList.add(new SingleType(cppType, null, 2, 0 == true ? 1 : 0));
        }
        SingleType[] singleTypeArr = (SingleType[]) arrayList.toArray(new SingleType[0]);
        this((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
    }
}

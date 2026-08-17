package expo.modules.kotlin.jni;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import j7.AbstractC2800q;
import j7.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/jni/SingleType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expectedCppType", "Lexpo/modules/kotlin/jni/CppType;", "parameterTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/jni/ExpectedType;", "<init>", "(Lexpo/modules/kotlin/jni/CppType;[Lexpo/modules/kotlin/jni/ExpectedType;)V", "getExpectedCppType$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/CppType;", "[Lexpo/modules/kotlin/jni/ExpectedType;", "getCppType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFirstParameterType", "getSecondParameterType", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class SingleType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CppType expectedCppType;
    private final ExpectedType[] parameterTypes;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/jni/SingleType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "merge", "Lexpo/modules/kotlin/jni/SingleType;", "first", "second", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SingleType merge(SingleType first, SingleType second) {
            AbstractC2855l.g(first, "first");
            AbstractC2855l.g(second, "second");
            if (first.getExpectedCppType() != second.getExpectedCppType()) {
                throw new IllegalArgumentException("Cannot merge types with different CppType: " + first.getExpectedCppType() + " and " + second.getExpectedCppType());
            }
            ExpectedType[] expectedTypeArr = first.parameterTypes;
            ExpectedType[] expectedTypeArr2 = second.parameterTypes;
            if (expectedTypeArr == null || expectedTypeArr2 == null) {
                return first;
            }
            if (expectedTypeArr.length == expectedTypeArr2.length) {
                B7.c cVarP = B7.d.p(0, expectedTypeArr.length);
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(cVarP, 10));
                Iterator it = cVarP.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((J) it).nextInt();
                    arrayList.add(ExpectedType.INSTANCE.merge(expectedTypeArr[iNextInt], expectedTypeArr2[iNextInt]));
                }
                return new SingleType(first.getExpectedCppType(), (ExpectedType[]) arrayList.toArray(new ExpectedType[0]));
            }
            throw new IllegalArgumentException(("Cannot merge types with different number of parameters: " + first.parameterTypes.length + " and " + second.parameterTypes.length).toString());
        }

        private Companion() {
        }
    }

    public SingleType(CppType expectedCppType, ExpectedType[] expectedTypeArr) {
        AbstractC2855l.g(expectedCppType, "expectedCppType");
        this.expectedCppType = expectedCppType;
        this.parameterTypes = expectedTypeArr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbstractC2855l.b(SingleType.class, other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC2855l.e(other, "null cannot be cast to non-null type expo.modules.kotlin.jni.SingleType");
        SingleType singleType = (SingleType) other;
        return this.expectedCppType == singleType.expectedCppType && Arrays.equals(this.parameterTypes, singleType.parameterTypes);
    }

    @DoNotStrip
    public final int getCppType() {
        return this.expectedCppType.getValue();
    }

    /* JADX INFO: renamed from: getExpectedCppType$expo_modules_core_release, reason: from getter */
    public final CppType getExpectedCppType() {
        return this.expectedCppType;
    }

    @DoNotStrip
    public final ExpectedType getFirstParameterType() {
        ExpectedType[] expectedTypeArr = this.parameterTypes;
        if (expectedTypeArr != null) {
            return expectedTypeArr[0];
        }
        return null;
    }

    @DoNotStrip
    public final ExpectedType getSecondParameterType() {
        ExpectedType[] expectedTypeArr = this.parameterTypes;
        if (expectedTypeArr != null) {
            return expectedTypeArr[1];
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = this.expectedCppType.hashCode() * 31;
        ExpectedType[] expectedTypeArr = this.parameterTypes;
        return iHashCode + (expectedTypeArr != null ? Arrays.hashCode(expectedTypeArr) : 0);
    }

    public /* synthetic */ SingleType(CppType cppType, ExpectedType[] expectedTypeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cppType, (i10 & 2) != 0 ? null : expectedTypeArr);
    }
}

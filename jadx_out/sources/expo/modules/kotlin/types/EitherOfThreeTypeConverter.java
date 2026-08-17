package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.ExpectedType;
import i7.t;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfThreeTypeConverter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "FirstType", "SecondType", "ThirdType", "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "Lexpo/modules/kotlin/types/EitherOfThree;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", "eitherType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isTrivial", "()Z", "value", "Lexpo/modules/kotlin/AppContext;", "context", "forceConversion", "convertNonNullable", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/types/EitherOfThree;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "firstJavaType", "LC7/o;", "secondJavaType", "thirdJavaType", "Lexpo/modules/kotlin/types/TypeConverter;", "firstTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "secondTypeConverter", "thirdTypeConverter", "firstType", "Lexpo/modules/kotlin/jni/ExpectedType;", "secondType", "thirdType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EitherOfThreeTypeConverter<FirstType, SecondType, ThirdType> extends NonNullableTypeConverter<EitherOfThree<FirstType, SecondType, ThirdType>> {
    private final C7.o firstJavaType;
    private final ExpectedType firstType;
    private final TypeConverter<?> firstTypeConverter;
    private final C7.o secondJavaType;
    private final ExpectedType secondType;
    private final TypeConverter<?> secondTypeConverter;
    private final C7.o thirdJavaType;
    private final ExpectedType thirdType;
    private final TypeConverter<?> thirdTypeConverter;

    public EitherOfThreeTypeConverter(TypeConverterProvider converterProvider, C7.o eitherType) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(eitherType, "eitherType");
        q qVar = (q) AbstractC2800q.h0(eitherType.getArguments(), 0);
        C7.o oVarC = qVar != null ? qVar.c() : null;
        if (oVarC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.firstJavaType = oVarC;
        q qVar2 = (q) AbstractC2800q.h0(eitherType.getArguments(), 1);
        C7.o oVarC2 = qVar2 != null ? qVar2.c() : null;
        if (oVarC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.secondJavaType = oVarC2;
        q qVar3 = (q) AbstractC2800q.h0(eitherType.getArguments(), 2);
        C7.o oVarC3 = qVar3 != null ? qVar3.c() : null;
        if (oVarC3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.thirdJavaType = oVarC3;
        TypeConverter<?> typeConverterObtainTypeConverter = converterProvider.obtainTypeConverter(oVarC);
        this.firstTypeConverter = typeConverterObtainTypeConverter;
        TypeConverter<?> typeConverterObtainTypeConverter2 = converterProvider.obtainTypeConverter(oVarC2);
        this.secondTypeConverter = typeConverterObtainTypeConverter2;
        TypeConverter<?> typeConverterObtainTypeConverter3 = converterProvider.obtainTypeConverter(oVarC3);
        this.thirdTypeConverter = typeConverterObtainTypeConverter3;
        this.firstType = typeConverterObtainTypeConverter.get$cppRequireType();
        this.secondType = typeConverterObtainTypeConverter2.get$cppRequireType();
        this.thirdType = typeConverterObtainTypeConverter3.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.merge(this.firstType, this.secondType, this.thirdType);
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public EitherOfThree<FirstType, SecondType, ThirdType> convertNonNullable(Object value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        List listM = AbstractC2800q.m(this.firstJavaType, this.secondJavaType, this.thirdJavaType);
        return new EitherOfThree<>(value, AbstractC2800q.R0(EitherTypeConverterKt.createDeferredValues(value, context, AbstractC2800q.m(t.a(this.firstType, this.firstTypeConverter), t.a(this.secondType, this.secondTypeConverter), t.a(this.thirdType, this.thirdTypeConverter)), listM)), listM);
    }
}

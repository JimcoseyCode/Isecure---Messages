package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.ExpectedType;
import i7.AbstractC2746i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/types/AnyType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/o;", "kType", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "<init>", "(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "value", "Lexpo/modules/kotlin/AppContext;", "appContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convert", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "LC7/o;", "getKType", "()LC7/o;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverterProvider", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "Lexpo/modules/kotlin/types/TypeConverter;", "converter$delegate", "Lkotlin/Lazy;", "getConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "converter", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyType {

    /* JADX INFO: renamed from: converter$delegate, reason: from kotlin metadata */
    private final Lazy converter;
    private final TypeConverterProvider converterProvider;
    private final C7.o kType;

    public AnyType(C7.o kType, TypeConverterProvider typeConverterProvider) {
        AbstractC2855l.g(kType, "kType");
        this.kType = kType;
        this.converterProvider = typeConverterProvider;
        this.converter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.types.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AnyType.converter_delegate$lambda$0(this.f26638g);
            }
        });
    }

    public static /* synthetic */ Object convert$default(AnyType anyType, Object obj, AppContext appContext, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            appContext = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return anyType.convert(obj, appContext, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeConverter converter_delegate$lambda$0(AnyType anyType) {
        TypeConverter<?> typeConverterObtainTypeConverter;
        TypeConverterProvider typeConverterProvider = anyType.converterProvider;
        return (typeConverterProvider == null || (typeConverterObtainTypeConverter = typeConverterProvider.obtainTypeConverter(anyType.kType)) == null) ? TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(anyType.kType) : typeConverterObtainTypeConverter;
    }

    private final TypeConverter<?> getConverter() {
        return (TypeConverter) this.converter.getValue();
    }

    public final Object convert(Object value, AppContext appContext, boolean forceConversion) {
        return (forceConversion || !getConverter().isTrivial() || (value instanceof Dynamic)) ? getConverter().convert(value, appContext, forceConversion) : value;
    }

    public final TypeConverterProvider getConverterProvider() {
        return this.converterProvider;
    }

    public final ExpectedType getCppRequiredTypes() {
        return getConverter().getCppRequiredTypes();
    }

    public final C7.o getKType() {
        return this.kType;
    }

    public /* synthetic */ AnyType(C7.o oVar, TypeConverterProvider typeConverterProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i10 & 2) != 0 ? null : typeConverterProvider);
    }
}

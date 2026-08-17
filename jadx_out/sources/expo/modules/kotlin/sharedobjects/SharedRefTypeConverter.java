package expo.modules.kotlin.sharedobjects;

import C7.d;
import C7.e;
import C7.o;
import C7.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.KClassExtensionsKt;
import expo.modules.kotlin.exception.IncorrectRefTypeException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.sharedobjects.SharedRefTypeConverter;
import expo.modules.kotlin.types.NonNullableTypeConverter;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001a¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRefTypeConverter;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "T", "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "LC7/o;", NotificationsService.EVENT_TYPE_KEY, "<init>", "(LC7/o;)V", "sharedRef", "checkInnerRef", "(Lexpo/modules/kotlin/sharedobjects/SharedRef;)Lexpo/modules/kotlin/sharedobjects/SharedRef;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertNonNullable", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "LC7/o;", "getType", "()LC7/o;", "Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;", "sharedObjectTypeConverter", "Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;", "sharedRefType$delegate", "Lkotlin/Lazy;", "getSharedRefType", "sharedRefType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedRefTypeConverter<T extends SharedRef<?>> extends NonNullableTypeConverter<T> {
    private final SharedObjectTypeConverter<T> sharedObjectTypeConverter;

    /* JADX INFO: renamed from: sharedRefType$delegate, reason: from kotlin metadata */
    private final Lazy sharedRefType;
    private final o type;

    public SharedRefTypeConverter(o type) {
        AbstractC2855l.g(type, "type");
        this.type = type;
        this.sharedObjectTypeConverter = new SharedObjectTypeConverter<>(type);
        this.sharedRefType = AbstractC2746i.b(new InterfaceC3487a() { // from class: c7.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return SharedRefTypeConverter.sharedRefType_delegate$lambda$1(this.f18918g);
            }
        });
    }

    private final SharedRef<?> checkInnerRef(SharedRef<?> sharedRef) throws IncorrectRefTypeException {
        Object ref = sharedRef.getRef();
        if (ref != null) {
            o sharedRefType = getSharedRefType();
            e classifier = sharedRefType != null ? sharedRefType.getClassifier() : null;
            d dVar = classifier instanceof d ? (d) classifier : null;
            if (dVar != null && !KClassExtensionsKt.fastIsSupperClassOf(dVar, ref.getClass())) {
                throw new IncorrectRefTypeException(this.type, sharedRef.getClass());
            }
        }
        return sharedRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o sharedRefType_delegate$lambda$1(SharedRefTypeConverter sharedRefTypeConverter) {
        List arguments;
        e classifier = sharedRefTypeConverter.type.getClassifier();
        d dVar = classifier instanceof d ? (d) classifier : null;
        o oVar = sharedRefTypeConverter.type;
        while (dVar != null) {
            if (AbstractC2855l.b(dVar, D.b(SharedRef.class))) {
                q qVar = (oVar == null || (arguments = oVar.getArguments()) == null) ? null : (q) AbstractC2800q.e0(arguments);
                if (AbstractC2855l.b(qVar, q.f518c.c())) {
                    return null;
                }
                o oVarC = qVar != null ? qVar.c() : null;
                if (oVarC != null) {
                    return oVarC;
                }
                throw new IllegalArgumentException(("The " + sharedRefTypeConverter.getSharedRefType() + " type should contain the type of the inner ref").toString());
            }
            oVar = (o) AbstractC2800q.g0(dVar.g());
            e classifier2 = oVar != null ? oVar.getClassifier() : null;
            dVar = classifier2 instanceof d ? (d) classifier2 : null;
        }
        return null;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return this.sharedObjectTypeConverter.get$cppRequireType();
    }

    public final o getSharedRefType() {
        return (o) this.sharedRefType.getValue();
    }

    public final o getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.sharedObjectTypeConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public T convertNonNullable(Object value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        T t10 = (T) checkInnerRef(this.sharedObjectTypeConverter.convert(value, context, forceConversion));
        AbstractC2855l.e(t10, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
        return t10;
    }
}

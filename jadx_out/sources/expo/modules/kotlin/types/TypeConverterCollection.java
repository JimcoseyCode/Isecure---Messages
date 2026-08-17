package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import i7.t;
import i7.u;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\b\u0018\u00012\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bRB\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\t0\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterCollection;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Type", "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "LC7/o;", NotificationsService.EVENT_TYPE_KEY, "<init>", "(LC7/o;)V", "P0", "Lkotlin/Function1;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "from", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterCollection;", "value", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertNonNullable", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Object;", "isTrivial", "()Z", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "LC7/o;", "getType", "()LC7/o;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "converters", "Ljava/util/Map;", "getConverters", "()Ljava/util/Map;", "setConverters", "(Ljava/util/Map;)V", "getConverters$annotations", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypeConverterCollection<Type> extends NonNullableTypeConverter<Type> {
    private Map<C7.o, Function1> converters;
    private final C7.o type;

    /* JADX INFO: renamed from: expo.modules.kotlin.types.TypeConverterCollection$from$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1 implements Function1 {
        final /* synthetic */ Function1 $body;

        public AnonymousClass1(Function1 function1) {
            this.$body = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Type invoke(Object obj) {
            return (Type) this.$body.invoke(obj);
        }
    }

    public TypeConverterCollection(C7.o type) {
        AbstractC2855l.g(type, "type");
        this.type = type;
        this.converters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence convertNonNullable$lambda$2(Pair it) {
        AbstractC2855l.g(it, "it");
        return it.c().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence convertNonNullable$lambda$3(CodedException it) {
        AbstractC2855l.g(it, "it");
        String message = it.getMessage();
        return message != null ? message : PointerEventHelper.POINTER_TYPE_UNKNOWN;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public Type convertNonNullable(Object value, AppContext context, boolean forceConversion) throws MissingTypeConverter {
        CodedException unexpectedException;
        CodedException codedException;
        AbstractC2855l.g(value, "value");
        Map<C7.o, Function1> map = this.converters;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<C7.o, Function1> entry : map.entrySet()) {
            arrayList.add(t.a(entry.getKey(), entry.getValue()));
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C7.e classifier = ((C7.o) ((Pair) obj).getFirst()).getClassifier();
            C7.d dVar = classifier instanceof C7.d ? (C7.d) classifier : null;
            if (dVar != null && dVar.q(value)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            if (value instanceof Dynamic) {
                return convertNonNullable(new ExpoDynamic((Dynamic) value), context, forceConversion);
            }
            throw new MissingTypeConverter(this.type);
        }
        if (arrayList2.size() <= 1) {
            Pair pair = (Pair) AbstractC2800q.e0(arrayList2);
            C7.o oVar = (C7.o) pair.getFirst();
            Function1 function1 = (Function1) pair.getSecond();
            TypeConverter<?> typeConverterObtainTypeConverter = TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(oVar);
            return (!typeConverterObtainTypeConverter.isTrivial() || forceConversion) ? (Type) function1.invoke(typeConverterObtainTypeConverter.convert(value, context, forceConversion)) : (Type) function1.invoke(value);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Pair pair2 : arrayList2) {
            try {
                return (Type) ((Function1) pair2.getSecond()).invoke(TypeConverterProviderImpl.INSTANCE.obtainTypeConverter((C7.o) pair2.getFirst()).convert(value, context, true));
            } catch (Exception e10) {
                if (e10 instanceof CodedException) {
                    codedException = (CodedException) e10;
                } else {
                    if (e10 instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) e10;
                        String code = codedException2.getCode();
                        AbstractC2855l.f(code, "getCode(...)");
                        unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(e10);
                    }
                    codedException = unexpectedException;
                }
                arrayList3.add(codedException);
            }
        }
        throw new u("Cannot cast '" + value + "' to '" + this.type + "'. Tried: " + AbstractC2800q.o0(arrayList2, null, null, null, 0, null, new Function1() { // from class: expo.modules.kotlin.types.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TypeConverterCollection.convertNonNullable$lambda$2((Pair) obj2);
            }
        }, 31, null) + ". Errors: " + AbstractC2800q.o0(arrayList3, null, null, null, 0, null, new Function1() { // from class: expo.modules.kotlin.types.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TypeConverterCollection.convertNonNullable$lambda$3((CodedException) obj2);
            }
        }, 31, null));
    }

    public final /* synthetic */ <P0> TypeConverterCollection<Type> from(Function1 body) {
        AbstractC2855l.g(body, "body");
        Map<C7.o, Function1> converters = getConverters();
        AbstractC2855l.m(6, "P0");
        converters.put(null, new AnonymousClass1(body));
        return this;
    }

    public final Map<C7.o, Function1> getConverters() {
        return this.converters;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public ExpectedType getCppRequiredTypes() {
        ExpectedType.Companion companion = ExpectedType.INSTANCE;
        Set<C7.o> setKeySet = this.converters.keySet();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(ExpectedType.INSTANCE.fromKType((C7.o) it.next()));
        }
        ExpectedType[] expectedTypeArr = (ExpectedType[]) arrayList.toArray(new ExpectedType[0]);
        return companion.merge((ExpectedType[]) Arrays.copyOf(expectedTypeArr, expectedTypeArr.length));
    }

    public final C7.o getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    public final void setConverters(Map<C7.o, Function1> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.converters = map;
    }

    public static /* synthetic */ void getConverters$annotations() {
    }
}

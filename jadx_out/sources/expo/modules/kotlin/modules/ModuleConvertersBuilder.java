package expo.modules.kotlin.modules;

import C7.d;
import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.NullableTypeConverter;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterCollection;
import expo.modules.kotlin.types.TypeConverterComponent;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\tJW\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R2\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "T", "LC7/d;", "classifier", "Lexpo/modules/kotlin/types/TypeConverterComponent;", "TypeConverter", "(LC7/d;)Lexpo/modules/kotlin/types/TypeConverterComponent;", "P0", "Lkotlin/Function1;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "(LC7/d;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "buildTypeConverterProvider", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "convertersComponent", "Ljava/util/List;", "getConvertersComponent", "()Ljava/util/List;", "setConvertersComponent", "(Ljava/util/List;)V", "getConvertersComponent$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleConvertersBuilder {
    private List<TypeConverterComponent<?>> convertersComponent = new ArrayList();

    public static /* synthetic */ TypeConverterComponent TypeConverter$default(ModuleConvertersBuilder moduleConvertersBuilder, d classifier, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "T");
            classifier = D.b(Object.class);
        }
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.l();
        ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1 moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1 = ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1.INSTANCE;
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        TypeConverterComponent<?> typeConverterComponent = new TypeConverterComponent<>(new LazyKType(dVarB, false, moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1));
        moduleConvertersBuilder.getConvertersComponent().add(typeConverterComponent);
        return typeConverterComponent;
    }

    public final /* synthetic */ <T> TypeConverterComponent<T> TypeConverter(d classifier) {
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.l();
        ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1 moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1 = ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1.INSTANCE;
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        TypeConverterComponent<T> typeConverterComponent = new TypeConverterComponent<>(new LazyKType(dVarB, false, moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1));
        getConvertersComponent().add(typeConverterComponent);
        return typeConverterComponent;
    }

    public final TypeConverterProvider buildTypeConverterProvider() {
        List<TypeConverterComponent<?>> list = this.convertersComponent;
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair<o, TypeConverter<?>> pairBuild = ((TypeConverterComponent) it.next()).build();
            if (pairBuild != null) {
                arrayList.add(pairBuild);
            }
        }
        return new TypeConverterProvider() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder.buildTypeConverterProvider.1
            private final TypeConverter<?> findNonNullableTypeConverter(o type) {
                Object next;
                Iterator<T> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    o oVar = (o) ((Pair) next).getFirst();
                    if (AbstractC2855l.b(oVar.getClassifier(), type.getClassifier()) && AbstractC2855l.b(oVar.getArguments(), type.getArguments())) {
                        break;
                    }
                }
                Pair pair = (Pair) next;
                if (pair != null) {
                    return (TypeConverter) pair.d();
                }
                return null;
            }

            @Override // expo.modules.kotlin.types.TypeConverterProvider
            public TypeConverter<?> obtainTypeConverter(o type) throws MissingTypeConverter {
                AbstractC2855l.g(type, "type");
                TypeConverter<?> typeConverterFindNonNullableTypeConverter = findNonNullableTypeConverter(type);
                if (typeConverterFindNonNullableTypeConverter != null) {
                    return type.getIsMarkedNullable() ? new NullableTypeConverter(typeConverterFindNonNullableTypeConverter) : typeConverterFindNonNullableTypeConverter;
                }
                throw new MissingTypeConverter(type);
            }
        };
    }

    public final List<TypeConverterComponent<?>> getConvertersComponent() {
        return this.convertersComponent;
    }

    public final void setConvertersComponent(List<TypeConverterComponent<?>> list) {
        AbstractC2855l.g(list, "<set-?>");
        this.convertersComponent = list;
    }

    public final /* synthetic */ <T, P0> TypeConverterComponent<T> TypeConverter(d classifier, Function1 body) {
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1 moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1 = ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1.INSTANCE;
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        TypeConverterComponent<T> typeConverterComponent = new TypeConverterComponent<>(new LazyKType(dVarB, false, moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1));
        getConvertersComponent().add(typeConverterComponent);
        Map<o, Function1> converters = ((TypeConverterCollection) typeConverterComponent.getDesireTypeConverter().getValue()).getConverters();
        AbstractC2855l.m(6, "P0");
        AbstractC2855l.l();
        converters.put(null, new ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1(body));
        return typeConverterComponent;
    }

    public static /* synthetic */ TypeConverterComponent TypeConverter$default(ModuleConvertersBuilder moduleConvertersBuilder, d classifier, Function1 body, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            AbstractC2855l.m(4, "T");
            classifier = D.b(Object.class);
        }
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1 moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1 = ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1.INSTANCE;
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        TypeConverterComponent<?> typeConverterComponent = new TypeConverterComponent<>(new LazyKType(dVarB, false, moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1));
        moduleConvertersBuilder.getConvertersComponent().add(typeConverterComponent);
        Map<o, Function1> converters = ((TypeConverterCollection) typeConverterComponent.getDesireTypeConverter().getValue()).getConverters();
        AbstractC2855l.m(6, "P0");
        AbstractC2855l.l();
        converters.put(null, new ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1(body));
        return typeConverterComponent;
    }

    public static /* synthetic */ void getConvertersComponent$annotations() {
    }
}

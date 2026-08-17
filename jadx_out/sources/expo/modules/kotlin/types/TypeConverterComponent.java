package expo.modules.kotlin.types;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.TypeConverterCollection;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.AbstractC2746i;
import i7.t;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00012\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterComponent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Type", "LC7/o;", "desireType", "<init>", "(LC7/o;)V", "P0", "Lkotlin/Function1;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "from", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;", "Lkotlin/Pair;", "Lexpo/modules/kotlin/types/TypeConverter;", "build", "()Lkotlin/Pair;", "LC7/o;", "getDesireType", "()LC7/o;", "Lkotlin/Lazy;", "Lexpo/modules/kotlin/types/TypeConverterCollection;", "desireTypeConverter", "Lkotlin/Lazy;", "getDesireTypeConverter", "()Lkotlin/Lazy;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypeConverterComponent<Type> {
    private final C7.o desireType;
    private final Lazy desireTypeConverter;

    public TypeConverterComponent(C7.o desireType) {
        AbstractC2855l.g(desireType, "desireType");
        this.desireType = desireType;
        this.desireTypeConverter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.types.l
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return TypeConverterComponent.desireTypeConverter$lambda$0(this.f26639g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeConverterCollection desireTypeConverter$lambda$0(TypeConverterComponent typeConverterComponent) {
        return new TypeConverterCollection(typeConverterComponent.desireType);
    }

    public final Pair<C7.o, TypeConverter<?>> build() {
        if (!this.desireTypeConverter.e()) {
            return null;
        }
        TypeConverterCollection typeConverterCollection = new TypeConverterCollection(this.desireType);
        typeConverterCollection.setConverters(((TypeConverterCollection) this.desireTypeConverter.getValue()).getConverters());
        return t.a(this.desireType, typeConverterCollection);
    }

    public final /* synthetic */ <P0> TypeConverterComponent<Type> from(Function1 body) {
        AbstractC2855l.g(body, "body");
        Map<C7.o, Function1> converters = ((TypeConverterCollection) getDesireTypeConverter().getValue()).getConverters();
        AbstractC2855l.m(6, "P0");
        converters.put(null, new TypeConverterCollection.AnonymousClass1(body));
        return this;
    }

    public final C7.o getDesireType() {
        return this.desireType;
    }

    public final Lazy getDesireTypeConverter() {
        return this.desireTypeConverter;
    }
}

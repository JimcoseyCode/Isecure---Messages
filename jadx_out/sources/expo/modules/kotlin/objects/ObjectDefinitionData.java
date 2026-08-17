package expo.modules.kotlin.objects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B}\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lexpo/modules/kotlin/objects/ObjectDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function0;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "legacyConstantsProvider", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "syncFunctions", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "asyncFunctions", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/objects/PropertyComponent;", "properties", "Lexpo/modules/kotlin/objects/ConstantComponent;", "constants", "<init>", "(Lw7/a;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/events/EventsDefinition;Ljava/util/Map;Ljava/util/Map;)V", "other", "plus", "(Lexpo/modules/kotlin/objects/ObjectDefinitionData;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lw7/a;", "getLegacyConstantsProvider", "()Lw7/a;", "Ljava/util/Map;", "getSyncFunctions", "()Ljava/util/Map;", "getAsyncFunctions", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "getProperties", "getConstants", "Lexpo/modules/kotlin/ConcatIterator;", "Lexpo/modules/kotlin/functions/AnyFunction;", "getFunctions", "()Lexpo/modules/kotlin/ConcatIterator;", "functions", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObjectDefinitionData {
    private final Map<String, BaseAsyncFunctionComponent> asyncFunctions;
    private final Map<String, ConstantComponent> constants;
    private final EventsDefinition eventsDefinition;
    private final InterfaceC3487a legacyConstantsProvider;
    private final Map<String, PropertyComponent> properties;
    private final Map<String, SyncFunctionComponent> syncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDefinitionData(InterfaceC3487a legacyConstantsProvider, Map<String, SyncFunctionComponent> syncFunctions, Map<String, ? extends BaseAsyncFunctionComponent> asyncFunctions, EventsDefinition eventsDefinition, Map<String, PropertyComponent> properties, Map<String, ConstantComponent> constants) {
        AbstractC2855l.g(legacyConstantsProvider, "legacyConstantsProvider");
        AbstractC2855l.g(syncFunctions, "syncFunctions");
        AbstractC2855l.g(asyncFunctions, "asyncFunctions");
        AbstractC2855l.g(properties, "properties");
        AbstractC2855l.g(constants, "constants");
        this.legacyConstantsProvider = legacyConstantsProvider;
        this.syncFunctions = syncFunctions;
        this.asyncFunctions = asyncFunctions;
        this.eventsDefinition = eventsDefinition;
        this.properties = properties;
        this.constants = constants;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map plus$lambda$0(ObjectDefinitionData objectDefinitionData, ObjectDefinitionData objectDefinitionData2) {
        return K.o((Map) objectDefinitionData.legacyConstantsProvider.invoke(), (Map) objectDefinitionData2.legacyConstantsProvider.invoke());
    }

    public final Map<String, BaseAsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final Map<String, ConstantComponent> getConstants() {
        return this.constants;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final ConcatIterator<AnyFunction> getFunctions() {
        return new ConcatIterator<>(this.syncFunctions.values().iterator(), this.asyncFunctions.values().iterator());
    }

    public final InterfaceC3487a getLegacyConstantsProvider() {
        return this.legacyConstantsProvider;
    }

    public final Map<String, PropertyComponent> getProperties() {
        return this.properties;
    }

    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    public final ObjectDefinitionData plus(final ObjectDefinitionData other) {
        if (other == null) {
            return this;
        }
        InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ObjectDefinitionData.plus$lambda$0(this.f26619g, other);
            }
        };
        Map mapO = K.o(this.syncFunctions, other.syncFunctions);
        Map mapO2 = K.o(this.asyncFunctions, other.asyncFunctions);
        EventsDefinition eventsDefinition = this.eventsDefinition;
        return new ObjectDefinitionData(interfaceC3487a, mapO, mapO2, eventsDefinition != null ? eventsDefinition.plus(other.eventsDefinition) : null, K.o(this.properties, other.properties), K.o(this.constants, other.constants));
    }
}

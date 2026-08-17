package expo.modules.kotlin.classcomponent;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constructor", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "staticSyncFunctions", PointerEventHelper.POINTER_TYPE_UNKNOWN, "staticAsyncFunctions", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "objectDefinition", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "isSharedRef", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/functions/SyncFunctionComponent;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/objects/ObjectDefinitionData;Z)V", "getName", "()Ljava/lang/String;", "getConstructor", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getStaticSyncFunctions", "()Ljava/util/Map;", "getStaticAsyncFunctions", "getObjectDefinition", "()Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "()Z", "staticFunctions", "Lexpo/modules/kotlin/ConcatIterator;", "Lexpo/modules/kotlin/functions/AnyFunction;", "getStaticFunctions", "()Lexpo/modules/kotlin/ConcatIterator;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassDefinitionData {
    private final SyncFunctionComponent constructor;
    private final boolean isSharedRef;
    private final String name;
    private final ObjectDefinitionData objectDefinition;
    private final Map<String, BaseAsyncFunctionComponent> staticAsyncFunctions;
    private final Map<String, SyncFunctionComponent> staticSyncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDefinitionData(String name, SyncFunctionComponent constructor, Map<String, SyncFunctionComponent> staticSyncFunctions, Map<String, ? extends BaseAsyncFunctionComponent> staticAsyncFunctions, ObjectDefinitionData objectDefinition, boolean z10) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(staticSyncFunctions, "staticSyncFunctions");
        AbstractC2855l.g(staticAsyncFunctions, "staticAsyncFunctions");
        AbstractC2855l.g(objectDefinition, "objectDefinition");
        this.name = name;
        this.constructor = constructor;
        this.staticSyncFunctions = staticSyncFunctions;
        this.staticAsyncFunctions = staticAsyncFunctions;
        this.objectDefinition = objectDefinition;
        this.isSharedRef = z10;
    }

    public final SyncFunctionComponent getConstructor() {
        return this.constructor;
    }

    public final String getName() {
        return this.name;
    }

    public final ObjectDefinitionData getObjectDefinition() {
        return this.objectDefinition;
    }

    public final Map<String, BaseAsyncFunctionComponent> getStaticAsyncFunctions() {
        return this.staticAsyncFunctions;
    }

    public final ConcatIterator<AnyFunction> getStaticFunctions() {
        return new ConcatIterator<>(this.staticSyncFunctions.values().iterator(), this.staticAsyncFunctions.values().iterator());
    }

    public final Map<String, SyncFunctionComponent> getStaticSyncFunctions() {
        return this.staticSyncFunctions;
    }

    /* JADX INFO: renamed from: isSharedRef, reason: from getter */
    public final boolean getIsSharedRef() {
        return this.isSharedRef;
    }
}

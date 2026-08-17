package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001:\u0001YB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001f\u0010 J*\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0082 ¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b/\u0010.J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0086 ¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bH\u0086 ¢\u0006\u0004\b3\u0010*J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u001200H\u0086 ¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\bH\u0086 ¢\u0006\u0004\b6\u0010*J\u0010\u00108\u001a\u000207H\u0086 ¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:H\u0086 ¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0=H\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0019H\u0086 ¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bD\u0010\fJ \u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\bE\u0010\fJ\u001d\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0019¢\u0006\u0004\bD\u0010FJ \u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0019H\u0086\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\bD\u0010\u000fJ \u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\bE\u0010\u000fJ\u001f\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bD\u0010\u0011J\"\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\bE\u0010\u0011J\u001f\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bD\u0010\u0014J\"\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0086\u0002¢\u0006\u0004\bE\u0010\u0014J\u001f\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bD\u0010\u0016J\"\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\bE\u0010\u0016J\u001f\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bD\u0010IJ\"\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010GH\u0086\u0002¢\u0006\u0004\bE\u0010IJ-\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010MJ-\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010NJ-\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010OJ/\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010PJ/\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010QJ/\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010RJ/\u0010L\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010G2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010SJ\u000f\u0010T\u001a\u00020\nH\u0004¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0002H\u0016¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010X¨\u0006Z"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setBoolProperty", "(Ljava/lang/String;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "setDoubleProperty", "(Ljava/lang/String;D)V", "setStringProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "setJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;)V", "setJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "unsetProperty", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "options", "defineBoolProperty", "(Ljava/lang/String;ZI)V", "defineDoubleProperty", "(Ljava/lang/String;DI)V", "defineStringProperty", "(Ljava/lang/String;Ljava/lang/String;I)V", "defineJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;I)V", "defineJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;I)V", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "deallocator", "defineNativeDeallocator", "(Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "isValid", "()Z", "hasProperty", "(Ljava/lang/String;)Z", "getProperty", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "get", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getPropertyNames", "()[Ljava/lang/String;", "isArray", "getArray", "()[Lexpo/modules/kotlin/jni/JavaScriptValue;", "isArrayBuffer", "Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;", "getArrayBuffer", "()Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "createWeak", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lkotlin/Function0;", "defineDeallocator$expo_modules_core_release", "(Lw7/a;)V", "defineDeallocator", "size", "setExternalMemoryPressure", "(I)V", "setProperty", "set", "(Ljava/lang/String;I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "null", "(Ljava/lang/String;Ljava/lang/Void;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", "defineProperty", "(Ljava/lang/String;ZLjava/util/List;)V", "(Ljava/lang/String;ILjava/util/List;)V", "(Ljava/lang/String;DLjava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;Ljava/util/List;)V", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/Void;Ljava/util/List;)V", "finalize", "()V", "getHybridDataForJNIDeallocator", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public class JavaScriptObject implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Configurable", "Enumerable", "Writable", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PropertyDescriptor {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PropertyDescriptor[] $VALUES;
        public static final PropertyDescriptor Configurable = new PropertyDescriptor("Configurable", 0, 1);
        public static final PropertyDescriptor Enumerable = new PropertyDescriptor("Enumerable", 1, 2);
        public static final PropertyDescriptor Writable = new PropertyDescriptor("Writable", 2, 4);
        private final int value;

        private static final /* synthetic */ PropertyDescriptor[] $values() {
            return new PropertyDescriptor[]{Configurable, Enumerable, Writable};
        }

        static {
            PropertyDescriptor[] propertyDescriptorArr$values = $values();
            $VALUES = propertyDescriptorArr$values;
            $ENTRIES = AbstractC3083a.a(propertyDescriptorArr$values);
        }

        private PropertyDescriptor(String str, int i10, int i11) {
            this.value = i11;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PropertyDescriptor valueOf(String str) {
            return (PropertyDescriptor) Enum.valueOf(PropertyDescriptor.class, str);
        }

        public static PropertyDescriptor[] values() {
            return (PropertyDescriptor[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @DoNotStrip
    public JavaScriptObject(HybridData mHybridData) {
        AbstractC2855l.g(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    private final native void defineBoolProperty(String name, boolean value, int options);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B defineDeallocator$lambda$0(InterfaceC3487a interfaceC3487a, Object[] it) {
        AbstractC2855l.g(it, "it");
        interfaceC3487a.invoke();
        return C2735B.f28704a;
    }

    private final native void defineDoubleProperty(String name, double value, int options);

    private final native void defineJSObjectProperty(String name, JavaScriptObject value, int options);

    private final native void defineJSValueProperty(String name, JavaScriptValue value, int options);

    private final native void defineNativeDeallocator(JNIFunctionBody deallocator);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, boolean z10, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, z10, (List<? extends PropertyDescriptor>) list);
    }

    private final native void defineStringProperty(String name, String value, int options);

    private final native void setBoolProperty(String name, boolean value);

    private final native void setDoubleProperty(String name, double value);

    private final native void setJSObjectProperty(String name, JavaScriptObject value);

    private final native void setJSValueProperty(String name, JavaScriptValue value);

    private final native void setStringProperty(String name, String value);

    private final native void unsetProperty(String name);

    public final native JavaScriptWeakObject createWeak();

    public final void defineDeallocator$expo_modules_core_release(final InterfaceC3487a deallocator) {
        AbstractC2855l.g(deallocator, "deallocator");
        defineNativeDeallocator(new JNIFunctionBody() { // from class: expo.modules.kotlin.jni.b
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return JavaScriptObject.defineDeallocator$lambda$0(deallocator, objArr);
            }
        });
    }

    public final void defineProperty(String name, boolean value, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineBoolProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    public final JavaScriptValue get(String name) {
        AbstractC2855l.g(name, "name");
        if (hasProperty(name)) {
            return getProperty(name);
        }
        return null;
    }

    public final native JavaScriptValue[] getArray();

    public final native JavaScriptArrayBuffer getArrayBuffer();

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final native JavaScriptValue getProperty(String name);

    public final native String[] getPropertyNames();

    public final native boolean hasProperty(String name);

    public final native boolean isArray();

    public final native boolean isArrayBuffer();

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final void set(String name, boolean value) {
        AbstractC2855l.g(name, "name");
        setBoolProperty(name, value);
    }

    public final native void setExternalMemoryPressure(int size);

    public final void setProperty(String name, boolean value) {
        AbstractC2855l.g(name, "name");
        setBoolProperty(name, value);
    }

    public final void defineProperty(String name, int value, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineDoubleProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, int value) {
        AbstractC2855l.g(name, "name");
        setDoubleProperty(name, value);
    }

    public final void setProperty(String name, int value) {
        AbstractC2855l.g(name, "name");
        setDoubleProperty(name, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, int i10, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, i10, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(String name, double value, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineDoubleProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, double value) {
        AbstractC2855l.g(name, "name");
        setDoubleProperty(name, value);
    }

    public final void setProperty(String name, double value) {
        AbstractC2855l.g(name, "name");
        setDoubleProperty(name, value);
    }

    public final void defineProperty(String name, String value, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineStringProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, String value) {
        AbstractC2855l.g(name, "name");
        setStringProperty(name, value);
    }

    public final void setProperty(String name, String value) {
        AbstractC2855l.g(name, "name");
        setStringProperty(name, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, double d10, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, d10, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(String name, JavaScriptValue value, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineJSValueProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, JavaScriptValue value) {
        AbstractC2855l.g(name, "name");
        setJSValueProperty(name, value);
    }

    public final void setProperty(String name, JavaScriptValue value) {
        AbstractC2855l.g(name, "name");
        setJSValueProperty(name, value);
    }

    public final void defineProperty(String name, JavaScriptObject value, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineJSObjectProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, JavaScriptObject value) {
        AbstractC2855l.g(name, "name");
        setJSObjectProperty(name, value);
    }

    public final void setProperty(String name, JavaScriptObject value) {
        AbstractC2855l.g(name, "name");
        setJSObjectProperty(name, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, String str2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, str2, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(String name, Void r22, List<? extends PropertyDescriptor> options) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(options, "options");
        defineJSObjectProperty(name, null, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, Void r22) {
        AbstractC2855l.g(name, "name");
        unsetProperty(name);
    }

    public final void setProperty(String name, Void r22) {
        AbstractC2855l.g(name, "name");
        unsetProperty(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, JavaScriptValue javaScriptValue, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, javaScriptValue, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, JavaScriptObject javaScriptObject2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, javaScriptObject2, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, Void r22, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2800q.j();
        }
        javaScriptObject.defineProperty(str, r22, (List<? extends PropertyDescriptor>) list);
    }
}

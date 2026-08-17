package expo.modules.logbox;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Ljava/lang/Class;", "obj", PointerEventHelper.POINTER_TYPE_UNKNOWN, "filedName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "newValue", "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "predicate", "Li7/B;", "setProtectedDeclaredField", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "U", "getProtectedFieldValue", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "expo-log-box_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExpoLogBoxReflectionExtensionsKt {
    public static final <T, U> U getProtectedFieldValue(Class<? extends T> cls, T t10, String filedName) throws NoSuchFieldException {
        AbstractC2855l.g(cls, "<this>");
        AbstractC2855l.g(filedName, "filedName");
        Field declaredField = cls.getDeclaredField(filedName);
        declaredField.setAccessible(true);
        return (U) declaredField.get(t10);
    }

    public static final <T> void setProtectedDeclaredField(Class<? extends T> cls, T t10, String filedName, Object newValue, Function1 predicate) throws IllegalAccessException, NoSuchFieldException {
        AbstractC2855l.g(cls, "<this>");
        AbstractC2855l.g(filedName, "filedName");
        AbstractC2855l.g(newValue, "newValue");
        AbstractC2855l.g(predicate, "predicate");
        Field declaredField = cls.getDeclaredField(filedName);
        Field declaredField2 = Field.class.getDeclaredField("accessFlags");
        declaredField.setAccessible(true);
        declaredField2.setAccessible(true);
        declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
        if (((Boolean) predicate.invoke(declaredField.get(t10))).booleanValue()) {
            declaredField.set(t10, newValue);
        }
    }

    public static /* synthetic */ void setProtectedDeclaredField$default(Class cls, Object obj, String str, Object obj2, Function1 function1, int i10, Object obj3) throws IllegalAccessException, NoSuchFieldException {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: expo.modules.logbox.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return Boolean.valueOf(ExpoLogBoxReflectionExtensionsKt.setProtectedDeclaredField$lambda$0(obj4));
                }
            };
        }
        setProtectedDeclaredField(cls, obj, str, obj2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setProtectedDeclaredField$lambda$0(Object obj) {
        return true;
    }
}

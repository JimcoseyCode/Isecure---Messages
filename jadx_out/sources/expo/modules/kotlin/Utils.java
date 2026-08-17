package expo.modules.kotlin;

import android.os.Looper;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.Exceptions;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/Utils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "assertMainThread", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final void assertMainThread() throws Exceptions.IncorrectThreadException {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        String name = Thread.currentThread().getName();
        AbstractC2855l.f(name, "getName(...)");
        String name2 = Looper.getMainLooper().getThread().getName();
        AbstractC2855l.f(name2, "getName(...)");
        throw new Exceptions.IncorrectThreadException(name, name2);
    }
}

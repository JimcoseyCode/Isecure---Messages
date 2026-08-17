package expo.modules.medialibrary.next.extensions;

import android.content.Context;
import expo.modules.kotlin.exception.Exceptions;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"getOrThrow", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WeakReferenceExtensionsKt {
    public static final Context getOrThrow(WeakReference<Context> weakReference) throws Exceptions.ReactContextLost {
        AbstractC2855l.g(weakReference, "<this>");
        Context context = weakReference.get();
        if (context != null) {
            return context;
        }
        throw new Exceptions.ReactContextLost();
    }
}

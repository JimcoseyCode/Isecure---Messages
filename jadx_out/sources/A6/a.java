package A6;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC2855l;
import r6.AbstractC3276e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f86a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f87b;

    private a() {
    }

    public final void a() {
        EditText editText;
        WeakReference weakReference = f87b;
        if (weakReference == null || (editText = (EditText) weakReference.get()) == null) {
            return;
        }
        AbstractC3276e.e(editText);
    }

    public final EditText b() {
        WeakReference weakReference = f87b;
        if (weakReference != null) {
            return (EditText) weakReference.get();
        }
        return null;
    }

    public final void c(EditText textInput) {
        AbstractC2855l.g(textInput, "textInput");
        f87b = new WeakReference(textInput);
    }
}

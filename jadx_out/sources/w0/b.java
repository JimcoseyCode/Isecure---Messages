package W0;

import android.text.Editable;
import androidx.emoji2.text.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f11901a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f11902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f11903c;

    private b() {
        try {
            f11903c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f11902b == null) {
            synchronized (f11901a) {
                try {
                    if (f11902b == null) {
                        f11902b = new b();
                    }
                } finally {
                }
            }
        }
        return f11902b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f11903c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}

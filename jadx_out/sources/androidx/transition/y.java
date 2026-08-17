package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final B f18424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f18425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f18426c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(y.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            y.e(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f18424a = new K();
        } else {
            f18424a = new J();
        }
        f18425b = new a(Float.class, "translationAlpha");
        f18426c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f18424a.a(view);
    }

    static float b(View view) {
        return f18424a.b(view);
    }

    static void c(View view) {
        f18424a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f18424a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f18424a.e(view, f10);
    }

    static void f(View view, int i10) {
        f18424a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f18424a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f18424a.h(view, matrix);
    }
}

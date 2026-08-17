package C6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativekeyboardcontroller.d;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import r6.AbstractC3274c;
import v6.C3429a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f511a = K.l(t.a("com.android.inputmethod.latin", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24866a), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24866a))), t.a("com.google.android.inputmethod.latin", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24868c), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24867b))), t.a("com.touchtype.swiftkey", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24874i), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24873h))), t.a("com.google.android.googlequicksearchbox", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24870e), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24869d))), t.a("com.google.android.tts", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24870e), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24869d))), t.a("ru.yandex.androidkeyboard", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24876k), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24875j))), t.a("com.samsung.android.honeyboard", t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24872g), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24871f))));

    public static final a a(Context context, int i10) {
        AbstractC2855l.g(context, "<this>");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, d.f24877a);
        AbstractC2855l.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return new a(typedArrayObtainStyledAttributes.getColor(d.f24878b, -16777216), typedArrayObtainStyledAttributes.getInt(d.f24879c, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final int b(ThemedReactContext themedReactContext) {
        AbstractC2855l.g(themedReactContext, "<this>");
        String strA = AbstractC3274c.a(themedReactContext);
        boolean zC = AbstractC3274c.c(themedReactContext);
        C3429a.b(C3429a.f32948a, "Skins", "Current IME: " + strA, null, 4, null);
        Pair pairA = (Pair) f511a.get(strA);
        if (pairA == null) {
            pairA = t.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f24868c), Integer.valueOf(com.reactnativekeyboardcontroller.c.f24867b));
        }
        int iIntValue = ((Number) pairA.getFirst()).intValue();
        int iIntValue2 = ((Number) pairA.getSecond()).intValue();
        if (zC && Build.VERSION.SDK_INT > 29) {
            iIntValue = iIntValue2;
        }
        return a(themedReactContext, iIntValue).a();
    }

    public static final int c(int i10, int i11) {
        return Color.argb(Color.alpha(i10), B7.d.l(Color.red(i10) + i11, 0, 255), B7.d.l(Color.green(i10) + i11, 0, 255), B7.d.l(Color.blue(i10) + i11, 0, 255));
    }
}

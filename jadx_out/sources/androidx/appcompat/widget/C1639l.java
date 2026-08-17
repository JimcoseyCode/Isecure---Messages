package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import f.AbstractC2577j;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1639l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f15037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W0.a f15038b;

    C1639l(EditText editText) {
        this.f15037a = editText;
        this.f15038b = new W0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f15038b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean c() {
        return this.f15038b.b();
    }

    void d(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f15037a.getContext().obtainStyledAttributes(attributeSet, AbstractC2577j.f27064g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27134u0) ? typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27134u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f15038b.c(inputConnection, editorInfo);
    }

    void f(boolean z10) {
        this.f15038b.d(z10);
    }
}

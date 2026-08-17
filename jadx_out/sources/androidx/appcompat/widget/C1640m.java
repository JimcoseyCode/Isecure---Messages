package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC2577j;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C1640m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f15040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W0.f f15041b;

    C1640m(TextView textView) {
        this.f15040a = textView;
        this.f15041b = new W0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f15041b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f15041b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f15040a.getContext().obtainStyledAttributes(attributeSet, AbstractC2577j.f27064g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27134u0) ? typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27134u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z10) {
        this.f15041b.c(z10);
    }

    void e(boolean z10) {
        this.f15041b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f15041b.e(transformationMethod);
    }
}

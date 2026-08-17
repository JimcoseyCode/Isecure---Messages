package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC1793k;
import androidx.transition.v;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class j extends AbstractC1793k {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f23481a;

        a(TextView textView) {
            this.f23481a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f23481a.setScaleX(fFloatValue);
            this.f23481a.setScaleY(fFloatValue);
        }
    }

    private void j0(v vVar) {
        View view = vVar.f18417b;
        if (view instanceof TextView) {
            vVar.f18416a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public void g(v vVar) {
        j0(vVar);
    }

    @Override // androidx.transition.AbstractC1793k
    public void j(v vVar) {
        j0(vVar);
    }

    @Override // androidx.transition.AbstractC1793k
    public Animator n(ViewGroup viewGroup, v vVar, v vVar2) {
        if (vVar == null || vVar2 == null || !(vVar.f18417b instanceof TextView)) {
            return null;
        }
        View view = vVar2.f18417b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = vVar.f18416a;
        Map map2 = vVar2.f18416a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}

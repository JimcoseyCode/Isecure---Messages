package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import f.AbstractC2568a;

/* JADX INFO: renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1650x extends SeekBar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1651y f15089g;

    public C1650x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26722I);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f15089g.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f15089g.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f15089g.g(canvas);
    }

    public C1650x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0.a(this, getContext());
        C1651y c1651y = new C1651y(this);
        this.f15089g = c1651y;
        c1651y.c(attributeSet, i10);
    }
}

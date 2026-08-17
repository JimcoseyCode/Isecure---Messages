package com.google.android.material.timepicker;

import Q4.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Chip f23992E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Chip f23993F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final ClockHandView f23994G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ClockFaceView f23995H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final MaterialButtonToggleGroup f23996I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final View.OnClickListener f23997J;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.w(TimePickerView.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.x(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GestureDetector f24000g;

        c(GestureDetector gestureDetector) {
            this.f24000g = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f24000g.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e w(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d x(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void y() {
        this.f23992E.setTag(Q4.e.f9287Q, 12);
        this.f23993F.setTag(Q4.e.f9287Q, 10);
        this.f23992E.setOnClickListener(this.f23997J);
        this.f23993F.setOnClickListener(this.f23997J);
        this.f23992E.setAccessibilityClassName("android.view.View");
        this.f23993F.setAccessibilityClassName("android.view.View");
    }

    private void z() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f23992E.setOnTouchListener(cVar);
        this.f23993F.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f23993F.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23997J = new a();
        LayoutInflater.from(context).inflate(g.f9339l, this);
        this.f23995H = (ClockFaceView) findViewById(Q4.e.f9307i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(Q4.e.f9310l);
        this.f23996I = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f24008a.getClass();
            }
        });
        this.f23992E = (Chip) findViewById(Q4.e.f9313o);
        this.f23993F = (Chip) findViewById(Q4.e.f9311m);
        this.f23994G = (ClockHandView) findViewById(Q4.e.f9308j);
        z();
        y();
    }
}

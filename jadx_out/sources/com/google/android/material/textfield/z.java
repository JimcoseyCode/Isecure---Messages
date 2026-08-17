package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class z extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f23939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f23940g;

    z(s sVar, int i10) {
        super(sVar);
        this.f23938e = Q4.d.f9261a;
        this.f23940g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.v(this.f23937g, view);
            }
        };
        if (i10 != 0) {
            this.f23938e = i10;
        }
    }

    public static /* synthetic */ void v(z zVar, View view) {
        EditText editText = zVar.f23939f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (zVar.w()) {
            zVar.f23939f.setTransformationMethod(null);
        } else {
            zVar.f23939f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            zVar.f23939f.setSelection(selectionEnd);
        }
        zVar.r();
    }

    private boolean w() {
        EditText editText = this.f23939f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.t
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return Q4.i.f9371T;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return this.f23938e;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f23940g;
    }

    @Override // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.t
    void n(EditText editText) {
        this.f23939f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        if (x(this.f23939f)) {
            this.f23939f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        EditText editText = this.f23939f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

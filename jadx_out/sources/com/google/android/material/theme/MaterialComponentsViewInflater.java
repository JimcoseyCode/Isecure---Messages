package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.s;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.C1630c;
import androidx.appcompat.widget.C1632e;
import androidx.appcompat.widget.C1633f;
import androidx.appcompat.widget.C1647u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.w;
import d5.C2339a;
import j5.C2770a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends s {
    @Override // androidx.appcompat.app.s
    protected C1630c c(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected C1632e d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected C1633f e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected C1647u k(Context context, AttributeSet attributeSet) {
        return new C2339a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    protected B o(Context context, AttributeSet attributeSet) {
        return new C2770a(context, attributeSet);
    }
}

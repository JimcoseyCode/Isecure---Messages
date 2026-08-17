package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24003a;

    public b(int i10) {
        this.f24003a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb.toString()) <= this.f24003a) {
                return null;
            }
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        } catch (NumberFormatException unused) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
    }
}

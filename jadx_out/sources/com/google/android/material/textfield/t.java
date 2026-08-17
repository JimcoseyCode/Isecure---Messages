package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f23887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final s f23888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f23889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f23890d;

    t(s sVar) {
        this.f23887a = sVar.f23860g;
        this.f23888b = sVar;
        this.f23889c = sVar.getContext();
        this.f23890d = sVar.r();
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    final void r() {
        this.f23888b.L(false);
    }

    boolean t() {
        return false;
    }

    void s() {
    }

    void u() {
    }

    void a(Editable editable) {
    }

    void n(EditText editText) {
    }

    void q(boolean z10) {
    }

    void o(View view, I0.z zVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

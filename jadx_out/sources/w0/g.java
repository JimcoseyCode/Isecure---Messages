package W0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final EditText f11917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f.AbstractC0176f f11919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11920j = ViewDefaults.NUMBER_OF_LINES;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11921k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11922l = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends f.AbstractC0176f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f11923a;

        a(EditText editText) {
            this.f11923a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0176f
        public void b() {
            super.b();
            g.c((EditText) this.f11923a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f11917g = editText;
        this.f11918h = z10;
    }

    private f.AbstractC0176f a() {
        if (this.f11919i == null) {
            this.f11919i = new a(this.f11917g);
        }
        return this.f11919i;
    }

    static void c(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean e() {
        if (this.f11922l) {
            return (this.f11918h || androidx.emoji2.text.f.i()) ? false : true;
        }
        return true;
    }

    public boolean b() {
        return this.f11922l;
    }

    public void d(boolean z10) {
        if (this.f11922l != z10) {
            if (this.f11919i != null) {
                androidx.emoji2.text.f.c().u(this.f11919i);
            }
            this.f11922l = z10;
            if (z10) {
                c(this.f11917g, androidx.emoji2.text.f.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f11917g.isInEditMode() || e() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.f.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i10, i10 + i12, this.f11920j, this.f11921k);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

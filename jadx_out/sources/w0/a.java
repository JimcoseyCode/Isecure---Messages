package W0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11897b = ViewDefaults.NUMBER_OF_LINES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11898c = 0;

    /* JADX INFO: renamed from: W0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0126a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f11899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f11900b;

        C0126a(EditText editText, boolean z10) {
            this.f11899a = editText;
            g gVar = new g(editText, z10);
            this.f11900b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(W0.b.getInstance());
        }

        @Override // W0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // W0.a.b
        boolean b() {
            return this.f11900b.b();
        }

        @Override // W0.a.b
        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f11899a, inputConnection, editorInfo);
        }

        @Override // W0.a.b
        void d(boolean z10) {
            this.f11900b.d(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract boolean b();

        abstract InputConnection c(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void d(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        H0.g.h(editText, "editText cannot be null");
        this.f11896a = new C0126a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f11896a.a(keyListener);
    }

    public boolean b() {
        return this.f11896a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f11896a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f11896a.d(z10);
    }
}

package r6;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.textinput.ReactEditText;
import i7.C2735B;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import v6.C3429a;
import w7.InterfaceC3487a;
import w7.r;

/* JADX INFO: renamed from: r6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3276e {
    public static final InterfaceC3487a b(EditText editText, r action) {
        AbstractC2855l.g(editText, "<this>");
        AbstractC2855l.g(action, "action");
        final g gVar = new g(editText, action);
        gVar.j();
        return new InterfaceC3487a() { // from class: r6.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractC3276e.c(gVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B c(g gVar) {
        gVar.i();
        return C2735B.f28704a;
    }

    public static final TextWatcher d(EditText editText, Function1 action) throws IllegalAccessException {
        AbstractC2855l.g(editText, "<this>");
        AbstractC2855l.g(action, "action");
        a aVar = new a(new C(), action);
        try {
            Field declaredField = ReactEditText.class.getDeclaredField("mListeners");
            AbstractC2855l.f(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(editText);
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof TextWatcher)) {
                        }
                    }
                }
                arrayList.add(0, aVar);
                return aVar;
            }
            C3429a.d(C3429a.f32948a, editText.getClass().getSimpleName(), "Can not attach listener because `fieldValue` does not belong to `ArrayList<TextWatcher>`", null, 4, null);
            return aVar;
        } catch (ClassCastException e10) {
            C3429a.d(C3429a.f32948a, editText.getClass().getSimpleName(), "Can not attach listener because casting failed: " + e10.getMessage(), null, 4, null);
            return aVar;
        } catch (IllegalArgumentException e11) {
            C3429a.d(C3429a.f32948a, editText.getClass().getSimpleName(), "Can not attach listener to be the first in the list: " + e11.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(aVar);
            return aVar;
        } catch (NoSuchFieldException e12) {
            C3429a.d(C3429a.f32948a, editText.getClass().getSimpleName(), "Can not attach listener because field `mListeners` not found: " + e12.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(aVar);
            return aVar;
        }
    }

    public static final void e(EditText editText) {
        if (editText instanceof ReactEditText) {
            ((ReactEditText) editText).requestFocusFromJS();
        } else if (editText != null) {
            editText.requestFocus();
        }
    }

    public static final String f(EditText editText) {
        if (editText == null) {
            return Constants.COLLATION_DEFAULT;
        }
        int inputType = editText.getInputType() & 15;
        int inputType2 = editText.getInputType() & 4080;
        return inputType2 == 32 ? "email-address" : inputType2 == 16 ? "url" : inputType2 == 144 ? "visible-password" : inputType == 2 ? ((editText.getInputType() & 8192) == 0 || (editText.getInputType() & 4096) != 0) ? (editText.getInputType() & 4096) != 0 ? Constants.COLLATION_OPTION_NUMERIC : "number-pad" : "decimal-pad" : inputType == 3 ? "phone-pad" : Constants.COLLATION_DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.EditText, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final int g(EditText editText) {
        AbstractC2855l.g(editText, "<this>");
        while (editText != 0) {
            Object parent = editText.getParent();
            editText = parent instanceof View ? (View) parent : 0;
            if (editText instanceof ReactScrollView) {
                ReactScrollView reactScrollView = (ReactScrollView) editText;
                if (reactScrollView.getScrollEnabled()) {
                    return reactScrollView.getId();
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r6.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C f31966g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f31967h;

        a(C c10, Function1 function1) {
            this.f31966g = c10;
            this.f31967h = function1;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String strValueOf = String.valueOf(charSequence);
            if (AbstractC2855l.b(strValueOf, this.f31966g.f29371g)) {
                return;
            }
            this.f31966g.f29371g = strValueOf;
            this.f31967h.invoke(strValueOf);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}

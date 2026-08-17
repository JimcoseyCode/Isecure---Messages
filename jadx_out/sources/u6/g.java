package u6;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import i7.C2735B;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import q6.C3122a;
import q6.C3123b;
import q6.C3124c;
import q6.C3125d;
import q6.C3126e;
import r6.AbstractC3276e;
import r6.AbstractC3277f;
import w7.InterfaceC3487a;
import w7.r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f32686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactViewGroup f32687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThemedReactContext f32688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EditText f32690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3123b f32691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextWatcher f32692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC3487a f32693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnLayoutChangeListener f32694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Function1 f32695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r f32696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f32697l;

    public g(View view, ReactViewGroup eventPropagationView, ThemedReactContext themedReactContext) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(eventPropagationView, "eventPropagationView");
        this.f32686a = view;
        this.f32687b = eventPropagationView;
        this.f32688c = themedReactContext;
        this.f32689d = UIManagerHelper.getSurfaceId(view);
        this.f32691f = h.a();
        this.f32694i = new View.OnLayoutChangeListener() { // from class: u6.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                g.j(this.f32680g, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f32695j = new Function1() { // from class: u6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.m(this.f32681g, (String) obj);
            }
        };
        this.f32696k = new r() { // from class: u6.d
            @Override // w7.r
            public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return g.k(this.f32682g, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Double) obj3).doubleValue(), ((Double) obj4).doubleValue(), ((Double) obj5).doubleValue(), ((Double) obj6).doubleValue());
            }
        };
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: u6.e
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                g.h(this.f32683g, view2, view3);
            }
        };
        this.f32697l = onGlobalFocusChangeListener;
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    private final void g(C3123b c3123b) {
        if (AbstractC2855l.b(c3123b, this.f32691f)) {
            return;
        }
        this.f32691f = c3123b;
        r6.i.a(this.f32688c, this.f32687b.getId(), new C3122a(this.f32689d, this.f32687b.getId(), c3123b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(g gVar, View view, View view2) {
        View viewC = null;
        if (view2 == null || view != null) {
            EditText editText = gVar.f32690e;
            if (editText != null) {
                editText.removeOnLayoutChangeListener(gVar.f32694i);
            }
            final EditText editText2 = gVar.f32690e;
            if (editText2 != null) {
                final TextWatcher textWatcher = gVar.f32692g;
                editText2.post(new Runnable() { // from class: u6.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.i(editText2, textWatcher);
                    }
                });
            }
            InterfaceC3487a interfaceC3487a = gVar.f32693h;
            if (interfaceC3487a != null) {
                interfaceC3487a.invoke();
            }
            gVar.f32690e = null;
        }
        if (view2 instanceof EditText) {
            EditText editText3 = (EditText) view2;
            gVar.f32690e = editText3;
            editText3.addOnLayoutChangeListener(gVar.f32694i);
            gVar.l();
            gVar.f32692g = AbstractC3276e.d(editText3, gVar.f32695j);
            gVar.f32693h = AbstractC3276e.b(editText3, gVar.f32696k);
            A6.a.f86a.c(editText3);
            A6.c cVar = A6.c.f89a;
            B6.i iVarE = cVar.e(view2);
            if (iVarE != null) {
                viewC = iVarE;
            } else {
                ThemedReactContext themedReactContext = gVar.f32688c;
                if (themedReactContext != null) {
                    viewC = r6.h.c(themedReactContext);
                }
            }
            List listH = cVar.h(viewC);
            int iIndexOf = listH.indexOf(view2);
            ThemedReactContext themedReactContext2 = gVar.f32688c;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("current", iIndexOf);
            writableMapCreateMap.putInt("count", listH.size());
            C2735B c2735b = C2735B.f28704a;
            r6.i.b(themedReactContext2, "KeyboardController::focusDidSet", writableMapCreateMap);
        }
        if (view2 == null) {
            gVar.g(h.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditText editText, TextWatcher textWatcher) {
        editText.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g gVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        gVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B k(g gVar, int i10, int i11, double d10, double d11, double d12, double d13) {
        EditText editText = gVar.f32690e;
        if (editText == null) {
            return C2735B.f28704a;
        }
        gVar.l();
        r6.i.a(gVar.f32688c, gVar.f32687b.getId(), new C3124c(gVar.f32689d, gVar.f32687b.getId(), new C3125d(editText.getId(), d10, d11, d12, d13, i10, i11)));
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B m(g gVar, String text) {
        AbstractC2855l.g(text, "text");
        gVar.l();
        r6.i.a(gVar.f32688c, gVar.f32687b.getId(), new C3126e(gVar.f32689d, gVar.f32687b.getId(), text));
        return C2735B.f28704a;
    }

    public final void f() {
        this.f32686a.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f32697l);
    }

    public final void l() {
        EditText editText = this.f32690e;
        if (editText == null) {
            return;
        }
        int[] iArrB = r6.k.b(editText);
        g(new C3123b(AbstractC3277f.a(editText.getX()), AbstractC3277f.a(editText.getY()), AbstractC3277f.a(editText.getWidth()), AbstractC3277f.a(editText.getHeight()), AbstractC3277f.a(iArrB[0]), AbstractC3277f.a(iArrB[1]), editText.getId(), AbstractC3276e.g(editText)));
    }
}

package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.C1630c;
import androidx.appcompat.widget.C1632e;
import androidx.appcompat.widget.C1633f;
import androidx.appcompat.widget.C1634g;
import androidx.appcompat.widget.C1638k;
import androidx.appcompat.widget.C1642o;
import androidx.appcompat.widget.C1644q;
import androidx.appcompat.widget.C1647u;
import androidx.appcompat.widget.C1648v;
import androidx.appcompat.widget.C1650x;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.c0;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f.AbstractC2577j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f14147b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f14148c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f14149d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f14150e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f14151f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f14152g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final m0.i f14153h = new m0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f14154a = new Object[2];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final View f14155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f14156h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Method f14157i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Context f14158j;

        public a(View view, String str) {
            this.f14155g = view;
            this.f14156h = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f14156h, View.class)) != null) {
                        this.f14157i = method;
                        this.f14158j = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f14155g.getId();
            if (id == -1) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            } else {
                str = " with id '" + this.f14155g.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f14156h + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f14155g.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f14157i == null) {
                a(this.f14155g.getContext());
            }
            try {
                this.f14157i.invoke(this.f14158j, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14149d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            AbstractC1658a0.l0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f14150e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            AbstractC1658a0.n0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f14151f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            AbstractC1658a0.x0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14148c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        m0.i iVar = f14153h;
        Constructor constructor = (Constructor) iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f14147b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f14154a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f14154a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f14152g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f14154a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2577j.f26974N3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26979O3, 0) : 0;
        if (z11 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26984P3, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C1630c c(Context context, AttributeSet attributeSet) {
        return new C1630c(context, attributeSet);
    }

    protected C1632e d(Context context, AttributeSet attributeSet) {
        return new C1632e(context, attributeSet);
    }

    protected C1633f e(Context context, AttributeSet attributeSet) {
        return new C1633f(context, attributeSet);
    }

    protected C1634g f(Context context, AttributeSet attributeSet) {
        return new C1634g(context, attributeSet);
    }

    protected C1638k g(Context context, AttributeSet attributeSet) {
        return new C1638k(context, attributeSet);
    }

    protected C1642o h(Context context, AttributeSet attributeSet) {
        return new C1642o(context, attributeSet);
    }

    protected C1644q i(Context context, AttributeSet attributeSet) {
        return new C1644q(context, attributeSet);
    }

    protected androidx.appcompat.widget.r j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C1647u k(Context context, AttributeSet attributeSet) {
        return new C1647u(context, attributeSet);
    }

    protected C1648v l(Context context, AttributeSet attributeSet) {
        return new C1648v(context, attributeSet);
    }

    protected C1650x m(Context context, AttributeSet attributeSet) {
        return new C1650x(context, attributeSet);
    }

    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected B o(Context context, AttributeSet attributeSet) {
        return new B(context, attributeSet);
    }

    protected F p(Context context, AttributeSet attributeSet) {
        return new F(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View viewL;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = c0.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}

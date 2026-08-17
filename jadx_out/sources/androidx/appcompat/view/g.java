package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.f0;
import androidx.core.view.AbstractC1659b;
import androidx.core.view.AbstractC1706z;
import f.AbstractC2577j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.MenuItemC2818c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class[] f14215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class[] f14216f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f14217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f14218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f14219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f14220d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class[] f14221c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f14222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f14223b;

        public a(Object obj, String str) {
            this.f14222a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f14223b = cls.getMethod(str, f14221c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f14223b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f14223b.invoke(this.f14222a, menuItem)).booleanValue();
                }
                this.f14223b.invoke(this.f14222a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        AbstractC1659b f14224A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private CharSequence f14225B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private CharSequence f14226C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private ColorStateList f14227D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f14228E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f14230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f14235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f14236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f14237h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f14238i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f14239j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f14240k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f14241l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f14242m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f14243n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f14244o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f14245p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f14246q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f14247r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f14248s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f14249t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f14250u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f14251v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f14252w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f14253x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f14254y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f14255z;

        public b(Menu menu) {
            this.f14230a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f14219c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f14248s).setVisible(this.f14249t).setEnabled(this.f14250u).setCheckable(this.f14247r >= 1).setTitleCondensed(this.f14241l).setIcon(this.f14242m);
            int i10 = this.f14251v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f14255z != null) {
                if (g.this.f14219c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f14255z));
            }
            if (this.f14247r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC2818c) {
                    ((MenuItemC2818c) menuItem).h(true);
                }
            }
            String str = this.f14253x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f14215e, g.this.f14217a));
                z10 = true;
            }
            int i11 = this.f14252w;
            if (i11 > 0 && !z10) {
                menuItem.setActionView(i11);
            }
            AbstractC1659b abstractC1659b = this.f14224A;
            if (abstractC1659b != null) {
                AbstractC1706z.a(menuItem, abstractC1659b);
            }
            AbstractC1706z.c(menuItem, this.f14225B);
            AbstractC1706z.g(menuItem, this.f14226C);
            AbstractC1706z.b(menuItem, this.f14243n, this.f14244o);
            AbstractC1706z.f(menuItem, this.f14245p, this.f14246q);
            PorterDuff.Mode mode = this.f14228E;
            if (mode != null) {
                AbstractC1706z.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f14227D;
            if (colorStateList != null) {
                AbstractC1706z.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f14237h = true;
            i(this.f14230a.add(this.f14231b, this.f14238i, this.f14239j, this.f14240k));
        }

        public SubMenu b() {
            this.f14237h = true;
            SubMenu subMenuAddSubMenu = this.f14230a.addSubMenu(this.f14231b, this.f14238i, this.f14239j, this.f14240k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f14237h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f14219c.obtainStyledAttributes(attributeSet, AbstractC2577j.f27105o1);
            this.f14231b = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f27115q1, 0);
            this.f14232c = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27125s1, 0);
            this.f14233d = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27130t1, 0);
            this.f14234e = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27135u1, 0);
            this.f14235f = typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27120r1, true);
            this.f14236g = typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27110p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            f0 f0VarU = f0.u(g.this.f14219c, attributeSet, AbstractC2577j.f27140v1);
            this.f14238i = f0VarU.n(AbstractC2577j.f27155y1, 0);
            this.f14239j = (f0VarU.k(AbstractC2577j.f26912B1, this.f14232c) & (-65536)) | (f0VarU.k(AbstractC2577j.f26917C1, this.f14233d) & 65535);
            this.f14240k = f0VarU.p(AbstractC2577j.f26922D1);
            this.f14241l = f0VarU.p(AbstractC2577j.f26927E1);
            this.f14242m = f0VarU.n(AbstractC2577j.f27145w1, 0);
            this.f14243n = c(f0VarU.o(AbstractC2577j.f26932F1));
            this.f14244o = f0VarU.k(AbstractC2577j.f26967M1, 4096);
            this.f14245p = c(f0VarU.o(AbstractC2577j.f26937G1));
            this.f14246q = f0VarU.k(AbstractC2577j.f26987Q1, 4096);
            if (f0VarU.s(AbstractC2577j.f26942H1)) {
                this.f14247r = f0VarU.a(AbstractC2577j.f26942H1, false) ? 1 : 0;
            } else {
                this.f14247r = this.f14234e;
            }
            this.f14248s = f0VarU.a(AbstractC2577j.f27160z1, false);
            this.f14249t = f0VarU.a(AbstractC2577j.f26907A1, this.f14235f);
            this.f14250u = f0VarU.a(AbstractC2577j.f27150x1, this.f14236g);
            this.f14251v = f0VarU.k(AbstractC2577j.f26992R1, -1);
            this.f14255z = f0VarU.o(AbstractC2577j.f26947I1);
            this.f14252w = f0VarU.n(AbstractC2577j.f26952J1, 0);
            this.f14253x = f0VarU.o(AbstractC2577j.f26962L1);
            String strO = f0VarU.o(AbstractC2577j.f26957K1);
            this.f14254y = strO;
            if (strO != null && this.f14252w == 0 && this.f14253x == null) {
                this.f14224A = (AbstractC1659b) e(strO, g.f14216f, g.this.f14218b);
            } else {
                this.f14224A = null;
            }
            this.f14225B = f0VarU.p(AbstractC2577j.f26972N1);
            this.f14226C = f0VarU.p(AbstractC2577j.f26997S1);
            if (f0VarU.s(AbstractC2577j.f26982P1)) {
                this.f14228E = M.e(f0VarU.k(AbstractC2577j.f26982P1, -1), this.f14228E);
            } else {
                this.f14228E = null;
            }
            if (f0VarU.s(AbstractC2577j.f26977O1)) {
                this.f14227D = f0VarU.c(AbstractC2577j.f26977O1);
            } else {
                this.f14227D = null;
            }
            f0VarU.x();
            this.f14237h = false;
        }

        public void h() {
            this.f14231b = 0;
            this.f14232c = 0;
            this.f14233d = 0;
            this.f14234e = 0;
            this.f14235f = true;
            this.f14236g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f14215e = clsArr;
        f14216f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f14219c = context;
        Object[] objArr = {context};
        this.f14217a = objArr;
        this.f14218b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC1659b abstractC1659b = bVar.f14224A;
                            if (abstractC1659b == null || !abstractC1659b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f14220d == null) {
            this.f14220d = a(this.f14219c);
        }
        return this.f14220d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof A0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f14219c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}

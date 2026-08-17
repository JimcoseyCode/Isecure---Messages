package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f14961c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f14962d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f14963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f14964b;

    private c0(Context context) {
        super(context);
        if (!p0.c()) {
            this.f14963a = new e0(this, context.getResources());
            this.f14964b = null;
            return;
        }
        p0 p0Var = new p0(this, context.getResources());
        this.f14963a = p0Var;
        Resources.Theme themeNewTheme = p0Var.newTheme();
        this.f14964b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof c0) || (context.getResources() instanceof e0) || (context.getResources() instanceof p0) || !p0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f14961c) {
            try {
                ArrayList arrayList = f14962d;
                if (arrayList == null) {
                    f14962d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f14962d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f14962d.remove(size);
                        }
                    }
                    for (int size2 = f14962d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f14962d.get(size2);
                        c0 c0Var = weakReference2 != null ? (c0) weakReference2.get() : null;
                        if (c0Var != null && c0Var.getBaseContext() == context) {
                            return c0Var;
                        }
                    }
                }
                c0 c0Var2 = new c0(context);
                f14962d.add(new WeakReference(c0Var2));
                return c0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f14963a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f14963a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f14964b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f14964b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}

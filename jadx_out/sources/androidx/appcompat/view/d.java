package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import f.AbstractC2576i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f14196f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f14198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f14199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f14200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f14201e;

    public d(Context context, int i10) {
        super(context);
        this.f14197a = i10;
    }

    private Resources b() {
        if (this.f14201e == null) {
            Configuration configuration = this.f14200d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f14201e = super.getResources();
            } else {
                this.f14201e = createConfigurationContext(this.f14200d).getResources();
            }
        }
        return this.f14201e;
    }

    private void d() {
        boolean z10 = this.f14198b == null;
        if (z10) {
            this.f14198b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14198b.setTo(theme);
            }
        }
        f(this.f14198b, this.f14197a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f14196f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f14196f = configuration2;
        }
        return configuration.equals(f14196f);
    }

    public void a(Configuration configuration) {
        if (this.f14201e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f14200d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f14200d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f14197a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14199c == null) {
            this.f14199c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14199c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f14198b;
        if (theme != null) {
            return theme;
        }
        if (this.f14197a == 0) {
            this.f14197a = AbstractC2576i.f26903e;
        }
        d();
        return this.f14198b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f14197a != i10) {
            this.f14197a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f14198b = theme;
    }
}

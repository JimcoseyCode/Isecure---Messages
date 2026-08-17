package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Arrays;
import v0.AbstractC3414b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f16299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f16300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t[] f16301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t[] f16302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f16303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f16304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f16305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f16306h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16307i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f16308j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f16309k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f16310l;

        /* JADX INFO: renamed from: androidx.core.app.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0159a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f16311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f16312b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f16313c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f16314d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f16315e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList f16316f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f16317g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f16318h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f16319i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f16320j;

            public C0159a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.c(null, PointerEventHelper.POINTER_TYPE_UNKNOWN, i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f16319i && this.f16313c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0159a a(t tVar) {
                if (this.f16316f == null) {
                    this.f16316f = new ArrayList();
                }
                if (tVar != null) {
                    this.f16316f.add(tVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<t> arrayList3 = this.f16316f;
                if (arrayList3 != null) {
                    for (t tVar : arrayList3) {
                        if (tVar.q()) {
                            arrayList.add(tVar);
                        } else {
                            arrayList2.add(tVar);
                        }
                    }
                }
                return new a(this.f16311a, this.f16312b, this.f16313c, this.f16315e, arrayList2.isEmpty() ? null : (t[]) arrayList2.toArray(new t[arrayList2.size()]), arrayList.isEmpty() ? null : (t[]) arrayList.toArray(new t[arrayList.size()]), this.f16314d, this.f16317g, this.f16318h, this.f16319i, this.f16320j);
            }

            private C0159a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f16314d = true;
                this.f16318h = true;
                this.f16311a = iconCompat;
                this.f16312b = e.f(charSequence);
                this.f16313c = pendingIntent;
                this.f16315e = bundle;
                this.f16316f = tVarArr == null ? null : new ArrayList(Arrays.asList(tVarArr));
                this.f16314d = z10;
                this.f16317g = i10;
                this.f16318h = z11;
                this.f16319i = z12;
                this.f16320j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c(null, PointerEventHelper.POINTER_TYPE_UNKNOWN, i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f16309k;
        }

        public boolean b() {
            return this.f16303e;
        }

        public Bundle c() {
            return this.f16299a;
        }

        public IconCompat d() {
            int i10;
            if (this.f16300b == null && (i10 = this.f16307i) != 0) {
                this.f16300b = IconCompat.c(null, PointerEventHelper.POINTER_TYPE_UNKNOWN, i10);
            }
            return this.f16300b;
        }

        public t[] e() {
            return this.f16301c;
        }

        public int f() {
            return this.f16305g;
        }

        public boolean g() {
            return this.f16304f;
        }

        public CharSequence h() {
            return this.f16308j;
        }

        public boolean i() {
            return this.f16310l;
        }

        public boolean j() {
            return this.f16306h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, t[] tVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f16304f = true;
            this.f16300b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f16307i = iconCompat.e();
            }
            this.f16308j = e.f(charSequence);
            this.f16309k = pendingIntent;
            this.f16299a = bundle == null ? new Bundle() : bundle;
            this.f16301c = tVarArr;
            this.f16302d = tVarArr2;
            this.f16303e = z10;
            this.f16305g = i10;
            this.f16304f = z11;
            this.f16306h = z12;
            this.f16310l = z13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f16321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f16322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f16323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f16324h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f16325i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.l$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class C0160b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.l.f
        public void b(k kVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.f16376b);
            IconCompat iconCompat = this.f16321e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0160b.a(bigContentTitle, this.f16321e.m(kVar instanceof m ? ((m) kVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f16321e.d());
                }
            }
            if (this.f16323g) {
                if (this.f16322f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f16322f.m(kVar instanceof m ? ((m) kVar).f() : null));
                }
            }
            if (this.f16378d) {
                bigContentTitle.setSummaryText(this.f16377c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0160b.c(bigContentTitle, this.f16325i);
                C0160b.b(bigContentTitle, this.f16324h);
            }
        }

        @Override // androidx.core.app.l.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f16322f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f16323g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f16321e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f16326e;

        @Override // androidx.core.app.l.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.l.f
        public void b(k kVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.f16376b).bigText(this.f16326e);
            if (this.f16378d) {
                bigTextStyleBigText.setSummaryText(this.f16377c);
            }
        }

        @Override // androidx.core.app.l.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f16326e = e.f(charSequence);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f16375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f16376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f16377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f16378d = false;

        public void a(Bundle bundle) {
            if (this.f16378d) {
                bundle.putCharSequence("android.summaryText", this.f16377c);
            }
            CharSequence charSequence = this.f16376b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(k kVar);

        protected abstract String c();

        public RemoteViews d(k kVar) {
            return null;
        }

        public RemoteViews e(k kVar) {
            return null;
        }

        public RemoteViews f(k kVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f16375a != eVar) {
                this.f16375a = eVar;
                if (eVar != null) {
                    eVar.A(this);
                }
            }
        }
    }

    public static boolean a(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static CharSequence b(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static CharSequence c(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static Bundle d(Notification notification) {
        return notification.extras;
    }

    public static boolean e(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static CharSequence f(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static Bitmap g(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC3414b.f32775b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC3414b.f32774a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f16327A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f16328B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f16329C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        String f16330D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        Bundle f16331E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f16332F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16333G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        Notification f16334H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        RemoteViews f16335I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f16336J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        RemoteViews f16337K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        String f16338L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f16339M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        String f16340N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f16341O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f16342P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        int f16343Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        boolean f16344R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Notification f16345S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        boolean f16346T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        Object f16347U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public ArrayList f16348V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f16349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f16350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f16351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f16352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f16353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f16354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f16355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f16356h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PendingIntent f16357i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        RemoteViews f16358j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        IconCompat f16359k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f16360l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f16361m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16362n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f16363o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f16364p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        f f16365q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f16366r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f16367s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f16368t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f16369u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f16370v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f16371w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f16372x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f16373y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f16374z;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f16350b = new ArrayList();
            this.f16351c = new ArrayList();
            this.f16352d = new ArrayList();
            this.f16363o = true;
            this.f16327A = false;
            this.f16332F = 0;
            this.f16333G = 0;
            this.f16339M = 0;
            this.f16342P = 0;
            this.f16343Q = 0;
            Notification notification = new Notification();
            this.f16345S = notification;
            this.f16349a = context;
            this.f16338L = str;
            notification.when = System.currentTimeMillis();
            this.f16345S.audioStreamType = -1;
            this.f16362n = 0;
            this.f16348V = new ArrayList();
            this.f16344R = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void p(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f16345S;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f16345S;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(f fVar) {
            if (this.f16365q != fVar) {
                this.f16365q = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e B(CharSequence charSequence) {
            this.f16366r = f(charSequence);
            return this;
        }

        public e C(CharSequence charSequence) {
            this.f16345S.tickerText = f(charSequence);
            return this;
        }

        public e D(long[] jArr) {
            this.f16345S.vibrate = jArr;
            return this;
        }

        public e E(int i10) {
            this.f16333G = i10;
            return this;
        }

        public e F(long j10) {
            this.f16345S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f16350b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f16350b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f16331E;
                if (bundle2 == null) {
                    this.f16331E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Notification d() {
            return new m(this).c();
        }

        public Bundle e() {
            if (this.f16331E == null) {
                this.f16331E = new Bundle();
            }
            return this.f16331E;
        }

        public e g(boolean z10) {
            p(16, z10);
            return this;
        }

        public e h(String str) {
            this.f16338L = str;
            return this;
        }

        public e i(int i10) {
            this.f16332F = i10;
            return this;
        }

        public e j(PendingIntent pendingIntent) {
            this.f16356h = pendingIntent;
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f16354f = f(charSequence);
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f16353e = f(charSequence);
            return this;
        }

        public e m(int i10) {
            Notification notification = this.f16345S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f16345S.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bundle bundle) {
            this.f16331E = bundle;
            return this;
        }

        public e q(Bitmap bitmap) {
            this.f16359k = bitmap == null ? null : IconCompat.b(l.g(this.f16349a, bitmap));
            return this;
        }

        public e r(int i10, int i11, int i12) {
            Notification notification = this.f16345S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e s(boolean z10) {
            this.f16327A = z10;
            return this;
        }

        public e t(int i10) {
            this.f16361m = i10;
            return this;
        }

        public e u(boolean z10) {
            p(2, z10);
            return this;
        }

        public e v(int i10) {
            this.f16362n = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f16363o = z10;
            return this;
        }

        public e x(boolean z10) {
            this.f16346T = z10;
            return this;
        }

        public e y(int i10) {
            this.f16345S.icon = i10;
            return this;
        }

        public e z(Uri uri) {
            Notification notification = this.f16345S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f16345S.audioAttributes = a.a(builderD);
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}

package G0;

import com.facebook.react.views.text.TextAttributeProps;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2175a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f2176b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f2177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f2178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f2179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f2180f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f2181b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f2182a;

        private a(boolean z10) {
            this.f2182a = z10;
        }

        @Override // G0.n.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = n.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f2182a) {
                        return 1;
                    }
                } else if (this.f2182a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f2182a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f2183a = new b();

        private b() {
        }

        @Override // G0.n.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = n.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class d implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f2184a;

        d(c cVar) {
            this.f2184a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f2184a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // G0.m
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f2184a == null ? a() : b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2185b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f2185b = z10;
        }

        @Override // G0.n.d
        protected boolean a() {
            return this.f2185b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f2186b = new f();

        f() {
            super(null);
        }

        @Override // G0.n.d
        protected boolean a() {
            return o.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2183a;
        f2177c = new e(bVar, false);
        f2178d = new e(bVar, true);
        f2179e = new e(a.f2181b, false);
        f2180f = f.f2186b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}

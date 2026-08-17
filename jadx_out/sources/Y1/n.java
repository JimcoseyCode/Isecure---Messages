package y1;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f33915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f33916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f33917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f33918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f33919h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f33920a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f33921b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f33922c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33923a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f33923a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33923a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33923a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33923a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f33924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f33926c;

        public b(c cVar) {
            this.f33924a = cVar;
        }

        @Override // y1.m
        public void a() {
            this.f33924a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f33925b = i10;
            this.f33926c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f33925b == bVar.f33925b && Q1.l.e(this.f33926c, bVar.f33926c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f33925b * 31;
            Bitmap.Config config = this.f33926c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f33925b, this.f33926c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c extends y1.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f33915d = configArr;
        f33916e = configArr;
        f33917f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f33918g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f33919h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f33920a.e(i10, config);
        Bitmap.Config[] configArrI = i(config);
        int length = configArrI.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Bitmap.Config config2 = configArrI[i11];
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num == null || num.intValue() > i10 * 8) {
                i11++;
            } else if (num.intValue() != i10 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f33920a.c(bVarE);
                return this.f33920a.e(num.intValue(), config2);
            }
        }
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f33916e;
        }
        int i10 = a.f33923a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f33919h : f33918g : f33917f : f33915d;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f33922c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f33922c.put(config, treeMap);
        return treeMap;
    }

    @Override // y1.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(Q1.l.h(i10, i11, config), config);
    }

    @Override // y1.l
    public int b(Bitmap bitmap) {
        return Q1.l.i(bitmap);
    }

    @Override // y1.l
    public void c(Bitmap bitmap) {
        b bVarE = this.f33920a.e(Q1.l.i(bitmap), bitmap.getConfig());
        this.f33921b.d(bVarE, bitmap);
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f33925b));
        navigableMapJ.put(Integer.valueOf(bVarE.f33925b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // y1.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(Q1.l.h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f33921b.a(bVarG);
        if (bitmap != null) {
            f(Integer.valueOf(bVarG.f33925b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // y1.l
    public String e(Bitmap bitmap) {
        return h(Q1.l.i(bitmap), bitmap.getConfig());
    }

    @Override // y1.l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f33921b.f();
        if (bitmap != null) {
            f(Integer.valueOf(Q1.l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f33921b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f33922c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f33922c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        sb.append(")}");
        return sb.toString();
    }
}

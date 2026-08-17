package h0;

import F.InterfaceC0515w0;
import H0.g;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.C3563H;

/* JADX INFO: renamed from: h0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2688b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f28251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f28252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f28253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f28254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f28255e;

    static {
        HashMap map = new HashMap();
        f28251a = map;
        HashMap map2 = new HashMap();
        f28252b = map2;
        HashMap map3 = new HashMap();
        f28253c = map3;
        HashMap map4 = new HashMap();
        f28254d = map4;
        HashMap map5 = new HashMap();
        f28255e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C3563H c3563h = C3563H.f33650d;
        map6.put(c3563h, 1);
        C3563H c3563h2 = C3563H.f33652f;
        map6.put(c3563h2, 2);
        C3563H c3563h3 = C3563H.f33653g;
        map6.put(c3563h3, 4096);
        C3563H c3563h4 = C3563H.f33654h;
        map6.put(c3563h4, 8192);
        HashMap map7 = new HashMap();
        map7.put(c3563h, 1);
        map7.put(c3563h2, 2);
        map7.put(c3563h3, 4096);
        map7.put(c3563h4, 8192);
        HashMap map8 = new HashMap();
        map8.put(c3563h, 1);
        map8.put(c3563h2, 4);
        map8.put(c3563h3, 4096);
        map8.put(c3563h4, 16384);
        HashMap map9 = new HashMap();
        map9.put(C3563H.f33655i, 256);
        map9.put(C3563H.f33656j, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING));
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static int a(String str, C3563H c3563h) {
        Integer num;
        Map map = (Map) f28255e.get(str);
        if (map == null || (num = (Integer) map.get(c3563h)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set b(C3563H c3563h) {
        Set set = (Set) f28251a.get(Integer.valueOf(c3563h.a()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static Set c(C3563H c3563h) {
        Set set = (Set) f28252b.get(Integer.valueOf(c3563h.b()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    private static boolean d(int i10, C3563H c3563h) {
        Set set = (Set) f28251a.get(Integer.valueOf(c3563h.a()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    private static boolean e(int i10, C3563H c3563h) {
        Set set = (Set) f28252b.get(Integer.valueOf(c3563h.b()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean f(InterfaceC0515w0.c cVar, C3563H c3563h) {
        return d(cVar.b(), c3563h) && e(cVar.g(), c3563h);
    }

    public static int g(int i10) {
        Map map = f28253c;
        g.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = (Integer) map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i10) {
        Map map = f28254d;
        g.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = (Integer) map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

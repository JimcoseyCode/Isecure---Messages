package t;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y.C3563H;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3344d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f32435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f32436b;

    static {
        HashMap map = new HashMap();
        f32435a = map;
        HashMap map2 = new HashMap();
        f32436b = map2;
        C3563H c3563h = C3563H.f33650d;
        map.put(1L, c3563h);
        map2.put(c3563h, Collections.singletonList(1L));
        map.put(2L, C3563H.f33652f);
        map2.put((C3563H) map.get(2L), Collections.singletonList(2L));
        C3563H c3563h2 = C3563H.f33653g;
        map.put(4L, c3563h2);
        map2.put(c3563h2, Collections.singletonList(4L));
        C3563H c3563h3 = C3563H.f33654h;
        map.put(8L, c3563h3);
        map2.put(c3563h3, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            f32435a.put((Long) it.next(), C3563H.f33655i);
        }
        f32436b.put(C3563H.f33655i, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f32435a.put((Long) it2.next(), C3563H.f33656j);
        }
        f32436b.put(C3563H.f33656j, listAsList2);
    }

    public static Long a(C3563H c3563h, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f32436b.get(c3563h);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static C3563H b(long j10) {
        return (C3563H) f32435a.get(Long.valueOf(j10));
    }
}

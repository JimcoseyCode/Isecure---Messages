package M2;

import N2.b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7454a = new b();

    private b() {
    }

    public static final b.a a(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z10, Uri uri) {
        AbstractC2855l.g(componentAttribution, "componentAttribution");
        AbstractC2855l.g(shortcutAttribution, "shortcutAttribution");
        b.a aVar = new b.a();
        if (rect != null) {
            aVar.f7964h = rect.width();
            aVar.f7965i = rect.height();
        }
        aVar.f7966j = str;
        if (pointF != null) {
            aVar.f7967k = Float.valueOf(pointF.x);
            aVar.f7968l = Float.valueOf(pointF.y);
        }
        aVar.f7962f = obj;
        aVar.f7969m = z10;
        aVar.f7963g = uri;
        aVar.f7959c = map;
        aVar.f7960d = map3;
        aVar.f7958b = shortcutAttribution;
        aVar.f7957a = componentAttribution;
        aVar.f7961e = map2;
        return aVar;
    }
}

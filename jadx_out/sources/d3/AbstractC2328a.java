package d3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: d3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2328a implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Set f25561i = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f25562g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f25563h;

    @Override // d3.e
    public boolean F0() {
        return false;
    }

    @Override // M2.a
    public void J(String str, Object obj) {
        if (f25561i.contains(str)) {
            this.f25562g.put(str, obj);
        }
    }

    @Override // d3.e
    public p Z() {
        return o.f25593d;
    }

    @Override // d3.l, M2.a
    public Map getExtras() {
        return this.f25562g;
    }

    @Override // d3.e
    public m i() {
        if (this.f25563h == null) {
            this.f25563h = new n(getWidth(), getHeight(), l(), Z(), getExtras());
        }
        return this.f25563h;
    }

    @Override // M2.a
    public void s(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f25561i) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f25562g.put(str, obj);
            }
        }
    }
}

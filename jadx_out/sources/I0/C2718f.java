package i0;

import F.InterfaceC0471b1;
import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import F.L;
import F.g1;
import Z.AbstractC1582v;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: i0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2718f implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f28662f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0513v0 f28663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L f28664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g1 f28665e;

    static {
        HashMap map = new HashMap();
        f28662f = map;
        map.put(1, AbstractC1582v.f13488f);
        map.put(8, AbstractC1582v.f13486d);
        map.put(6, AbstractC1582v.f13485c);
        map.put(5, AbstractC1582v.f13484b);
        map.put(4, AbstractC1582v.f13483a);
        map.put(0, AbstractC1582v.f13487e);
    }

    public C2718f(InterfaceC0513v0 interfaceC0513v0, L l10, g1 g1Var) {
        this.f28663c = interfaceC0513v0;
        this.f28664d = l10;
        this.f28665e = g1Var;
    }

    private boolean c(int i10) {
        AbstractC1582v abstractC1582v = (AbstractC1582v) f28662f.get(Integer.valueOf(i10));
        if (abstractC1582v == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f28665e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.f(this.f28664d, abstractC1582v) && !d(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(InterfaceC0471b1 interfaceC0471b1) {
        return (interfaceC0471b1 instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) interfaceC0471b1).a();
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return this.f28663c.a(i10) && c(i10);
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        if (a(i10)) {
            return this.f28663c.b(i10);
        }
        return null;
    }
}

package f0;

import F.InterfaceC0515w0;
import F.v1;
import Z.r;
import Z.z0;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f0.AbstractC2593p;
import g0.q0;
import g0.r0;
import h0.AbstractC2688b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.AbstractC3583h0;
import y.C3563H;
import y.I0;

/* JADX INFO: renamed from: f0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2590m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f27194a;

    static {
        HashMap map = new HashMap();
        f27194a = map;
        HashMap map2 = new HashMap();
        r0 r0Var = r0.f28081a;
        map2.put(1, r0Var);
        r0 r0Var2 = r0.f28084d;
        map2.put(2, r0Var2);
        r0 r0Var3 = r0.f28085e;
        map2.put(4096, r0Var3);
        map2.put(8192, r0Var3);
        HashMap map3 = new HashMap();
        map3.put(1, r0Var);
        map3.put(2, r0Var2);
        map3.put(4096, r0Var3);
        map3.put(8192, r0Var3);
        HashMap map4 = new HashMap();
        map4.put(1, r0Var);
        map4.put(4, r0Var2);
        map4.put(4096, r0Var3);
        map4.put(16384, r0Var3);
        map4.put(2, r0Var);
        map4.put(8, r0Var2);
        map4.put(8192, r0Var3);
        map4.put(32768, r0Var3);
        HashMap map5 = new HashMap();
        map5.put(256, r0Var2);
        map5.put(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING), r0.f28082b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    private static String a(C3563H c3563h) {
        int iB = c3563h.b();
        if (iB == 1) {
            return "video/avc";
        }
        if (iB == 3 || iB == 4 || iB == 5) {
            return "video/hevc";
        }
        if (iB == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + c3563h + "\nNo supported default mime type available.");
    }

    public static r0 b(String str, int i10) {
        r0 r0Var;
        Map map = (Map) f27194a.get(str);
        if (map != null && (r0Var = (r0) map.get(Integer.valueOf(i10))) != null) {
            return r0Var;
        }
        AbstractC3583h0.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i10)));
        return r0.f28081a;
    }

    static C2587j c(z0 z0Var, Range range) {
        Range range2 = I0.f33661q;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int iD = z0Var.d() != 0 ? z0Var.d() : iIntValue;
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iD);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        AbstractC3583h0.a("VideoConfigUtil", String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj));
        return new C2587j(iIntValue, iD);
    }

    public static q0 d(AbstractC2593p abstractC2593p, v1 v1Var, z0 z0Var, Size size, C3563H c3563h, Range range) {
        InterfaceC0515w0.c cVarD = abstractC2593p.d();
        return (q0) (cVarD != null ? new C2592o(abstractC2593p.a(), v1Var, z0Var, size, cVarD, c3563h, range) : new C2591n(abstractC2593p.a(), v1Var, z0Var, size, c3563h, range)).get();
    }

    public static AbstractC2593p e(r rVar, C3563H c3563h, b0.i iVar) {
        H0.g.j(c3563h.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c3563h + "]");
        String strH = r.h(rVar.c());
        if (iVar != null) {
            Set setC = AbstractC2688b.c(c3563h);
            Set setB = AbstractC2688b.b(c3563h);
            for (InterfaceC0515w0.c cVar : iVar.d()) {
                if (setC.contains(Integer.valueOf(cVar.g())) && setB.contains(Integer.valueOf(cVar.b()))) {
                    String strI = cVar.i();
                    if (Objects.equals(strH, strI)) {
                        AbstractC3583h0.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strH + "]");
                    } else if (rVar.c() == -1) {
                        AbstractC3583h0.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strH + ", dynamic range: " + c3563h + "]");
                    }
                    strH = strI;
                    break;
                }
            }
            cVar = null;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            if (rVar.c() == -1) {
                strH = a(c3563h);
            }
            if (iVar == null) {
                AbstractC3583h0.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strH + ", dynamic range: " + c3563h + "]");
            } else {
                AbstractC3583h0.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strH + ", dynamic range: " + c3563h + "]");
            }
        }
        AbstractC2593p.a aVarC = AbstractC2593p.c(strH);
        if (cVar != null) {
            aVarC.c(cVar);
        }
        return aVarC.b();
    }

    public static int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Range range) {
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue() * new Rational(i15, i16).doubleValue() * new Rational(i17, i18).doubleValue());
        String str = AbstractC3583h0.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(iDoubleValue)) : PointerEventHelper.POINTER_TYPE_UNKNOWN;
        if (!z0.f13529a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (AbstractC3583h0.f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        AbstractC3583h0.a("VideoConfigUtil", str);
        return iDoubleValue;
    }

    public static q0 g(q0 q0Var, boolean z10) {
        if (q0Var.g() != r0.f28081a) {
            return q0Var;
        }
        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(MediaCodecDefaultDataSpaceQuirk.class);
        if (!z10 || mediaCodecDefaultDataSpaceQuirk == null) {
            return q0Var;
        }
        return q0Var.l().e(mediaCodecDefaultDataSpaceQuirk.g()).a();
    }
}

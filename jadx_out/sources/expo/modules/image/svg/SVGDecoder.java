package expo.modules.image.svg;

import D1.m;
import U1.g;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v1.h;
import v1.j;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/image/svg/SVGDecoder;", "Lv1/j;", "Ljava/io/InputStream;", "LU1/g;", "<init>", "()V", "source", "Lv1/h;", "options", PointerEventHelper.POINTER_TYPE_UNKNOWN, "handles", "(Ljava/io/InputStream;Lv1/h;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Lx1/v;", "decode", "(Ljava/io/InputStream;IILv1/h;)Lx1/v;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SVGDecoder implements j {
    @Override // v1.j
    public boolean handles(InputStream source, h options) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(options, "options");
        return true;
    }

    @Override // v1.j
    public v decode(InputStream source, int width, int height, h options) throws IOException {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(options, "options");
        try {
            g gVarL = g.l(source);
            AbstractC2855l.f(gVarL, "getFromInputStream(...)");
            if (gVarL.g() == null) {
                float fH = gVarL.h();
                float f10 = gVarL.f();
                if (fH != -1.0f && f10 != -1.0f) {
                    gVarL.u(0.0f, 0.0f, fH, f10);
                }
            }
            gVarL.v(width);
            gVarL.t(height);
            return new m(gVarL);
        } catch (U1.j e10) {
            throw new IOException("Cannot load SVG from stream", e10);
        }
    }
}

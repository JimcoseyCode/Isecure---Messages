package I3;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a(Reader reader) {
        try {
            return AvifDecoder.isAvifImage((reader instanceof J3.a ? (J3.a) reader : new J3.a(reader)).a());
        } catch (IOException unused) {
            return false;
        }
    }
}

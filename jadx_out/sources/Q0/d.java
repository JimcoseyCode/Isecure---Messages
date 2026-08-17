package Q0;

import N0.C1304d;
import androidx.datastore.preferences.protobuf.C1728v;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8991a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) throws C1304d {
            AbstractC2855l.g(input, "input");
            try {
                f fVarU = f.U(input);
                AbstractC2855l.f(fVarU, "{\n                Prefer…From(input)\n            }");
                return fVarU;
            } catch (C1728v e10) {
                throw new C1304d("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}

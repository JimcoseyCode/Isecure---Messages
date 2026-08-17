package R8;

import R8.AbstractC1430q0;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.AbstractC2982b;
import n7.j;

/* JADX INFO: renamed from: R8.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1430q0 extends J implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10215i = new a(null);

    /* JADX INFO: renamed from: R8.q0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2982b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC1430q0 d(j.b bVar) {
            if (bVar instanceof AbstractC1430q0) {
                return (AbstractC1430q0) bVar;
            }
            return null;
        }

        private a() {
            super(J.f10140h, new Function1() { // from class: R8.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC1430q0.a.d((j.b) obj);
                }
            });
        }
    }
}

package g8;

import h8.AbstractC2708a;
import j7.AbstractC2800q;
import j7.J;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2683a extends AbstractC2708a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0283a f28232g = new C0283a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2683a f28233h = new C2683a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2683a f28234i = new C2683a(new int[0]);

    /* JADX INFO: renamed from: g8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0283a {
        public /* synthetic */ C0283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2683a a(InputStream stream) {
            AbstractC2855l.g(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            B7.c cVar = new B7.c(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(cVar, 10));
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                ((J) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrO0 = AbstractC2800q.O0(arrayList);
            return new C2683a(Arrays.copyOf(iArrO0, iArrO0.length));
        }

        private C0283a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2683a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        AbstractC2855l.g(numbers, "numbers");
    }

    public boolean h() {
        return f(f28233h);
    }
}

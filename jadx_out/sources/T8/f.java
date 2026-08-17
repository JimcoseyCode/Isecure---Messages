package T8;

import R8.InterfaceC1421m;
import W8.E;
import W8.H;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f10671a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10672b = H.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f10673c = H.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f10674d = new E("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final E f10675e = new E("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final E f10676f = new E("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final E f10677g = new E("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final E f10678h = new E("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final E f10679i = new E("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final E f10680j = new E("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final E f10681k = new E("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final E f10682l = new E("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final E f10683m = new E("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final E f10684n = new E("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final E f10685o = new E("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final E f10686p = new E("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final E f10687q = new E("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final E f10688r = new E("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final E f10689s = new E("NO_CLOSE_CAUSE");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2853j implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f10690g = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (m) obj2);
        }

        public final m j(long j10, m mVar) {
            return f.x(j10, mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC1421m interfaceC1421m, Object obj, w7.o oVar) {
        Object objO = interfaceC1421m.o(obj, null, oVar);
        if (objO == null) {
            return false;
        }
        interfaceC1421m.q(objO);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC1421m interfaceC1421m, Object obj, w7.o oVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        return B(interfaceC1421m, obj, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final C7.g y() {
        return a.f10690g;
    }

    public static final E z() {
        return f10682l;
    }
}

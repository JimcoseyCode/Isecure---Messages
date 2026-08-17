package N0;

import i7.C2735B;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7909d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f7910e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f7911f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f7912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f7913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3487a f7914c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends kotlin.jvm.internal.n implements Function1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f7915h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(File it) {
            AbstractC2855l.g(it, "it");
            return v.a(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return o.f7910e;
        }

        public final Object b() {
            return o.f7911f;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends kotlin.jvm.internal.n implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ File f7916h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f7916h = file;
        }

        public final void a() {
            b bVar = o.f7909d;
            Object objB = bVar.b();
            File file = this.f7916h;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                C2735B c2735b = C2735B.f28704a;
            }
        }

        @Override // w7.InterfaceC3487a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C2735B.f28704a;
        }
    }

    public o(A serializer, Function1 coordinatorProducer, InterfaceC3487a produceFile) {
        AbstractC2855l.g(serializer, "serializer");
        AbstractC2855l.g(coordinatorProducer, "coordinatorProducer");
        AbstractC2855l.g(produceFile, "produceFile");
        this.f7912a = serializer;
        this.f7913b = coordinatorProducer;
        this.f7914c = produceFile;
    }

    @Override // N0.E
    public F a() throws IOException {
        File file = ((File) this.f7914c.invoke()).getCanonicalFile();
        synchronized (f7911f) {
            String path = file.getAbsolutePath();
            Set set = f7910e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC2855l.f(path, "path");
            set.add(path);
        }
        AbstractC2855l.f(file, "file");
        return new p(file, this.f7912a, (t) this.f7913b.invoke(file), new c(file));
    }

    public /* synthetic */ o(A a10, Function1 function1, InterfaceC3487a interfaceC3487a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, (i10 & 2) != 0 ? a.f7915h : function1, interfaceC3487a);
    }
}

package R0;

import N0.C1310j;
import N0.E;
import N0.InterfaceC1309i;
import N0.o;
import R8.N;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.n;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f9946a = new e();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends n implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC3487a f9947h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3487a interfaceC3487a) {
            super(0);
            this.f9947h = interfaceC3487a;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f9947h.invoke();
            if (AbstractC2855l.b(t7.j.y(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                AbstractC2855l.f(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final InterfaceC1309i a(E storage, O0.b bVar, List migrations, N scope) {
        AbstractC2855l.g(storage, "storage");
        AbstractC2855l.g(migrations, "migrations");
        AbstractC2855l.g(scope, "scope");
        return new d(C1310j.f7749a.a(storage, bVar, migrations, scope));
    }

    public final InterfaceC1309i b(O0.b bVar, List migrations, N scope, InterfaceC3487a produceFile) {
        AbstractC2855l.g(migrations, "migrations");
        AbstractC2855l.g(scope, "scope");
        AbstractC2855l.g(produceFile, "produceFile");
        return new d(a(new o(h.f9949a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}

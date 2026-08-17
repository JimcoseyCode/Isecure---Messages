package P7;

import L7.w0;
import L7.x0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8849c = new a();

    private a() {
        super("package", false);
    }

    @Override // L7.x0
    public Integer a(x0 visibility) {
        AbstractC2855l.g(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return w0.f7361a.b(visibility) ? 1 : -1;
    }

    @Override // L7.x0
    public String b() {
        return "public/*package*/";
    }

    @Override // L7.x0
    public x0 d() {
        return w0.g.f7370c;
    }
}

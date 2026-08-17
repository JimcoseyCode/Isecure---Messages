package P7;

import L7.w0;
import L7.x0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8850c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // L7.x0
    public Integer a(x0 visibility) {
        AbstractC2855l.g(visibility, "visibility");
        if (AbstractC2855l.b(this, visibility)) {
            return 0;
        }
        if (visibility == w0.b.f7365c) {
            return null;
        }
        return w0.f7361a.b(visibility) ? 1 : -1;
    }

    @Override // L7.x0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // L7.x0
    public x0 d() {
        return w0.g.f7370c;
    }
}

package M7;

import C8.S;
import L7.h0;
import M7.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f7549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f7551c;

    public d(S s10, Map map, h0 h0Var) {
        if (s10 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (h0Var == null) {
            b(2);
        }
        this.f7549a = s10;
        this.f7550b = map;
        this.f7551c = h0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // M7.c
    public Map a() {
        Map map = this.f7550b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // M7.c
    public k8.c d() {
        return c.a.a(this);
    }

    @Override // M7.c
    public h0 g() {
        h0 h0Var = this.f7551c;
        if (h0Var == null) {
            b(5);
        }
        return h0Var;
    }

    @Override // M7.c
    public S getType() {
        S s10 = this.f7549a;
        if (s10 == null) {
            b(3);
        }
        return s10;
    }

    public String toString() {
        return n8.n.f30122h.P(this, null);
    }
}

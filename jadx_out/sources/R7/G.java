package R7;

import b8.InterfaceC1814B;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class G extends u implements InterfaceC1814B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f10054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation[] f10055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10057d;

    public G(E type, Annotation[] reflectAnnotations, String str, boolean z10) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(reflectAnnotations, "reflectAnnotations");
        this.f10054a = type;
        this.f10055b = reflectAnnotations;
        this.f10056c = str;
        this.f10057d = z10;
    }

    @Override // b8.InterfaceC1814B
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public E getType() {
        return this.f10054a;
    }

    @Override // b8.InterfaceC1814B
    public boolean a() {
        return this.f10057d;
    }

    @Override // b8.InterfaceC1814B
    public k8.f getName() {
        String str = this.f10056c;
        if (str != null) {
            return k8.f.p(str);
        }
        return null;
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(G.class.getName());
        sb.append(": ");
        sb.append(a() ? "vararg " : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }

    @Override // b8.InterfaceC1820d
    public C1395g b(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return k.a(this.f10055b, fqName);
    }

    @Override // b8.InterfaceC1820d
    public List getAnnotations() {
        return k.b(this.f10055b);
    }
}

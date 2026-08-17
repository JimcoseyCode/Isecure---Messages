package n8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.N;
import L7.m0;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;

/* JADX INFO: renamed from: n8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2987b {

    /* JADX INFO: renamed from: n8.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC2987b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30101a = new a();

        private a() {
        }

        @Override // n8.InterfaceC2987b
        public String a(InterfaceC1283h classifier, n renderer) {
            AbstractC2855l.g(classifier, "classifier");
            AbstractC2855l.g(renderer, "renderer");
            if (classifier instanceof m0) {
                k8.f name = ((m0) classifier).getName();
                AbstractC2855l.f(name, "getName(...)");
                return renderer.T(name, false);
            }
            k8.d dVarM = AbstractC3027i.m(classifier);
            AbstractC2855l.f(dVarM, "getFqName(...)");
            return renderer.S(dVarM);
        }
    }

    /* JADX INFO: renamed from: n8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0325b implements InterfaceC2987b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0325b f30102a = new C0325b();

        private C0325b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [L7.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [L7.J, L7.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [L7.m] */
        @Override // n8.InterfaceC2987b
        public String a(InterfaceC1283h classifier, n renderer) {
            AbstractC2855l.g(classifier, "classifier");
            AbstractC2855l.g(renderer, "renderer");
            if (classifier instanceof m0) {
                k8.f name = ((m0) classifier).getName();
                AbstractC2855l.f(name, "getName(...)");
                return renderer.T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof InterfaceC1280e);
            return G.c(AbstractC2800q.O(arrayList));
        }
    }

    /* JADX INFO: renamed from: n8.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements InterfaceC2987b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30103a = new c();

        private c() {
        }

        private final String b(InterfaceC1283h interfaceC1283h) {
            k8.f name = interfaceC1283h.getName();
            AbstractC2855l.f(name, "getName(...)");
            String strB = G.b(name);
            if (interfaceC1283h instanceof m0) {
                return strB;
            }
            InterfaceC1288m interfaceC1288mB = interfaceC1283h.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            String strC = c(interfaceC1288mB);
            if (strC == null || AbstractC2855l.b(strC, PointerEventHelper.POINTER_TYPE_UNKNOWN)) {
                return strB;
            }
            return strC + '.' + strB;
        }

        private final String c(InterfaceC1288m interfaceC1288m) {
            if (interfaceC1288m instanceof InterfaceC1280e) {
                return b((InterfaceC1283h) interfaceC1288m);
            }
            if (!(interfaceC1288m instanceof N)) {
                return null;
            }
            k8.d dVarJ = ((N) interfaceC1288m).d().j();
            AbstractC2855l.f(dVarJ, "toUnsafe(...)");
            return G.a(dVarJ);
        }

        @Override // n8.InterfaceC2987b
        public String a(InterfaceC1283h classifier, n renderer) {
            AbstractC2855l.g(classifier, "classifier");
            AbstractC2855l.g(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(InterfaceC1283h interfaceC1283h, n nVar);
}

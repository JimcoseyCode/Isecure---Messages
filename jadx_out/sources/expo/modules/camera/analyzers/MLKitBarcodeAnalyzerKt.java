package expo.modules.camera.analyzers;

import P4.AbstractC1378l;
import P4.InterfaceC1371e;
import P4.InterfaceC1373g;
import P4.InterfaceC1374h;
import R8.C1425o;
import R8.InterfaceC1421m;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import n7.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "LP4/l;", "await", "(LP4/l;Ln7/f;)Ljava/lang/Object;", "expo-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MLKitBarcodeAnalyzerKt {
    public static final <T> Object await(AbstractC1378l abstractC1378l, f fVar) {
        final C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        final Function1 function1 = new Function1() { // from class: expo.modules.camera.analyzers.MLKitBarcodeAnalyzerKt$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m26invoke(obj);
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m26invoke(T t10) {
                c1425o.resumeWith(C2752o.b(t10));
            }
        };
        abstractC1378l.g(new InterfaceC1374h(function1) { // from class: expo.modules.camera.analyzers.MLKitBarcodeAnalyzerKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ Function1 function;

            {
                AbstractC2855l.g(function1, "function");
                this.function = function1;
            }

            @Override // P4.InterfaceC1374h
            public final /* synthetic */ void onSuccess(Object obj) {
                this.function.invoke(obj);
            }
        });
        abstractC1378l.e(new InterfaceC1373g() { // from class: expo.modules.camera.analyzers.MLKitBarcodeAnalyzerKt$await$2$2
            @Override // P4.InterfaceC1373g
            public final void onFailure(Exception exception) {
                AbstractC2855l.g(exception, "exception");
                InterfaceC1421m interfaceC1421m = c1425o;
                C2752o.a aVar = C2752o.f28721h;
                interfaceC1421m.resumeWith(C2752o.b(AbstractC2753p.a(exception)));
            }
        });
        abstractC1378l.a(new InterfaceC1371e() { // from class: expo.modules.camera.analyzers.MLKitBarcodeAnalyzerKt$await$2$3
            @Override // P4.InterfaceC1371e
            public final void onCanceled() {
                InterfaceC1421m.a.a(c1425o, null, 1, null);
            }
        });
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objZ;
    }
}

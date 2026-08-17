package expo.modules.camera;

import R8.N;
import android.graphics.Bitmap;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.analyzers.BarCodeScannerResultSerializer;
import expo.modules.camera.analyzers.MLKitBarCodeScanner;
import expo.modules.camera.utils.BarCodeScannerResult;
import expo.modules.kotlin.Promise;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.camera.CameraViewModule$definition$1$7$1$onSuccess$1", f = "CameraViewModule.kt", l = {130}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class CameraViewModule$definition$1$7$1$onSuccess$1 extends kotlin.coroutines.jvm.internal.l implements Function2 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ List<Integer> $formats;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ MLKitBarCodeScanner $scanner;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraViewModule$definition$1$7$1$onSuccess$1(MLKitBarCodeScanner mLKitBarCodeScanner, Bitmap bitmap, Promise promise, List<Integer> list, n7.f fVar) {
        super(2, fVar);
        this.$scanner = mLKitBarCodeScanner;
        this.$bitmap = bitmap;
        this.$promise = promise;
        this.$formats = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new CameraViewModule$definition$1$7$1$onSuccess$1(this.$scanner, this.$bitmap, this.$promise, this.$formats, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((CameraViewModule$definition$1$7$1$onSuccess$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                MLKitBarCodeScanner mLKitBarCodeScanner = this.$scanner;
                Bitmap bitmap = this.$bitmap;
                this.label = 1;
                obj = mLKitBarCodeScanner.scan(bitmap, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            List<Integer> list = this.$formats;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (list.contains(kotlin.coroutines.jvm.internal.b.c(((BarCodeScannerResult) obj2).getType()))) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(BarCodeScannerResultSerializer.INSTANCE.toBundle((BarCodeScannerResult) it.next(), 1.0f));
            }
            this.$promise.resolve((Collection<? extends Object>) arrayList2);
        } catch (Exception e10) {
            CameraViewModule.INSTANCE.getTAG$expo_camera_release();
            e10.getMessage();
            this.$promise.reject(new CameraExceptions.MLKitUnavailableException());
        }
        return C2735B.f28704a;
    }
}

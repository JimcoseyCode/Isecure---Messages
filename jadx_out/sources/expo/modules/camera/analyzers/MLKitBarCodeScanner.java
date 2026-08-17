package expo.modules.camera.analyzers;

import P4.AbstractC1378l;
import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.graphics.Bitmap;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e6.AbstractC2429c;
import e6.C2428b;
import e6.InterfaceC2427a;
import f6.C2615a;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k6.C2831a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "newBarCodeTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "areNewAndOldBarCodeTypesEqual", "(Ljava/util/List;)Z", "Landroid/graphics/Bitmap;", "bitmap", "Lexpo/modules/camera/utils/BarCodeScannerResult;", "scan", "(Landroid/graphics/Bitmap;Ln7/f;)Ljava/lang/Object;", "formats", "Li7/B;", "setSettings", "(Ljava/util/List;)V", "barCodeTypes", "Ljava/util/List;", "Le6/b;", "barcodeScannerOptions", "Le6/b;", "Le6/a;", "barcodeScanner", "Le6/a;", "Companion", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MLKitBarCodeScanner {
    private static final String TAG = MLKitBarCodeScanner.class.getSimpleName();
    private List<Integer> barCodeTypes;
    private InterfaceC2427a barcodeScanner;
    private C2428b barcodeScannerOptions;

    /* JADX INFO: renamed from: expo.modules.camera.analyzers.MLKitBarCodeScanner$scan$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.camera.analyzers.MLKitBarCodeScanner$scan$2", f = "MLKitBarcodeAnalyzer.kt", l = {OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/camera/utils/BarCodeScannerResult;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Bitmap $bitmap;
        Object L$0;
        int label;
        final /* synthetic */ MLKitBarCodeScanner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Bitmap bitmap, MLKitBarCodeScanner mLKitBarCodeScanner, n7.f fVar) {
            super(2, fVar);
            this.$bitmap = bitmap;
            this.this$0 = mLKitBarCodeScanner;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass2(this.$bitmap, this.this$0, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C2831a c2831a;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    C2831a c2831aA = C2831a.a(this.$bitmap, 0);
                    AbstractC2855l.f(c2831aA, "fromBitmap(...)");
                    AbstractC1378l abstractC1378lS0 = this.this$0.barcodeScanner.s0(c2831aA);
                    AbstractC2855l.f(abstractC1378lS0, "process(...)");
                    this.L$0 = c2831aA;
                    this.label = 1;
                    Object objAwait = MLKitBarcodeAnalyzerKt.await(abstractC1378lS0, this);
                    if (objAwait == objE) {
                        return objE;
                    }
                    c2831a = c2831aA;
                    obj = objAwait;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2831a = (C2831a) this.L$0;
                    AbstractC2753p.b(obj);
                }
                AbstractC2855l.f(obj, "await(...)");
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(BarCodeScannerResultSerializer.INSTANCE.parseBarcodeScanningResult((C2615a) it.next(), c2831a));
                    }
                }
                return arrayList;
            } catch (Exception e10) {
                String unused = MLKitBarCodeScanner.TAG;
                e10.getMessage();
                return AbstractC2800q.j();
            }
        }
    }

    public MLKitBarCodeScanner() {
        C2428b c2428bA = new C2428b.a().b(0, new int[0]).a();
        AbstractC2855l.f(c2428bA, "build(...)");
        this.barcodeScannerOptions = c2428bA;
        InterfaceC2427a interfaceC2427aA = AbstractC2429c.a(c2428bA);
        AbstractC2855l.f(interfaceC2427aA, "getClient(...)");
        this.barcodeScanner = interfaceC2427aA;
    }

    private final boolean areNewAndOldBarCodeTypesEqual(List<Integer> newBarCodeTypes) {
        List<Integer> list = this.barCodeTypes;
        if (list == null) {
            return false;
        }
        HashSet hashSetN0 = AbstractC2800q.N0(list);
        HashSet hashSetN02 = AbstractC2800q.N0(newBarCodeTypes);
        if (hashSetN0.size() != hashSetN02.size()) {
            return false;
        }
        hashSetN0.removeAll(hashSetN02);
        return hashSetN0.isEmpty();
    }

    public final Object scan(Bitmap bitmap, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(bitmap, this, null), fVar);
    }

    public final void setSettings(List<Integer> formats) {
        AbstractC2855l.g(formats, "formats");
        if (areNewAndOldBarCodeTypesEqual(formats)) {
            return;
        }
        Iterator<T> it = formats.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
        }
        int iIntValue = ((Number) next).intValue();
        this.barCodeTypes = formats;
        C2428b c2428bA = new C2428b.a().b(iIntValue, new int[0]).a();
        AbstractC2855l.f(c2428bA, "build(...)");
        this.barcodeScannerOptions = c2428bA;
        InterfaceC2427a interfaceC2427aA = AbstractC2429c.a(c2428bA);
        AbstractC2855l.f(interfaceC2427aA, "getClient(...)");
        this.barcodeScanner = interfaceC2427aA;
    }
}

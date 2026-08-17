package expo.modules.camera.analyzers;

import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import P4.InterfaceC1373g;
import P4.InterfaceC1374h;
import P8.C1385d;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e6.AbstractC2429c;
import e6.C2428b;
import e6.InterfaceC2427a;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.utils.BarCodeScannerResult;
import f6.C2615a;
import i7.C2735B;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.C2831a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/camera/analyzers/BarcodeAnalyzer;", "Landroidx/camera/core/g$a;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/camera/records/BarcodeType;", "formats", "Lkotlin/Function1;", "Lexpo/modules/camera/utils/BarCodeScannerResult;", "Li7/B;", "onComplete", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/core/o;", "imageProxy", "analyze", "(Landroidx/camera/core/o;)V", "Lkotlin/jvm/functions/Function1;", "getOnComplete", "()Lkotlin/jvm/functions/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "barcodeFormats", "I", "Le6/b;", "barcodeScannerOptions", "Le6/b;", "Le6/a;", "barcodeScanner", "Le6/a;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BarcodeAnalyzer implements g.a {
    private final int barcodeFormats;
    private InterfaceC2427a barcodeScanner;
    private C2428b barcodeScannerOptions;
    private final Function1 onComplete;

    public BarcodeAnalyzer(List<? extends BarcodeType> formats, Function1 onComplete) {
        int iIntValue;
        AbstractC2855l.g(formats, "formats");
        AbstractC2855l.g(onComplete, "onComplete");
        this.onComplete = onComplete;
        if (formats.isEmpty()) {
            iIntValue = 0;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(formats, 10));
            Iterator<T> it = formats.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) it2.next()).intValue());
            }
            iIntValue = ((Number) next).intValue();
        }
        this.barcodeFormats = iIntValue;
        C2428b c2428bA = new C2428b.a().b(iIntValue, new int[0]).a();
        AbstractC2855l.f(c2428bA, "build(...)");
        this.barcodeScannerOptions = c2428bA;
        InterfaceC2427a interfaceC2427aA = AbstractC2429c.a(c2428bA);
        AbstractC2855l.f(interfaceC2427aA, "getClient(...)");
        this.barcodeScanner = interfaceC2427aA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2735B analyze$lambda$6(BarcodeAnalyzer barcodeAnalyzer, int i10, int i11, List list) {
        String str;
        List arrayList;
        if (list.isEmpty()) {
            return C2735B.f28704a;
        }
        AbstractC2855l.d(list);
        C2615a c2615a = (C2615a) AbstractC2800q.e0(list);
        String strK = c2615a.k();
        if (strK != null) {
            str = strK;
        } else {
            byte[] bArrJ = c2615a.j();
            if (bArrJ != null) {
                str = new String(bArrJ, C1385d.f8858b);
            } else {
                strK = null;
                str = strK;
            }
        }
        Point[] pointArrC = c2615a.c();
        if (pointArrC != null) {
            int[] iArr = new int[pointArrC.length * 2];
            int length = pointArrC.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                Point point = pointArrC[i12];
                int i14 = i13 + 1;
                int i15 = i13 * 2;
                iArr[i15] = point.x;
                iArr[i15 + 1] = point.y;
                i12++;
                i13 = i14;
            }
            arrayList = AbstractC2793j.C0(iArr);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        List list2 = arrayList;
        BarCodeScannerResultSerializer barCodeScannerResultSerializer = BarCodeScannerResultSerializer.INSTANCE;
        AbstractC2855l.d(c2615a);
        barcodeAnalyzer.onComplete.invoke(new BarCodeScannerResult(c2615a.g(), c2615a.d(), str, barCodeScannerResultSerializer.parseExtraDate(c2615a), list2, i10, i11));
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$8(Exception it) {
        AbstractC2855l.g(it, "it");
        Throwable cause = it.getCause();
        if (cause != null) {
            cause.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$9(o oVar, AbstractC1378l it) {
        AbstractC2855l.g(it, "it");
        oVar.close();
    }

    @Override // androidx.camera.core.g.a
    public void analyze(final o imageProxy) {
        AbstractC2855l.g(imageProxy, "imageProxy");
        Image imageP0 = imageProxy.p0();
        if (imageP0 != null) {
            int iE = imageProxy.i().e();
            C2831a c2831aB = C2831a.b(imageP0, iE);
            AbstractC2855l.f(c2831aB, "fromMediaImage(...)");
            boolean z10 = iE == 90 || iE == 270;
            final int height = z10 ? imageProxy.getHeight() : imageProxy.getWidth();
            final int width = z10 ? imageProxy.getWidth() : imageProxy.getHeight();
            AbstractC1378l abstractC1378lS0 = this.barcodeScanner.s0(c2831aB);
            final Function1 function1 = new Function1() { // from class: expo.modules.camera.analyzers.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BarcodeAnalyzer.analyze$lambda$6(this.f26447g, width, height, (List) obj);
                }
            };
            abstractC1378lS0.g(new InterfaceC1374h() { // from class: expo.modules.camera.analyzers.b
                @Override // P4.InterfaceC1374h
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).e(new InterfaceC1373g() { // from class: expo.modules.camera.analyzers.c
                @Override // P4.InterfaceC1373g
                public final void onFailure(Exception exc) {
                    BarcodeAnalyzer.analyze$lambda$8(exc);
                }
            }).c(new InterfaceC1372f() { // from class: expo.modules.camera.analyzers.d
                @Override // P4.InterfaceC1372f
                public final void onComplete(AbstractC1378l abstractC1378l) {
                    BarcodeAnalyzer.analyze$lambda$9(imageProxy, abstractC1378l);
                }
            });
        }
    }

    @Override // androidx.camera.core.g.a
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    public final Function1 getOnComplete() {
        return this.onComplete;
    }

    @Override // androidx.camera.core.g.a
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // androidx.camera.core.g.a
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}

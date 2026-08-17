package expo.modules.camera.analyzers;

import P8.C1385d;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.camera.utils.BarCodeScannerResult;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import f6.C2615a;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import k6.C2831a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import q7.AbstractC3130c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "cornerPoints", "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;", "boundingBox", PointerEventHelper.POINTER_TYPE_UNKNOWN, "density", "Landroid/util/Pair;", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "getCornerPointsAndBoundingBox", "(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;F)Landroid/util/Pair;", "width", "height", "getSize", "(FF)Landroid/os/Bundle;", "x", "y", "getPoint", "Lexpo/modules/camera/utils/BarCodeScannerResult;", "result", "toBundle", "(Lexpo/modules/camera/utils/BarCodeScannerResult;F)Landroid/os/Bundle;", "Lf6/a;", "barcode", "Lk6/a;", "inputImage", "parseBarcodeScanningResult", "(Lf6/a;Lk6/a;)Lexpo/modules/camera/utils/BarCodeScannerResult;", "parseExtraDate", "(Lf6/a;)Landroid/os/Bundle;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BarCodeScannerResultSerializer {
    public static final BarCodeScannerResultSerializer INSTANCE = new BarCodeScannerResultSerializer();

    private BarCodeScannerResultSerializer() {
    }

    private final Pair<ArrayList<Bundle>, Bundle> getCornerPointsAndBoundingBox(List<Integer> cornerPoints, BarCodeScannerResult.BoundingBox boundingBox, float density) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int iB = AbstractC3130c.b(0, cornerPoints.size() - 1, 2);
        if (iB >= 0) {
            while (true) {
                arrayList.add(getPoint(cornerPoints.get(i10).intValue() / density, cornerPoints.get(i10 + 1).intValue() / density));
                if (i10 == iB) {
                    break;
                }
                i10 += 2;
            }
        }
        Bundle bundle = new Bundle();
        BarCodeScannerResultSerializer barCodeScannerResultSerializer = INSTANCE;
        bundle.putParcelable("origin", barCodeScannerResultSerializer.getPoint(boundingBox.getX() / density, boundingBox.getY() / density));
        bundle.putParcelable("size", barCodeScannerResultSerializer.getSize(boundingBox.getWidth() / density, boundingBox.getHeight() / density));
        return new Pair<>(arrayList, bundle);
    }

    private final Bundle getPoint(float x10, float y10) {
        Bundle bundle = new Bundle();
        bundle.putFloat("x", x10);
        bundle.putFloat("y", y10);
        return bundle;
    }

    private final Bundle getSize(float width, float height) {
        Bundle bundle = new Bundle();
        bundle.putFloat("width", width);
        bundle.putFloat("height", height);
        return bundle;
    }

    public static /* synthetic */ BarCodeScannerResult parseBarcodeScanningResult$default(BarCodeScannerResultSerializer barCodeScannerResultSerializer, C2615a c2615a, C2831a c2831a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c2831a = null;
        }
        return barCodeScannerResultSerializer.parseBarcodeScanningResult(c2615a, c2831a);
    }

    public final BarCodeScannerResult parseBarcodeScanningResult(C2615a barcode, C2831a inputImage) {
        String str;
        AbstractC2855l.g(barcode, "barcode");
        String strK = barcode.k();
        if (strK != null) {
            str = strK;
        } else {
            byte[] bArrJ = barcode.j();
            if (bArrJ != null) {
                str = new String(bArrJ, C1385d.f8858b);
            } else {
                strK = null;
                str = strK;
            }
        }
        String strD = barcode.n() == 1 ? str : barcode.d();
        ArrayList arrayList = new ArrayList();
        Point[] pointArrC = barcode.c();
        if (pointArrC != null) {
            for (Point point : pointArrC) {
                arrayList.addAll(AbstractC2800q.m(Integer.valueOf(point.x), Integer.valueOf(point.y)));
            }
        }
        return new BarCodeScannerResult(barcode.g(), strD, str, parseExtraDate(barcode), arrayList, inputImage != null ? inputImage.g() : 0, inputImage != null ? inputImage.k() : 0);
    }

    public final Bundle parseExtraDate(C2615a barcode) {
        List listA;
        C2615a.C0272a c0272a;
        String[] strArrA;
        List listG;
        List listE;
        C2615a.i iVar;
        List listB;
        C2615a.f fVar;
        C2615a.h hVarC;
        C2615a.h hVarC2;
        C2615a.h hVarC3;
        C2615a.b bVarB;
        C2615a.b bVarD;
        AbstractC2855l.g(barcode, "barcode");
        Bundle bundle = new Bundle();
        int iN = barcode.n();
        String str = null;
        string = null;
        String string = null;
        str = null;
        str = null;
        str = null;
        if (iN == 1) {
            C2615a.d dVarB = barcode.b();
            bundle.putString(NotificationsService.EVENT_TYPE_KEY, "contactInfo");
            bundle.putString("firstName", (dVarB == null || (hVarC3 = dVarB.c()) == null) ? null : hVarC3.a());
            bundle.putString("middleName", (dVarB == null || (hVarC2 = dVarB.c()) == null) ? null : hVarC2.c());
            bundle.putString("lastName", (dVarB == null || (hVarC = dVarB.c()) == null) ? null : hVarC.b());
            bundle.putString(AlertFragment.ARG_TITLE, dVarB != null ? dVarB.f() : null);
            bundle.putString("organization", dVarB != null ? dVarB.d() : null);
            bundle.putString("email", (dVarB == null || (listB = dVarB.b()) == null || (fVar = (C2615a.f) AbstractC2800q.g0(listB)) == null) ? null : fVar.a());
            bundle.putString("phone", (dVarB == null || (listE = dVarB.e()) == null || (iVar = (C2615a.i) AbstractC2800q.g0(listE)) == null) ? null : iVar.a());
            bundle.putString("url", (dVarB == null || (listG = dVarB.g()) == null) ? null : (String) AbstractC2800q.g0(listG));
            if (dVarB != null && (listA = dVarB.a()) != null && (c0272a = (C2615a.C0272a) AbstractC2800q.g0(listA)) != null && (strArrA = c0272a.a()) != null) {
                str = (String) AbstractC2793j.G(strArrA);
            }
            bundle.putString("address", str);
            return bundle;
        }
        if (iN == 2) {
            C2615a.f fVarF = barcode.f();
            bundle.putString(NotificationsService.EVENT_TYPE_KEY, "email");
            bundle.putString("address", fVarF != null ? fVarF.a() : null);
            bundle.putString("subject", fVarF != null ? fVarF.c() : null);
            bundle.putString(ExpoNotificationBuilder.EXTRAS_BODY_KEY, fVarF != null ? fVarF.b() : null);
            return bundle;
        }
        if (iN == 4) {
            C2615a.i iVarI = barcode.i();
            bundle.putString(NotificationsService.EVENT_TYPE_KEY, "phone");
            bundle.putString("number", iVarI != null ? iVarI.a() : null);
            bundle.putString("phoneNumberType", String.valueOf(iVarI != null ? Integer.valueOf(iVarI.b()) : null));
            return bundle;
        }
        if (iN == 6) {
            C2615a.j jVarL = barcode.l();
            bundle.putString(NotificationsService.EVENT_TYPE_KEY, "sms");
            bundle.putString("phoneNumber", jVarL != null ? jVarL.b() : null);
            bundle.putString("message", jVarL != null ? jVarL.a() : null);
            return bundle;
        }
        switch (iN) {
            case 8:
                C2615a.k kVarM = barcode.m();
                bundle.putString(NotificationsService.EVENT_TYPE_KEY, "url");
                bundle.putString("url", kVarM != null ? kVarM.a() : null);
                break;
            case 9:
                C2615a.l lVarO = barcode.o();
                bundle.putString(NotificationsService.EVENT_TYPE_KEY, "wifi");
                bundle.putString("ssid", lVarO != null ? lVarO.c() : null);
                bundle.putString("password", lVarO != null ? lVarO.b() : null);
                bundle.putString(NotificationsService.EVENT_TYPE_KEY, String.valueOf(lVarO != null ? Integer.valueOf(lVarO.a()) : null));
                break;
            case 10:
                C2615a.g gVarH = barcode.h();
                bundle.putString(NotificationsService.EVENT_TYPE_KEY, "geoPoint");
                bundle.putString("lat", String.valueOf(gVarH != null ? Double.valueOf(gVarH.a()) : null));
                bundle.putString("lng", String.valueOf(gVarH != null ? Double.valueOf(gVarH.b()) : null));
                break;
            case 11:
                C2615a.c cVarA = barcode.a();
                bundle.putString(NotificationsService.EVENT_TYPE_KEY, "calendarEvent");
                bundle.putString("summary", cVarA != null ? cVarA.e() : null);
                bundle.putString("description", cVarA != null ? cVarA.a() : null);
                bundle.putString("location", cVarA != null ? cVarA.c() : null);
                bundle.putString(ViewProps.START, (cVarA == null || (bVarD = cVarA.d()) == null) ? null : bVarD.toString());
                if (cVarA != null && (bVarB = cVarA.b()) != null) {
                    string = bVarB.toString();
                }
                bundle.putString(ViewProps.END, string);
                break;
            case 12:
                C2615a.e eVarE = barcode.e();
                bundle.putString(NotificationsService.EVENT_TYPE_KEY, "driverLicense");
                bundle.putString("firstName", eVarE != null ? eVarE.e() : null);
                bundle.putString("middleName", eVarE != null ? eVarE.i() : null);
                bundle.putString("lastName", eVarE != null ? eVarE.g() : null);
                bundle.putString("licenseNumber", eVarE != null ? eVarE.h() : null);
                bundle.putString("expiryDate", eVarE != null ? eVarE.d() : null);
                bundle.putString("issueDate", eVarE != null ? eVarE.f() : null);
                bundle.putString("addressStreet", eVarE != null ? eVarE.c() : null);
                bundle.putString("addressCity", eVarE != null ? eVarE.a() : null);
                bundle.putString("addressState", eVarE != null ? eVarE.b() : null);
                break;
        }
        return bundle;
    }

    public final Bundle toBundle(BarCodeScannerResult result, float density) {
        AbstractC2855l.g(result, "result");
        Bundle bundle = new Bundle();
        bundle.putString("data", result.getValue());
        bundle.putString("raw", result.getRaw());
        bundle.putInt(NotificationsService.EVENT_TYPE_KEY, result.getType());
        bundle.putBundle("extra", result.getExtra());
        Pair<ArrayList<Bundle>, Bundle> cornerPointsAndBoundingBox = INSTANCE.getCornerPointsAndBoundingBox(result.getCornerPoints(), result.getBoundingBox(), density);
        bundle.putParcelableArrayList("cornerPoints", (ArrayList) cornerPointsAndBoundingBox.first);
        bundle.putBundle("bounds", (Bundle) cornerPointsAndBoundingBox.second);
        return bundle;
    }
}

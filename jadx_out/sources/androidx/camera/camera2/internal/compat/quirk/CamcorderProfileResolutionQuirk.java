package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s.E;
import s.X;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f15099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f15100b = null;

    public CamcorderProfileResolutionQuirk(E e10) {
        this.f15099a = e10.e();
    }

    static boolean h(E e10) {
        Integer num = (Integer) e10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List g() {
        if (this.f15100b == null) {
            Size[] sizeArrG = this.f15099a.g(34);
            this.f15100b = sizeArrG != null ? Arrays.asList((Size[]) sizeArrG.clone()) : Collections.EMPTY_LIST;
            AbstractC3583h0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f15100b);
        }
        return new ArrayList(this.f15100b);
    }
}

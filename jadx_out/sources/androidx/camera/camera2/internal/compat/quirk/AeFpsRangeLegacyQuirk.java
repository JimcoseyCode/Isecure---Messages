package androidx.camera.camera2.internal.compat.quirk;

import F.o1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import s.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Range f15098a;

    public AeFpsRangeLegacyQuirk(E e10) {
        this.f15098a = i((Range[]) e10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range g(Range range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / ProgressBarContainerView.MAX_PROGRESS;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / ProgressBarContainerView.MAX_PROGRESS;
        }
        return new Range(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    static boolean h(E e10) {
        Integer num = (Integer) e10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range i(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range rangeG = g(range2);
                if (((Integer) rangeG.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeG.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeG;
                }
            }
        }
        return range;
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public Range b() {
        Range range = this.f15098a;
        return range != null ? range : o1.f1588a;
    }
}

package v;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f32750b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f32751c;

    public n(String str) {
        this.f32749a = str;
        this.f32751c = new e(str);
    }

    private void a(List list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f32750b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrG = extraSupportedOutputSizeQuirk.g(i10);
        if (sizeArrG.length > 0) {
            list.addAll(Arrays.asList(sizeArrG));
        }
    }

    private void c(List list, int i10) {
        List listA = this.f32751c.a(i10);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            AbstractC3583h0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}

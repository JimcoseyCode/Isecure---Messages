package G;

import F.InterfaceC0515w0;
import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class d {
    public static InterfaceC0515w0 a(CamcorderProfile camcorderProfile) {
        return InterfaceC0515w0.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    private static List b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC0515w0.a.a(i10, InterfaceC0515w0.e(i10), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, InterfaceC0515w0.f(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC0515w0.c.a(i10, InterfaceC0515w0.g(i10), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}

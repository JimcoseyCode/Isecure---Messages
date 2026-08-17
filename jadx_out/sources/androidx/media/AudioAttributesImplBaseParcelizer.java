package androidx.media;

import androidx.versionedparcelable.a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f17653a = aVar.p(audioAttributesImplBase.f17653a, 1);
        audioAttributesImplBase.f17654b = aVar.p(audioAttributesImplBase.f17654b, 2);
        audioAttributesImplBase.f17655c = aVar.p(audioAttributesImplBase.f17655c, 3);
        audioAttributesImplBase.f17656d = aVar.p(audioAttributesImplBase.f17656d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f17653a, 1);
        aVar.F(audioAttributesImplBase.f17654b, 2);
        aVar.F(audioAttributesImplBase.f17655c, 3);
        aVar.F(audioAttributesImplBase.f17656d, 4);
    }
}

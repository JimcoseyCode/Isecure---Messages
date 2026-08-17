package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AudioAttributes f17651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f17652b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f17651a.equals(((AudioAttributesImplApi21) obj).f17651a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17651a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f17651a;
    }
}

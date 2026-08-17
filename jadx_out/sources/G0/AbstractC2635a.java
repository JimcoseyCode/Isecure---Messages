package g0;

import F.v1;
import android.media.MediaFormat;
import g0.C2637c;
import java.util.Objects;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2635a implements InterfaceC2648n {

    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0281a {
        AbstractC0281a() {
        }

        abstract AbstractC2635a a();

        public AbstractC2635a b() {
            AbstractC2635a abstractC2635aA = a();
            if (Objects.equals(abstractC2635aA.getMimeType(), "audio/mp4a-latm") && abstractC2635aA.h() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return abstractC2635aA;
        }

        public abstract AbstractC0281a c(int i10);

        public abstract AbstractC0281a d(int i10);

        public abstract AbstractC0281a e(int i10);

        public abstract AbstractC0281a f(int i10);

        public abstract AbstractC0281a g(v1 v1Var);

        public abstract AbstractC0281a h(String str);

        public abstract AbstractC0281a i(int i10);
    }

    AbstractC2635a() {
    }

    public static AbstractC0281a c() {
        return new C2637c.b().i(-1);
    }

    @Override // g0.InterfaceC2648n
    public MediaFormat a() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(getMimeType(), g(), f());
        mediaFormatCreateAudioFormat.setInteger("bitrate", d());
        if (h() != -1) {
            if (getMimeType().equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", h());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", h());
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // g0.InterfaceC2648n
    public abstract v1 b();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    @Override // g0.InterfaceC2648n
    public abstract String getMimeType();

    public abstract int h();
}

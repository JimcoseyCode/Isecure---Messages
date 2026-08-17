package c0;

import c0.u;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1834a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f18700a = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* JADX INFO: renamed from: c0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0199a {
        AbstractC0199a() {
        }

        abstract AbstractC1834a a();

        public final AbstractC1834a b() {
            AbstractC1834a abstractC1834aA = a();
            int iC = abstractC1834aA.c();
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (iC == -1) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " audioSource";
            }
            if (abstractC1834aA.e() <= 0) {
                str = str + " captureSampleRate";
            }
            if (abstractC1834aA.g() <= 0) {
                str = str + " encodeSampleRate";
            }
            if (abstractC1834aA.f() <= 0) {
                str = str + " channelCount";
            }
            if (abstractC1834aA.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return abstractC1834aA;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        public abstract AbstractC0199a c(int i10);

        public abstract AbstractC0199a d(int i10);

        public abstract AbstractC0199a e(int i10);

        public abstract AbstractC0199a f(int i10);

        public abstract AbstractC0199a g(int i10);
    }

    AbstractC1834a() {
    }

    public static AbstractC0199a a() {
        return new u.b().d(-1).e(-1).g(-1).f(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return t.f(b(), f());
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();
}

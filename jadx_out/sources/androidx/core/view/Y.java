package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f16505a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f16506b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16507c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16508d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16509e = 0;

    Y() {
    }

    private void b() {
        this.f16508d = 0;
        this.f16507c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f16508d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f16509e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f16506b[i11];
        while (true) {
            jArr = this.f16506b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f16508d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f16508d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.f16505a[i14] / (r2 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f16508d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f16506b;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float f10 = f(fAbs);
                float f11 = this.f16505a[i18] / (this.f16506b[i18] - j12);
                fAbs += (f11 - f10) * Math.abs(f11);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f16508d != 0 && eventTime - this.f16506b[this.f16509e] > 40) {
            b();
        }
        int i10 = (this.f16509e + 1) % 20;
        this.f16509e = i10;
        int i11 = this.f16508d;
        if (i11 != 20) {
            this.f16508d = i11 + 1;
        }
        this.f16505a[i10] = motionEvent.getAxisValue(26);
        this.f16506b[this.f16509e] = eventTime;
    }

    void c(int i10, float f10) {
        float fE = e() * i10;
        this.f16507c = fE;
        if (fE < (-Math.abs(f10))) {
            this.f16507c = -Math.abs(f10);
        } else if (this.f16507c > Math.abs(f10)) {
            this.f16507c = Math.abs(f10);
        }
    }

    float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f16507c;
    }
}

package c0;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import c0.p;
import d0.AbstractC2316a;
import d0.AbstractC2317b;
import d0.AbstractC2318c;
import d0.AbstractC2319d;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class s implements p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f18756m = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioRecord f18757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1834a f18758b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p.a f18764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f18765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f18766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AudioManager.AudioRecordingCallback f18767k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18759c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f18760d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f18761e = new AtomicReference(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18768l = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AudioManager.AudioRecordingCallback {
        a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
                if (AbstractC2317b.a(audioRecordingConfiguration) == s.this.f18757a.getAudioSessionId()) {
                    s.this.o(AbstractC2318c.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public s(AbstractC1834a abstractC1834a, Context context) throws p.b {
        if (!n(abstractC1834a.e(), abstractC1834a.f(), abstractC1834a.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(abstractC1834a.e()), Integer.valueOf(abstractC1834a.f()), Integer.valueOf(abstractC1834a.b())));
        }
        this.f18758b = abstractC1834a;
        this.f18763g = abstractC1834a.d();
        int iL = l(abstractC1834a.e(), abstractC1834a.f(), abstractC1834a.b());
        H0.g.i(iL > 0);
        int i10 = iL * 2;
        this.f18762f = i10;
        AudioRecord audioRecordJ = j(i10, abstractC1834a, context);
        this.f18757a = audioRecordJ;
        e(audioRecordJ);
    }

    private static void e(AudioRecord audioRecord) throws p.b {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new p.b("Unable to initialize AudioRecord");
    }

    private void f() {
        H0.g.j(!this.f18759c.get(), "AudioStream has been released.");
    }

    private void g() {
        H0.g.j(this.f18760d.get(), "AudioStream has not been started.");
    }

    private static AudioFormat h(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(t.b(i11)).setEncoding(i12).build();
    }

    private static AudioFormat i(AbstractC1834a abstractC1834a) {
        return h(abstractC1834a.e(), abstractC1834a.f(), abstractC1834a.b());
    }

    private static AudioRecord j(int i10, AbstractC1834a abstractC1834a, Context context) {
        int i11 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatI = i(abstractC1834a);
        AudioRecord.Builder builderB = AbstractC2316a.b();
        if (i11 >= 31 && context != null) {
            AbstractC2319d.a(builderB, context);
        }
        AbstractC2316a.d(builderB, abstractC1834a.c());
        AbstractC2316a.c(builderB, audioFormatI);
        AbstractC2316a.e(builderB, i10);
        try {
            return AbstractC2316a.a(builderB);
        } catch (UnsupportedOperationException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private long k() {
        long jC;
        if (this.f18768l) {
            jC = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (AbstractC2317b.b(this.f18757a, audioTimestamp, 0) == 0) {
                jC = t.c(this.f18758b.e(), this.f18766j, audioTimestamp);
                if (Math.abs(jC - System.nanoTime()) > f18756m) {
                    this.f18768l = true;
                }
            } else {
                AbstractC3583h0.l("AudioStreamImpl", "Unable to get audio timestamp");
            }
            jC = -1;
        }
        return jC == -1 ? System.nanoTime() : jC;
    }

    private static int l(int i10, int i11, int i12) {
        return AudioRecord.getMinBufferSize(i10, t.a(i11), i12);
    }

    private static boolean m() {
        return androidx.camera.video.internal.compat.quirk.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean n(int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || l(i10, i11, i12) <= 0) {
            return false;
        }
        try {
            h(i10, i11, i12);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // c0.p
    public void a() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f18759c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f18767k) != null) {
            AbstractC2318c.d(this.f18757a, audioRecordingCallback);
        }
        this.f18757a.release();
    }

    @Override // c0.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        H0.g.j(!this.f18760d.get(), "AudioStream can not be started when setCallback.");
        f();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        H0.g.b(z10, "executor can't be null with non-null callback.");
        this.f18764h = aVar;
        this.f18765i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f18767k;
            if (audioRecordingCallback != null) {
                AbstractC2318c.d(this.f18757a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f18767k == null) {
                this.f18767k = new a();
            }
            AbstractC2318c.c(this.f18757a, executor, this.f18767k);
        }
    }

    void o(final boolean z10) {
        Executor executor = this.f18765i;
        final p.a aVar = this.f18764h;
        if (executor == null || aVar == null || Objects.equals(this.f18761e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: c0.r
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(z10);
            }
        });
    }

    @Override // c0.p
    public p.c read(ByteBuffer byteBuffer) {
        long jK;
        f();
        g();
        int i10 = this.f18757a.read(byteBuffer, this.f18762f);
        if (i10 > 0) {
            byteBuffer.limit(i10);
            jK = k();
            this.f18766j += t.g(i10, this.f18763g);
        } else {
            jK = 0;
        }
        return p.c.c(i10, jK);
    }

    @Override // c0.p
    public void start() throws p.b {
        f();
        if (this.f18760d.getAndSet(true)) {
            return;
        }
        if (m()) {
            e(this.f18757a);
        }
        this.f18757a.startRecording();
        boolean z10 = false;
        if (this.f18757a.getRecordingState() != 3) {
            this.f18760d.set(false);
            throw new p.b("Unable to start AudioRecord with state: " + this.f18757a.getRecordingState());
        }
        this.f18766j = 0L;
        this.f18768l = false;
        this.f18761e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = AbstractC2318c.a(this.f18757a);
            z10 = audioRecordingConfigurationA != null && AbstractC2318c.b(audioRecordingConfigurationA);
        }
        o(z10);
    }

    @Override // c0.p
    public void stop() {
        f();
        if (this.f18760d.getAndSet(false)) {
            this.f18757a.stop();
            if (this.f18757a.getRecordingState() != 1) {
                AbstractC3583h0.l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f18757a.getRecordingState());
            }
            if (m()) {
                this.f18757a.release();
                this.f18757a = j(this.f18762f, this.f18758b, null);
            }
        }
    }
}

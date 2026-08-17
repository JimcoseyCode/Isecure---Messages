package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f17090o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f17091p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile f f17092q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f17094b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f17097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f17098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f17099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f17100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f17101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f17102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f17103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f17104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f17105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f17106n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f17093a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f17095c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f17096d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f17107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile n f17108c;

        /* JADX INFO: renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0175a extends i {
            C0175a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f17110a.n(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        void a() {
            try {
                this.f17110a.f17098f.a(new C0175a());
            } catch (Throwable th) {
                this.f17110a.n(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f17107b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f17108c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f17110a.f17100h);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f17110a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f17108c = nVar;
            n nVar2 = this.f17108c;
            j jVar = this.f17110a.f17099g;
            e eVar = this.f17110a.f17106n;
            f fVar = this.f17110a;
            this.f17107b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f17101i, fVar.f17102j, androidx.emoji2.text.h.a());
            this.f17110a.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f17110a;

        b(f fVar) {
            this.f17110a = fVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void c(EditorInfo editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f17111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f17112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f17113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f17114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f17115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set f17116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f17117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17118h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f17119i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e f17120j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            H0.g.h(hVar, "metadataLoader cannot be null.");
            this.f17111a = hVar;
        }

        protected final h a() {
            return this.f17111a;
        }

        public c b(int i10) {
            this.f17119i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class g implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f17121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Throwable f17122h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f17123i;

        g(AbstractC0176f abstractC0176f, int i10) {
            this(Arrays.asList((AbstractC0176f) H0.g.h(abstractC0176f, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f17121g.size();
            int i10 = 0;
            if (this.f17123i != 1) {
                while (i10 < size) {
                    ((AbstractC0176f) this.f17121g.get(i10)).a(this.f17122h);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((AbstractC0176f) this.f17121g.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th) {
            H0.g.h(collection, "initCallbacks cannot be null");
            this.f17121g = new ArrayList(collection);
            this.f17123i = i10;
            this.f17122h = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface h {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f17100h = cVar.f17113c;
        this.f17101i = cVar.f17114d;
        this.f17102j = cVar.f17115e;
        this.f17103k = cVar.f17117g;
        this.f17104l = cVar.f17118h;
        this.f17098f = cVar.f17111a;
        this.f17105m = cVar.f17119i;
        this.f17106n = cVar.f17120j;
        m0.b bVar = new m0.b();
        this.f17094b = bVar;
        j jVar = cVar.f17112b;
        this.f17099g = jVar == null ? new d() : jVar;
        Set set = cVar.f17116f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f17116f);
        }
        this.f17097e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f17090o) {
            fVar = f17092q;
            H0.g.j(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i10, keyEvent);
    }

    public static f h(c cVar) {
        f fVar;
        f fVar2 = f17092q;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (f17090o) {
            try {
                fVar = f17092q;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f17092q = fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f17092q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f17093a.writeLock().lock();
        try {
            if (this.f17105m == 0) {
                this.f17095c = 0;
            }
            this.f17093a.writeLock().unlock();
            if (e() == 0) {
                this.f17097e.a();
            }
        } catch (Throwable th) {
            this.f17093a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f17104l;
    }

    public int e() {
        this.f17093a.readLock().lock();
        try {
            return this.f17095c;
        } finally {
            this.f17093a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f17103k;
    }

    public void l() {
        H0.g.j(this.f17105m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f17093a.writeLock().lock();
        try {
            if (this.f17095c == 0) {
                return;
            }
            this.f17095c = 0;
            this.f17093a.writeLock().unlock();
            this.f17097e.a();
        } finally {
            this.f17093a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f17093a.writeLock().lock();
        try {
            this.f17095c = 2;
            arrayList.addAll(this.f17094b);
            this.f17094b.clear();
            this.f17093a.writeLock().unlock();
            this.f17096d.post(new g(arrayList, this.f17095c, th));
        } catch (Throwable th2) {
            this.f17093a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f17093a.writeLock().lock();
        try {
            this.f17095c = 1;
            arrayList.addAll(this.f17094b);
            this.f17094b.clear();
            this.f17093a.writeLock().unlock();
            this.f17096d.post(new g(arrayList, this.f17095c));
        } catch (Throwable th) {
            this.f17093a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, ViewDefaults.NUMBER_OF_LINES);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        H0.g.j(k(), "Not initialized yet");
        H0.g.e(i10, "start cannot be negative");
        H0.g.e(i11, "end cannot be negative");
        H0.g.e(i12, "maxEmojiCount cannot be negative");
        H0.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        H0.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        H0.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f17100h : false;
        } else {
            z10 = true;
        }
        return this.f17097e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(AbstractC0176f abstractC0176f) {
        H0.g.h(abstractC0176f, "initCallback cannot be null");
        this.f17093a.writeLock().lock();
        try {
            if (this.f17095c == 1 || this.f17095c == 2) {
                this.f17096d.post(new g(abstractC0176f, this.f17095c));
            } else {
                this.f17094b.add(abstractC0176f);
            }
            this.f17093a.writeLock().unlock();
        } catch (Throwable th) {
            this.f17093a.writeLock().unlock();
            throw th;
        }
    }

    public void u(AbstractC0176f abstractC0176f) {
        H0.g.h(abstractC0176f, "initCallback cannot be null");
        this.f17093a.writeLock().lock();
        try {
            this.f17094b.remove(abstractC0176f);
        } finally {
            this.f17093a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f17097e.c(editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0176f {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}

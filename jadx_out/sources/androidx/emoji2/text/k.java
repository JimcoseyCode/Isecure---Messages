package androidx.emoji2.text;

import E0.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import x0.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k extends f.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f17148k = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {
        public Typeface a(Context context, h.b bVar) {
            return E0.h.a(context, null, new h.b[]{bVar});
        }

        public h.a b(Context context, E0.f fVar) {
            return E0.h.b(context, null, fVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements f.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f17149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E0.f f17150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f17151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f17152d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f17153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f17154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f17155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        f.i f17156h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f17157i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f17158j;

        b(Context context, E0.f fVar, a aVar) {
            H0.g.h(context, "Context cannot be null");
            H0.g.h(fVar, "FontRequest cannot be null");
            this.f17149a = context.getApplicationContext();
            this.f17150b = fVar;
            this.f17151c = aVar;
        }

        private void b() {
            synchronized (this.f17152d) {
                try {
                    this.f17156h = null;
                    ContentObserver contentObserver = this.f17157i;
                    if (contentObserver != null) {
                        this.f17151c.c(this.f17149a, contentObserver);
                        this.f17157i = null;
                    }
                    Handler handler = this.f17153e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f17158j);
                    }
                    this.f17153e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f17155g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f17154f = null;
                    this.f17155g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private h.b e() {
            try {
                h.a aVarB = this.f17151c.b(this.f17149a, this.f17150b);
                if (aVarB.e() == 0) {
                    h.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            H0.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f17152d) {
                this.f17156h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f17152d) {
                try {
                    if (this.f17156h == null) {
                        return;
                    }
                    try {
                        h.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f17152d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            D0.l.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f17151c.a(this.f17149a, bVarE);
                            ByteBuffer byteBufferF = D.f(this.f17149a, null, bVarE.e());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n nVarB = n.b(typefaceA, byteBufferF);
                            D0.l.b();
                            synchronized (this.f17152d) {
                                try {
                                    f.i iVar = this.f17156h;
                                    if (iVar != null) {
                                        iVar.b(nVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            D0.l.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f17152d) {
                            try {
                                f.i iVar2 = this.f17156h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f17152d) {
                try {
                    if (this.f17156h == null) {
                        return;
                    }
                    if (this.f17154f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f17155g = threadPoolExecutorB;
                        this.f17154f = threadPoolExecutorB;
                    }
                    this.f17154f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17159g.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f17152d) {
                this.f17154f = executor;
            }
        }
    }

    public k(Context context, E0.f fVar) {
        super(new b(context, fVar, f17148k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}

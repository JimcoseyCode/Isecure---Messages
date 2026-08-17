package N0;

import i7.AbstractC2753p;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f7901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f7902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7903c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7905h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7906i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7908k;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7906i = obj;
            this.f7908k |= androidx.customview.widget.a.INVALID_ID;
            return n.i(n.this, this);
        }
    }

    public n(File file, A serializer) {
        AbstractC2855l.g(file, "file");
        AbstractC2855l.g(serializer, "serializer");
        this.f7901a = file;
        this.f7902b = serializer;
        this.f7903c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [N0.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [N0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [N0.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object i(n nVar, n7.f fVar) throws IOException {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f7908k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f7908k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj = aVar.f7906i;
        Object objE = AbstractC3016b.e();
        ?? r22 = aVar.f7908k;
        try {
        } catch (FileNotFoundException unused) {
            nVar = r22;
        }
        if (r22 != 0) {
            if (r22 == 1) {
                closeable2 = (Closeable) aVar.f7905h;
                r22 = (n) aVar.f7904g;
                try {
                    AbstractC2753p.b(obj);
                    AbstractC3376c.a(closeable2, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (r22 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) aVar.f7904g;
            try {
                AbstractC2753p.b(obj);
                AbstractC3376c.a(closeable, null);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                try {
                    throw th;
                } finally {
                }
            }
        }
        AbstractC2753p.b(obj);
        nVar.f();
        try {
            FileInputStream fileInputStream = new FileInputStream(((n) nVar).f7901a);
            try {
                A a10 = ((n) nVar).f7902b;
                aVar.f7904g = nVar;
                aVar.f7905h = fileInputStream;
                aVar.f7908k = 1;
                Object objB = a10.b(fileInputStream, aVar);
                if (objB != objE) {
                    closeable2 = fileInputStream;
                    obj = objB;
                    AbstractC3376c.a(closeable2, null);
                    return obj;
                }
            } catch (Throwable th5) {
                r22 = nVar;
                closeable2 = fileInputStream;
                th2 = th5;
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            if (!((n) nVar).f7901a.exists()) {
                return ((n) nVar).f7902b.a();
            }
            FileInputStream fileInputStream2 = new FileInputStream(((n) nVar).f7901a);
            try {
                A a11 = ((n) nVar).f7902b;
                aVar.f7904g = fileInputStream2;
                aVar.f7905h = null;
                aVar.f7908k = 2;
                Object objB2 = a11.b(fileInputStream2, aVar);
                if (objB2 != objE) {
                    obj = objB2;
                    closeable = fileInputStream2;
                    AbstractC3376c.a(closeable, null);
                    return obj;
                }
            } catch (Throwable th6) {
                th = th6;
                closeable = fileInputStream2;
                throw th;
            }
        }
        return objE;
    }

    @Override // N0.InterfaceC1303c
    public void close() {
        this.f7903c.set(true);
    }

    @Override // N0.y
    public Object e(n7.f fVar) {
        return i(this, fVar);
    }

    protected final void f() {
        if (this.f7903c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    protected final File g() {
        return this.f7901a;
    }

    protected final A h() {
        return this.f7902b;
    }
}

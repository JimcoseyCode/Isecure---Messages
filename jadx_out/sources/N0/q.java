package N0;

import i7.AbstractC2753p;
import i7.C2735B;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends n implements K {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7937h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7938i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7940k;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7938i = obj;
            this.f7940k |= androidx.customview.widget.a.INVALID_ID;
            return q.this.b(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, A serializer) {
        super(file, serializer);
        AbstractC2855l.g(file, "file");
        AbstractC2855l.g(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // N0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj, n7.f fVar) throws IOException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f7940k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f7940k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj2 = aVar.f7938i;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f7940k;
        if (i11 == 0) {
            AbstractC2753p.b(obj2);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                A aH = h();
                I i12 = new I(fileOutputStream2);
                aVar.f7936g = fileOutputStream2;
                aVar.f7937h = fileOutputStream2;
                aVar.f7940k = 1;
                if (aH.c(obj, i12, aVar) == objE) {
                    return objE;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f7937h;
            closeable = (Closeable) aVar.f7936g;
            try {
                AbstractC2753p.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC3376c.a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        C2735B c2735b = C2735B.f28704a;
        AbstractC3376c.a(closeable, null);
        return C2735B.f28704a;
    }
}

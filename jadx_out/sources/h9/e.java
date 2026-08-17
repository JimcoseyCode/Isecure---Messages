package h9;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.D;
import t9.m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function1 f28648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(D delegate, Function1 onException) {
        super(delegate);
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(onException, "onException");
        this.f28648h = onException;
    }

    @Override // t9.m, t9.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f28647g) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f28647g = true;
            this.f28648h.invoke(e10);
        }
    }

    @Override // t9.m, t9.D, java.io.Flushable
    public void flush() {
        if (this.f28647g) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f28647g = true;
            this.f28648h.invoke(e10);
        }
    }

    @Override // t9.m, t9.D
    public void write(C3391h source, long j10) throws EOFException {
        AbstractC2855l.g(source, "source");
        if (this.f28647g) {
            source.skip(j10);
            return;
        }
        try {
            super.write(source, j10);
        } catch (IOException e10) {
            this.f28647g = true;
            this.f28648h.invoke(e10);
        }
    }
}

package i9;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f28835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28838d;

    public a(String name, boolean z10) {
        AbstractC2855l.g(name, "name");
        this.f28837c = name;
        this.f28838d = z10;
        this.f28836b = -1L;
    }

    public final boolean a() {
        return this.f28838d;
    }

    public final String b() {
        return this.f28837c;
    }

    public final long c() {
        return this.f28836b;
    }

    public final d d() {
        return this.f28835a;
    }

    public final void e(d queue) {
        AbstractC2855l.g(queue, "queue");
        d dVar = this.f28835a;
        if (dVar == queue) {
            return;
        }
        if (!(dVar == null)) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f28835a = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f28836b = j10;
    }

    public String toString() {
        return this.f28837c;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}

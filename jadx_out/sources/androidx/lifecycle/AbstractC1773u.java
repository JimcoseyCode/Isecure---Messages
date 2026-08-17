package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1773u {
    public static final void a(r rVar, AbstractC1764k.b current, AbstractC1764k.b next) {
        AbstractC2855l.g(current, "current");
        AbstractC2855l.g(next, "next");
        if (current == AbstractC1764k.b.f17591h && next == AbstractC1764k.b.f17590g) {
            throw new IllegalStateException(("State must be at least '" + AbstractC1764k.b.f17592i + "' to be moved to '" + next + "' in component " + rVar).toString());
        }
        AbstractC1764k.b bVar = AbstractC1764k.b.f17590g;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + rVar).toString());
    }
}

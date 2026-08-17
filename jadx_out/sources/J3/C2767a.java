package j3;

import android.os.Trace;
import j3.C2768b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: j3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2767a implements C2768b.c {
    @Override // j3.C2768b.c
    public void a(String name) {
        AbstractC2855l.g(name, "name");
        if (c()) {
            Trace.beginSection(name);
        }
    }

    @Override // j3.C2768b.c
    public void b() {
        if (c()) {
            Trace.endSection();
        }
    }

    @Override // j3.C2768b.c
    public boolean c() {
        return false;
    }
}

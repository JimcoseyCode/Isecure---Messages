package t7;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f32483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32484b;

    public f(File root, List segments) {
        AbstractC2855l.g(root, "root");
        AbstractC2855l.g(segments, "segments");
        this.f32483a = root;
        this.f32484b = segments;
    }

    public final File a() {
        return this.f32483a;
    }

    public final List b() {
        return this.f32484b;
    }

    public final int c() {
        return this.f32484b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC2855l.b(this.f32483a, fVar.f32483a) && AbstractC2855l.b(this.f32484b, fVar.f32484b);
    }

    public int hashCode() {
        return (this.f32483a.hashCode() * 31) + this.f32484b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f32483a + ", segments=" + this.f32484b + ')';
    }
}

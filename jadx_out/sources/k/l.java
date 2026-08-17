package K;

import com.facebook.react.uimanager.ViewDefaults;
import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7003b;

    public l(Map streamSpecs, int i10) {
        AbstractC2855l.g(streamSpecs, "streamSpecs");
        this.f7002a = streamSpecs;
        this.f7003b = i10;
    }

    public final int a() {
        return this.f7003b;
    }

    public final Map b() {
        return this.f7002a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC2855l.b(this.f7002a, lVar.f7002a) && this.f7003b == lVar.f7003b;
    }

    public int hashCode() {
        return (this.f7002a.hashCode() * 31) + Integer.hashCode(this.f7003b);
    }

    public String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.f7002a + ", maxSupportedFrameRate=" + this.f7003b + ')';
    }

    public /* synthetic */ l(Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.i() : map, (i11 & 2) != 0 ? ViewDefaults.NUMBER_OF_LINES : i10);
    }
}

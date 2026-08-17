package U7;

import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f11386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f11387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f11389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11390e;

    public G(O globalLevel, O o10, Map userDefinedLevelForSpecificAnnotation) {
        AbstractC2855l.g(globalLevel, "globalLevel");
        AbstractC2855l.g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f11386a = globalLevel;
        this.f11387b = o10;
        this.f11388c = userDefinedLevelForSpecificAnnotation;
        this.f11389d = AbstractC2746i.b(new F(this));
        O o11 = O.f11452i;
        this.f11390e = globalLevel == o11 && o10 == o11 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(G g10) {
        List listC = AbstractC2800q.c();
        listC.add(g10.f11386a.j());
        O o10 = g10.f11387b;
        if (o10 != null) {
            listC.add("under-migration:" + o10.j());
        }
        for (Map.Entry entry : g10.f11388c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + ((O) entry.getValue()).j());
        }
        return (String[]) AbstractC2800q.a(listC).toArray(new String[0]);
    }

    public final O c() {
        return this.f11386a;
    }

    public final O d() {
        return this.f11387b;
    }

    public final Map e() {
        return this.f11388c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f11386a == g10.f11386a && this.f11387b == g10.f11387b && AbstractC2855l.b(this.f11388c, g10.f11388c);
    }

    public final boolean f() {
        return this.f11390e;
    }

    public int hashCode() {
        int iHashCode = this.f11386a.hashCode() * 31;
        O o10 = this.f11387b;
        return ((iHashCode + (o10 == null ? 0 : o10.hashCode())) * 31) + this.f11388c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f11386a + ", migrationLevel=" + this.f11387b + ", userDefinedLevelForSpecificAnnotation=" + this.f11388c + ')';
    }

    public /* synthetic */ G(O o10, O o11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? null : o11, (i10 & 4) != 0 ? j7.K.i() : map);
    }
}

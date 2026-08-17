package C7;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class w implements WildcardType, Type {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f541i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final w f542j = new w(null, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Type f543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Type f544h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a() {
            return w.f542j;
        }

        private a() {
        }
    }

    public w(Type type, Type type2) {
        this.f543g = type;
        this.f544h = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f544h;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f544h != null) {
            return "? super " + v.h(this.f544h);
        }
        Type type = this.f543g;
        if (type == null || AbstractC2855l.b(type, Object.class)) {
            return "?";
        }
        return "? extends " + v.h(this.f543g);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f543g;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}

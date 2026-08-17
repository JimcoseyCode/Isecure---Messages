package C7;

import j7.AbstractC2793j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class t implements ParameterizedType, Type {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Type f535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Type[] f536i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2853j implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f537g = new a();

        a() {
            super(1, v.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            AbstractC2855l.g(p02, "p0");
            return v.h(p02);
        }
    }

    public t(Class rawType, Type type, List typeArguments) {
        AbstractC2855l.g(rawType, "rawType");
        AbstractC2855l.g(typeArguments, "typeArguments");
        this.f534g = rawType;
        this.f535h = type;
        this.f536i = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC2855l.b(this.f534g, parameterizedType.getRawType()) && AbstractC2855l.b(this.f535h, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f536i;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f535h;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f534g;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f535h;
        if (type != null) {
            sb.append(v.h(type));
            sb.append("$");
            sb.append(this.f534g.getSimpleName());
        } else {
            sb.append(v.h(this.f534g));
        }
        Type[] typeArr = this.f536i;
        if (!(typeArr.length == 0)) {
            AbstractC2793j.U(typeArr, sb, null, "<", ">", 0, null, a.f537g, 50, null);
        }
        return sb.toString();
    }

    public int hashCode() {
        int iHashCode = this.f534g.hashCode();
        Type type = this.f535h;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}

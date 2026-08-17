package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r4.AbstractC3267h;
import r4.AbstractC3268i;
import s4.AbstractC3325b;
import y4.j;
import y4.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f21334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final int f21335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected final boolean f21336i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected final int f21337j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected final boolean f21338k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected final String f21339l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected final int f21340m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final Class f21341n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected final String f21342o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private zan f21343p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final a f21344q;

        Field(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, zaa zaaVar) {
            this.f21334g = i10;
            this.f21335h = i11;
            this.f21336i = z10;
            this.f21337j = i12;
            this.f21338k = z11;
            this.f21339l = str;
            this.f21340m = i13;
            if (str2 == null) {
                this.f21341n = null;
                this.f21342o = null;
            } else {
                this.f21341n = SafeParcelResponse.class;
                this.f21342o = str2;
            }
            if (zaaVar == null) {
                this.f21344q = null;
            } else {
                this.f21344q = zaaVar.s();
            }
        }

        public final boolean A0() {
            return this.f21344q != null;
        }

        public int e() {
            return this.f21340m;
        }

        public final Object k0(Object obj) {
            AbstractC3268i.k(this.f21344q);
            return this.f21344q.d(obj);
        }

        final String l0() {
            String str = this.f21342o;
            if (str == null) {
                return null;
            }
            return str;
        }

        final zaa s() {
            a aVar = this.f21344q;
            if (aVar == null) {
                return null;
            }
            return zaa.e(aVar);
        }

        public final Map t0() {
            AbstractC3268i.k(this.f21342o);
            AbstractC3268i.k(this.f21343p);
            return (Map) AbstractC3268i.k(this.f21343p.s(this.f21342o));
        }

        public final String toString() {
            AbstractC3267h.a aVarA = AbstractC3267h.c(this).a("versionCode", Integer.valueOf(this.f21334g)).a("typeIn", Integer.valueOf(this.f21335h)).a("typeInArray", Boolean.valueOf(this.f21336i)).a("typeOut", Integer.valueOf(this.f21337j)).a("typeOutArray", Boolean.valueOf(this.f21338k)).a("outputFieldName", this.f21339l).a("safeParcelFieldId", Integer.valueOf(this.f21340m)).a("concreteTypeName", l0());
            Class cls = this.f21341n;
            if (cls != null) {
                aVarA.a("concreteType.class", cls.getCanonicalName());
            }
            a aVar = this.f21344q;
            if (aVar != null) {
                aVarA.a("converterName", aVar.getClass().getCanonicalName());
            }
            return aVarA.toString();
        }

        public final void u0(zan zanVar) {
            this.f21343p = zanVar;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = this.f21334g;
            int iA = AbstractC3325b.a(parcel);
            AbstractC3325b.j(parcel, 1, i11);
            AbstractC3325b.j(parcel, 2, this.f21335h);
            AbstractC3325b.c(parcel, 3, this.f21336i);
            AbstractC3325b.j(parcel, 4, this.f21337j);
            AbstractC3325b.c(parcel, 5, this.f21338k);
            AbstractC3325b.p(parcel, 6, this.f21339l, false);
            AbstractC3325b.j(parcel, 7, e());
            AbstractC3325b.p(parcel, 8, l0(), false);
            AbstractC3325b.o(parcel, 9, s(), i10, false);
            AbstractC3325b.b(parcel, iA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        Object d(Object obj);
    }

    protected static final Object f(Field field, Object obj) {
        return field.f21344q != null ? field.k0(obj) : obj;
    }

    private static final void g(StringBuilder sb, Field field, Object obj) {
        int i10 = field.f21335h;
        if (i10 == 11) {
            Class cls = field.f21341n;
            AbstractC3268i.k(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(j.a((String) obj));
            sb.append("\"");
        }
    }

    public abstract Map a();

    protected Object b(Field field) {
        String str = field.f21339l;
        if (field.f21341n == null) {
            return c(str);
        }
        AbstractC3268i.p(c(str) == null, "Concrete field shouldn't be value object: %s", field.f21339l);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    protected abstract Object c(String str);

    protected boolean d(Field field) {
        if (field.f21337j != 11) {
            return e(field.f21339l);
        }
        if (field.f21338k) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean e(String str);

    public String toString() {
        Map mapA = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapA.keySet()) {
            Field field = (Field) mapA.get(str);
            if (d(field)) {
                Object objF = f(field, b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objF != null) {
                    switch (field.f21337j) {
                        case 8:
                            sb.append("\"");
                            sb.append(y4.c.a((byte[]) objF));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(y4.c.b((byte[]) objF));
                            sb.append("\"");
                            break;
                        case 10:
                            k.a(sb, (HashMap) objF);
                            break;
                        default:
                            if (field.f21336i) {
                                ArrayList arrayList = (ArrayList) objF;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                g(sb, field, objF);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}

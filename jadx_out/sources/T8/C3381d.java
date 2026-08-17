package t8;

/* JADX INFO: renamed from: t8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3381d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k8.c f32528b;

    private C3381d(String str) {
        if (str == null) {
            a(7);
        }
        this.f32527a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i10 != 5) {
            switch (i10) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static C3381d b(k8.b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new C3381d(h(bVar));
    }

    public static C3381d c(k8.c cVar) {
        if (cVar == null) {
            a(4);
        }
        C3381d c3381d = new C3381d(cVar.b().replace('.', '/'));
        c3381d.f32528b = cVar;
        return c3381d;
    }

    public static C3381d d(String str) {
        if (str == null) {
            a(0);
        }
        return new C3381d(str);
    }

    public static String h(k8.b bVar) {
        if (bVar == null) {
            a(2);
        }
        k8.c cVarF = bVar.f();
        String strReplace = bVar.g().b().replace('.', '$');
        if (!cVarF.d()) {
            strReplace = cVarF.b().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public k8.c e() {
        return new k8.c(this.f32527a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f32527a.equals(((C3381d) obj).f32527a);
    }

    public String f() {
        String str = this.f32527a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public k8.c g() {
        int iLastIndexOf = this.f32527a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new k8.c(this.f32527a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        k8.c cVar = k8.c.f29204c;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f32527a.hashCode();
    }

    public String toString() {
        return this.f32527a;
    }
}

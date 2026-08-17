package k8;

import expo.modules.notifications.service.NotificationsService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f29215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f29216h;

    private f(String str, boolean z10) {
        if (str == null) {
            h(0);
        }
        this.f29215g = str;
        this.f29216h = z10;
    }

    private static /* synthetic */ void h(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = NotificationsService.IDENTIFIER_KEY;
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f p(String str) {
        if (str == null) {
            h(9);
        }
        return str.startsWith("<") ? t(str) : q(str);
    }

    public static f q(String str) {
        if (str == null) {
            h(5);
        }
        return new f(str, false);
    }

    public static boolean s(String str) {
        if (str == null) {
            h(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f t(String str) {
        if (str == null) {
            h(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f29216h == fVar.f29216h && this.f29215g.equals(fVar.f29215g);
    }

    public int hashCode() {
        return (this.f29215g.hashCode() * 31) + (this.f29216h ? 1 : 0);
    }

    public String j() {
        String str = this.f29215g;
        if (str == null) {
            h(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f29215g.compareTo(fVar.f29215g);
    }

    public String m() {
        if (this.f29216h) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strJ = j();
        if (strJ == null) {
            h(2);
        }
        return strJ;
    }

    public boolean r() {
        return this.f29216h;
    }

    public String toString() {
        return this.f29215g;
    }
}

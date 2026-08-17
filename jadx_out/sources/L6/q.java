package L6;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f7278a = new q();

    private q() {
    }

    public final int a(int i10, int i11) {
        if (i11 == 1) {
            if (i10 == 3) {
                return 0;
            }
            if (i10 == 5) {
                return -1;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
        }
        if (i11 == 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 == 4) {
                return 0;
            }
            if (i10 == 5) {
                return -1;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
        }
        if (i11 != 3) {
            throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 0;
        }
        if (i10 == 5) {
            return -1;
        }
        if (i10 == 6) {
            return 1;
        }
        throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
    }

    public final boolean b(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6;
    }

    public final int c(int i10, int i11) {
        if (i11 == 1) {
            if (i10 == -1) {
                return 5;
            }
            if (i10 == 0) {
                return 3;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
        }
        if (i11 == 2) {
            if (i10 == -1) {
                return 5;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == 1) {
                return 3;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
        }
        if (i11 != 3) {
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
        }
        if (i10 == -1) {
            return 5;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 2) {
            return 3;
        }
        throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
    }
}

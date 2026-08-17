package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17684g;

    e(long j10) {
        this.f17684g = j10;
    }

    public long j() {
        return this.f17684g;
    }
}

package P4;

/* JADX INFO: renamed from: P4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1370d extends IllegalStateException {
    private C1370d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC1378l abstractC1378l) {
        if (!abstractC1378l.o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excK = abstractC1378l.k();
        return new C1370d("Complete with: ".concat(excK != null ? "failure" : abstractC1378l.p() ? "result ".concat(String.valueOf(abstractC1378l.l())) : abstractC1378l.n() ? "cancellation" : "unknown issue"), excK);
    }
}

package T5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f10429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f10430h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public d(a aVar, String str) {
        super(str);
        this.f10430h = str;
        this.f10429g = aVar;
    }

    public a a() {
        return this.f10429g;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "Error type: " + this.f10429g + ". " + this.f10430h;
    }
}

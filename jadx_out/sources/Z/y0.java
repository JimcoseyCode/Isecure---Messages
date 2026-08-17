package Z;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1579s f13524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f13525b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC1580t f13526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f13527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f13528e;

        a(AbstractC1579s abstractC1579s, c0 c0Var, AbstractC1580t abstractC1580t, int i10, Throwable th) {
            super(abstractC1579s, c0Var);
            this.f13526c = abstractC1580t;
            this.f13527d = i10;
            this.f13528e = th;
        }

        static String h(int i10) {
            switch (i10) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i10 + ")";
            }
        }

        public Throwable i() {
            return this.f13528e;
        }

        public int j() {
            return this.f13527d;
        }

        public AbstractC1580t k() {
            return this.f13526c;
        }

        public boolean l() {
            return this.f13527d != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends y0 {
        b(AbstractC1579s abstractC1579s, c0 c0Var) {
            super(abstractC1579s, c0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends y0 {
        c(AbstractC1579s abstractC1579s, c0 c0Var) {
            super(abstractC1579s, c0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends y0 {
        d(AbstractC1579s abstractC1579s, c0 c0Var) {
            super(abstractC1579s, c0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends y0 {
        e(AbstractC1579s abstractC1579s, c0 c0Var) {
            super(abstractC1579s, c0Var);
        }
    }

    y0(AbstractC1579s abstractC1579s, c0 c0Var) {
        this.f13524a = (AbstractC1579s) H0.g.g(abstractC1579s);
        this.f13525b = (c0) H0.g.g(c0Var);
    }

    static a a(AbstractC1579s abstractC1579s, c0 c0Var, AbstractC1580t abstractC1580t) {
        return new a(abstractC1579s, c0Var, abstractC1580t, 0, null);
    }

    static a b(AbstractC1579s abstractC1579s, c0 c0Var, AbstractC1580t abstractC1580t, int i10, Throwable th) {
        H0.g.b(i10 != 0, "An error type is required.");
        return new a(abstractC1579s, c0Var, abstractC1580t, i10, th);
    }

    static b d(AbstractC1579s abstractC1579s, c0 c0Var) {
        return new b(abstractC1579s, c0Var);
    }

    static c e(AbstractC1579s abstractC1579s, c0 c0Var) {
        return new c(abstractC1579s, c0Var);
    }

    static d f(AbstractC1579s abstractC1579s, c0 c0Var) {
        return new d(abstractC1579s, c0Var);
    }

    static e g(AbstractC1579s abstractC1579s, c0 c0Var) {
        return new e(abstractC1579s, c0Var);
    }

    public AbstractC1579s c() {
        return this.f13524a;
    }
}

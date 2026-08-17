package Z;

import Z.AbstractC1562a;
import android.util.Range;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: Z.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1564c extends AbstractC1562a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Range f13339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Range f13342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13343h;

    /* JADX INFO: renamed from: Z.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC1562a.AbstractC0136a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Range f13344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f13345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f13346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Range f13347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f13348e;

        b() {
        }

        @Override // Z.AbstractC1562a.AbstractC0136a
        public AbstractC1562a a() {
            Range range = this.f13344a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (range == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " bitrate";
            }
            if (this.f13345b == null) {
                str = str + " sourceFormat";
            }
            if (this.f13346c == null) {
                str = str + " source";
            }
            if (this.f13347d == null) {
                str = str + " sampleRate";
            }
            if (this.f13348e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C1564c(this.f13344a, this.f13345b.intValue(), this.f13346c.intValue(), this.f13347d, this.f13348e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z.AbstractC1562a.AbstractC0136a
        public AbstractC1562a.AbstractC0136a b(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f13344a = range;
            return this;
        }

        @Override // Z.AbstractC1562a.AbstractC0136a
        public AbstractC1562a.AbstractC0136a c(int i10) {
            this.f13348e = Integer.valueOf(i10);
            return this;
        }

        @Override // Z.AbstractC1562a.AbstractC0136a
        public AbstractC1562a.AbstractC0136a d(Range range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f13347d = range;
            return this;
        }

        @Override // Z.AbstractC1562a.AbstractC0136a
        public AbstractC1562a.AbstractC0136a e(int i10) {
            this.f13346c = Integer.valueOf(i10);
            return this;
        }

        public AbstractC1562a.AbstractC0136a f(int i10) {
            this.f13345b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // Z.AbstractC1562a
    public Range b() {
        return this.f13339d;
    }

    @Override // Z.AbstractC1562a
    public int c() {
        return this.f13343h;
    }

    @Override // Z.AbstractC1562a
    public Range d() {
        return this.f13342g;
    }

    @Override // Z.AbstractC1562a
    public int e() {
        return this.f13341f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1562a) {
            AbstractC1562a abstractC1562a = (AbstractC1562a) obj;
            if (this.f13339d.equals(abstractC1562a.b()) && this.f13340e == abstractC1562a.f() && this.f13341f == abstractC1562a.e() && this.f13342g.equals(abstractC1562a.d()) && this.f13343h == abstractC1562a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.AbstractC1562a
    public int f() {
        return this.f13340e;
    }

    public int hashCode() {
        return ((((((((this.f13339d.hashCode() ^ 1000003) * 1000003) ^ this.f13340e) * 1000003) ^ this.f13341f) * 1000003) ^ this.f13342g.hashCode()) * 1000003) ^ this.f13343h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f13339d + ", sourceFormat=" + this.f13340e + ", source=" + this.f13341f + ", sampleRate=" + this.f13342g + ", channelCount=" + this.f13343h + "}";
    }

    private C1564c(Range range, int i10, int i11, Range range2, int i12) {
        this.f13339d = range;
        this.f13340e = i10;
        this.f13341f = i11;
        this.f13342g = range2;
        this.f13343h = i12;
    }
}

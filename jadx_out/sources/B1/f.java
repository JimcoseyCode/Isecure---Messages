package B1;

import B1.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f264b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface e {
        void a(Object obj);

        Object b(Resources.Theme theme, Resources resources, int i10);

        Class getDataClass();
    }

    f(Context context, e eVar) {
        this.f263a = context.getApplicationContext();
        this.f264b = eVar;
    }

    public static o a(Context context) {
        return new a(context);
    }

    public static o c(Context context) {
        return new b(context);
    }

    public static o e(Context context) {
        return new c(context);
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Integer num, int i10, int i11, v1.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.b(F1.l.f1801b);
        return new n.a(new P1.c(num), new d(theme, theme != null ? theme.getResources() : this.f263a.getResources(), this.f264b, num.intValue()));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean handles(Integer num) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f265a;

        a(Context context) {
            this.f265a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new f(this.f265a, this);
        }

        @Override // B1.f.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // B1.f.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor b(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        @Override // B1.f.e
        public Class getDataClass() {
            return AssetFileDescriptor.class;
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f266a;

        b(Context context) {
            this.f266a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new f(this.f266a, this);
        }

        @Override // B1.f.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Drawable b(Resources.Theme theme, Resources resources, int i10) {
            return F1.i.a(this.f266a, i10, theme);
        }

        @Override // B1.f.e
        public Class getDataClass() {
            return Drawable.class;
        }

        @Override // B1.o
        public void teardown() {
        }

        @Override // B1.f.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f267a;

        c(Context context) {
            this.f267a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new f(this.f267a, this);
        }

        @Override // B1.f.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // B1.f.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public InputStream b(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        @Override // B1.f.e
        public Class getDataClass() {
            return InputStream.class;
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Resources.Theme f268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Resources f269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final e f270i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f271j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Object f272k;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f268g = theme;
            this.f269h = resources;
            this.f270i = eVar;
            this.f271j = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            Object obj = this.f272k;
            if (obj != null) {
                try {
                    this.f270i.a(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return this.f270i.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objB = this.f270i.b(this.f268g, this.f269h, this.f271j);
                this.f272k = objB;
                aVar.c(objB);
            } catch (Resources.NotFoundException e10) {
                aVar.a(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}

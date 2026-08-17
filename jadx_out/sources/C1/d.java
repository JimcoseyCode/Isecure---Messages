package C1;

import B1.n;
import B1.o;
import B1.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import v1.EnumC3417a;
import v1.h;
import w1.AbstractC3464c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f477d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: C1.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0022d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String[] f480q = {"_data"};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Context f481g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final n f482h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final n f483i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Uri f484j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f485k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f486l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final h f487m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f488n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private volatile boolean f489o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f490p;

        C0022d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
            this.f481g = context.getApplicationContext();
            this.f482h = nVar;
            this.f483i = nVar2;
            this.f484j = uri;
            this.f485k = i10;
            this.f486l = i11;
            this.f487m = hVar;
            this.f488n = cls;
        }

        private n.a a() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f482h.buildLoadData(d(this.f484j), this.f485k, this.f486l, this.f487m);
            }
            if (AbstractC3464c.a(this.f484j)) {
                return this.f483i.buildLoadData(this.f484j, this.f485k, this.f486l, this.f487m);
            }
            return this.f483i.buildLoadData(c() ? MediaStore.setRequireOriginal(this.f484j) : this.f484j, this.f485k, this.f486l, this.f487m);
        }

        private com.bumptech.glide.load.data.d b() {
            n.a aVarA = a();
            if (aVarA != null) {
                return aVarA.f301c;
            }
            return null;
        }

        private boolean c() {
            return this.f481g.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File d(Uri uri) {
            try {
                Cursor cursorQuery = this.f481g.getContentResolver().query(uri, f480q, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f489o = true;
            com.bumptech.glide.load.data.d dVar = this.f490p;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            com.bumptech.glide.load.data.d dVar = this.f490p;
            if (dVar != null) {
                dVar.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return this.f488n;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarB = b();
                if (dVarB == null) {
                    aVar.a(new IllegalArgumentException("Failed to build fetcher for: " + this.f484j));
                    return;
                }
                this.f490p = dVarB;
                if (this.f489o) {
                    cancel();
                } else {
                    dVarB.loadData(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.a(e10);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f474a = context.getApplicationContext();
        this.f475b = nVar;
        this.f476c = nVar2;
        this.f477d = cls;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Uri uri, int i10, int i11, h hVar) {
        return new n.a(new P1.c(uri), new C0022d(this.f474a, this.f475b, this.f476c, uri, i10, i11, hVar, this.f477d));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC3464c.d(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f479b;

        a(Context context, Class cls) {
            this.f478a = context;
            this.f479b = cls;
        }

        @Override // B1.o
        public final n build(r rVar) {
            return new d(this.f478a, rVar.d(File.class, this.f479b), rVar.d(Uri.class, this.f479b), this.f479b);
        }

        @Override // B1.o
        public final void teardown() {
        }
    }
}

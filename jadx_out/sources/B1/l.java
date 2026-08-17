package B1;

import B1.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import v1.EnumC3417a;
import w1.AbstractC3464c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f288a;

    public l(Context context) {
        this.f288a = context;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Uri uri, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(uri), new b(this.f288a, uri));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri) {
        return AbstractC3464c.d(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f289a;

        public a(Context context) {
            this.f289a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new l(this.f289a);
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String[] f290i = {"_data"};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Context f291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Uri f292h;

        b(Context context, Uri uri) {
            this.f291g = context;
            this.f292h = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            Cursor cursorQuery = this.f291g.getContentResolver().query(this.f292h, f290i, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.c(new File(string));
                return;
            }
            aVar.a(new FileNotFoundException("Failed to find file path for: " + this.f292h));
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }
}

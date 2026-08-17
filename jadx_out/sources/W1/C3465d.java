package w1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import v1.EnumC3417a;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3465d implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f33086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3467f f33087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputStream f33088i;

    /* JADX INFO: renamed from: w1.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements InterfaceC3466e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f33089b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f33090a;

        a(ContentResolver contentResolver) {
            this.f33090a = contentResolver;
        }

        @Override // w1.InterfaceC3466e
        public Cursor a(Uri uri) {
            return this.f33090a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f33089b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: w1.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements InterfaceC3466e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f33091b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f33092a;

        b(ContentResolver contentResolver) {
            this.f33092a = contentResolver;
        }

        @Override // w1.InterfaceC3466e
        public Cursor a(Uri uri) {
            return this.f33092a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f33091b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C3465d(Uri uri, C3467f c3467f) {
        this.f33086g = uri;
        this.f33087h = c3467f;
    }

    private static C3465d a(Context context, Uri uri, InterfaceC3466e interfaceC3466e) {
        return new C3465d(uri, new C3467f(com.bumptech.glide.b.d(context).k().g(), interfaceC3466e, com.bumptech.glide.b.d(context).f(), context.getContentResolver()));
    }

    public static C3465d b(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    public static C3465d c(Context context, Uri uri) {
        return a(context, uri, new b(context.getContentResolver()));
    }

    private InputStream d() throws Throwable {
        InputStream inputStreamD = this.f33087h.d(this.f33086g);
        int iA = inputStreamD != null ? this.f33087h.a(this.f33086g) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f33088i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3417a getDataSource() {
        return EnumC3417a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(com.bumptech.glide.g gVar, d.a aVar) throws Throwable {
        try {
            InputStream inputStreamD = d();
            this.f33088i = inputStreamD;
            aVar.c(inputStreamD);
        } catch (FileNotFoundException e10) {
            aVar.a(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}

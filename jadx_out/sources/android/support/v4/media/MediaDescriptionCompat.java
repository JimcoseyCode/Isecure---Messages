package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f13717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CharSequence f13718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CharSequence f13719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CharSequence f13720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Bitmap f13721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Uri f13722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Bundle f13723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f13724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object f13725o;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f13727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f13728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f13729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f13730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f13731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f13732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f13733h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f13726a, this.f13727b, this.f13728c, this.f13729d, this.f13730e, this.f13731f, this.f13732g, this.f13733h);
        }

        public b b(CharSequence charSequence) {
            this.f13729d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f13732g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f13730e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f13731f = uri;
            return this;
        }

        public b f(String str) {
            this.f13726a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f13733h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f13728c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f13727b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f13717g = str;
        this.f13718h = charSequence;
        this.f13719i = charSequence2;
        this.f13720j = charSequence3;
        this.f13721k = bitmap;
        this.f13722l = uri;
        this.f13723m = bundle;
        this.f13724n = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle bundleC = android.support.v4.media.a.c(obj);
        if (bundleC != null) {
            MediaSessionCompat.a(bundleC);
            uri = (Uri) bundleC.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleC;
        } else if (!bundleC.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleC.size() != 2) {
            bundleC.remove("android.support.v4.media.description.MEDIA_URI");
            bundleC.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleC;
        }
        bVar.c(bundle);
        if (uri != null) {
            bVar.g(uri);
        } else {
            bVar.g(android.support.v4.media.b.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = bVar.a();
        mediaDescriptionCompatA.f13725o = obj;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        Object obj = this.f13725o;
        if (obj != null) {
            return obj;
        }
        Object objB = a.C0141a.b();
        a.C0141a.g(objB, this.f13717g);
        a.C0141a.i(objB, this.f13718h);
        a.C0141a.h(objB, this.f13719i);
        a.C0141a.c(objB, this.f13720j);
        a.C0141a.e(objB, this.f13721k);
        a.C0141a.f(objB, this.f13722l);
        a.C0141a.d(objB, this.f13723m);
        b.a.a(objB, this.f13724n);
        Object objA = a.C0141a.a(objB);
        this.f13725o = objA;
        return objA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f13718h) + ", " + ((Object) this.f13719i) + ", " + ((Object) this.f13720j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}

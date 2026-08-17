package expo.modules.medialibrary.next.objects.album;

import android.content.ContentResolver;
import android.content.Context;
import androidx.customview.widget.a;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt;
import expo.modules.medialibrary.next.objects.album.factories.AlbumFactory;
import i7.AbstractC2753p;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "albumFactory", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, AlertFragment.ARG_TITLE, "Lexpo/modules/medialibrary/next/objects/album/Album;", "getAlbum", "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "getAlbumFactory", "()Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AlbumQuery {
    private final AlbumFactory albumFactory;
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.AlbumQuery$getAlbum$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.AlbumQuery", f = "AlbumQuery.kt", l = {TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR}, m = "getAlbum")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AlbumQuery.this.getAlbum(null, this);
        }
    }

    public AlbumQuery(AlbumFactory albumFactory, Context context) {
        AbstractC2855l.g(albumFactory, "albumFactory");
        AbstractC2855l.g(context, "context");
        this.albumFactory = albumFactory;
        this.contextRef = new WeakReference<>(context);
    }

    private final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAlbum(String str, n7.f fVar) throws ContentResolverNotObtainedException {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objQueryAlbumId = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAlbumId);
            ContentResolver contentResolver = getContentResolver();
            anonymousClass1.label = 1;
            objQueryAlbumId = AlbumExtensionsKt.queryAlbumId(contentResolver, str, anonymousClass1);
            if (objQueryAlbumId == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryAlbumId);
        }
        String str2 = (String) objQueryAlbumId;
        if (str2 == null) {
            return null;
        }
        return this.albumFactory.create(str2);
    }

    public final AlbumFactory getAlbumFactory() {
        return this.albumFactory;
    }
}

package expo.modules.medialibrary.next.objects.album;

import androidx.customview.widget.a;
import expo.modules.medialibrary.next.exceptions.AlbumPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.album.Album", f = "Album.kt", l = {41, 44}, m = "getRelativePath-MwbCjzw")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Album$getRelativePath$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Album this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Album$getRelativePath$1(Album album, n7.f fVar) {
        super(fVar);
        this.this$0 = album;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws AlbumPropertyNotFoundException, ContentResolverNotObtainedException {
        this.result = obj;
        this.label |= a.INVALID_ID;
        Object objM275getRelativePathMwbCjzw = this.this$0.m275getRelativePathMwbCjzw(this);
        return objM275getRelativePathMwbCjzw == AbstractC3016b.e() ? objM275getRelativePathMwbCjzw : RelativePath.m311boximpl((String) objM275getRelativePathMwbCjzw);
    }
}

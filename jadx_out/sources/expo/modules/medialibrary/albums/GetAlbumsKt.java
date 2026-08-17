package expo.modules.medialibrary.albums;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.D0;
import R8.N;
import android.content.Context;
import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.UnableToLoadException;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "getAlbums", "(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetAlbumsKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.GetAlbumsKt$getAlbums$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.GetAlbumsKt$getAlbums$2", f = "GetAlbums.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, n7.f fVar) {
            super(2, fVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UnableToLoadException, IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.L$0;
            String[] strArr = {"bucket_id", "bucket_display_name"};
            HashMap map = new HashMap();
            try {
                Cursor cursorQuery = this.$context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), strArr, "media_type != 0", null, "bucket_display_name");
                try {
                    D0.g(n10.i());
                    if (cursorQuery == null) {
                        throw new AlbumException("Could not get albums. Query returns null");
                    }
                    int columnIndex = cursorQuery.getColumnIndex("bucket_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("bucket_display_name");
                    while (cursorQuery.moveToNext()) {
                        D0.g(n10.i());
                        String string = cursorQuery.getString(columnIndex);
                        if (cursorQuery.getType(columnIndex2) != 0) {
                            Album album = (Album) map.get(string);
                            if (album == null) {
                                AbstractC2855l.d(string);
                                String string2 = cursorQuery.getString(columnIndex2);
                                AbstractC2855l.f(string2, "getString(...)");
                                Album album2 = new Album(string, string2, 0, 4, null);
                                map.put(string, album2);
                                album = album2;
                            }
                            album.setCount(album.getCount() + 1);
                        }
                    }
                    Collection collectionValues = map.values();
                    AbstractC2855l.f(collectionValues, "<get-values>(...)");
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionValues, 10));
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Album) it.next()).toBundle());
                    }
                    AbstractC3376c.a(cursorQuery, null);
                    return arrayList;
                } finally {
                }
            } catch (SecurityException e10) {
                throw new UnableToLoadException("Could not get albums: need READ_EXTERNAL_STORAGE permission " + e10.getMessage(), e10);
            } catch (RuntimeException e11) {
                throw new UnableToLoadException("Could not get albums " + e11.getMessage(), e11);
            }
        }
    }

    public static final Object getAlbums(Context context, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(context, null), fVar);
    }
}

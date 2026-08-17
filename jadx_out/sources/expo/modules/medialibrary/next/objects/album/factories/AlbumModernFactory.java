package expo.modules.medialibrary.next.objects.album.factories;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.AlbumCouldNotBeCreated;
import expo.modules.medialibrary.next.exceptions.AlbumNotFoundException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.asset.factories.AssetFactory;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0016\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\fH\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\"\u0010(\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\b0\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;", "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "assetFactory", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "mediaStorePermissionsDelegate", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "assets", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteOriginalAssets", "Li7/B;", "processAssetsLocation-KTsBHyQ", "(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "processAssetsLocation", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Lexpo/modules/medialibrary/next/objects/album/Album;", "create", "(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;", "albumName", "createFromAssets", "(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;", "Landroid/net/Uri;", "filePaths", "createFromFilePaths", "(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AlbumModernFactory implements AlbumFactory {
    private final AssetDeleter assetDeleter;
    private final AssetFactory assetFactory;
    private final WeakReference<Context> contextRef;
    private final MediaStorePermissionsDelegate mediaStorePermissionsDelegate;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.factories.AlbumModernFactory$createFromAssets$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.factories.AlbumModernFactory", f = "AlbumModernFactory.kt", l = {41, 43, 44}, m = "createFromAssets")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AlbumModernFactory.this.createFromAssets(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.factories.AlbumModernFactory$createFromFilePaths$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.factories.AlbumModernFactory", f = "AlbumModernFactory.kt", l = {57, 59}, m = "createFromFilePaths")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25411 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C25411(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AlbumModernFactory.this.createFromFilePaths(null, null, this);
        }
    }

    public AlbumModernFactory(AssetFactory assetFactory, AssetDeleter assetDeleter, MediaStorePermissionsDelegate mediaStorePermissionsDelegate, Context context) {
        AbstractC2855l.g(assetFactory, "assetFactory");
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(mediaStorePermissionsDelegate, "mediaStorePermissionsDelegate");
        AbstractC2855l.g(context, "context");
        this.assetFactory = assetFactory;
        this.assetDeleter = assetDeleter;
        this.mediaStorePermissionsDelegate = mediaStorePermissionsDelegate;
        this.contextRef = new WeakReference<>(context);
    }

    private final ContentResolver getContentResolver() throws AlbumCouldNotBeCreated {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new AlbumCouldNotBeCreated("Failed to create album: ContentResolver is unavailable.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r11.requestMediaLibraryWritePermission(r12, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cf -> B:34:0x00d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0107 -> B:43:0x0109). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: processAssetsLocation-KTsBHyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m280processAssetsLocationKTsBHyQ(List<Asset> list, String str, boolean z10, n7.f fVar) {
        AlbumModernFactory$processAssetsLocation$1 albumModernFactory$processAssetsLocation$1;
        Iterator it;
        Collection collection;
        String str2;
        Collection arrayList;
        String str3;
        Iterator it2;
        if (fVar instanceof AlbumModernFactory$processAssetsLocation$1) {
            albumModernFactory$processAssetsLocation$1 = (AlbumModernFactory$processAssetsLocation$1) fVar;
            int i10 = albumModernFactory$processAssetsLocation$1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                albumModernFactory$processAssetsLocation$1.label = i10 - a.INVALID_ID;
            } else {
                albumModernFactory$processAssetsLocation$1 = new AlbumModernFactory$processAssetsLocation$1(this, fVar);
            }
        }
        Object objM281copydXLngQ8 = albumModernFactory$processAssetsLocation$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = albumModernFactory$processAssetsLocation$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM281copydXLngQ8);
            if (z10) {
                MediaStorePermissionsDelegate mediaStorePermissionsDelegate = this.mediaStorePermissionsDelegate;
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Asset) it3.next()).getContentUri());
                }
                albumModernFactory$processAssetsLocation$1.L$0 = list;
                albumModernFactory$processAssetsLocation$1.L$1 = str;
                albumModernFactory$processAssetsLocation$1.label = 1;
            } else {
                ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(list, 10));
                it = list.iterator();
                collection = arrayList3;
                str2 = str;
                if (it.hasNext()) {
                }
            }
        } else if (i11 == 1) {
            str = (String) albumModernFactory$processAssetsLocation$1.L$1;
            list = (List) albumModernFactory$processAssetsLocation$1.L$0;
            AbstractC2753p.b(objM281copydXLngQ8);
        } else if (i11 == 2) {
            Collection collection2 = (Collection) albumModernFactory$processAssetsLocation$1.L$3;
            it2 = (Iterator) albumModernFactory$processAssetsLocation$1.L$2;
            arrayList = (Collection) albumModernFactory$processAssetsLocation$1.L$1;
            str3 = (String) albumModernFactory$processAssetsLocation$1.L$0;
            AbstractC2753p.b(objM281copydXLngQ8);
            collection2.add(C2735B.f28704a);
            collection2 = arrayList;
            if (it2.hasNext()) {
                Asset asset = (Asset) it2.next();
                albumModernFactory$processAssetsLocation$1.L$0 = str3;
                albumModernFactory$processAssetsLocation$1.L$1 = collection2;
                albumModernFactory$processAssetsLocation$1.L$2 = it2;
                albumModernFactory$processAssetsLocation$1.L$3 = collection2;
                albumModernFactory$processAssetsLocation$1.label = 2;
                if (asset.m283movedXLngQ8(str3, albumModernFactory$processAssetsLocation$1) != objE) {
                    arrayList = collection2;
                    collection2.add(C2735B.f28704a);
                    collection2 = arrayList;
                    if (it2.hasNext()) {
                        return C2735B.f28704a;
                    }
                }
                return objE;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) albumModernFactory$processAssetsLocation$1.L$3;
            it = (Iterator) albumModernFactory$processAssetsLocation$1.L$2;
            Collection collection3 = (Collection) albumModernFactory$processAssetsLocation$1.L$1;
            String str4 = (String) albumModernFactory$processAssetsLocation$1.L$0;
            AbstractC2753p.b(objM281copydXLngQ8);
            collection.add((Asset) objM281copydXLngQ8);
            collection = collection3;
            str2 = str4;
            if (it.hasNext()) {
                Asset asset2 = (Asset) it.next();
                albumModernFactory$processAssetsLocation$1.L$0 = str2;
                albumModernFactory$processAssetsLocation$1.L$1 = collection;
                albumModernFactory$processAssetsLocation$1.L$2 = it;
                albumModernFactory$processAssetsLocation$1.L$3 = collection;
                albumModernFactory$processAssetsLocation$1.label = 3;
                objM281copydXLngQ8 = asset2.m281copydXLngQ8(str2, albumModernFactory$processAssetsLocation$1);
                if (objM281copydXLngQ8 != objE) {
                    str4 = str2;
                    collection3 = collection;
                    collection.add((Asset) objM281copydXLngQ8);
                    collection = collection3;
                    str2 = str4;
                    if (it.hasNext()) {
                        return C2735B.f28704a;
                    }
                }
                return objE;
            }
        }
        arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        str3 = str;
        it2 = list.iterator();
        collection2 = arrayList;
        if (it2.hasNext()) {
        }
    }

    @Override // expo.modules.medialibrary.next.objects.album.factories.AlbumFactory
    public Album create(String id) {
        AbstractC2855l.g(id, "id");
        return new Album(id, this.assetDeleter, this.assetFactory, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.album.factories.AlbumFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createFromAssets(String str, List<Asset> list, boolean z10, n7.f fVar) throws AlbumCouldNotBeCreated, AlbumNotFoundException {
        AnonymousClass1 anonymousClass1;
        Object objM282getMimeTypedctPOJs;
        String strM320createwht0CjE;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objM269queryAlbumIdqTZuolk = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
                Asset asset = list.get(0);
                anonymousClass1.L$0 = str;
                anonymousClass1.L$1 = list;
                anonymousClass1.Z$0 = z10;
                anonymousClass1.label = 1;
                objM282getMimeTypedctPOJs = asset.m282getMimeTypedctPOJs(anonymousClass1);
                if (objM282getMimeTypedctPOJs == objE) {
                }
                return objE;
            }
            if (i11 == 1) {
                z10 = anonymousClass1.Z$0;
                list = (List) anonymousClass1.L$1;
                str = (String) anonymousClass1.L$0;
                AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
                objM282getMimeTypedctPOJs = ((MimeType) objM269queryAlbumIdqTZuolk).m309unboximpl();
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    strM320createwht0CjE = (String) anonymousClass1.L$0;
                    AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
                    String str2 = (String) objM269queryAlbumIdqTZuolk;
                    if (str2 != null) {
                        return new Album(str2, this.assetDeleter, this.assetFactory, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
                    }
                    throw new AlbumNotFoundException("Could not find album with relativePath: " + RelativePath.m317toStringimpl(strM320createwht0CjE), null, 2, null);
                }
                strM320createwht0CjE = (String) anonymousClass1.L$0;
                AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
                ContentResolver contentResolver = getContentResolver();
                anonymousClass1.L$0 = strM320createwht0CjE;
                anonymousClass1.label = 3;
                objM269queryAlbumIdqTZuolk = AlbumExtensionsKt.m269queryAlbumIdqTZuolk(contentResolver, strM320createwht0CjE, anonymousClass1);
            }
            strM320createwht0CjE = RelativePath.INSTANCE.m320createwht0CjE((String) objM282getMimeTypedctPOJs, str);
            anonymousClass1.L$0 = strM320createwht0CjE;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (m280processAssetsLocationKTsBHyQ(list, strM320createwht0CjE, z10, anonymousClass1) != objE) {
                ContentResolver contentResolver2 = getContentResolver();
                anonymousClass1.L$0 = strM320createwht0CjE;
                anonymousClass1.label = 3;
                objM269queryAlbumIdqTZuolk = AlbumExtensionsKt.m269queryAlbumIdqTZuolk(contentResolver2, strM320createwht0CjE, anonymousClass1);
            }
            return objE;
        } catch (IOException e10) {
            throw new AlbumCouldNotBeCreated("I/O error while creating album: " + e10.getMessage(), e10);
        } catch (SecurityException e11) {
            throw new AlbumCouldNotBeCreated("Security Exception: " + e11.getMessage(), e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.medialibrary.next.objects.album.factories.AlbumFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createFromFilePaths(String str, List<? extends Uri> list, n7.f fVar) throws AlbumCouldNotBeCreated {
        C25411 c25411;
        String str2;
        Iterator it;
        if (fVar instanceof C25411) {
            c25411 = (C25411) fVar;
            int i10 = c25411.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25411.label = i10 - a.INVALID_ID;
            } else {
                c25411 = new C25411(fVar);
            }
        }
        Object objM269queryAlbumIdqTZuolk = c25411.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25411.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
            String strM320createwht0CjE = RelativePath.INSTANCE.m320createwht0CjE(MimeType.INSTANCE.m310fromdctPOJs(list.get(0)), str);
            Iterator it2 = list.iterator();
            str2 = strM320createwht0CjE;
            it = it2;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
                String str3 = (String) objM269queryAlbumIdqTZuolk;
                if (str3 != null) {
                    return new Album(str3, this.assetDeleter, this.assetFactory, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
                }
                throw new AlbumCouldNotBeCreated("Failed to create album: newly created album was not found in the MediaStore.", null, 2, null);
            }
            it = (Iterator) c25411.L$1;
            str2 = (String) c25411.L$0;
            AbstractC2753p.b(objM269queryAlbumIdqTZuolk);
        }
        while (true) {
            if (it.hasNext()) {
                Uri uri = (Uri) it.next();
                AssetFactory assetFactory = this.assetFactory;
                c25411.L$0 = str2;
                c25411.L$1 = it;
                c25411.label = 1;
                if (assetFactory.mo289createBuevYFM(uri, str2, c25411) == objE) {
                    break;
                }
            } else {
                ContentResolver contentResolver = getContentResolver();
                c25411.L$0 = null;
                c25411.L$1 = null;
                c25411.label = 2;
                objM269queryAlbumIdqTZuolk = AlbumExtensionsKt.m269queryAlbumIdqTZuolk(contentResolver, str2, c25411);
            }
        }
        return objE;
    }
}

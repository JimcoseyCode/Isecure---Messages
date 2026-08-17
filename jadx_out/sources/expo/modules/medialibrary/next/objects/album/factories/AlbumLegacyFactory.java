package expo.modules.medialibrary.next.objects.album.factories;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.AlbumCouldNotBeCreated;
import expo.modules.medialibrary.next.exceptions.AlbumNotFoundException;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.asset.factories.AssetFactory;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\u0014\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\nH\u0096@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\"\u0010(\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\u00060\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;", "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "assetFactory", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "assets", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteOriginalAssets", "Li7/B;", "processAssetsLocation-KTsBHyQ", "(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "processAssetsLocation", "createAlbumDirectoryIfNotExists-YsBE8GI", "(Ljava/lang/String;)V", "createAlbumDirectoryIfNotExists", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Lexpo/modules/medialibrary/next/objects/album/Album;", "create", "(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;", "albumName", "createFromAssets", "(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;", "Landroid/net/Uri;", "filePaths", "createFromFilePaths", "(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AlbumLegacyFactory implements AlbumFactory {
    private final AssetDeleter assetDeleter;
    private final AssetFactory assetFactory;
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.factories.AlbumLegacyFactory$createFromAssets$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.factories.AlbumLegacyFactory", f = "AlbumLegacyFactory.kt", l = {43, 46, 47}, m = "createFromAssets")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AlbumLegacyFactory.this.createFromAssets(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.album.factories.AlbumLegacyFactory$createFromFilePaths$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.album.factories.AlbumLegacyFactory", f = "AlbumLegacyFactory.kt", l = {63, 65}, m = "createFromFilePaths")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25401 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C25401(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AlbumLegacyFactory.this.createFromFilePaths(null, null, this);
        }
    }

    public AlbumLegacyFactory(AssetFactory assetFactory, AssetDeleter assetDeleter, Context context) {
        AbstractC2855l.g(assetFactory, "assetFactory");
        AbstractC2855l.g(assetDeleter, "assetDeleter");
        AbstractC2855l.g(context, "context");
        this.assetFactory = assetFactory;
        this.assetDeleter = assetDeleter;
        this.contextRef = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: createAlbumDirectoryIfNotExists-YsBE8GI, reason: not valid java name */
    private final void m277createAlbumDirectoryIfNotExistsYsBE8GI(String relativePath) throws AlbumCouldNotBeCreated {
        File file = new File(RelativePath.m316toFilePathimpl(relativePath));
        if (!file.exists() && !file.mkdirs()) {
            file = null;
        }
        if (file == null) {
            throw new AlbumCouldNotBeCreated("Could not create album directory", null, 2, null);
        }
    }

    private final ContentResolver getContentResolver() throws AlbumCouldNotBeCreated {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new AlbumCouldNotBeCreated("Failed to create album: ContentResolver is unavailable.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008e -> B:25:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c9 -> B:34:0x00cb). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: processAssetsLocation-KTsBHyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m278processAssetsLocationKTsBHyQ(List<Asset> list, String str, boolean z10, n7.f fVar) {
        AlbumLegacyFactory$processAssetsLocation$1 albumLegacyFactory$processAssetsLocation$1;
        Iterator it;
        Collection collection;
        String str2;
        Iterator it2;
        Collection collection2;
        String str3;
        if (fVar instanceof AlbumLegacyFactory$processAssetsLocation$1) {
            albumLegacyFactory$processAssetsLocation$1 = (AlbumLegacyFactory$processAssetsLocation$1) fVar;
            int i10 = albumLegacyFactory$processAssetsLocation$1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                albumLegacyFactory$processAssetsLocation$1.label = i10 - a.INVALID_ID;
            } else {
                albumLegacyFactory$processAssetsLocation$1 = new AlbumLegacyFactory$processAssetsLocation$1(this, fVar);
            }
        }
        Object objM281copydXLngQ8 = albumLegacyFactory$processAssetsLocation$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = albumLegacyFactory$processAssetsLocation$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objM281copydXLngQ8);
            if (z10) {
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
                it2 = list.iterator();
                collection2 = arrayList;
                str3 = str;
                if (it2.hasNext()) {
                }
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
                it = list.iterator();
                collection = arrayList2;
                str2 = str;
                if (it.hasNext()) {
                }
            }
        } else if (i11 == 1) {
            collection2 = (Collection) albumLegacyFactory$processAssetsLocation$1.L$3;
            it2 = (Iterator) albumLegacyFactory$processAssetsLocation$1.L$2;
            Collection collection3 = (Collection) albumLegacyFactory$processAssetsLocation$1.L$1;
            String str4 = (String) albumLegacyFactory$processAssetsLocation$1.L$0;
            AbstractC2753p.b(objM281copydXLngQ8);
            collection2.add(C2735B.f28704a);
            collection2 = collection3;
            str3 = str4;
            if (it2.hasNext()) {
                Asset asset = (Asset) it2.next();
                albumLegacyFactory$processAssetsLocation$1.L$0 = str3;
                albumLegacyFactory$processAssetsLocation$1.L$1 = collection2;
                albumLegacyFactory$processAssetsLocation$1.L$2 = it2;
                albumLegacyFactory$processAssetsLocation$1.L$3 = collection2;
                albumLegacyFactory$processAssetsLocation$1.label = 1;
                if (asset.m283movedXLngQ8(str3, albumLegacyFactory$processAssetsLocation$1) != objE) {
                    str4 = str3;
                    collection3 = collection2;
                    collection2.add(C2735B.f28704a);
                    collection2 = collection3;
                    str3 = str4;
                    if (it2.hasNext()) {
                        return C2735B.f28704a;
                    }
                }
                return objE;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) albumLegacyFactory$processAssetsLocation$1.L$3;
            it = (Iterator) albumLegacyFactory$processAssetsLocation$1.L$2;
            Collection collection4 = (Collection) albumLegacyFactory$processAssetsLocation$1.L$1;
            String str5 = (String) albumLegacyFactory$processAssetsLocation$1.L$0;
            AbstractC2753p.b(objM281copydXLngQ8);
            collection.add((Asset) objM281copydXLngQ8);
            collection = collection4;
            str2 = str5;
            if (it.hasNext()) {
                Asset asset2 = (Asset) it.next();
                albumLegacyFactory$processAssetsLocation$1.L$0 = str2;
                albumLegacyFactory$processAssetsLocation$1.L$1 = collection;
                albumLegacyFactory$processAssetsLocation$1.L$2 = it;
                albumLegacyFactory$processAssetsLocation$1.L$3 = collection;
                albumLegacyFactory$processAssetsLocation$1.label = 2;
                objM281copydXLngQ8 = asset2.m281copydXLngQ8(str2, albumLegacyFactory$processAssetsLocation$1);
                if (objM281copydXLngQ8 != objE) {
                    str5 = str2;
                    collection4 = collection;
                    collection.add((Asset) objM281copydXLngQ8);
                    collection = collection4;
                    str2 = str5;
                    if (it.hasNext()) {
                        return C2735B.f28704a;
                    }
                }
                return objE;
            }
        }
    }

    @Override // expo.modules.medialibrary.next.objects.album.factories.AlbumFactory
    public Album create(String id) {
        AbstractC2855l.g(id, "id");
        return new Album(id, this.assetDeleter, this.assetFactory, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (r10 != r0) goto L40;
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
        Object objQueryAssetBucketId = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(objQueryAssetBucketId);
                Asset asset = (Asset) AbstractC2800q.g0(list);
                if (asset == null) {
                    throw new AlbumCouldNotBeCreated("No assets provided", null, 2, null);
                }
                anonymousClass1.L$0 = str;
                anonymousClass1.L$1 = list;
                anonymousClass1.label = 1;
                objM282getMimeTypedctPOJs = asset.m282getMimeTypedctPOJs(anonymousClass1);
                if (objM282getMimeTypedctPOJs == objE) {
                }
                return objE;
            }
            if (i11 == 1) {
                list = (List) anonymousClass1.L$1;
                str = (String) anonymousClass1.L$0;
                AbstractC2753p.b(objQueryAssetBucketId);
                objM282getMimeTypedctPOJs = ((MimeType) objQueryAssetBucketId).m309unboximpl();
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    strM320createwht0CjE = (String) anonymousClass1.L$0;
                    AbstractC2753p.b(objQueryAssetBucketId);
                    Integer num = (Integer) objQueryAssetBucketId;
                    if (num != null) {
                        return new Album(String.valueOf(num.intValue()), this.assetDeleter, this.assetFactory, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
                    }
                    throw new AlbumNotFoundException("Could not find album with filePath: " + RelativePath.m316toFilePathimpl(strM320createwht0CjE), null, 2, null);
                }
                strM320createwht0CjE = (String) anonymousClass1.L$1;
                list = (List) anonymousClass1.L$0;
                AbstractC2753p.b(objQueryAssetBucketId);
                ContentResolver contentResolver = getContentResolver();
                Uri contentUri = list.get(0).getContentUri();
                anonymousClass1.L$0 = strM320createwht0CjE;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                objQueryAssetBucketId = AssetExtensionsKt.queryAssetBucketId(contentResolver, contentUri, anonymousClass1);
            }
            strM320createwht0CjE = RelativePath.INSTANCE.m320createwht0CjE((String) objM282getMimeTypedctPOJs, str);
            m277createAlbumDirectoryIfNotExistsYsBE8GI(strM320createwht0CjE);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = strM320createwht0CjE;
            anonymousClass1.label = 2;
            if (m278processAssetsLocationKTsBHyQ(list, strM320createwht0CjE, true, anonymousClass1) != objE) {
                ContentResolver contentResolver2 = getContentResolver();
                Uri contentUri2 = list.get(0).getContentUri();
                anonymousClass1.L$0 = strM320createwht0CjE;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                objQueryAssetBucketId = AssetExtensionsKt.queryAssetBucketId(contentResolver2, contentUri2, anonymousClass1);
            }
            return objE;
        } catch (IOException e10) {
            throw new AlbumCouldNotBeCreated("IO error while creating album: " + e10.getMessage(), e10);
        } catch (SecurityException e11) {
            throw new AlbumCouldNotBeCreated("Missing WRITE_EXTERNAL_STORAGE permission: " + e11.getMessage(), e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009b -> B:25:0x009f). Please report as a decompilation issue!!! */
    @Override // expo.modules.medialibrary.next.objects.album.factories.AlbumFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createFromFilePaths(String str, List<? extends Uri> list, n7.f fVar) throws AlbumCouldNotBeCreated {
        C25401 c25401;
        String str2;
        Collection collection;
        Iterator it;
        String str3;
        Integer num;
        if (fVar instanceof C25401) {
            c25401 = (C25401) fVar;
            int i10 = c25401.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25401.label = i10 - a.INVALID_ID;
            } else {
                c25401 = new C25401(fVar);
            }
        }
        Object objQueryAssetBucketId = c25401.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25401.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryAssetBucketId);
            Uri uri = (Uri) AbstractC2800q.g0(list);
            if (uri == null) {
                throw new AlbumCouldNotBeCreated("No file paths provided", null, 2, null);
            }
            String strM320createwht0CjE = RelativePath.INSTANCE.m320createwht0CjE(MimeType.INSTANCE.m310fromdctPOJs(uri), str);
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator it2 = list.iterator();
            str2 = strM320createwht0CjE;
            collection = arrayList;
            it = it2;
            if (it.hasNext()) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) c25401.L$0;
            AbstractC2753p.b(objQueryAssetBucketId);
            num = (Integer) objQueryAssetBucketId;
            if (num == null) {
                return new Album(String.valueOf(num.intValue()), this.assetDeleter, this.assetFactory, WeakReferenceExtensionsKt.getOrThrow(this.contextRef));
            }
            throw new AlbumCouldNotBeCreated("Could not find album with relativePath: " + RelativePath.m317toStringimpl(str3), null, 2, null);
        }
        collection = (Collection) c25401.L$3;
        Iterator it3 = (Iterator) c25401.L$2;
        Collection collection2 = (Collection) c25401.L$1;
        String str4 = (String) c25401.L$0;
        AbstractC2753p.b(objQueryAssetBucketId);
        C25401 c254012 = c25401;
        Iterator it4 = it3;
        str2 = str4;
        C25401 c254013 = c254012;
        collection.add((Asset) objQueryAssetBucketId);
        it = it4;
        collection = collection2;
        c25401 = c254013;
        if (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            AssetFactory assetFactory = this.assetFactory;
            c25401.L$0 = str2;
            c25401.L$1 = collection;
            c25401.L$2 = it;
            c25401.L$3 = collection;
            c25401.label = 1;
            Object objMo289createBuevYFM = assetFactory.mo289createBuevYFM(uri2, str2, c25401);
            if (objMo289createBuevYFM != objE) {
                c254013 = c25401;
                it4 = it;
                objQueryAssetBucketId = objMo289createBuevYFM;
                collection2 = collection;
                collection.add((Asset) objQueryAssetBucketId);
                it = it4;
                collection = collection2;
                c25401 = c254013;
                if (it.hasNext()) {
                    ContentResolver contentResolver = getContentResolver();
                    Uri contentUri = ((Asset) ((List) collection).get(0)).getContentUri();
                    c25401.L$0 = str2;
                    c25401.L$1 = null;
                    c25401.L$2 = null;
                    c25401.L$3 = null;
                    c25401.label = 2;
                    objQueryAssetBucketId = AssetExtensionsKt.queryAssetBucketId(contentResolver, contentUri, c25401);
                    if (objQueryAssetBucketId != objE) {
                        str3 = str2;
                        num = (Integer) objQueryAssetBucketId;
                        if (num == null) {
                        }
                    }
                }
            }
        }
        return objE;
    }
}

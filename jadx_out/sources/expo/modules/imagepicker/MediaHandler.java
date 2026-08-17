package expo.modules.imagepicker;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.imagepicker.exporters.CompressionImageExporter;
import expo.modules.imagepicker.exporters.ImageExportResult;
import expo.modules.imagepicker.exporters.ImageExporter;
import expo.modules.imagepicker.exporters.RawImageExporter;
import expo.modules.kotlin.providers.AppContextProvider;
import i7.AbstractC2753p;
import i7.C2750m;
import i7.C2752o;
import j7.AbstractC2800q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u001b\u001a\u00020\u00182\u001e\u0010\u0017\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u00140\u0013j\u0002`\u00162\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lexpo/modules/imagepicker/MediaHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/providers/AppContextProvider;", "appContextProvider", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", "Landroid/net/Uri;", "sourceUri", "Lexpo/modules/imagepicker/ImagePickerOptions;", "options", "Lexpo/modules/imagepicker/ImagePickerAsset;", "handleImage", "(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;", "uri", "Lexpo/modules/imagepicker/AdditionalFileData;", "getAdditionalFileData", "(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;", "handleVideo", "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "Lexpo/modules/imagepicker/MediaType;", "Lexpo/modules/imagepicker/contracts/MediaList;", "bareResult", "Lexpo/modules/imagepicker/ImagePickerResponse;", "readExtras$expo_image_picker_release", "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;", "readExtras", "Lexpo/modules/kotlin/providers/AppContextProvider;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaHandler {
    private final AppContextProvider appContextProvider;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.MediaHandler$handleImage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", l = {58, 60, 63}, m = "handleImage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return MediaHandler.this.handleImage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.MediaHandler$handleVideo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", l = {102}, m = "handleVideo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24761 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C24761(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return MediaHandler.this.handleVideo(null, this);
        }
    }

    public MediaHandler(AppContextProvider appContextProvider) {
        AbstractC2855l.g(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    private final AdditionalFileData getAdditionalFileData(Uri uri) throws IOException {
        Object objB;
        Cursor cursorQuery = getContext().getContentResolver().query(uri, (String[]) AbstractC2800q.m("_display_name", "_size").toArray(new String[0]), null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                AbstractC3376c.a(cursorQuery, null);
                return null;
            }
            try {
                C2752o.a aVar = C2752o.f28721h;
                Integer numValueOf = Integer.valueOf(cursorQuery.getColumnIndex("_display_name"));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                String string = numValueOf != null ? cursorQuery.getString(numValueOf.intValue()) : null;
                Integer numValueOf2 = Integer.valueOf(cursorQuery.getColumnIndex("_size"));
                if (numValueOf2.intValue() == -1) {
                    numValueOf2 = null;
                }
                objB = C2752o.b(new AdditionalFileData(string, numValueOf2 != null ? Long.valueOf(cursorQuery.getLong(numValueOf2.intValue())) : null));
            } catch (Throwable th) {
                C2752o.a aVar2 = C2752o.f28721h;
                objB = C2752o.b(AbstractC2753p.a(th));
            }
            if (C2752o.f(objB)) {
                objB = null;
            }
            AdditionalFileData additionalFileData = (AdditionalFileData) objB;
            AbstractC3376c.a(cursorQuery, null);
            return additionalFileData;
        } finally {
        }
    }

    private final File getCacheDirectory() {
        return this.appContextProvider.getAppContext().getCacheDirectory();
    }

    private final Context getContext() {
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleImage(Uri uri, ImagePickerOptions imagePickerOptions, n7.f fVar) throws IOException, FailedToCreateFileException {
        AnonymousClass1 anonymousClass1;
        ImagePickerOptions imagePickerOptions2;
        String str;
        File file;
        ImageExportResult imageExportResult;
        Uri uri2;
        ImageExportResult imageExportResult2;
        ImagePickerOptions imagePickerOptions3;
        String str2;
        Boolean boolA;
        String str3;
        ImageExportResult imageExportResult3;
        String str4;
        Uri uri3;
        ByteArrayOutputStream byteArrayOutputStream;
        AdditionalFileData additionalFileData;
        String name;
        Long fileSize;
        Uri uri4 = uri;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objExportAsync = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        Bundle bundle = null;
        if (i11 == 0) {
            AbstractC2753p.b(objExportAsync);
            ImageExporter rawImageExporter = imagePickerOptions.getQuality() == 1.0d ? new RawImageExporter() : new CompressionImageExporter(this.appContextProvider, imagePickerOptions.getQuality());
            ContentResolver contentResolver = getContext().getContentResolver();
            AbstractC2855l.f(contentResolver, "getContentResolver(...)");
            String type = ImagePickerUtilsKt.getType(contentResolver, uri4);
            if (type == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            File fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ImagePickerUtilsKt.toImageFileExtension(type));
            ContentResolver contentResolver2 = getContext().getContentResolver();
            AbstractC2855l.f(contentResolver2, "getContentResolver(...)");
            anonymousClass1.L$0 = uri4;
            imagePickerOptions2 = imagePickerOptions;
            anonymousClass1.L$1 = imagePickerOptions2;
            anonymousClass1.L$2 = type;
            anonymousClass1.L$3 = fileCreateOutputFile;
            anonymousClass1.label = 1;
            objExportAsync = rawImageExporter.exportAsync(uri4, fileCreateOutputFile, contentResolver2, anonymousClass1);
            if (objExportAsync != objE) {
                str = type;
                file = fileCreateOutputFile;
            }
            return objE;
        }
        if (i11 == 1) {
            File file2 = (File) anonymousClass1.L$3;
            String str5 = (String) anonymousClass1.L$2;
            ImagePickerOptions imagePickerOptions4 = (ImagePickerOptions) anonymousClass1.L$1;
            Uri uri5 = (Uri) anonymousClass1.L$0;
            AbstractC2753p.b(objExportAsync);
            imagePickerOptions2 = imagePickerOptions4;
            str = str5;
            file = file2;
            uri4 = uri5;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) anonymousClass1.L$4;
                imageExportResult3 = (ImageExportResult) anonymousClass1.L$3;
                file = (File) anonymousClass1.L$2;
                str4 = (String) anonymousClass1.L$1;
                uri3 = (Uri) anonymousClass1.L$0;
                AbstractC2753p.b(objExportAsync);
                bundle = (Bundle) objExportAsync;
                uri2 = uri3;
                imageExportResult = imageExportResult3;
                str3 = str4;
                String str6 = str2;
                Bundle bundle2 = bundle;
                additionalFileData = getAdditionalFileData(uri2);
                Uri uri6 = uri2;
                MediaType mediaType = MediaType.IMAGE;
                String string = Uri.fromFile(file).toString();
                AbstractC2855l.f(string, "toString(...)");
                int width = imageExportResult.getWidth();
                int height = imageExportResult.getHeight();
                if (additionalFileData == null || (name = additionalFileData.getFileName()) == null) {
                    name = file.getName();
                }
                return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri6), mediaType, string, width, height, name, kotlin.coroutines.jvm.internal.b.d((additionalFileData == null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str6, bundle2, null, null, 3072, null);
            }
            imageExportResult2 = (ImageExportResult) anonymousClass1.L$4;
            file = (File) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            imagePickerOptions3 = (ImagePickerOptions) anonymousClass1.L$1;
            uri2 = (Uri) anonymousClass1.L$0;
            AbstractC2753p.b(objExportAsync);
            byteArrayOutputStream = (ByteArrayOutputStream) objExportAsync;
            if (byteArrayOutputStream == null) {
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                imageExportResult = imageExportResult2;
                str2 = strEncodeToString;
                boolA = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
                if (!boolA.booleanValue()) {
                    boolA = null;
                }
                if (boolA == null) {
                    str3 = str;
                    String str62 = str2;
                    Bundle bundle22 = bundle;
                    additionalFileData = getAdditionalFileData(uri2);
                    Uri uri62 = uri2;
                    MediaType mediaType2 = MediaType.IMAGE;
                    String string2 = Uri.fromFile(file).toString();
                    AbstractC2855l.f(string2, "toString(...)");
                    int width2 = imageExportResult.getWidth();
                    int height2 = imageExportResult.getHeight();
                    if (additionalFileData == null) {
                    }
                    return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri62), mediaType2, string2, width2, height2, name, kotlin.coroutines.jvm.internal.b.d((additionalFileData == null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str62, bundle22, null, null, 3072, null);
                }
                ContentResolver contentResolver3 = getContext().getContentResolver();
                AbstractC2855l.f(contentResolver3, "getContentResolver(...)");
                anonymousClass1.L$0 = uri2;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = file;
                anonymousClass1.L$3 = imageExportResult;
                anonymousClass1.L$4 = str2;
                anonymousClass1.label = 3;
                Object objExif = imageExportResult.exif(contentResolver3, anonymousClass1);
                if (objExif != objE) {
                    imageExportResult3 = imageExportResult;
                    objExportAsync = objExif;
                    str4 = str;
                    uri3 = uri2;
                    bundle = (Bundle) objExportAsync;
                    uri2 = uri3;
                    imageExportResult = imageExportResult3;
                    str3 = str4;
                    String str622 = str2;
                    Bundle bundle222 = bundle;
                    additionalFileData = getAdditionalFileData(uri2);
                    Uri uri622 = uri2;
                    MediaType mediaType22 = MediaType.IMAGE;
                    String string22 = Uri.fromFile(file).toString();
                    AbstractC2855l.f(string22, "toString(...)");
                    int width22 = imageExportResult.getWidth();
                    int height22 = imageExportResult.getHeight();
                    if (additionalFileData == null) {
                        name = file.getName();
                    }
                    return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri622), mediaType22, string22, width22, height22, name, kotlin.coroutines.jvm.internal.b.d((additionalFileData == null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str622, bundle222, null, null, 3072, null);
                }
                return objE;
            }
            imageExportResult = imageExportResult2;
            imagePickerOptions2 = imagePickerOptions3;
            uri4 = uri2;
            uri2 = uri4;
            str2 = null;
            imagePickerOptions3 = imagePickerOptions2;
            boolA = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
            if (!boolA.booleanValue()) {
            }
            if (boolA == null) {
            }
        }
        imageExportResult = (ImageExportResult) objExportAsync;
        Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions2.getBase64());
        if (!boolA2.booleanValue()) {
            boolA2 = null;
        }
        if (boolA2 != null) {
            ContentResolver contentResolver4 = getContext().getContentResolver();
            AbstractC2855l.f(contentResolver4, "getContentResolver(...)");
            anonymousClass1.L$0 = uri4;
            anonymousClass1.L$1 = imagePickerOptions2;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = file;
            anonymousClass1.L$4 = imageExportResult;
            anonymousClass1.label = 2;
            Object objData = imageExportResult.data(contentResolver4, anonymousClass1);
            if (objData != objE) {
                uri2 = uri4;
                imageExportResult2 = imageExportResult;
                objExportAsync = objData;
                imagePickerOptions3 = imagePickerOptions2;
                byteArrayOutputStream = (ByteArrayOutputStream) objExportAsync;
                if (byteArrayOutputStream == null) {
                }
            }
            return objE;
        }
        uri2 = uri4;
        str2 = null;
        imagePickerOptions3 = imagePickerOptions2;
        boolA = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
        if (!boolA.booleanValue()) {
        }
        if (boolA == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleVideo(Uri uri, n7.f fVar) throws IOException, FailedToCreateFileException, FailedToExtractVideoMetadataException {
        C24761 c24761;
        File fileCreateOutputFile;
        Uri uri2 = uri;
        if (fVar instanceof C24761) {
            c24761 = (C24761) fVar;
            int i10 = c24761.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24761.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24761 = new C24761(fVar);
            }
        }
        Object obj = c24761.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24761.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ".mp4");
            ContentResolver contentResolver = getContext().getContentResolver();
            AbstractC2855l.f(contentResolver, "getContentResolver(...)");
            c24761.L$0 = uri2;
            c24761.L$1 = fileCreateOutputFile;
            c24761.label = 1;
            if (ImagePickerUtilsKt.copyFile(uri2, fileCreateOutputFile, contentResolver, c24761) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            File file = (File) c24761.L$1;
            Uri uri3 = (Uri) c24761.L$0;
            AbstractC2753p.b(obj);
            fileCreateOutputFile = file;
            uri2 = uri3;
        }
        Uri uriFromFile = Uri.fromFile(fileCreateOutputFile);
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(getContext(), uriFromFile);
            AdditionalFileData additionalFileData = getAdditionalFileData(uri2);
            ContentResolver contentResolver2 = getContext().getContentResolver();
            AbstractC2855l.f(contentResolver2, "getContentResolver(...)");
            String type = ImagePickerUtilsKt.getType(contentResolver2, uri2);
            A a10 = new A();
            a10.f29369g = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 18);
            A a11 = new A();
            a11.f29369g = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 19);
            int iExtractInt = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 24);
            if (iExtractInt % 180 != 0) {
                int i12 = a11.f29369g;
                a11.f29369g = a10.f29369g;
                a10.f29369g = i12;
            }
            MediaType mediaType = MediaType.VIDEO;
            String string = uriFromFile.toString();
            AbstractC2855l.f(string, "toString(...)");
            return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType, string, a10.f29369g, a11.f29369g, additionalFileData != null ? additionalFileData.getFileName() : null, additionalFileData != null ? additionalFileData.getFileSize() : null, type, null, null, kotlin.coroutines.jvm.internal.b.c(ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 9)), kotlin.coroutines.jvm.internal.b.c(iExtractInt), 768, null);
        } catch (FailedToExtractVideoMetadataException e10) {
            throw new FailedToExtractVideoMetadataException(fileCreateOutputFile, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b2 -> B:30:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d5 -> B:39:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readExtras$expo_image_picker_release(List<? extends Pair<? extends MediaType, ? extends Uri>> list, ImagePickerOptions imagePickerOptions, n7.f fVar) throws IOException, FailedToCreateFileException, FailedToExtractVideoMetadataException {
        MediaHandler$readExtras$1 mediaHandler$readExtras$1;
        Iterator it;
        Collection collection;
        ImagePickerOptions imagePickerOptions2;
        ImagePickerOptions imagePickerOptions3;
        Collection collection2;
        ImagePickerAsset imagePickerAsset;
        if (fVar instanceof MediaHandler$readExtras$1) {
            mediaHandler$readExtras$1 = (MediaHandler$readExtras$1) fVar;
            int i10 = mediaHandler$readExtras$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                mediaHandler$readExtras$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                mediaHandler$readExtras$1 = new MediaHandler$readExtras$1(this, fVar);
            }
        }
        Object obj = mediaHandler$readExtras$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = mediaHandler$readExtras$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            it = list.iterator();
            collection = arrayList;
            imagePickerOptions2 = imagePickerOptions;
            if (!it.hasNext()) {
            }
        } else if (i11 == 1) {
            collection = (Collection) mediaHandler$readExtras$1.L$3;
            it = (Iterator) mediaHandler$readExtras$1.L$2;
            collection2 = (Collection) mediaHandler$readExtras$1.L$1;
            imagePickerOptions3 = (ImagePickerOptions) mediaHandler$readExtras$1.L$0;
            AbstractC2753p.b(obj);
            imagePickerAsset = (ImagePickerAsset) obj;
            collection.add(imagePickerAsset);
            collection = collection2;
            imagePickerOptions2 = imagePickerOptions3;
            if (!it.hasNext()) {
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) mediaHandler$readExtras$1.L$3;
            it = (Iterator) mediaHandler$readExtras$1.L$2;
            collection2 = (Collection) mediaHandler$readExtras$1.L$1;
            imagePickerOptions3 = (ImagePickerOptions) mediaHandler$readExtras$1.L$0;
            AbstractC2753p.b(obj);
            imagePickerAsset = (ImagePickerAsset) obj;
            collection.add(imagePickerAsset);
            collection = collection2;
            imagePickerOptions2 = imagePickerOptions3;
            if (!it.hasNext()) {
                Pair pair = (Pair) it.next();
                MediaType mediaType = (MediaType) pair.getFirst();
                Uri uri = (Uri) pair.getSecond();
                int i12 = mediaType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mediaType.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1) {
                        mediaHandler$readExtras$1.L$0 = imagePickerOptions2;
                        mediaHandler$readExtras$1.L$1 = collection;
                        mediaHandler$readExtras$1.L$2 = it;
                        mediaHandler$readExtras$1.L$3 = collection;
                        mediaHandler$readExtras$1.label = 1;
                        Object objHandleVideo = handleVideo(uri, mediaHandler$readExtras$1);
                        if (objHandleVideo != objE) {
                            imagePickerOptions3 = imagePickerOptions2;
                            collection2 = collection;
                            imagePickerAsset = (ImagePickerAsset) objHandleVideo;
                        }
                    } else {
                        if (i12 != 2) {
                            throw new C2750m();
                        }
                        mediaHandler$readExtras$1.L$0 = imagePickerOptions2;
                        mediaHandler$readExtras$1.L$1 = collection;
                        mediaHandler$readExtras$1.L$2 = it;
                        mediaHandler$readExtras$1.L$3 = collection;
                        mediaHandler$readExtras$1.label = 2;
                        Object objHandleImage = handleImage(uri, imagePickerOptions2, mediaHandler$readExtras$1);
                        if (objHandleImage != objE) {
                            imagePickerOptions3 = imagePickerOptions2;
                            obj = objHandleImage;
                            collection2 = collection;
                            imagePickerAsset = (ImagePickerAsset) obj;
                        }
                    }
                    return objE;
                }
                String string = uri.toString();
                AbstractC2855l.f(string, "toString(...)");
                imagePickerOptions3 = imagePickerOptions2;
                collection2 = collection;
                imagePickerAsset = new ImagePickerAsset(null, null, string, 0, 0, null, null, null, null, null, null, null, 4089, null);
                collection.add(imagePickerAsset);
                collection = collection2;
                imagePickerOptions2 = imagePickerOptions3;
                if (!it.hasNext()) {
                    return new ImagePickerResponse(false, (List) collection);
                }
            }
        }
    }
}

package expo.modules.filesystem.unifiedfile;

import O8.i;
import O8.l;
import P8.q;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import j7.AbstractC2800q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3375b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010-\u001a\u0004\b\u000f\u0010/\"\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00103R\u0016\u0010=\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00103R\u0016\u0010?\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001f¨\u0006@"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/AssetFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "exists", "()Z", "isDirectory", "isFile", "Lexpo/modules/kotlin/AppContext;", "appContext", "getContentUri", "(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mimeType", "displayName", "createFile", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createDirectory", "(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "delete", "deleteRecursively", PointerEventHelper.POINTER_TYPE_UNKNOWN, "listFilesAsUnified", "()Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "lastModified", "()Ljava/lang/Long;", "append", "Ljava/io/OutputStream;", "outputStream", "(Z)Ljava/io/OutputStream;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "length", "()J", "LO8/i;", "walkTopDown", "()LO8/i;", "Landroid/content/Context;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "path", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "contentUri", "setContentUri", "(Landroid/net/Uri;)V", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "parentFile", "getType", NotificationsService.EVENT_TYPE_KEY, "getFileName", "fileName", "getCreationTime", "creationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetFile implements UnifiedFileInterface {
    private Uri contentUri;
    private final Context context;
    private final String path;
    private final Uri uri;

    /* JADX INFO: renamed from: expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1", f = "AssetFile.kt", l = {133, 139}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO8/k;", "Lexpo/modules/filesystem/unifiedfile/AssetFile;", "Li7/B;", "<anonymous>", "(LO8/k;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends k implements Function2 {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass1 anonymousClass1 = AssetFile.this.new AnonymousClass1(fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O8.k kVar, n7.f fVar) {
            return ((AnonymousClass1) create(kVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            if (r1.c(r13, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
        
            if (r7.e(r13, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c9 -> B:26:0x00cc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            O8.k kVar;
            String[] list;
            O8.k kVar2;
            int length;
            AssetFile assetFile;
            int i10;
            String[] strArr;
            Object objE = AbstractC3016b.e();
            int i11 = this.label;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                kVar = (O8.k) this.L$0;
                AssetFile assetFile2 = AssetFile.this;
                this.L$0 = kVar;
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = this.I$1;
                    i10 = this.I$0;
                    assetFile = (AssetFile) this.L$2;
                    strArr = (String[]) this.L$1;
                    kVar2 = (O8.k) this.L$0;
                    AbstractC2753p.b(obj);
                    i10++;
                    if (i10 < length) {
                        String str = strArr[i10];
                        if (assetFile.getPath().length() != 0) {
                            str = assetFile.getPath() + "/" + str;
                        }
                        i iVarWalkTopDown = new AssetFile(assetFile.context, Uri.parse("asset:///" + str)).walkTopDown();
                        this.L$0 = kVar2;
                        this.L$1 = strArr;
                        this.L$2 = assetFile;
                        this.I$0 = i10;
                        this.I$1 = length;
                        this.label = 2;
                    }
                    return C2735B.f28704a;
                }
                kVar = (O8.k) this.L$0;
                AbstractC2753p.b(obj);
            }
            if (AssetFile.this.isDirectory() && (list = AssetFile.this.context.getAssets().list(AssetFile.this.getPath())) != null) {
                AssetFile assetFile3 = AssetFile.this;
                kVar2 = kVar;
                length = list.length;
                assetFile = assetFile3;
                i10 = 0;
                strArr = list;
                if (i10 < length) {
                }
            }
            return C2735B.f28704a;
        }
    }

    public AssetFile(Context context, Uri uri) {
        String strD1;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(uri, "uri");
        this.context = context;
        this.uri = uri;
        String path = getUri().getPath();
        if (path != null && (strD1 = q.d1(path, '/')) != null) {
            this.path = strD1;
            return;
        }
        throw new IllegalArgumentException("Invalid asset URI: " + getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        AbstractC2855l.g(displayName, "displayName");
        throw new UnsupportedOperationException("Asset directories are not writable and cannot be created");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) {
        AbstractC2855l.g(mimeType, "mimeType");
        AbstractC2855l.g(displayName, "displayName");
        throw new UnsupportedOperationException("Asset files are not writable and cannot be created");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean delete() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean deleteRecursively() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean exists() {
        return isDirectory() || isFile();
    }

    public final Uri getContentUri() {
        return this.contentUri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() {
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        return getUri().getLastPathSegment();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        String path = getUri().getPath();
        if (path == null) {
            path = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if (path.length() == 0) {
            return null;
        }
        return new AssetFile(this.context, Uri.parse("asset:///" + q.a1(path, '/', null, 2, null)));
    }

    public final String getPath() {
        return this.path;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getUri().toString());
        AbstractC2855l.d(fileExtensionFromUrl);
        if (fileExtensionFromUrl.length() <= 0) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() throws IOException {
        InputStream inputStreamOpen = this.context.getAssets().open(this.path);
        AbstractC2855l.f(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isDirectory() throws IOException {
        String[] list = this.context.getAssets().list(this.path);
        if (list != null) {
            if (!(list.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isFile() {
        Object objB;
        try {
            C2752o.a aVar = C2752o.f28721h;
            AbstractC3376c.a(this.context.getAssets().open(this.path), null);
            objB = C2752o.b(Boolean.TRUE);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.d(objB) != null) {
            objB = Boolean.FALSE;
        }
        return ((Boolean) objB).booleanValue();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long lastModified() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(5:45|3|38|4|5)|(4:(2:7|8)(8:11|12|40|20|21|43|22|(5:23|(1:25)(4:48|26|27|28)|29|36|37))|43|22|(6:23|(0)(0)|29|36|37|25))|9|19|40|20|21|(3:(0)|(1:42)|(1:47))) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x005d, LOOP:0: B:23:0x004b->B:25:0x0052, LOOP_END, TryCatch #3 {all -> 0x005d, blocks: (B:22:0x0048, B:23:0x004b, B:25:0x0052, B:26:0x0055), top: B:43:0x0048, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055 A[SYNTHETIC] */
    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long length() {
        InputStream inputStreamOpen;
        byte[] bArr;
        long j10;
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        long length;
        try {
            C2752o.a aVar = C2752o.f28721h;
            assetFileDescriptorOpenFd = this.context.getAssets().openFd(this.path);
            try {
                length = assetFileDescriptorOpenFd.getLength();
            } finally {
            }
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            C2752o.b(AbstractC2753p.a(th));
        }
        try {
            if (length > 0) {
                AbstractC3376c.a(assetFileDescriptorOpenFd, null);
                return length;
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(assetFileDescriptorOpenFd, null);
            C2752o.b(C2735B.f28704a);
            inputStreamOpen = this.context.getAssets().open(this.path);
            bArr = new byte[8192];
            j10 = 0;
            while (true) {
                i10 = inputStreamOpen.read(bArr);
                if (i10 != -1) {
                    C2735B c2735b2 = C2735B.f28704a;
                    AbstractC3376c.a(inputStreamOpen, null);
                    return j10;
                }
                j10 += (long) i10;
                C2752o.a aVar3 = C2752o.f28721h;
                C2752o.b(AbstractC2753p.a(th));
                return 0L;
            }
            bArr = new byte[8192];
            j10 = 0;
            while (true) {
                i10 = inputStreamOpen.read(bArr);
                if (i10 != -1) {
                }
                C2752o.a aVar32 = C2752o.f28721h;
                C2752o.b(AbstractC2753p.a(th));
                return 0L;
                j10 += (long) i10;
            }
        } finally {
        }
        C2752o.a aVar22 = C2752o.f28721h;
        C2752o.b(AbstractC2753p.a(th));
        inputStreamOpen = this.context.getAssets().open(this.path);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() throws IOException {
        String[] list = this.context.getAssets().list(this.path);
        if (list == null) {
            return AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(list.length);
        for (String str : list) {
            if (this.path.length() != 0) {
                str = this.path + "/" + str;
            }
            arrayList.add(new AssetFile(this.context, Uri.parse("asset:///" + str)));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream(boolean append) {
        throw new UnsupportedOperationException("Asset files are not writable");
    }

    public final void setContentUri(Uri uri) {
        this.contentUri = uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public i walkTopDown() {
        return l.b(new AnonymousClass1(null));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getContentUri(AppContext appContext) throws IOException {
        AbstractC2855l.g(appContext, "appContext");
        InputStream inputStream = inputStream();
        try {
            File file = new File(this.context.getCacheDir(), "expo_shared_assets/" + getFileName());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                AbstractC3375b.b(inputStream, fileOutputStream, 0, 2, null);
                AbstractC3376c.a(fileOutputStream, null);
                Uri contentUri = new JavaFile(Uri.fromFile(file)).getContentUri(appContext);
                this.contentUri = contentUri;
                AbstractC3376c.a(inputStream, null);
                return contentUri;
            } finally {
            }
        } finally {
        }
    }
}

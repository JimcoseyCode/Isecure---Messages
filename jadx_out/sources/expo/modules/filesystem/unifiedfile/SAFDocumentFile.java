package expo.modules.filesystem.unifiedfile;

import O8.i;
import O8.l;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00109\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001b¨\u0006>"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "exists", "()Z", "isDirectory", "isFile", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mimeType", "displayName", "createFile", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createDirectory", "(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "delete", "deleteRecursively", PointerEventHelper.POINTER_TYPE_UNKNOWN, "listFilesAsUnified", "()Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "lastModified", "()Ljava/lang/Long;", "Lexpo/modules/kotlin/AppContext;", "appContext", "getContentUri", "(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;", "append", "Ljava/io/OutputStream;", "outputStream", "(Z)Ljava/io/OutputStream;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "length", "()J", "LO8/i;", "walkTopDown", "()LO8/i;", "Landroid/content/Context;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "LS0/a;", "getDocumentFile", "()LS0/a;", "documentFile", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "parentFile", "getType", "()Ljava/lang/String;", NotificationsService.EVENT_TYPE_KEY, "getFileName", "fileName", "getCreationTime", "creationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SAFDocumentFile implements UnifiedFileInterface {
    private final Context context;
    private final Uri uri;

    /* JADX INFO: renamed from: expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1", f = "SAFDocumentFile.kt", l = {90, 93}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO8/k;", "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;", "Li7/B;", "<anonymous>", "(LO8/k;)V"}, k = 3, mv = {2, 1, 0})
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
            AnonymousClass1 anonymousClass1 = SAFDocumentFile.this.new AnonymousClass1(fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O8.k kVar, n7.f fVar) {
            return ((AnonymousClass1) create(kVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            if (r1.c(r12, r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
        
            if (r7.e(r12, r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:24:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            O8.k kVar;
            S0.a documentFile;
            S0.a[] aVarArrQ;
            O8.k kVar2;
            int length;
            SAFDocumentFile sAFDocumentFile;
            int i10;
            S0.a[] aVarArr;
            Object objE = AbstractC3016b.e();
            int i11 = this.label;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                kVar = (O8.k) this.L$0;
                SAFDocumentFile sAFDocumentFile2 = SAFDocumentFile.this;
                this.L$0 = kVar;
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = this.I$1;
                    i10 = this.I$0;
                    sAFDocumentFile = (SAFDocumentFile) this.L$2;
                    aVarArr = (S0.a[]) this.L$1;
                    kVar2 = (O8.k) this.L$0;
                    AbstractC2753p.b(obj);
                    i10++;
                    if (i10 < length) {
                        S0.a aVar = aVarArr[i10];
                        Context context = sAFDocumentFile.context;
                        Uri uriL = aVar.l();
                        AbstractC2855l.f(uriL, "getUri(...)");
                        i iVarWalkTopDown = new SAFDocumentFile(context, uriL).walkTopDown();
                        this.L$0 = kVar2;
                        this.L$1 = aVarArr;
                        this.L$2 = sAFDocumentFile;
                        this.I$0 = i10;
                        this.I$1 = length;
                        this.label = 2;
                    }
                    return C2735B.f28704a;
                }
                kVar = (O8.k) this.L$0;
                AbstractC2753p.b(obj);
            }
            if (SAFDocumentFile.this.isDirectory() && (documentFile = SAFDocumentFile.this.getDocumentFile()) != null && (aVarArrQ = documentFile.q()) != null) {
                SAFDocumentFile sAFDocumentFile3 = SAFDocumentFile.this;
                kVar2 = kVar;
                length = aVarArrQ.length;
                sAFDocumentFile = sAFDocumentFile3;
                i10 = 0;
                aVarArr = aVarArrQ;
                if (i10 < length) {
                }
            }
            return C2735B.f28704a;
        }
    }

    public SAFDocumentFile(Context context, Uri uri) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(uri, "uri");
        this.context = context;
        this.uri = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S0.a getDocumentFile() {
        List<String> pathSegments = getUri().getPathSegments();
        AbstractC2855l.f(pathSegments, "getPathSegments(...)");
        String str = (String) AbstractC2800q.h0(pathSegments, 0);
        if (str == null) {
            str = "tree";
        }
        return AbstractC2855l.b(str, "document") ? S0.a.g(this.context, getUri()) : S0.a.h(this.context, getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        Uri uriL;
        AbstractC2855l.g(displayName, "displayName");
        S0.a documentFile = getDocumentFile();
        S0.a aVarC = documentFile != null ? documentFile.c(displayName) : null;
        if (aVarC == null || (uriL = aVarC.l()) == null) {
            return null;
        }
        return new SAFDocumentFile(this.context, uriL);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) {
        Uri uriL;
        AbstractC2855l.g(mimeType, "mimeType");
        AbstractC2855l.g(displayName, "displayName");
        S0.a documentFile = getDocumentFile();
        S0.a aVarD = documentFile != null ? documentFile.d(mimeType, displayName) : null;
        if (aVarD == null || (uriL = aVarD.l()) == null) {
            return null;
        }
        return new SAFDocumentFile(this.context, uriL);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean delete() {
        S0.a documentFile = getDocumentFile();
        return documentFile != null && documentFile.e();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean deleteRecursively() {
        S0.a documentFile = getDocumentFile();
        return documentFile != null && SAFDocumentFileKt.deleteRecursively(documentFile);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean exists() {
        S0.a documentFile = getDocumentFile();
        return documentFile != null && documentFile.f();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getContentUri(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        return getUri();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() {
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        S0.a documentFile = getDocumentFile();
        if (documentFile != null) {
            return documentFile.i();
        }
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        S0.a aVarJ;
        Uri uriL;
        S0.a documentFile = getDocumentFile();
        if (documentFile == null || (aVarJ = documentFile.j()) == null || (uriL = aVarJ.l()) == null) {
            return null;
        }
        return new SAFDocumentFile(this.context, uriL);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        S0.a documentFile = getDocumentFile();
        if (documentFile != null) {
            return documentFile.k();
        }
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(getUri());
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IllegalStateException("Unable to open input stream for URI: " + getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isDirectory() {
        S0.a documentFile = getDocumentFile();
        return documentFile != null && documentFile.m();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isFile() {
        S0.a documentFile = getDocumentFile();
        return documentFile != null && documentFile.n();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long lastModified() {
        S0.a documentFile = getDocumentFile();
        if (documentFile != null) {
            return Long.valueOf(documentFile.o());
        }
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public long length() {
        S0.a documentFile = getDocumentFile();
        if (documentFile != null) {
            return documentFile.p();
        }
        return 0L;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() {
        S0.a[] aVarArrQ;
        S0.a documentFile = getDocumentFile();
        if (documentFile == null || (aVarArrQ = documentFile.q()) == null) {
            return AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(aVarArrQ.length);
        for (S0.a aVar : aVarArrQ) {
            Context context = this.context;
            Uri uriL = aVar.l();
            AbstractC2855l.f(uriL, "getUri(...)");
            arrayList.add(new SAFDocumentFile(context, uriL));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream(boolean append) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = this.context.getContentResolver().openOutputStream(getUri(), append ? "wa" : "w");
        if (outputStreamOpenOutputStream != null) {
            return outputStreamOpenOutputStream;
        }
        throw new IllegalStateException("Unable to open output stream for URI: " + getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public i walkTopDown() {
        return l.b(new AnonymousClass1(null));
    }
}

package expo.modules.filesystem;

import R8.C1425o;
import R8.InterfaceC1421m;
import R8.N;
import android.webkit.URLUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.z;
import expo.modules.kotlin.services.FilePermissionService;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3375b;
import t7.AbstractC3376c;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$4", f = "FileSystemModule.kt", l = {283}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"}, k = 3, mv = {2, 1, 0})
public final class FileSystemModule$definition$lambda$62$$inlined$Coroutine$4 extends l implements o {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    public FileSystemModule$definition$lambda$62$$inlined$Coroutine$4(n7.f fVar) {
        super(3, fVar);
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        FileSystemModule$definition$lambda$62$$inlined$Coroutine$4 fileSystemModule$definition$lambda$62$$inlined$Coroutine$4 = new FileSystemModule$definition$lambda$62$$inlined$Coroutine$4(fVar);
        fileSystemModule$definition$lambda$62$$inlined$Coroutine$4.L$0 = objArr;
        return fileSystemModule$definition$lambda$62$$inlined$Coroutine$4.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws DestinationAlreadyExistsException, IOException, UnableToDownloadException {
        URI uri;
        FileSystemPath fileSystemPath;
        DownloadOptions downloadOptions;
        Map<String, String> headers;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            DownloadOptions downloadOptions2 = (DownloadOptions) objArr[2];
            FileSystemPath fileSystemPath2 = (FileSystemPath) obj3;
            URI uri2 = (URI) obj2;
            fileSystemPath2.validatePermission(FilePermissionService.Permission.WRITE);
            B.a aVar = new B.a();
            URL url = uri2.toURL();
            AbstractC2855l.f(url, "toURL(...)");
            B.a aVarN = aVar.n(url);
            if (downloadOptions2 != null && (headers = downloadOptions2.getHeaders()) != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    aVarN.a(entry.getKey(), entry.getValue());
                }
            }
            B b10 = aVarN.b();
            z zVar = new z();
            this.L$0 = downloadOptions2;
            this.L$1 = fileSystemPath2;
            this.L$2 = uri2;
            this.L$3 = zVar;
            this.L$4 = b10;
            this.L$5 = this;
            this.label = 1;
            final C1425o c1425o = new C1425o(AbstractC3016b.c(this), 1);
            c1425o.F();
            zVar.a(b10).t0(new InterfaceC2438f() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$8$$inlined$await$1
                @Override // e9.InterfaceC2438f
                public void onFailure(InterfaceC2437e call, IOException e10) {
                    AbstractC2855l.g(call, "call");
                    AbstractC2855l.g(e10, "e");
                    if (c1425o.isCancelled()) {
                        return;
                    }
                    InterfaceC1421m interfaceC1421m = c1425o;
                    C2752o.a aVar2 = C2752o.f28721h;
                    interfaceC1421m.resumeWith(C2752o.b(AbstractC2753p.a(e10)));
                }

                @Override // e9.InterfaceC2438f
                public void onResponse(InterfaceC2437e call, D response) {
                    AbstractC2855l.g(call, "call");
                    AbstractC2855l.g(response, "response");
                    c1425o.resumeWith(C2752o.b(response));
                }
            });
            Object objZ = c1425o.z();
            if (objZ == AbstractC3016b.e()) {
                h.c(this);
            }
            if (objZ == objE) {
                return objE;
            }
            uri = uri2;
            fileSystemPath = fileSystemPath2;
            downloadOptions = downloadOptions2;
            obj = objZ;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (URI) this.L$2;
            fileSystemPath = (FileSystemPath) this.L$1;
            downloadOptions = (DownloadOptions) this.L$0;
            AbstractC2753p.b(obj);
        }
        D d10 = (D) obj;
        if (!d10.k0()) {
            throw new UnableToDownloadException("response has status: " + d10.I());
        }
        File file = fileSystemPath instanceof FileSystemDirectory ? new File(fileSystemPath.getJavaFile(), URLUtil.guessFileName(uri.toString(), d10.g0().o("content-disposition"), d10.g0().o("content-type"))) : fileSystemPath.getJavaFile();
        if ((downloadOptions == null || !downloadOptions.getIdempotent()) && file.exists()) {
            throw new DestinationAlreadyExistsException();
        }
        E eR = d10.r();
        if (eR == null) {
            throw new UnableToDownloadException("response body is null");
        }
        InputStream inputStreamByteStream = eR.byteStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                AbstractC3375b.b(inputStreamByteStream, fileOutputStream, 0, 2, null);
                AbstractC3376c.a(fileOutputStream, null);
                AbstractC3376c.a(inputStreamByteStream, null);
                return file.toURI();
            } finally {
            }
        } finally {
        }
    }
}

package N0;

import a9.InterfaceC1601a;
import i7.AbstractC2738a;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f7917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f7918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f7919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3487a f7920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f7921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1601a f7922f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f7925i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f7926j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f7928l;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7926j = obj;
            this.f7928l |= androidx.customview.widget.a.INVALID_ID;
            return p.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7930h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f7931i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f7932j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f7933k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f7935m;

        b(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7933k = obj;
            this.f7935m |= androidx.customview.widget.a.INVALID_ID;
            return p.this.c(null, this);
        }
    }

    public p(File file, A serializer, t coordinator, InterfaceC3487a onClose) {
        AbstractC2855l.g(file, "file");
        AbstractC2855l.g(serializer, "serializer");
        AbstractC2855l.g(coordinator, "coordinator");
        AbstractC2855l.g(onClose, "onClose");
        this.f7917a = file;
        this.f7918b = serializer;
        this.f7919c = coordinator;
        this.f7920d = onClose;
        this.f7921e = new AtomicBoolean(false);
        this.f7922f = a9.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f7921e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [N0.p] */
    /* JADX WARN: Type inference failed for: r0v14, types: [N0.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [N0.p$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [N0.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [w7.o] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // N0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(w7.o oVar, n7.f fVar) throws Throwable {
        ?? aVar;
        Throwable th;
        InterfaceC1303c interfaceC1303c;
        ?? r82;
        ?? r02;
        if (fVar instanceof a) {
            a aVar2 = (a) fVar;
            int i10 = aVar2.f7928l;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar2.f7928l = i10 - androidx.customview.widget.a.INVALID_ID;
                aVar = aVar2;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj = aVar.f7926j;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f7928l;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = aVar.f7925i;
                interfaceC1303c = (InterfaceC1303c) aVar.f7924h;
                aVar = (p) aVar.f7923g;
                try {
                    AbstractC2753p.b(obj);
                    r02 = aVar;
                    r82 = oVar;
                    try {
                        interfaceC1303c.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r82 != 0) {
                        InterfaceC1601a.C0140a.b(r02.f7922f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        interfaceC1303c.close();
                    } catch (Throwable th4) {
                        AbstractC2738a.a(th, th4);
                    }
                    throw th;
                }
            }
            AbstractC2753p.b(obj);
            f();
            boolean zA = InterfaceC1601a.C0140a.a(this.f7922f, null, 1, null);
            try {
                n nVar = new n(this.f7917a, this.f7918b);
                try {
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zA);
                    aVar.f7923g = this;
                    aVar.f7924h = nVar;
                    aVar.f7925i = zA;
                    aVar.f7928l = 1;
                    Object objInvoke = oVar.invoke(nVar, boolA, aVar);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    obj = objInvoke;
                    r82 = zA;
                    r02 = this;
                    interfaceC1303c = nVar;
                    interfaceC1303c.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    oVar = zA;
                    aVar = this;
                    interfaceC1303c = nVar;
                    interfaceC1303c.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                oVar = zA;
                aVar = this;
                if (oVar != 0) {
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (oVar != 0) {
                InterfaceC1601a.C0140a.b(aVar.f7922f, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [a9.a, int] */
    @Override // N0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Function2 function2, n7.f fVar) throws IOException {
        b bVar;
        File file;
        p pVar;
        InterfaceC1601a interfaceC1601a;
        q qVar;
        Throwable th;
        InterfaceC1303c interfaceC1303c;
        File file2;
        p pVar2;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f7935m;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                bVar.f7935m = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                bVar = new b(fVar);
            }
        }
        Object obj = bVar.f7933k;
        Object objE = AbstractC3016b.e();
        ?? r22 = bVar.f7935m;
        try {
            try {
            } catch (Throwable th2) {
                r22.c(null);
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            file = objE;
        }
        try {
            try {
                if (r22 == 0) {
                    AbstractC2753p.b(obj);
                    f();
                    g(this.f7917a);
                    InterfaceC1601a interfaceC1601a2 = this.f7922f;
                    bVar.f7929g = this;
                    bVar.f7930h = function2;
                    bVar.f7931i = interfaceC1601a2;
                    bVar.f7935m = 1;
                    if (interfaceC1601a2.a(null, bVar) != objE) {
                        pVar = this;
                        interfaceC1601a = interfaceC1601a2;
                    }
                    return objE;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1303c = (InterfaceC1303c) bVar.f7932j;
                    File file3 = (File) bVar.f7931i;
                    interfaceC1601a = (InterfaceC1601a) bVar.f7930h;
                    pVar2 = (p) bVar.f7929g;
                    try {
                        AbstractC2753p.b(obj);
                        file2 = file3;
                        C2735B c2735b = C2735B.f28704a;
                        try {
                            interfaceC1303c.close();
                            th = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        if (th == null) {
                            throw th;
                        }
                        if (file2.exists() && !m.a(file2, pVar2.f7917a)) {
                            throw new IOException("Unable to rename " + file2 + " to " + pVar2.f7917a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                        }
                        C2735B c2735b2 = C2735B.f28704a;
                        interfaceC1601a.c(null);
                        return C2735B.f28704a;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            interfaceC1303c.close();
                        } catch (Throwable th5) {
                            AbstractC2738a.a(th, th5);
                        }
                        throw th;
                    }
                }
                InterfaceC1601a interfaceC1601a3 = (InterfaceC1601a) bVar.f7931i;
                Function2 function22 = (Function2) bVar.f7930h;
                pVar = (p) bVar.f7929g;
                AbstractC2753p.b(obj);
                interfaceC1601a = interfaceC1601a3;
                function2 = function22;
                bVar.f7929g = pVar;
                bVar.f7930h = interfaceC1601a;
                bVar.f7931i = file;
                bVar.f7932j = qVar;
                bVar.f7935m = 2;
                if (function2.invoke(qVar, bVar) != objE) {
                    file2 = file;
                    pVar2 = pVar;
                    interfaceC1303c = qVar;
                    C2735B c2735b3 = C2735B.f28704a;
                    interfaceC1303c.close();
                    th = null;
                    if (th == null) {
                    }
                }
                return objE;
            } catch (Throwable th6) {
                th = th6;
                interfaceC1303c = qVar;
                interfaceC1303c.close();
                throw th;
            }
            qVar = new q(file, pVar.f7918b);
        } catch (IOException e11) {
            e = e11;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
        file = new File(pVar.f7917a.getAbsolutePath() + ".tmp");
    }

    @Override // N0.InterfaceC1303c
    public void close() {
        this.f7921e.set(true);
        this.f7920d.invoke();
    }

    @Override // N0.F
    public t d() {
        return this.f7919c;
    }
}

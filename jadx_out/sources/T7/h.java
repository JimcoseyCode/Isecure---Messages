package t7;

import com.facebook.react.uimanager.ViewDefaults;
import i7.C2750m;
import j7.AbstractC2786c;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements O8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f32488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f32489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f32490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f32491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f32492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32493f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            AbstractC2855l.g(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b extends AbstractC2786c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayDeque f32494i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f32496b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f32497c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f32498d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f32499e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f32500f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                AbstractC2855l.g(rootDir, "rootDir");
                this.f32500f = bVar;
            }

            @Override // t7.h.c
            public File b() {
                if (!this.f32499e && this.f32497c == null) {
                    Function1 function1 = h.this.f32490c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f32497c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = h.this.f32492e;
                        if (function2 != null) {
                            function2.invoke(a(), new C3374a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f32499e = true;
                    }
                }
                File[] fileArr = this.f32497c;
                if (fileArr != null) {
                    int i10 = this.f32498d;
                    AbstractC2855l.d(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f32497c;
                        AbstractC2855l.d(fileArr2);
                        int i11 = this.f32498d;
                        this.f32498d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f32496b) {
                    this.f32496b = true;
                    return a();
                }
                Function1 function12 = h.this.f32491d;
                if (function12 != null) {
                    function12.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: t7.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private final class C0361b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f32501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f32502c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0361b(b bVar, File rootFile) {
                super(rootFile);
                AbstractC2855l.g(rootFile, "rootFile");
                this.f32502c = bVar;
            }

            @Override // t7.h.c
            public File b() {
                if (this.f32501b) {
                    return null;
                }
                this.f32501b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f32503b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f32504c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f32505d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f32506e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                AbstractC2855l.g(rootDir, "rootDir");
                this.f32506e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // t7.h.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File b() {
                Function2 function2;
                if (!this.f32503b) {
                    Function1 function1 = h.this.f32490c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    this.f32503b = true;
                    return a();
                }
                File[] fileArr = this.f32504c;
                if (fileArr != null) {
                    int i10 = this.f32505d;
                    AbstractC2855l.d(fileArr);
                    if (i10 >= fileArr.length) {
                        Function1 function12 = h.this.f32491d;
                        if (function12 != null) {
                            function12.invoke(a());
                        }
                        return null;
                    }
                }
                if (this.f32504c == null) {
                    File[] fileArrListFiles = a().listFiles();
                    this.f32504c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = h.this.f32492e) != null) {
                        function2.invoke(a(), new C3374a(a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f32504c;
                    if (fileArr2 != null) {
                        AbstractC2855l.d(fileArr2);
                    }
                    Function1 function13 = h.this.f32491d;
                    if (function13 != null) {
                        function13.invoke(a());
                    }
                    return null;
                }
                File[] fileArr3 = this.f32504c;
                AbstractC2855l.d(fileArr3);
                int i11 = this.f32505d;
                this.f32505d = i11 + 1;
                return fileArr3[i11];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32507a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.f32509g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.f32510h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f32507a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f32494i = arrayDeque;
            if (h.this.f32488a.isDirectory()) {
                arrayDeque.push(g(h.this.f32488a));
            } else if (h.this.f32488a.isFile()) {
                arrayDeque.push(new C0361b(this, h.this.f32488a));
            } else {
                d();
            }
        }

        private final a g(File file) {
            int i10 = d.f32507a[h.this.f32489b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new C2750m();
        }

        private final File i() {
            File fileB;
            while (true) {
                c cVar = (c) this.f32494i.peek();
                if (cVar == null) {
                    return null;
                }
                fileB = cVar.b();
                if (fileB == null) {
                    this.f32494i.pop();
                } else {
                    if (AbstractC2855l.b(fileB, cVar.a()) || !fileB.isDirectory() || this.f32494i.size() >= h.this.f32493f) {
                        break;
                    }
                    this.f32494i.push(g(fileB));
                }
            }
            return fileB;
        }

        @Override // j7.AbstractC2786c
        protected void c() {
            File fileI = i();
            if (fileI != null) {
                e(fileI);
            } else {
                d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f32508a;

        public c(File root) {
            AbstractC2855l.g(root, "root");
            this.f32508a = root;
        }

        public final File a() {
            return this.f32508a;
        }

        public abstract File b();
    }

    private h(File file, i iVar, Function1 function1, Function1 function12, Function2 function2, int i10) {
        this.f32488a = file;
        this.f32489b = iVar;
        this.f32490c = function1;
        this.f32491d = function12;
        this.f32492e = function2;
        this.f32493f = i10;
    }

    public final h i(Function2 function) {
        AbstractC2855l.g(function, "function");
        return new h(this.f32488a, this.f32489b, this.f32490c, this.f32491d, function, this.f32493f);
    }

    @Override // O8.i
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ h(File file, i iVar, Function1 function1, Function1 function12, Function2 function2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? i.f32509g : iVar, function1, function12, function2, (i11 & 32) != 0 ? ViewDefaults.NUMBER_OF_LINES : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(File start, i direction) {
        this(start, direction, null, null, null, 0, 32, null);
        AbstractC2855l.g(start, "start");
        AbstractC2855l.g(direction, "direction");
    }
}

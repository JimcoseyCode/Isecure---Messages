package E0;

import E0.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l1.AbstractC2861a;
import x0.v;
import y.AbstractC3567L;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final m0.h f1035a = new m0.h(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f1036b = i.a("fonts-androidx", 10, ModuleDescriptor.MODULE_VERSION);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f1037c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final m0.i f1038d = new m0.i();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f1041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1042d;

        a(String str, Context context, f fVar, int i10) {
            this.f1039a = str;
            this.f1040b = context;
            this.f1041c = fVar;
            this.f1042d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return g.c(this.f1039a, this.f1040b, AbstractC3567L.a(new Object[]{this.f1041c}), this.f1042d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements H0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ E0.a f1043a;

        b(E0.a aVar) {
            this.f1043a = aVar;
        }

        @Override // H0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1043a.b(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f1046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1047d;

        c(String str, Context context, List list, int i10) {
            this.f1044a = str;
            this.f1045b = context;
            this.f1046c = list;
            this.f1047d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return g.c(this.f1044a, this.f1045b, this.f1046c, this.f1047d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements H0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1048a;

        d(String str) {
            this.f1048a = str;
        }

        @Override // H0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (g.f1037c) {
                try {
                    m0.i iVar = g.f1038d;
                    ArrayList arrayList = (ArrayList) iVar.get(this.f1048a);
                    if (arrayList == null) {
                        return;
                    }
                    iVar.remove(this.f1048a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((H0.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((f) list.get(i11)).d());
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static int b(h.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        h.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (h.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List list, int i10) {
        AbstractC2861a.c("getFontSync");
        try {
            m0.h hVar = f1035a;
            Typeface typeface = (Typeface) hVar.c(str);
            if (typeface != null) {
                return new e(typeface);
            }
            h.a aVarE = E0.e.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? v.b(context, null, aVarE.c(), i10) : v.c(context, null, aVarE.d(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            hVar.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            AbstractC2861a.f();
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, E0.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f1035a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f1037c) {
            try {
                m0.i iVar = f1038d;
                ArrayList arrayList = (ArrayList) iVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                iVar.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f1036b;
                }
                i.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, f fVar, E0.a aVar, int i10, int i11) {
        String strA = a(AbstractC3567L.a(new Object[]{fVar}), i10);
        Typeface typeface = (Typeface) f1035a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, AbstractC3567L.a(new Object[]{fVar}), i10);
            aVar.b(eVarC);
            return eVarC.f1049a;
        }
        try {
            e eVar = (e) i.d(f1036b, new a(strA, context, fVar, i10), i11);
            aVar.b(eVar);
            return eVar.f1049a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f1049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1050b;

        e(int i10) {
            this.f1049a = null;
            this.f1050b = i10;
        }

        boolean a() {
            return this.f1050b == 0;
        }

        e(Typeface typeface) {
            this.f1049a = typeface;
            this.f1050b = 0;
        }
    }
}

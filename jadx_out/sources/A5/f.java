package A5;

import A5.j;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import android.content.Context;
import android.util.Base64OutputStream;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import n5.C2970e;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.InterfaceC3080a;
import q5.C3119c;
import q5.D;
import q5.InterfaceC3120d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5.b f63a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f64b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5.b f65c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f66d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f67e;

    private f(final Context context, final String str, Set set, C5.b bVar, Executor executor) {
        this(new q5.w(new C5.b() { // from class: A5.c
            @Override // C5.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                w wVar = (w) fVar.f63a.get();
                List listG = wVar.g();
                wVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    x xVar = (x) listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", xVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) xVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static /* synthetic */ w d(Context context, String str) {
        return new w(context, str);
    }

    public static /* synthetic */ f e(D d10, InterfaceC3120d interfaceC3120d) {
        return new f((Context) interfaceC3120d.a(Context.class), ((C2970e) interfaceC3120d.a(C2970e.class)).n(), interfaceC3120d.g(g.class), interfaceC3120d.c(K5.i.class), (Executor) interfaceC3120d.e(d10));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            ((w) fVar.f63a.get()).o(System.currentTimeMillis(), ((K5.i) fVar.f65c.get()).a());
        }
        return null;
    }

    public static C3119c g() {
        final D dA = D.a(InterfaceC3080a.class, Executor.class);
        return C3119c.d(f.class, i.class, j.class).b(q5.q.j(Context.class)).b(q5.q.j(C2970e.class)).b(q5.q.m(g.class)).b(q5.q.l(K5.i.class)).b(q5.q.k(dA)).e(new q5.g() { // from class: A5.b
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return f.e(dA, interfaceC3120d);
            }
        }).d();
    }

    @Override // A5.i
    public AbstractC1378l a() {
        return !D0.m.a(this.f64b) ? AbstractC1381o.f(PointerEventHelper.POINTER_TYPE_UNKNOWN) : AbstractC1381o.c(this.f67e, new Callable() { // from class: A5.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f61a);
            }
        });
    }

    @Override // A5.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVar = (w) this.f63a.get();
        if (!wVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        wVar.k();
        return j.a.GLOBAL;
    }

    public AbstractC1378l h() {
        return this.f66d.size() <= 0 ? AbstractC1381o.f(null) : !D0.m.a(this.f64b) ? AbstractC1381o.f(null) : AbstractC1381o.c(this.f67e, new Callable() { // from class: A5.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f62a);
            }
        });
    }

    f(C5.b bVar, Set set, Executor executor, C5.b bVar2, Context context) {
        this.f63a = bVar;
        this.f66d = set;
        this.f67e = executor;
        this.f65c = bVar2;
        this.f64b = context;
    }
}

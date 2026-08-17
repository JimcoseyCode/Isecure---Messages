package Q0;

import C7.k;
import N0.InterfaceC1309i;
import R8.N;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.n;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0.b f8984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f8985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N f8986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC1309i f8988f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends n implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f8989h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ c f8990i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f8989h = context;
            this.f8990i = cVar;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f8989h;
            AbstractC2855l.f(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f8990i.f8983a);
        }
    }

    public c(String name, O0.b bVar, Function1 produceMigrations, N scope) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(produceMigrations, "produceMigrations");
        AbstractC2855l.g(scope, "scope");
        this.f8983a = name;
        this.f8984b = bVar;
        this.f8985c = produceMigrations;
        this.f8986d = scope;
        this.f8987e = new Object();
    }

    @Override // kotlin.properties.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1309i getValue(Context thisRef, k property) {
        InterfaceC1309i interfaceC1309i;
        AbstractC2855l.g(thisRef, "thisRef");
        AbstractC2855l.g(property, "property");
        InterfaceC1309i interfaceC1309i2 = this.f8988f;
        if (interfaceC1309i2 != null) {
            return interfaceC1309i2;
        }
        synchronized (this.f8987e) {
            try {
                if (this.f8988f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    R0.e eVar = R0.e.f9946a;
                    O0.b bVar = this.f8984b;
                    Function1 function1 = this.f8985c;
                    AbstractC2855l.f(applicationContext, "applicationContext");
                    this.f8988f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f8986d, new a(applicationContext, this));
                }
                interfaceC1309i = this.f8988f;
                AbstractC2855l.d(interfaceC1309i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1309i;
    }
}

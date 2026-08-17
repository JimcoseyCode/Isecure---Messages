package P0;

import N0.InterfaceC1307g;
import android.content.Context;
import android.content.SharedPreferences;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.n;
import n7.f;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC1307g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f8770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f8771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f8772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f8774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f8775f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: P0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0094a extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8776g;

        C0094a(f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, f fVar) {
            return ((C0094a) create(obj, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return new C0094a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.f8776g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends n implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f8777h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f8778i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f8777h = context;
            this.f8778i = str;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f8777h.getSharedPreferences(this.f8778i, 0);
            AbstractC2855l.f(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8779a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f8780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f8781h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f8783j;

        d(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8781h = obj;
            this.f8783j |= androidx.customview.widget.a.INVALID_ID;
            return a.this.c(null, this);
        }
    }

    private a(InterfaceC3487a interfaceC3487a, Set set, Function2 function2, o oVar, Context context, String str) {
        this.f8770a = function2;
        this.f8771b = oVar;
        this.f8772c = context;
        this.f8773d = str;
        this.f8774e = AbstractC2746i.b(interfaceC3487a);
        this.f8775f = set == P0.b.a() ? null : AbstractC2800q.S0(set);
    }

    private final void d(Context context, String str) {
        c.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f8774e.getValue();
    }

    @Override // N0.InterfaceC1307g
    public Object a(f fVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set set = this.f8775f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f8772c) != null && (str = this.f8773d) != null) {
            d(context, str);
        }
        Set set2 = this.f8775f;
        if (set2 != null) {
            set2.clear();
        }
        return C2735B.f28704a;
    }

    @Override // N0.InterfaceC1307g
    public Object b(Object obj, f fVar) {
        return this.f8771b.invoke(new P0.c(e(), this.f8775f), obj, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // N0.InterfaceC1307g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Object obj, f fVar) {
        d dVar;
        a aVar;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f8783j;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                dVar.f8783j = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                dVar = new d(fVar);
            }
        }
        Object objInvoke = dVar.f8781h;
        Object objE = AbstractC3016b.e();
        int i11 = dVar.f8783j;
        boolean z10 = true;
        if (i11 == 0) {
            AbstractC2753p.b(objInvoke);
            Function2 function2 = this.f8770a;
            dVar.f8780g = this;
            dVar.f8783j = 1;
            objInvoke = function2.invoke(obj, dVar);
            if (objInvoke == objE) {
                return objE;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar.f8780g;
            AbstractC2753p.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        Set set = aVar.f8775f;
        if (set == null) {
            Map<String, ?> all = aVar.e().getAll();
            AbstractC2855l.f(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPreferencesE = aVar.e();
            if (set == null || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesE.contains((String) it.next())) {
                        break;
                    }
                }
                z10 = false;
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? P0.b.a() : set, (i10 & 8) != 0 ? new C0094a(null) : function2, oVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set keysToMigrate, Function2 shouldRunMigration, o migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(sharedPreferencesName, "sharedPreferencesName");
        AbstractC2855l.g(keysToMigrate, "keysToMigrate");
        AbstractC2855l.g(shouldRunMigration, "shouldRunMigration");
        AbstractC2855l.g(migrate, "migrate");
    }
}

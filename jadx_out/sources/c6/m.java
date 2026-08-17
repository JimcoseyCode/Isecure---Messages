package c6;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import q5.C3119c;
import q5.InterfaceC3120d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3119c f18888b = C3119c.c(m.class).b(q5.q.j(C1864i.class)).b(q5.q.j(Context.class)).e(new q5.g() { // from class: c6.E
        @Override // q5.g
        public final Object a(InterfaceC3120d interfaceC3120d) {
            return new m((Context) interfaceC3120d.a(Context.class));
        }
    }).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f18889a;

    public m(Context context) {
        this.f18889a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f18889a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}

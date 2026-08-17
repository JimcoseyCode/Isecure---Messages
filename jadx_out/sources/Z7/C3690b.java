package z7;

import java.util.Random;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: z7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3690b extends AbstractC3689a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f34288i = new a();

    /* JADX INFO: renamed from: z7.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // z7.AbstractC3689a
    public Random c() {
        Object obj = this.f34288i.get();
        AbstractC2855l.f(obj, "get(...)");
        return (Random) obj;
    }
}

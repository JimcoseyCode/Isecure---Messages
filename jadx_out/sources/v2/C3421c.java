package v2;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: v2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3421c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3421c f32901b = new C3421c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f32902c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f32903a = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: v2.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C3421c() {
    }

    public static C3421c a() {
        return f32902c ? new C3421c() : f32901b;
    }

    public void b(a aVar) {
        if (f32902c) {
            for (int i10 = 5; !this.f32903a.offer(aVar) && i10 > 0; i10--) {
                this.f32903a.poll();
            }
        }
    }

    public String toString() {
        return this.f32903a.toString();
    }
}

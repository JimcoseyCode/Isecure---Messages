package G7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f3501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f3502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f3503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f3504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f3505e;

    public d(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f3501a = cls;
        this.f3502b = map;
        this.f3503c = lazy;
        this.f3504d = lazy2;
        this.f3505e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f3501a, this.f3502b, this.f3503c, this.f3504d, this.f3505e, obj, method, objArr);
    }
}

package d3;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f25590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f25591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f25592k;

    public n(int i10, int i11, int i12, p pVar, Map map) {
        this.f25588g = i10;
        this.f25589h = i11;
        this.f25590i = i12;
        this.f25591j = pVar;
        this.f25592k = map;
    }

    @Override // d3.l, M2.a
    public Map getExtras() {
        return this.f25592k;
    }

    @Override // d3.m
    public int getHeight() {
        return this.f25589h;
    }

    @Override // d3.m
    public int getWidth() {
        return this.f25588g;
    }
}

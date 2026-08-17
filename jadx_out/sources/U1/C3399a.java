package u1;

import B1.h;
import Q1.c;
import Q1.k;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import e9.B;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import v1.EnumC3417a;
import v1.e;

/* JADX INFO: renamed from: u1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3399a implements d, InterfaceC2438f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2437e.a f32657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f32658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputStream f32659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f32660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d.a f32661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile InterfaceC2437e f32662l;

    public C3399a(InterfaceC2437e.a aVar, h hVar) {
        this.f32657g = aVar;
        this.f32658h = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        InterfaceC2437e interfaceC2437e = this.f32662l;
        if (interfaceC2437e != null) {
            interfaceC2437e.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        try {
            InputStream inputStream = this.f32659i;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        E e10 = this.f32660j;
        if (e10 != null) {
            e10.close();
        }
        this.f32661k = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3417a getDataSource() {
        return EnumC3417a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(g gVar, d.a aVar) {
        B.a aVarM = new B.a().m(this.f32658h.toStringUrl());
        for (Map.Entry<String, String> entry : this.f32658h.getHeaders().entrySet()) {
            aVarM.a(entry.getKey(), entry.getValue());
        }
        B b10 = aVarM.b();
        this.f32661k = aVar;
        this.f32662l = this.f32657g.a(b10);
        this.f32662l.t0(this);
    }

    @Override // e9.InterfaceC2438f
    public void onFailure(InterfaceC2437e interfaceC2437e, IOException iOException) {
        this.f32661k.a(iOException);
    }

    @Override // e9.InterfaceC2438f
    public void onResponse(InterfaceC2437e interfaceC2437e, D d10) {
        this.f32660j = d10.r();
        if (!d10.k0()) {
            this.f32661k.a(new e(d10.l0(), d10.I()));
            return;
        }
        InputStream inputStreamE = c.e(this.f32660j.byteStream(), ((E) k.e(this.f32660j)).contentLength());
        this.f32659i = inputStreamE;
        this.f32661k.c(inputStreamE);
    }
}

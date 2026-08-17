package com.bumptech.glide.request;

import M1.c;
import com.bumptech.glide.request.b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f19283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f19284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f19285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b.a f19286f;

    public a(Object obj, b bVar) {
        b.a aVar = b.a.CLEARED;
        this.f19285e = aVar;
        this.f19286f = aVar;
        this.f19281a = obj;
        this.f19282b = bVar;
    }

    private boolean a(c cVar) {
        b.a aVar = this.f19285e;
        b.a aVar2 = b.a.FAILED;
        if (aVar != aVar2) {
            return cVar.equals(this.f19283c);
        }
        if (!cVar.equals(this.f19284d)) {
            return false;
        }
        b.a aVar3 = this.f19286f;
        return aVar3 == b.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean b() {
        b bVar = this.f19282b;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean c() {
        b bVar = this.f19282b;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean d() {
        b bVar = this.f19282b;
        return bVar == null || bVar.canSetImage(this);
    }

    @Override // M1.c
    public void begin() {
        synchronized (this.f19281a) {
            try {
                b.a aVar = this.f19285e;
                b.a aVar2 = b.a.RUNNING;
                if (aVar != aVar2) {
                    this.f19285e = aVar2;
                    this.f19283c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyCleared(c cVar) {
        boolean z10;
        synchronized (this.f19281a) {
            try {
                z10 = b() && cVar.equals(this.f19283c);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyStatusChanged(c cVar) {
        boolean z10;
        synchronized (this.f19281a) {
            try {
                z10 = c() && a(cVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canSetImage(c cVar) {
        boolean zD;
        synchronized (this.f19281a) {
            zD = d();
        }
        return zD;
    }

    @Override // M1.c
    public void clear() {
        synchronized (this.f19281a) {
            try {
                b.a aVar = b.a.CLEARED;
                this.f19285e = aVar;
                this.f19283c.clear();
                if (this.f19286f != aVar) {
                    this.f19286f = aVar;
                    this.f19284d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(c cVar, c cVar2) {
        this.f19283c = cVar;
        this.f19284d = cVar2;
    }

    @Override // com.bumptech.glide.request.b
    public b getRoot() {
        b root;
        synchronized (this.f19281a) {
            try {
                b bVar = this.f19282b;
                root = bVar != null ? bVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.b, M1.c
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f19281a) {
            try {
                z10 = this.f19283c.isAnyResourceSet() || this.f19284d.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // M1.c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f19281a) {
            try {
                b.a aVar = this.f19285e;
                b.a aVar2 = b.a.CLEARED;
                z10 = aVar == aVar2 && this.f19286f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // M1.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f19281a) {
            try {
                b.a aVar = this.f19285e;
                b.a aVar2 = b.a.SUCCESS;
                z10 = aVar == aVar2 || this.f19286f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // M1.c
    public boolean isEquivalentTo(c cVar) {
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            if (this.f19283c.isEquivalentTo(aVar.f19283c) && this.f19284d.isEquivalentTo(aVar.f19284d)) {
                return true;
            }
        }
        return false;
    }

    @Override // M1.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f19281a) {
            try {
                b.a aVar = this.f19285e;
                b.a aVar2 = b.a.RUNNING;
                z10 = aVar == aVar2 || this.f19286f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestFailed(c cVar) {
        synchronized (this.f19281a) {
            try {
                if (cVar.equals(this.f19284d)) {
                    this.f19286f = b.a.FAILED;
                    b bVar = this.f19282b;
                    if (bVar != null) {
                        bVar.onRequestFailed(this);
                    }
                    return;
                }
                this.f19285e = b.a.FAILED;
                b.a aVar = this.f19286f;
                b.a aVar2 = b.a.RUNNING;
                if (aVar != aVar2) {
                    this.f19286f = aVar2;
                    this.f19284d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestSuccess(c cVar) {
        synchronized (this.f19281a) {
            try {
                if (cVar.equals(this.f19283c)) {
                    this.f19285e = b.a.SUCCESS;
                } else if (cVar.equals(this.f19284d)) {
                    this.f19286f = b.a.SUCCESS;
                }
                b bVar = this.f19282b;
                if (bVar != null) {
                    bVar.onRequestSuccess(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M1.c
    public void pause() {
        synchronized (this.f19281a) {
            try {
                b.a aVar = this.f19285e;
                b.a aVar2 = b.a.RUNNING;
                if (aVar == aVar2) {
                    this.f19285e = b.a.PAUSED;
                    this.f19283c.pause();
                }
                if (this.f19286f == aVar2) {
                    this.f19286f = b.a.PAUSED;
                    this.f19284d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

.class public final Lcom/google/android/gms/common/internal/r;
.super Lcom/google/android/gms/common/internal/k;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field public final g:Landroid/os/IBinder;

.field final synthetic h:Lcom/google/android/gms/common/internal/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/b;ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/common/internal/k;-><init>(Lcom/google/android/gms/common/internal/b;ILandroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, Lcom/google/android/gms/common/internal/r;->g:Landroid/os/IBinder;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method protected final f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b;->T(Lcom/google/android/gms/common/internal/b;)Lcom/google/android/gms/common/internal/b$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b;->T(Lcom/google/android/gms/common/internal/b;)Lcom/google/android/gms/common/internal/b$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/b$b;->d(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/b;->K(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method protected final g()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/internal/r;->g:Landroid/os/IBinder;

    .line 3
    .line 4
    invoke-static {v1}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    iget-object v2, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/b;->D()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/b;->D()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    return v0

    .line 29
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/android/gms/common/internal/r;->g:Landroid/os/IBinder;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/internal/b;->r(Landroid/os/IBinder;)Landroid/os/IInterface;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iget-object v2, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    const/4 v4, 0x4

    .line 43
    invoke-static {v2, v3, v4, v1}, Lcom/google/android/gms/common/internal/b;->e0(Lcom/google/android/gms/common/internal/b;IILandroid/os/IInterface;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    iget-object v2, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 50
    .line 51
    const/4 v3, 0x3

    .line 52
    invoke-static {v2, v3, v4, v1}, Lcom/google/android/gms/common/internal/b;->e0(Lcom/google/android/gms/common/internal/b;IILandroid/os/IInterface;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/b;->X(Lcom/google/android/gms/common/internal/b;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/b;->w()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b;->S(Lcom/google/android/gms/common/internal/b;)Lcom/google/android/gms/common/internal/b$a;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iget-object v0, p0, Lcom/google/android/gms/common/internal/r;->h:Lcom/google/android/gms/common/internal/b;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b;->S(Lcom/google/android/gms/common/internal/b;)Lcom/google/android/gms/common/internal/b$a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/b$a;->f(Landroid/os/Bundle;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    const/4 v0, 0x1

    .line 86
    :catch_0
    :cond_3
    return v0
.end method

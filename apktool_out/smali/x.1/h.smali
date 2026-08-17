.class public final Lx/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Lr/b0;

.field private b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lr/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/h;->a:Lr/b0;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ly/q;)Lx/h;
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, LF/L;

    .line 3
    .line 4
    invoke-interface {v0}, LF/L;->g()LF/L;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Lr/b0;

    .line 9
    .line 10
    const-string v2, "CameraInfo doesn\'t contain Camera2 implementation."

    .line 11
    .line 12
    invoke-static {v1, v2}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Lr/b0;

    .line 16
    .line 17
    invoke-virtual {v0}, Lr/b0;->B()Lx/h;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, p0, LF/d;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast p0, LF/d;

    .line 26
    .line 27
    invoke-virtual {p0}, LF/d;->D()LF/m1;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object v0
.end method


# virtual methods
.method public b(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lx/h;->b:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/util/Pair;

    .line 20
    .line 21
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Landroid/hardware/camera2/CameraCharacteristics$Key;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iget-object p1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    iget-object v0, p0, Lx/h;->a:Lr/b0;

    .line 35
    .line 36
    invoke-virtual {v0}, Lr/b0;->C()Ls/E;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p1}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/h;->a:Lr/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/b0;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.class public LU/f$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:LF/S0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LF/S0;->i0()LF/S0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LU/f$b;->a:LF/S0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()LU/f;
    .locals 3

    .line 1
    new-instance v0, LU/f;

    .line 2
    .line 3
    iget-object v1, p0, LU/f$b;->a:LF/S0;

    .line 4
    .line 5
    invoke-static {v1}, LF/X0;->h0(LF/j0;)LF/X0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, LU/f;-><init>(LF/j0;LU/f$a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public b(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)LU/f$b;
    .locals 1

    .line 1
    invoke-static {p1}, LU/f;->f0(Landroid/hardware/camera2/CaptureRequest$Key;)LF/j0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LU/f$b;->a:LF/S0;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

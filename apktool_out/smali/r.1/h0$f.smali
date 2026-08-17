.class Lr/h0$f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lr/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/h0$f$a;
    }
.end annotation


# instance fields
.field private a:Landroidx/concurrent/futures/c$a;

.field private final b:Lm5/a;

.field private final c:Lr/h0$f$a;


# direct methods
.method constructor <init>(Lr/h0$f$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr/r0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lr/r0;-><init>(Lr/h0$f;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lr/h0$f;->b:Lm5/a;

    .line 14
    .line 15
    iput-object p1, p0, Lr/h0$f;->c:Lr/h0$f$a;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic b(Lr/h0$f;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lr/h0$f;->a:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    const-string p0, "waitFor3AResult"

    .line 4
    .line 5
    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/h0$f;->c:Lr/h0$f$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr/h0$f$a;->a(Landroid/hardware/camera2/TotalCaptureResult;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-object v0, p0, Lr/h0$f;->a:Landroidx/concurrent/futures/c$a;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1
.end method

.method public c()Lm5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/h0$f;->b:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

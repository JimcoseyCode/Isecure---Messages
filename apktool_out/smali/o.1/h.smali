.class Lo/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/h$b;,
        Lo/h$c;
    }
.end annotation


# instance fields
.field private final a:Lo/h$c;

.field private b:Landroid/os/CancellationSignal;

.field private c:LD0/d;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo/h$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lo/h$a;-><init>(Lo/h;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo/h;->a:Lo/h$c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/h;->b:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {v0}, Lo/h$b;->a(Landroid/os/CancellationSignal;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    iput-object v1, p0, Lo/h;->b:Landroid/os/CancellationSignal;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lo/h;->c:LD0/d;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_1
    invoke-virtual {v0}, LD0/d;->a()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 16
    .line 17
    .line 18
    :catch_1
    iput-object v1, p0, Lo/h;->c:LD0/d;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method b()Landroid/os/CancellationSignal;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/h;->b:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lo/h;->a:Lo/h$c;

    .line 6
    .line 7
    invoke-interface {v0}, Lo/h$c;->b()Landroid/os/CancellationSignal;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lo/h;->b:Landroid/os/CancellationSignal;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lo/h;->b:Landroid/os/CancellationSignal;

    .line 14
    .line 15
    return-object v0
.end method

.method c()LD0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/h;->c:LD0/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lo/h;->a:Lo/h$c;

    .line 6
    .line 7
    invoke-interface {v0}, Lo/h$c;->a()LD0/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lo/h;->c:LD0/d;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lo/h;->c:LD0/d;

    .line 14
    .line 15
    return-object v0
.end method

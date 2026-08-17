.class Lx1/h$d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private a:Lv1/f;

.field private b:Lv1/k;

.field private c:Lx1/u;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lx1/h$d;->a:Lv1/f;

    .line 3
    .line 4
    iput-object v0, p0, Lx1/h$d;->b:Lv1/k;

    .line 5
    .line 6
    iput-object v0, p0, Lx1/h$d;->c:Lx1/u;

    .line 7
    .line 8
    return-void
.end method

.method b(Lx1/h$e;Lv1/h;)V
    .locals 4

    .line 1
    const-string v0, "DecodeJob.encode"

    .line 2
    .line 3
    invoke-static {v0}, LR1/b;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Lx1/h$e;->a()Lz1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lx1/h$d;->a:Lv1/f;

    .line 11
    .line 12
    new-instance v1, Lx1/e;

    .line 13
    .line 14
    iget-object v2, p0, Lx1/h$d;->b:Lv1/k;

    .line 15
    .line 16
    iget-object v3, p0, Lx1/h$d;->c:Lx1/u;

    .line 17
    .line 18
    invoke-direct {v1, v2, v3, p2}, Lx1/e;-><init>(Lv1/d;Ljava/lang/Object;Lv1/h;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lz1/a;->b(Lv1/f;Lz1/a$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lx1/h$d;->c:Lx1/u;

    .line 25
    .line 26
    invoke-virtual {p1}, Lx1/u;->f()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, LR1/b;->e()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    iget-object p2, p0, Lx1/h$d;->c:Lx1/u;

    .line 35
    .line 36
    invoke-virtual {p2}, Lx1/u;->f()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, LR1/b;->e()V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/h$d;->c:Lx1/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method d(Lv1/f;Lv1/k;Lx1/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/h$d;->a:Lv1/f;

    .line 2
    .line 3
    iput-object p2, p0, Lx1/h$d;->b:Lv1/k;

    .line 4
    .line 5
    iput-object p3, p0, Lx1/h$d;->c:Lx1/u;

    .line 6
    .line 7
    return-void
.end method

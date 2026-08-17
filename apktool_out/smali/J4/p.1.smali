.class final LJ4/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv5/g;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lv5/c;

.field private final d:LJ4/l;


# direct methods
.method constructor <init>(LJ4/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LJ4/p;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LJ4/p;->b:Z

    .line 8
    .line 9
    iput-object p1, p0, LJ4/p;->d:LJ4/l;

    .line 10
    .line 11
    return-void
.end method

.method private final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LJ4/p;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LJ4/p;->a:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lv5/b;

    .line 10
    .line 11
    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lv5/b;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method


# virtual methods
.method final a(Lv5/c;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LJ4/p;->a:Z

    .line 3
    .line 4
    iput-object p1, p0, LJ4/p;->c:Lv5/c;

    .line 5
    .line 6
    iput-boolean p2, p0, LJ4/p;->b:Z

    .line 7
    .line 8
    return-void
.end method

.method public final d(Ljava/lang/String;)Lv5/g;
    .locals 3

    .line 1
    invoke-direct {p0}, LJ4/p;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ4/p;->d:LJ4/l;

    .line 5
    .line 6
    iget-object v1, p0, LJ4/p;->c:Lv5/c;

    .line 7
    .line 8
    iget-boolean v2, p0, LJ4/p;->b:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, v2}, LJ4/l;->f(Lv5/c;Ljava/lang/Object;Z)Lv5/e;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final e(Z)Lv5/g;
    .locals 3

    .line 1
    invoke-direct {p0}, LJ4/p;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ4/p;->d:LJ4/l;

    .line 5
    .line 6
    iget-object v1, p0, LJ4/p;->c:Lv5/c;

    .line 7
    .line 8
    iget-boolean v2, p0, LJ4/p;->b:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, v2}, LJ4/l;->g(Lv5/c;IZ)LJ4/l;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

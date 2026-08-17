.class public final Ld/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/g$a;
    }
.end annotation


# instance fields
.field private a:Le/g$g;

.field private b:I

.field private c:Z

.field private d:Le/g$b;

.field private e:Z

.field private f:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Le/g$c;->a:Le/g$c;

    .line 5
    .line 6
    iput-object v0, p0, Ld/g;->a:Le/g$g;

    .line 7
    .line 8
    sget-object v0, Le/e;->b:Le/e$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Le/e$a;->a()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Ld/g;->b:I

    .line 15
    .line 16
    sget-object v0, Le/g$b$b;->a:Le/g$b$b;

    .line 17
    .line 18
    iput-object v0, p0, Ld/g;->d:Le/g$b;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld/g;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Le/g$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ld/g;->d:Le/g$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Ld/g;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()Le/g$e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final e()Le/g$g;
    .locals 1

    .line 1
    iget-object v0, p0, Ld/g;->a:Le/g$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld/g;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld/g;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ld/g;->f:J

    .line 2
    .line 3
    return-void
.end method

.method public final i(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld/g;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public final j(Le/g$b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ld/g;->d:Le/g$b;

    .line 7
    .line 8
    return-void
.end method

.method public final k(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld/g;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public final l(Le/g$e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Le/g$g;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ld/g;->a:Le/g$g;

    .line 7
    .line 8
    return-void
.end method

.method public final n(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld/g;->c:Z

    .line 2
    .line 3
    return-void
.end method

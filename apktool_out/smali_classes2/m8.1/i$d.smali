.class public abstract Lm8/i$d;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8/i$d$a;
    }
.end annotation


# instance fields
.field private final h:Lm8/h;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/i;-><init>()V

    .line 2
    invoke-static {}, Lm8/h;->t()Lm8/h;

    move-result-object v0

    iput-object v0, p0, Lm8/i$d;->h:Lm8/h;

    return-void
.end method

.method protected constructor <init>(Lm8/i$c;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lm8/i;-><init>()V

    .line 4
    invoke-static {p1}, Lm8/i$c;->l(Lm8/i$c;)Lm8/h;

    move-result-object p1

    iput-object p1, p0, Lm8/i$d;->h:Lm8/h;

    return-void
.end method

.method static synthetic q(Lm8/i$d;)Lm8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lm8/i$d;->h:Lm8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method private y(Lm8/i$f;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lm8/i$f;->b()Lm8/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0}, Lm8/q;->a()Lm8/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method


# virtual methods
.method protected l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm8/h;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected o(Lm8/e;Lm8/f;Lm8/g;I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 2
    .line 3
    invoke-interface {p0}, Lm8/q;->a()Lm8/p;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move v5, p4

    .line 11
    invoke-static/range {v0 .. v5}, Lm8/i;->i(Lm8/h;Lm8/p;Lm8/e;Lm8/f;Lm8/g;I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method protected r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm8/h;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method protected s()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm8/h;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final t(Lm8/i$f;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lm8/i$d;->y(Lm8/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 5
    .line 6
    iget-object v1, p1, Lm8/i$f;->d:Lm8/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lm8/h;->h(Lm8/h$b;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lm8/i$f;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p1, v0}, Lm8/i$f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final u(Lm8/i$f;I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lm8/i$d;->y(Lm8/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 5
    .line 6
    iget-object v1, p1, Lm8/i$f;->d:Lm8/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Lm8/h;->i(Lm8/h$b;I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p1, p2}, Lm8/i$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final v(Lm8/i$f;)I
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lm8/i$d;->y(Lm8/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 5
    .line 6
    iget-object p1, p1, Lm8/i$f;->d:Lm8/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm8/h;->j(Lm8/h$b;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final w(Lm8/i$f;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lm8/i$d;->y(Lm8/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm8/i$d;->h:Lm8/h;

    .line 5
    .line 6
    iget-object p1, p1, Lm8/i$f;->d:Lm8/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm8/h;->m(Lm8/h$b;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method protected x()Lm8/i$d$a;
    .locals 3

    .line 1
    new-instance v0, Lm8/i$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v1, v2}, Lm8/i$d$a;-><init>(Lm8/i$d;ZLm8/i$a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

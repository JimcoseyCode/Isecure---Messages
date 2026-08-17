.class public final LH4/N;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH4/B;


# instance fields
.field private a:LC5/b;

.field private final b:LC5/b;

.field private final c:LH4/E;


# direct methods
.method public constructor <init>(Landroid/content/Context;LH4/E;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LH4/N;->c:LH4/E;

    .line 5
    .line 6
    sget-object p2, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    .line 7
    .line 8
    invoke-static {p1}, LW3/t;->f(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LW3/t;->c()LW3/t;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, LW3/t;->g(LW3/f;)LU3/i;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2}, Lcom/google/android/datatransport/cct/a;->a()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v0, "json"

    .line 24
    .line 25
    invoke-static {v0}, LU3/c;->b(Ljava/lang/String;)LU3/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    new-instance p2, Lq5/w;

    .line 36
    .line 37
    new-instance v0, LH4/K;

    .line 38
    .line 39
    invoke-direct {v0, p1}, LH4/K;-><init>(LU3/i;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p2, v0}, Lq5/w;-><init>(LC5/b;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, LH4/N;->a:LC5/b;

    .line 46
    .line 47
    :cond_0
    new-instance p2, Lq5/w;

    .line 48
    .line 49
    new-instance v0, LH4/L;

    .line 50
    .line 51
    invoke-direct {v0, p1}, LH4/L;-><init>(LU3/i;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, v0}, Lq5/w;-><init>(LC5/b;)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, LH4/N;->b:LC5/b;

    .line 58
    .line 59
    return-void
.end method

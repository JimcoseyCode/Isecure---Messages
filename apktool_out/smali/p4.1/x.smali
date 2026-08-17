.class public final Lp4/x;
.super LN4/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lo4/f$a;
.implements Lo4/f$b;


# static fields
.field private static final j:Lo4/a$a;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Landroid/os/Handler;

.field private final e:Lo4/a$a;

.field private final f:Ljava/util/Set;

.field private final g:Lr4/c;

.field private h:LM4/e;

.field private i:Lp4/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LM4/d;->c:Lo4/a$a;

    .line 2
    .line 3
    sput-object v0, Lp4/x;->j:Lo4/a$a;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lr4/c;)V
    .locals 1

    .line 1
    sget-object v0, Lp4/x;->j:Lo4/a$a;

    .line 2
    .line 3
    invoke-direct {p0}, LN4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lp4/x;->c:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lp4/x;->d:Landroid/os/Handler;

    .line 9
    .line 10
    const-string p1, "ClientSettings must not be null"

    .line 11
    .line 12
    invoke-static {p3, p1}, Lr4/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lr4/c;

    .line 17
    .line 18
    iput-object p1, p0, Lp4/x;->g:Lr4/c;

    .line 19
    .line 20
    invoke-virtual {p3}, Lr4/c;->e()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lp4/x;->f:Ljava/util/Set;

    .line 25
    .line 26
    iput-object v0, p0, Lp4/x;->e:Lo4/a$a;

    .line 27
    .line 28
    return-void
.end method

.method static bridge synthetic y(Lp4/x;)Lp4/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lp4/x;->i:Lp4/w;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic z(Lp4/x;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->e()Lcom/google/android/gms/common/ConnectionResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->l0()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->s()Lcom/google/android/gms/common/internal/zav;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/google/android/gms/common/internal/zav;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->e()Lcom/google/android/gms/common/ConnectionResult;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->l0()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v1, Ljava/lang/Exception;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "Sign-in succeeded with resolve account failure: "

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lp4/x;->i:Lp4/w;

    .line 46
    .line 47
    invoke-interface {p1, v0}, Lp4/w;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lp4/x;->h:LM4/e;

    .line 51
    .line 52
    invoke-interface {p0}, Lo4/a$f;->g()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    iget-object v0, p0, Lp4/x;->i:Lp4/w;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->s()Lcom/google/android/gms/common/internal/e;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v1, p0, Lp4/x;->f:Ljava/util/Set;

    .line 63
    .line 64
    invoke-interface {v0, p1, v1}, Lp4/w;->c(Lcom/google/android/gms/common/internal/e;Ljava/util/Set;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object p1, p0, Lp4/x;->i:Lp4/w;

    .line 69
    .line 70
    invoke-interface {p1, v0}, Lp4/w;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object p0, p0, Lp4/x;->h:LM4/e;

    .line 74
    .line 75
    invoke-interface {p0}, Lo4/a$f;->g()V

    .line 76
    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final A(Lp4/w;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lp4/x;->h:LM4/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lo4/a$f;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lp4/x;->g:Lr4/c;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lr4/c;->i(Ljava/lang/Integer;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lp4/x;->e:Lo4/a$a;

    .line 22
    .line 23
    iget-object v3, p0, Lp4/x;->c:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v0, p0, Lp4/x;->d:Landroid/os/Handler;

    .line 26
    .line 27
    iget-object v5, p0, Lp4/x;->g:Lr4/c;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v5}, Lr4/c;->f()LM4/a;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    move-object v8, p0

    .line 38
    move-object v7, p0

    .line 39
    invoke-virtual/range {v2 .. v8}, Lo4/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lr4/c;Ljava/lang/Object;Lo4/f$a;Lo4/f$b;)Lo4/a$f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, v7, Lp4/x;->h:LM4/e;

    .line 44
    .line 45
    iput-object p1, v7, Lp4/x;->i:Lp4/w;

    .line 46
    .line 47
    iget-object p1, v7, Lp4/x;->f:Ljava/util/Set;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, v7, Lp4/x;->h:LM4/e;

    .line 59
    .line 60
    invoke-interface {p1}, LM4/e;->p()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    iget-object p1, v7, Lp4/x;->d:Landroid/os/Handler;

    .line 65
    .line 66
    new-instance v0, Lp4/u;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lp4/u;-><init>(Lp4/x;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/x;->h:LM4/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lo4/a$f;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/x;->i:Lp4/w;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lp4/w;->d(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/x;->i:Lp4/w;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lp4/w;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lp4/x;->h:LM4/e;

    .line 2
    .line 3
    invoke-interface {p1, p0}, LM4/e;->k(LN4/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Lcom/google/android/gms/signin/internal/zak;)V
    .locals 1

    .line 1
    new-instance v0, Lp4/v;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lp4/v;-><init>(Lp4/x;Lcom/google/android/gms/signin/internal/zak;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lp4/x;->d:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

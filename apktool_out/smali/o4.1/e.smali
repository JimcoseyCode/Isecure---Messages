.class public abstract Lo4/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/e$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lo4/a;

.field private final d:Lo4/a$d;

.field private final e:Lp4/b;

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:Lo4/f;

.field private final i:Lp4/j;

.field protected final j:Lcom/google/android/gms/common/api/internal/b;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lo4/a;Lo4/a$d;Lo4/e$a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lr4/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    .line 2
    invoke-static {p3, v0}, Lr4/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 3
    invoke-static {p5, v0}, Lr4/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    .line 5
    invoke-static {v0, v1}, Lr4/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lo4/e;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 6
    invoke-static {p1}, Lo4/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lo4/e;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 8
    :goto_0
    iput-object p1, p0, Lo4/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lo4/e;->c:Lo4/a;

    iput-object p4, p0, Lo4/e;->d:Lo4/a$d;

    .line 9
    iget-object v1, p5, Lo4/e$a;->b:Landroid/os/Looper;

    iput-object v1, p0, Lo4/e;->f:Landroid/os/Looper;

    .line 10
    invoke-static {p3, p4, p1}, Lp4/b;->a(Lo4/a;Lo4/a$d;Ljava/lang/String;)Lp4/b;

    move-result-object p1

    iput-object p1, p0, Lo4/e;->e:Lp4/b;

    .line 11
    new-instance p3, Lp4/o;

    invoke-direct {p3, p0}, Lp4/o;-><init>(Lo4/e;)V

    iput-object p3, p0, Lo4/e;->h:Lo4/f;

    .line 12
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/b;->t(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p3

    iput-object p3, p0, Lo4/e;->j:Lcom/google/android/gms/common/api/internal/b;

    .line 13
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/internal/b;->k()I

    move-result p4

    iput p4, p0, Lo4/e;->g:I

    .line 14
    iget-object p4, p5, Lo4/e$a;->a:Lp4/j;

    iput-object p4, p0, Lo4/e;->i:Lp4/j;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    .line 15
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    .line 16
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/common/api/internal/h;->u(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/b;Lp4/b;)V

    .line 17
    :cond_1
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/internal/b;->D(Lo4/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo4/a;Lo4/a$d;Lo4/e$a;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 18
    invoke-direct/range {v0 .. v5}, Lo4/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lo4/a;Lo4/a$d;Lo4/e$a;)V

    return-void
.end method

.method private final m(ILcom/google/android/gms/common/api/internal/d;)LP4/l;
    .locals 6

    .line 1
    new-instance v4, LP4/m;

    .line 2
    .line 3
    invoke-direct {v4}, LP4/m;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v5, p0, Lo4/e;->i:Lp4/j;

    .line 7
    .line 8
    iget-object v0, p0, Lo4/e;->j:Lcom/google/android/gms/common/api/internal/b;

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    move v2, p1

    .line 12
    move-object v3, p2

    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/api/internal/b;->z(Lo4/e;ILcom/google/android/gms/common/api/internal/d;LP4/m;Lp4/j;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4}, LP4/m;->a()LP4/l;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method


# virtual methods
.method protected d()Lr4/c$a;
    .locals 2

    .line 1
    new-instance v0, Lr4/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lr4/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lr4/c$a;->d(Landroid/accounts/Account;)Lr4/c$a;

    .line 8
    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lr4/c$a;->c(Ljava/util/Collection;)Lr4/c$a;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lo4/e;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lr4/c$a;->e(Ljava/lang/String;)Lr4/c$a;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lo4/e;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lr4/c$a;->b(Ljava/lang/String;)Lr4/c$a;

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public e(Lcom/google/android/gms/common/api/internal/d;)LP4/l;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, Lo4/e;->m(ILcom/google/android/gms/common/api/internal/d;)LP4/l;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public f(Lcom/google/android/gms/common/api/internal/d;)LP4/l;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, Lo4/e;->m(ILcom/google/android/gms/common/api/internal/d;)LP4/l;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method protected g(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final h()Lp4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lo4/e;->e:Lp4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lo4/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Lo4/e;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final k(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/n;)Lo4/a$f;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lo4/e;->d()Lr4/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr4/c$a;->a()Lr4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v0, p0, Lo4/e;->c:Lo4/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lo4/a;->a()Lo4/a$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lo4/a$a;

    .line 21
    .line 22
    iget-object v5, p0, Lo4/e;->d:Lo4/a$d;

    .line 23
    .line 24
    iget-object v2, p0, Lo4/e;->a:Landroid/content/Context;

    .line 25
    .line 26
    move-object v7, p2

    .line 27
    move-object v3, p1

    .line 28
    move-object v6, p2

    .line 29
    invoke-virtual/range {v1 .. v7}, Lo4/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lr4/c;Ljava/lang/Object;Lo4/f$a;Lo4/f$b;)Lo4/a$f;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Lo4/e;->i()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    instance-of v0, p1, Lcom/google/android/gms/common/internal/b;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    move-object v0, p1

    .line 44
    check-cast v0, Lcom/google/android/gms/common/internal/b;

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/b;->O(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    if-eqz p2, :cond_2

    .line 50
    .line 51
    instance-of p2, p1, Lp4/g;

    .line 52
    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    throw p1

    .line 61
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final l(Landroid/content/Context;Landroid/os/Handler;)Lp4/x;
    .locals 2

    .line 1
    new-instance v0, Lp4/x;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo4/e;->d()Lr4/c$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lr4/c$a;->a()Lr4/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, p2, v1}, Lp4/x;-><init>(Landroid/content/Context;Landroid/os/Handler;Lr4/c;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.class public Ls2/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lc2/n;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LY2/t;

.field private final c:Ls2/h;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;LY2/y;Ljava/util/Set;Ljava/util/Set;Ls2/b;)V
    .locals 11

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ls2/g;->a:Landroid/content/Context;

    .line 5
    invoke-virtual {p2}, LY2/y;->j()LY2/t;

    move-result-object v0

    iput-object v0, p0, Ls2/g;->b:LY2/t;

    if-eqz p5, :cond_0

    .line 6
    invoke-virtual/range {p5 .. p5}, Ls2/b;->d()Ls2/h;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual/range {p5 .. p5}, Ls2/b;->d()Ls2/h;

    move-result-object v1

    iput-object v1, p0, Ls2/g;->c:Ls2/h;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Ls2/h;

    invoke-direct {v1}, Ls2/h;-><init>()V

    iput-object v1, p0, Ls2/g;->c:Ls2/h;

    .line 9
    :goto_0
    iget-object v2, p0, Ls2/g;->c:Ls2/h;

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 11
    invoke-static {}, Lv2/a;->b()Lv2/a;

    move-result-object v4

    .line 12
    invoke-virtual {p2, p1}, LY2/y;->b(Landroid/content/Context;)Lc3/a;

    move-result-object v5

    .line 13
    invoke-virtual {p2}, LY2/y;->q()Lc3/a;

    move-result-object v6

    .line 14
    invoke-static {}, La2/i;->B()La2/i;

    move-result-object v7

    .line 15
    invoke-virtual {v0}, LY2/t;->q()LW2/x;

    move-result-object v8

    const/4 p1, 0x0

    if-eqz p5, :cond_1

    .line 16
    invoke-virtual/range {p5 .. p5}, Ls2/b;->a()Lc2/f;

    move-result-object p2

    move-object v9, p2

    goto :goto_1

    :cond_1
    move-object v9, p1

    :goto_1
    if-eqz p5, :cond_2

    .line 17
    invoke-virtual/range {p5 .. p5}, Ls2/b;->b()Lc2/n;

    move-result-object p1

    :cond_2
    move-object v10, p1

    .line 18
    invoke-virtual/range {v2 .. v10}, Ls2/h;->a(Landroid/content/res/Resources;Lv2/a;Lc3/a;Lc3/a;Ljava/util/concurrent/Executor;LW2/x;Lc2/f;Lc2/n;)V

    .line 19
    iput-object p3, p0, Ls2/g;->d:Ljava/util/Set;

    .line 20
    iput-object p4, p0, Ls2/g;->e:Ljava/util/Set;

    if-eqz p5, :cond_3

    .line 21
    invoke-virtual/range {p5 .. p5}, Ls2/b;->c()LN2/g;

    :cond_3
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LY2/y;Ls2/b;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Ls2/g;-><init>(Landroid/content/Context;LY2/y;Ljava/util/Set;Ljava/util/Set;Ls2/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ls2/b;)V
    .locals 1

    .line 1
    invoke-static {}, LY2/y;->l()LY2/y;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Ls2/g;-><init>(Landroid/content/Context;LY2/y;Ls2/b;)V

    return-void
.end method


# virtual methods
.method public a()Ls2/f;
    .locals 6

    .line 1
    new-instance v0, Ls2/f;

    .line 2
    .line 3
    iget-object v1, p0, Ls2/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Ls2/g;->c:Ls2/h;

    .line 6
    .line 7
    iget-object v3, p0, Ls2/g;->b:LY2/t;

    .line 8
    .line 9
    iget-object v4, p0, Ls2/g;->d:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v5, p0, Ls2/g;->e:Ljava/util/Set;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Ls2/f;-><init>(Landroid/content/Context;Ls2/h;LY2/t;Ljava/util/Set;Ljava/util/Set;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Ls2/f;->K(LN2/g;)Ls2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls2/g;->a()Ls2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

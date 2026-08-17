.class public Ls2/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Landroid/content/res/Resources;

.field private b:Lv2/a;

.field private c:Lc3/a;

.field private d:Lc3/a;

.field private e:Ljava/util/concurrent/Executor;

.field private f:LW2/x;

.field private g:Lc2/f;

.field private h:Lc2/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/res/Resources;Lv2/a;Lc3/a;Lc3/a;Ljava/util/concurrent/Executor;LW2/x;Lc2/f;Lc2/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls2/h;->a:Landroid/content/res/Resources;

    .line 2
    .line 3
    iput-object p2, p0, Ls2/h;->b:Lv2/a;

    .line 4
    .line 5
    iput-object p3, p0, Ls2/h;->c:Lc3/a;

    .line 6
    .line 7
    iput-object p4, p0, Ls2/h;->d:Lc3/a;

    .line 8
    .line 9
    iput-object p5, p0, Ls2/h;->e:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    iput-object p6, p0, Ls2/h;->f:LW2/x;

    .line 12
    .line 13
    iput-object p7, p0, Ls2/h;->g:Lc2/f;

    .line 14
    .line 15
    iput-object p8, p0, Ls2/h;->h:Lc2/n;

    .line 16
    .line 17
    return-void
.end method

.method protected b(Landroid/content/res/Resources;Lv2/a;Lc3/a;Lc3/a;Ljava/util/concurrent/Executor;LW2/x;Lc2/f;)Ls2/e;
    .locals 8

    .line 1
    new-instance v0, Ls2/e;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    move-object v7, p7

    .line 10
    invoke-direct/range {v0 .. v7}, Ls2/e;-><init>(Landroid/content/res/Resources;Lv2/a;Lc3/a;Lc3/a;Ljava/util/concurrent/Executor;LW2/x;Lc2/f;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public c()Ls2/e;
    .locals 8

    .line 1
    iget-object v1, p0, Ls2/h;->a:Landroid/content/res/Resources;

    .line 2
    .line 3
    iget-object v2, p0, Ls2/h;->b:Lv2/a;

    .line 4
    .line 5
    iget-object v3, p0, Ls2/h;->c:Lc3/a;

    .line 6
    .line 7
    iget-object v4, p0, Ls2/h;->d:Lc3/a;

    .line 8
    .line 9
    iget-object v5, p0, Ls2/h;->e:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    iget-object v6, p0, Ls2/h;->f:LW2/x;

    .line 12
    .line 13
    iget-object v7, p0, Ls2/h;->g:Lc2/f;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-virtual/range {v0 .. v7}, Ls2/h;->b(Landroid/content/res/Resources;Lv2/a;Lc3/a;Lc3/a;Ljava/util/concurrent/Executor;LW2/x;Lc2/f;)Ls2/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, v0, Ls2/h;->h:Lc2/n;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v2}, Lc2/n;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v1, v2}, Ls2/e;->B0(Z)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v1
.end method

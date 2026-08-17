.class final Lcom/swmansion/rnscreens/gamma/tabs/l$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/gamma/tabs/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field final synthetic d:Lcom/swmansion/rnscreens/gamma/tabs/l;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->d:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/swmansion/rnscreens/gamma/tabs/l$b;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->f(Lcom/swmansion/rnscreens/gamma/tabs/l$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final f(Lcom/swmansion/rnscreens/gamma/tabs/l$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final i()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->c:Z

    .line 3
    .line 4
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b:Z

    .line 3
    .line 4
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->d:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 5
    .line 6
    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/m;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/m;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/l$b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->a:Z

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b:Z

    .line 9
    .line 10
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->d:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->s(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->c:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->c:Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->d:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->q(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->d:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->n(Lcom/swmansion/rnscreens/gamma/tabs/l;)Lcom/swmansion/rnscreens/gamma/tabs/o;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/o;->a()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

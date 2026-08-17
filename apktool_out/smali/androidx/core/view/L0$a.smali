.class public final Landroidx/core/view/L0$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/L0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/core/view/L0$g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroidx/core/view/L0$f;

    invoke-direct {v0}, Landroidx/core/view/L0$f;-><init>()V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Landroidx/core/view/L0$e;

    invoke-direct {v0}, Landroidx/core/view/L0$e;-><init>()V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Landroidx/core/view/L0$d;

    invoke-direct {v0}, Landroidx/core/view/L0$d;-><init>()V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, Landroidx/core/view/L0$c;

    invoke-direct {v0}, Landroidx/core/view/L0$c;-><init>()V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    .line 7
    :cond_3
    new-instance v0, Landroidx/core/view/L0$b;

    invoke-direct {v0}, Landroidx/core/view/L0$b;-><init>()V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void
.end method

.method public constructor <init>(Landroidx/core/view/L0;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 10
    new-instance v0, Landroidx/core/view/L0$f;

    invoke-direct {v0, p1}, Landroidx/core/view/L0$f;-><init>(Landroidx/core/view/L0;)V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 11
    new-instance v0, Landroidx/core/view/L0$e;

    invoke-direct {v0, p1}, Landroidx/core/view/L0$e;-><init>(Landroidx/core/view/L0;)V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 12
    new-instance v0, Landroidx/core/view/L0$d;

    invoke-direct {v0, p1}, Landroidx/core/view/L0$d;-><init>(Landroidx/core/view/L0;)V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 13
    new-instance v0, Landroidx/core/view/L0$c;

    invoke-direct {v0, p1}, Landroidx/core/view/L0$c;-><init>(Landroidx/core/view/L0;)V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void

    .line 14
    :cond_3
    new-instance v0, Landroidx/core/view/L0$b;

    invoke-direct {v0, p1}, Landroidx/core/view/L0$b;-><init>(Landroidx/core/view/L0;)V

    iput-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    return-void
.end method


# virtual methods
.method public a()Landroidx/core/view/L0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/L0$g;->b()Landroidx/core/view/L0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(ILx0/e;)Landroidx/core/view/L0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/core/view/L0$g;->c(ILx0/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Lx0/e;)Landroidx/core/view/L0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/view/L0$g;->e(Lx0/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(Lx0/e;)Landroidx/core/view/L0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$a;->a:Landroidx/core/view/L0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/view/L0$g;->g(Lx0/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

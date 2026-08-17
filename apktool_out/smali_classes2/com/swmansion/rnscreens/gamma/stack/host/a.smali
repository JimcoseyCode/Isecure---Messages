.class public final Lcom/swmansion/rnscreens/gamma/stack/host/a;
.super Lcom/swmansion/rnscreens/gamma/stack/host/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lcom/swmansion/rnscreens/gamma/stack/screen/d;

.field private final b:I

.field private final c:Z

.field private final d:Z


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;IZZ)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/stack/host/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->a:Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 4
    iput p2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->b:I

    .line 5
    iput-boolean p3, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->c:Z

    .line 6
    iput-boolean p4, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/swmansion/rnscreens/gamma/stack/host/a;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;IZZ)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/FragmentManager;Lcom/swmansion/rnscreens/gamma/stack/host/c;)V
    .locals 1

    .line 1
    const-string v0, "fragmentManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p1, p0}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->e(Landroidx/fragment/app/FragmentManager;Lcom/swmansion/rnscreens/gamma/stack/host/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lcom/swmansion/rnscreens/gamma/stack/screen/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/a;->a:Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 2
    .line 3
    return-object v0
.end method

.class public final LJ6/u$a;
.super LJ6/d$c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LJ6/d$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, LJ6/u;

    .line 5
    .line 6
    iput-object v0, p0, LJ6/u$a;->b:Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "PinchGestureHandler"

    .line 9
    .line 10
    iput-object v0, p0, LJ6/u$a;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)LJ6/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LJ6/u$a;->g(Landroid/content/Context;)LJ6/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(LJ6/d;)LK6/b;
    .locals 0

    .line 1
    check-cast p1, LJ6/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LJ6/u$a;->h(LJ6/u;)LK6/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJ6/u$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LJ6/u$a;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method protected g(Landroid/content/Context;)LJ6/u;
    .locals 0

    .line 1
    new-instance p1, LJ6/u;

    .line 2
    .line 3
    invoke-direct {p1}, LJ6/u;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public h(LJ6/u;)LK6/h;
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK6/h;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LK6/h;-><init>(LJ6/u;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

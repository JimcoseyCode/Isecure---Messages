.class LW2/w$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW2/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW2/w;->A(LW2/D;)LW2/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LW2/D;

.field final synthetic b:LW2/w;


# direct methods
.method constructor <init>(LW2/w;LW2/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW2/w$a;->b:LW2/w;

    .line 2
    .line 3
    iput-object p2, p0, LW2/w$a;->a:LW2/D;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LW2/n$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LW2/w$a;->b(LW2/n$a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LW2/n$a;)I
    .locals 1

    .line 1
    iget-object v0, p0, LW2/w$a;->b:LW2/w;

    .line 2
    .line 3
    invoke-static {v0}, LW2/w;->g(LW2/w;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p1, LW2/n$a;->g:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, LW2/w$a;->a:LW2/D;

    .line 13
    .line 14
    iget-object p1, p1, LW2/n$a;->b:Lg2/a;

    .line 15
    .line 16
    invoke-virtual {p1}, Lg2/a;->J()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {v0, p1}, LW2/D;->a(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

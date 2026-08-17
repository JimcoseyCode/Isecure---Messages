.class public final synthetic LY2/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:LY2/k$a;

.field public final synthetic h:LY2/k;


# direct methods
.method public synthetic constructor <init>(LY2/k$a;LY2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/f;->g:LY2/k$a;

    .line 5
    .line 6
    iput-object p2, p0, LY2/f;->h:LY2/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LY2/f;->g:LY2/k$a;

    .line 2
    .line 3
    iget-object v1, p0, LY2/f;->h:LY2/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, LY2/k$a;->f(LY2/k$a;LY2/k;)LW2/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

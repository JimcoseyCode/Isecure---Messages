.class public final synthetic LW2/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:LW2/j;

.field public final synthetic c:LW1/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LW2/j;LW1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW2/g;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LW2/g;->b:LW2/j;

    .line 7
    .line 8
    iput-object p3, p0, LW2/g;->c:LW1/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LW2/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LW2/g;->b:LW2/j;

    .line 4
    .line 5
    iget-object v2, p0, LW2/g;->c:LW1/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LW2/j;->b(Ljava/lang/Object;LW2/j;LW1/d;)Ljava/lang/Void;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
